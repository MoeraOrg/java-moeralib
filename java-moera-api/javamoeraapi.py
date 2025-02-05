from __future__ import annotations

import sys
from typing import Any, TextIO

import yaml
from camel_converter import to_snake, to_camel

def ind(n: int) -> str:
    return n * 4 * ' '


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


def generate_fingerprint_schema(schema: Any, name: str, version: int, ffile: TextIO) -> None:
    ffile.write(f'{ind(1)}private static final Object[] {to_snake(name).upper()}{version}_SCHEMA = new Object[] {{\n')
    for field in schema['fingerprint']:
        field_name = field['field']
        ffile.write(f'{ind(2)}"{field_name}",\n')
    ffile.write(f'{ind(1)}}};\n\n')


PY_FP_TYPES = {
    'String': 'String',
    'InetAddress': 'InetAddress',
    'int': 'int',
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
    # generate_types(node_api, outdir)
    generate_fingerprints(fp, outdir)


if len(sys.argv) < 3 or sys.argv[1] == '':
    print("Usage: java-moera-api <node_api.yml file path> <node_api_fingerprints.yml file path> <output directory>")
    exit(1)

outdir = sys.argv[3] if len(sys.argv) >= 4 else '.'
generate_code(outdir)
