from __future__ import annotations

import sys
from typing import Any, TextIO, Tuple, List

import yaml
from camel_converter import to_snake, to_camel


def ind(n: int) -> str:
    return n * 4 * ' '


def doc_wrap(s: str, indent: int) -> str:
    s = s.strip()
    if '\n' in s:
        return f'\n{ind(indent)}'.join(doc_wrap(c, indent) for c in s.split('\n'))

    max_length = 120 - indent * 4 - 3
    result = ''
    while True:
        if len(s) < max_length:
            result += ' * ' + s
            break
        pos = 0
        while True:
            next = s.find(' ', pos + 1)
            if next < 0 or next >= max_length:
                break
            pos = next
        result += ' * ' + s[:pos] + '\n' + ind(indent)
        s = s[pos + 1:]
    return result


def read_api(ifname: str) -> Any:
    with open(ifname, 'r') as ifile:
        return yaml.safe_load(ifile)


def comma_wrap(s: str, indent: int) -> str:
    max_length = 119 - indent * 4
    result = ''
    while True:
        if len(s) <= max_length:
            result += s
            break
        pos = 0
        while True:
            next = s.find(', ', pos + 1)
            if next < 0 or next > max_length:
                break
            pos = next
        result += s[:pos] + ',\n' + ind(indent)
        s = s[pos + 2:]
    return result


def params_wrap(template: str, substitute: str, indent: int) -> str:
    line = template % substitute
    if len(line) > 119:
        line = template % ('\n' + ind(indent) + comma_wrap(substitute, indent) + '\n' + ind(indent - 1))
    return line


def cap_first(s: str) -> str:
    return s[:1].upper() + s[1:] if s else s


PREAMBLE_ENUM = '''package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

'''

CONCLUSION_ENUM = '''
    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(EnumType type) {
        return type != null ? type.getValue() : null;
    }

    public static EnumType forValue(String value) {
        try {
            return parse(value);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return getValue();
    }

    @JsonCreator
    public static EnumType parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
'''

EXCLUDED_ENUMS = ['BlockedEntryOperation', 'PrincipalFlag', 'Scope', 'SettingType']


def generate_enum(enum: Any, outdir: str) -> None:
    if enum['name'] in EXCLUDED_ENUMS:
        return

    with open(outdir + f'/node/types/{enum["name"]}.java', 'w+') as tfile:
        tfile.write(PREAMBLE_ENUM)
        tfile.write(f'public enum {enum["name"]} {{\n')
        first = True
        for item in enum['values']:
            tfile.write('\n' if first else ',\n')
            if 'description' in item:
                tfile.write(f'{ind(1)}/**\n')
                tfile.write(ind(1) + doc_wrap(cap_first(item["description"]) + '.', 1))
                tfile.write(f'\n{ind(1)} */\n')
            tfile.write(f'{ind(1)}{item["name"].replace("-", "_").replace("/", "__").upper()}')
            first = False
        tfile.write(';\n')
        tfile.write(CONCLUSION_ENUM.replace('EnumType', enum['name']))


def generate_operations(operations: Any, outdir: str) -> None:
    with open(outdir + f'/node/types/{operations["name"]}.java', 'w+') as tfile:
        tfile.write('package org.moera.lib.node.types;\n\n')
        tfile.write('// This file is generated\n\n')
        tfile.write('import com.fasterxml.jackson.annotation.JsonInclude;\n')
        tfile.write('import org.moera.lib.node.types.principal.Principal;\n\n')
        tfile.write('@JsonInclude(JsonInclude.Include.NON_NULL)\n')
        tfile.write(f'public class {operations["name"]} {{\n\n')
        for field in operations['fields']:
            tfile.write(f'{ind(1)}private Principal {field["name"]};\n')
        for field in operations['fields']:
            name = field['name']
            tfile.write(f'\n{ind(1)}public Principal get{cap_first(name)}() {{\n')
            tfile.write(f'{ind(2)}return {name};\n')
            tfile.write(f'{ind(1)}}}\n')
            tfile.write(f'\n{ind(1)}public void set{cap_first(name)}(Principal {name}) {{\n')
            tfile.write(f'{ind(2)}this.{name} = {name};\n')
            tfile.write(f'{ind(1)}}}\n')
        tfile.write('\n}\n')


JAVA_TYPES = {
    'String': 'String',
    'String[]': 'List<String>',
    'int': 'int',
    'float': 'float',
    'boolean': 'boolean',
    'timestamp': 'Timestamp',
    'byte[]': 'byte[]',
    'UUID': 'UUID',
    'String -> int': 'Map<String, Integer>',
}

JAVA_OPTIONAL_TYPES = {
    'String': 'String',
    'String[]': 'List<String>',
    'int': 'Integer',
    'float': 'Float',
    'boolean': 'Boolean',
    'timestamp': 'Timestamp',
    'byte[]': 'byte[]',
    'UUID': 'UUID',
    'String -> int': 'Map<String, Integer>',
}


def to_java_type(api_type: str, optional: bool) -> str:
    java_type = (JAVA_OPTIONAL_TYPES if optional else JAVA_TYPES).get(api_type)
    if java_type is None:
        print('Unrecognized field type: ' + api_type)
        exit(1)
    return java_type


class Structure:
    data: Any
    generated: bool = False
    depends: list[str]

    def __init__(self, data: Any) -> None:
        self.data = data
        self.depends = [field['struct'] for field in data['fields'] if 'struct' in field]

    def get_name(self) -> str:
        return self.data["name"]

    def generate_class(self, outdir: str) -> None:
        imports = set()
        fields: List[Tuple[str, str]] = []
        for field in self.data['fields']:
            if 'struct' in field:
                t = field['struct']
            elif 'enum' in field:
                t = field['enum'] if field['enum'] not in EXCLUDED_ENUMS else 'String'
            else:
                if field['type'] == 'any':
                    continue
                t = to_java_type(field['type'], field.get('optional', False))
            if field.get('array', False):
                t = f'List<{t}>'
            if t.startswith('List<'):
                imports.add('java.util.List')
            if t.startswith('Map<'):
                imports.add('java.util.Map')
            if t == 'Timestamp':
                imports.add('java.sql.Timestamp')
            if t == 'UUID':
                imports.add('java.util.UUID')
            fields.append((t, field['name']))

        with open(outdir + f'/node/types/{self.data["name"]}.java', 'w+') as tfile:
            tfile.write('package org.moera.lib.node.types;\n\n')
            tfile.write('// This file is generated\n\n')
            if imports:
                for imp in sorted(imports):
                    tfile.write(f'import {imp};\n')
                tfile.write('\n')
            tfile.write('import com.fasterxml.jackson.annotation.JsonInclude;\n\n')
            tfile.write('@JsonInclude(JsonInclude.Include.NON_NULL)\n')
            tfile.write(f'public class {self.data["name"]} {{\n\n')
            for field in fields:
                tfile.write(f'{ind(1)}private {field[0]} {field[1]};\n')
            for field in fields:
                tfile.write(f'\n{ind(1)}public {field[0]} get{cap_first(field[1])}() {{\n')
                tfile.write(f'{ind(2)}return {field[1]};\n')
                tfile.write(f'{ind(1)}}}\n')
                tfile.write(f'\n{ind(1)}public void set{cap_first(field[1])}({field[0]} {field[1]}) {{\n')
                tfile.write(f'{ind(2)}this.{field[1]} = {field[1]};\n')
                tfile.write(f'{ind(1)}}}\n')
            tfile.write('\n}\n')


def scan_structures(api: Any) -> dict[str, Structure]:
    structs: dict[str, Structure] = {struct['name']: Structure(struct) for struct in api['structures']}
    return structs


def generate_types(api: Any, outdir: str) -> None:
    structs = scan_structures(api)

    for enum in api['enums']:
        generate_enum(enum, outdir)
    for operations in api['operations']:
        generate_operations(operations, outdir)
    for struct in structs.values():
        struct.generate_class(outdir)

FP_TYPES = {
    'String': 'String',
    'InetAddress': 'InetAddress',
    'int': 'int',
    'long': 'long',
    'timestamp': 'Timestamp',
    'byte': 'byte',
    'byte[]': 'byte[]',
    'boolean': 'boolean'
}


def generate_fingerprint_schema(schema: Any, name: str, version: int, ffile: TextIO) -> None:
    ffile.write(
        f'{ind(1)}private static final FieldWithSchema[] {to_snake(name).upper()}{version}_SCHEMA'
        f' = new FieldWithSchema[] {{\n'
    )
    for field in schema['fingerprint']:
        if 'type' in field:
            field_type = FP_TYPES[field['type']]
        else:
            field_type = 'byte[]'
        if field.get('array', False):
            field_type += '[]'
        field_name = to_snake(field['field'])
        ffile.write(f'{ind(2)}new FieldWithSchema("{field_name}", "{field_type}"),\n')
    ffile.write(f'{ind(1)}}};\n\n')


def generate_get_schema_function(fp: Any, ffile: TextIO) -> None:
    ffile.write(f'{ind(1)}public static FieldWithSchema[] getSchema(String objectType, int version) {{\n')
    ffile.write(f'{ind(2)}return switch (objectType) {{\n')
    for object in fp['objects']:
        name = to_snake(object['name']).upper()
        ffile.write(f'{ind(3)}case "{name}" -> switch (version) {{\n')
        for schema in object['versions']:
            version = schema['version']
            ffile.write(f'{ind(4)}case {version} -> {name}{version}_SCHEMA;\n')
        ffile.write(f'{ind(4)}default -> null;\n')
        ffile.write(f'{ind(3)}}};\n')
    ffile.write(f'{ind(3)}default -> null;\n')
    ffile.write(f'{ind(2)}}};\n')
    ffile.write(f'{ind(1)}}}\n\n')


PY_FP_TYPES = {
    'String': 'String',
    'InetAddress': 'InetAddress',
    'int': 'int',
    'long': 'long',
    'timestamp': 'Timestamp',
    'byte': 'byte',
    'byte[]': 'byte[]',
    'boolean': 'boolean'
}


def generate_latest_fingerprint_function(schema: Any, name: str, version: int, ffile: TextIO) -> None:
    params = []
    keys = []
    for field in schema['fingerprint']:
        field_name = field['field']
        if field_name != 'objectType':
            if 'type' in field:
                field_type = PY_FP_TYPES[field['type']]
            else:
                field_type = 'byte[]'
            if field.get('array', False):
                field_type = f'List<{field_type}>'
            params.append(f'{field_type} {field_name}')
            keys.append(field_name)
    method_name = to_camel(to_snake(name))
    ffile.write(params_wrap(f'{ind(1)}public static byte[] {method_name}(%s) {{\n', ', '.join(params), 2))
    ffile.write(params_wrap(f'{ind(2)}return {method_name}{version}(%s);\n', ', '.join(keys), 3))
    ffile.write(f'{ind(1)}}}\n\n')


def generate_fingerprint_function(schema: Any, name: str, version: int, ffile: TextIO) -> None:
    params = []
    for field in schema['fingerprint']:
        field_name = field['field']
        if field_name != 'objectType':
            if 'type' in field:
                field_type = PY_FP_TYPES[field['type']]
            else:
                field_type = 'byte[]'
            if field.get('array', False):
                field_type = f'List<{field_type}>'
            params.append(f'{field_type} {field_name}')
    method_name = to_camel(to_snake(name))
    ffile.write(params_wrap(f'{ind(1)}public static byte[] {method_name}{version}(%s) {{\n', ', '.join(params), 2))
    ffile.write(f'{ind(2)}Fingerprint fingerprint = new Fingerprint({version});\n')
    for field in schema['fingerprint']:
        field_name = field['field']
        if field_name != 'objectType':
            value = field_name
        else:
            value = '"' + field['comment'].removeprefix('<code>').removesuffix('</code>') + '"'
        ffile.write(f'{ind(2)}fingerprint.put("{to_snake(field_name)}", {value});\n')
    ffile.write('\n')
    schema_name = to_snake(name).upper()
    ffile.write(f'{ind(2)}return CryptoUtil.fingerprint(fingerprint, {schema_name}{version}_SCHEMA);\n')
    ffile.write(f'{ind(1)}}}\n\n')


PREAMBLE_FINGERPRINTS = '''package org.moera.lib.node;

// This file is generated

import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.List;

import org.moera.lib.crypto.CryptoUtil;
import org.moera.lib.crypto.FieldWithSchema;
import org.moera.lib.crypto.Fingerprint;

public class Fingerprints {

'''

CONCLUSION_FINGERPRINTS = '''}
'''


def generate_fingerprints(fp: Any, outdir: str) -> None:
    with open(outdir + '/node/Fingerprints.java', 'w+') as ffile:
        ffile.write(PREAMBLE_FINGERPRINTS)
        for object in fp['objects']:
            name = object['name']
            for schema in object['versions']:
                version = schema['version']
                generate_fingerprint_schema(schema, name, version, ffile)
        generate_get_schema_function(fp, ffile)
        for object in fp['objects']:
            name = object['name']
            schema = object['versions'][0]
            version = schema['version']
            generate_latest_fingerprint_function(schema, name, version, ffile)
            for schema in object['versions']:
                version = schema['version']
                generate_fingerprint_function(schema, name, version, ffile)
        ffile.write(CONCLUSION_FINGERPRINTS)


def generate_code(outdir: str) -> None:
    node_api = read_api(sys.argv[1])
    fp = read_api(sys.argv[2])
    generate_types(node_api, outdir)
    generate_fingerprints(fp, outdir)


if len(sys.argv) < 3 or sys.argv[1] == '':
    print("Usage: java-moera-api <node_api.yml file path> <node_api_fingerprints.yml file path> <output directory>")
    exit(1)

outdir = sys.argv[3] if len(sys.argv) >= 4 else '.'
generate_code(outdir)
