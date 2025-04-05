from __future__ import annotations

import re
import sys
from typing import Any, TextIO, Tuple, List, Iterable

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
    if len(line) > 118:
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
    /**
     * Retrieves the string representation of the enum constant.
     *
     * @return the string representation of the enum constant
     */
    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    /**
     * Converts the given enum constant to its string representation.
     *
     * @param type the {@link AskSubject} enum constant to convert; may be {@code null}
     * @return the string representation of the enum constant, or {@code null} if the input is {@code null}
     */
    public static String toValue(EnumType type) {
        return type != null ? type.getValue() : null;
    }

    /**
     * Converts the given string value to an enum constant.
     * If the conversion fails due to an invalid value, {@code null} is returned.
     *
     * @param value the string representation of an enum constant; must not be {@code null}
     * @return the corresponding enum constant, or {@code null} if the value is invalid
     */
    public static EnumType forValue(String value) {
        try {
            return parse(value);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /**
     * Returns the string representation of the current enum constant.
     *
     * @return the string representation derived from the enum constant's value
     */
    @Override
    public String toString() {
        return getValue();
    }

    /**
     * Parses the given string value into an instance of {@link EnumType}.
     *
     * @param value the input string to parse; must not be {@code null}
     * @return the corresponding enum constant
     * @throws IllegalArgumentException if the input string does not match any enum constant
     */
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
        values = sorted(enum['values'], key=lambda item: item.get('ordinal', 0))
        first = True
        ordinal = ''
        for item in values:
            tfile.write('\n' if first else f',{ordinal}\n')
            if 'description' in item:
                tfile.write(f'{ind(1)}/**\n')
                tfile.write(ind(1) + doc_wrap(cap_first(item["description"].strip() + '.'), 1))
                tfile.write(f'\n{ind(1)} */\n')
            tfile.write(f'{ind(1)}{item["name"].replace("-", "_").replace("/", "__").upper()}')
            ordinal = f' // {item["ordinal"]}' if 'ordinal' in item else ''
            first = False
        tfile.write(f';{ordinal}\n')
        tfile.write(CONCLUSION_ENUM.replace('EnumType', enum['name']))


CLONE_METHOD = '''
    /**
     * Creates and returns a copy of this {@code ClassName} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ClassName clone() {
        try {
            return (ClassName) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }
'''


def generate_operations(operations: Any, outdir: str) -> None:
    with open(outdir + f'/node/types/{operations["name"]}.java', 'w+') as tfile:
        tfile.write('package org.moera.lib.node.types;\n\n')
        tfile.write('// This file is generated\n\n')
        tfile.write('import java.util.Objects;\n\n')
        tfile.write('import com.fasterxml.jackson.annotation.JsonIgnore;\n')
        tfile.write('import com.fasterxml.jackson.annotation.JsonInclude;\n')
        tfile.write('import org.moera.lib.node.types.principal.Principal;\n\n')
        tfile.write('@JsonInclude(JsonInclude.Include.NON_NULL)\n')
        tfile.write(f'public class {operations["name"]} implements Cloneable {{\n\n')
        for field in operations['fields']:
            tfile.write(f'{ind(1)}private Principal {field["name"]};\n')
        for field in operations['fields']:
            name = field['name']
            tfile.write(f'\n{ind(1)}/**\n')
            tfile.write(f'{ind(1)} * Retrieves the permission to {field["description"]}.\n')
            tfile.write(f'{ind(1)} * If {{@code null}}, the default permission is in effect.\n')
            tfile.write(f'{ind(1)} *\n')
            tfile.write(f'{ind(1)} * @return the permission, may be {{@code null}}\n')
            tfile.write(f'{ind(1)} */\n')
            tfile.write(f'{ind(1)}public Principal get{cap_first(name)}() {{\n')
            tfile.write(f'{ind(2)}return {name};\n')
            tfile.write(f'{ind(1)}}}\n')
            tfile.write(f'\n{ind(1)}/**\n')
            tfile.write(f'{ind(1)} * Retrieves the permission to {field["description"]},\n')
            tfile.write(f'{ind(1)} * or {{@code defaultValue}} if the permission is {{@code null}}.\n')
            tfile.write(f'{ind(1)} *\n')
            tfile.write(f'{ind(1)} * @param defaultValue the default permission\n')
            tfile.write(f'{ind(1)} * @return the permission\n')
            tfile.write(f'{ind(1)} */\n')
            tfile.write(f'{ind(1)}public Principal get{cap_first(name)}(Principal defaultValue) {{\n')
            tfile.write(f'{ind(2)}return {name} != null ? {name} : defaultValue;\n')
            tfile.write(f'{ind(1)}}}\n')
            tfile.write(f'\n{ind(1)}/**\n')
            tfile.write(f'{ind(1)} * Retrieves the permission to {field["description"]},\n'),
            tfile.write(
                f'{ind(1)} * or {{@code defaultValue}} if {{@code operations}} is {{@code null}}'
                f' or the permission is {{@code null}}.\n'
            )
            tfile.write(f'{ind(1)} *\n')
            tfile.write(f'{ind(1)} * @param operations permissions data\n')
            tfile.write(f'{ind(1)} * @param defaultValue the default permission\n')
            tfile.write(f'{ind(1)} * @return the permission\n')
            tfile.write(f'{ind(1)} */\n')
            tfile.write(
                f'{ind(1)}public static Principal get{cap_first(name)}'
                f'({operations["name"]} operations, Principal defaultValue) {{\n'
            )
            tfile.write(
                f'{ind(2)}return operations != null ? operations.get{cap_first(name)}(defaultValue) : defaultValue;\n'
            )
            tfile.write(f'{ind(1)}}}\n')
            tfile.write(f'\n{ind(1)}/**\n')
            tfile.write(f'{ind(1)} * Sets the permission to {field["description"]}.\n')
            tfile.write(f'{ind(1)} * If set to {{@code null}}, the default permission should be used.\n')
            tfile.write(f'{ind(1)} *\n')
            tfile.write(f'{ind(1)} * @param {name} the permission to set, may be {{@code null}}\n')
            tfile.write(f'{ind(1)} */\n')
            tfile.write(f'{ind(1)}public void set{cap_first(name)}(Principal {name}) {{\n')
            tfile.write(f'{ind(2)}this.{name} = {name};\n')
            tfile.write(f'{ind(1)}}}\n')
            tfile.write(f'\n{ind(1)}/**\n')
            tfile.write(f'{ind(1)} * Sets the permission to {field["description"]}.\n')
            tfile.write(
                f'{ind(1)} * If the value is equal to {{@code defaultValue}},'
                f' the permission is set to {{@code null}}.\n'
            )
            tfile.write(f'{ind(1)} *\n')
            tfile.write(f'{ind(1)} * @param {name} the permission to set\n')
            tfile.write(f'{ind(1)} * @param defaultValue the default permission\n')
            tfile.write(f'{ind(1)} */\n')
            tfile.write(f'{ind(1)}public void set{cap_first(name)}(Principal {name}, Principal defaultValue) {{\n')
            line = f'{ind(2)}this.{name} = Objects.equals({name}, defaultValue) ? null : {name};\n'
            if len(line) > 120:
                line = line.replace('=', '=\n' + ind(3))
            tfile.write(line)
            tfile.write(f'{ind(1)}}}\n')
        tfile.write(f'\n{ind(1)}/**\n')
        tfile.write(f'{ind(1)} * Checks if all the permissions in the object are {{@code null}}.\n')
        tfile.write(f'{ind(1)} *\n')
        tfile.write(
            f'{ind(1)} * @return {{@code true}} if all the permissions are {{@code null}},'
            f' {{@code false}} otherwise.\n'
        )
        tfile.write(f'{ind(1)} */\n')
        tfile.write(f'{ind(1)}@JsonIgnore\n')
        tfile.write(f'{ind(1)}public boolean isEmpty() {{\n')
        tfile.write(f'{ind(2)}return ')
        first = True
        for field in operations['fields']:
            if not first:
                tfile.write(f'\n{ind(3)}&& ')
            first = False
            tfile.write(f'{field["name"]} == null')
        tfile.write(';\n')
        tfile.write(f'{ind(1)}}}\n')
        tfile.write(CLONE_METHOD.replace('ClassName', operations['name']))
        tfile.write('\n}\n')


JAVA_TYPES = {
    'String': 'String',
    'String[]': 'List<String>',
    'short': 'short',
    'int': 'int',
    'long': 'long',
    'float': 'float',
    'boolean': 'boolean',
    'timestamp': 'long',
    'byte[]': 'byte[]',
    'UUID': 'UUID',
    'String -> int': 'Map<String, Integer>',
}

JAVA_OPTIONAL_TYPES = {
    'String': 'String',
    'String[]': 'List<String>',
    'short': 'Short',
    'int': 'Integer',
    'long': 'Long',
    'float': 'Float',
    'boolean': 'Boolean',
    'timestamp': 'Long',
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


class BaseStructure:
    data: Any
    generated: bool = False
    depends: list[str]
    validated: bool = False
    validation_utils: bool = False

    def __init__(self, data: Any) -> None:
        self.data = data
        self.depends = [field['struct'] for field in self.get_fields() if 'struct' in field]
        self.depends += [
            field['enum'] for field in self.get_fields() if 'enum' in field and field['enum'] not in EXCLUDED_ENUMS
        ]

    def get_name(self) -> str:
        return self.data["name"]

    def get_package(self) -> str:
        return "types"

    def get_path(self) -> str:
        return self.get_package().replace('.', '/')

    def get_extends(self) -> list[str]:
        return []

    def get_implements(self) -> list[str]:
        if 'java-interfaces' in self.data:
            return [interface for interface in self.data['java-interfaces']]
        else:
            return []

    def get_fields(self) -> list[Any]:
        return self.data['fields']

    def generate_class(self, structs: dict[str, Structure], outdir: str) -> None:
        imports = set()
        fields: List[Tuple[str, str, str]] = []
        for field in self.get_fields():
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
            description = field.get('description', field.get('comment', ''))
            fields.append((t, field['name'], description))

        if self.data.get('java-equals', False):
            imports.add('java.util.Objects')

        imports.add('com.fasterxml.jackson.annotation.JsonInclude')

        if self.get_package() != 'types':
            for dep in self.depends:
                if dep != 'Body':
                    imports.add(f'org.moera.lib.node.types.{dep}')
        if 'Body' in self.depends:
            imports.add('org.moera.lib.node.types.body.Body')
        if self.validation_utils:
            imports.add('org.moera.lib.node.types.validate.ValidationUtil')

        self.add_imports(imports)

        with open(outdir + f'/node/{self.get_path()}/{self.get_name()}.java', 'w+') as tfile:
            tfile.write(f'package org.moera.lib.node.{self.get_package()};\n\n')
            tfile.write('// This file is generated\n\n')

            group1 = [imp for imp in imports if imp.startswith('java.')]
            if group1:
                for imp in sorted(group1):
                    tfile.write(f'import {imp};\n')
                tfile.write('\n')
            group2 = [imp for imp in imports if not imp.startswith('java.')]
            for imp in sorted(group2):
                tfile.write(f'import {imp};\n')

            if 'description' in self.data:
                tfile.write(f'\n/**\n')
                tfile.write(doc_wrap(cap_first(self.data["description"].strip()), 0))
                tfile.write(f'\n */')
            tfile.write('\n@JsonInclude(JsonInclude.Include.NON_NULL)\n')
            classes = self.get_extends()
            extends = f' extends {", ".join(classes)}' if classes else ''
            interfaces = self.get_implements()
            implements = f' implements {", ".join(interfaces)}' if interfaces else ''
            tfile.write(f'public class {self.get_name()}{extends}{implements} {{\n')
            if fields:
                tfile.write('\n')
                for field in fields:
                    tfile.write(f'{ind(1)}private {field[0]} {field[1]};\n')
            self.generate_constructor(tfile)
            for field in fields:
                verb = 'is' if field[0] == 'boolean' else 'get'
                tfile.write(f'\n{ind(1)}/**\n')
                tfile.write(ind(1) + doc_wrap(f'Retrieves {field[2].strip(" .")}.', 1))
                tfile.write(f'\n{ind(1)} *\n')
                tfile.write(f'{ind(1)} * @return the value\n')
                tfile.write(f'{ind(1)} */\n')
                tfile.write(f'{ind(1)}public {field[0]} {verb}{cap_first(field[1])}() {{\n')
                tfile.write(f'{ind(2)}return {field[1]};\n')
                tfile.write(f'{ind(1)}}}\n')
                tfile.write(f'\n{ind(1)}/**\n')
                tfile.write(ind(1) + doc_wrap(f'Sets {field[2].strip(" .")}.', 1))
                tfile.write(f'\n{ind(1)} *\n')
                tfile.write(f'{ind(1)} * @param {field[1]} the value to be set\n')
                tfile.write(f'{ind(1)} */\n')
                tfile.write(f'{ind(1)}public void set{cap_first(field[1])}({field[0]} {field[1]}) {{\n')
                tfile.write(f'{ind(2)}this.{field[1]} = {field[1]};\n')
                tfile.write(f'{ind(1)}}}\n')
            if self.validated:
                self.generate_validate(structs, tfile)
            self.generate_methods(tfile)
            if self.data.get('java-equals', False):
                self.generate_equals(fields, tfile)
            tfile.write('\n}\n')

    def add_imports(self, imports: set[str]) -> None:
        pass

    def generate_constructor(self, tfile: TextIO) -> None:
        pass

    def generate_methods(self, tfile: TextIO) -> None:
        pass

    def generate_validate(self, structs: dict[str, Structure], tfile: TextIO) -> None:
        tfile.write(f'\n{ind(1)}@Override\n')
        tfile.write(f'{ind(1)}public void validate() {{\n')
        tfile.write(f'{ind(2)}super.validate();\n')
        for field in self.get_fields():
            if 'struct' in field and field['struct'] in structs and structs[field['struct']].validated:
                tfile.write(f'{ind(2)}if ({field["name"]} != null) {{\n')
                if field.get('array', False):
                    tfile.write(f'{ind(3)}{field["name"]}.forEach({field["struct"]}::validate);\n')
                else:
                    tfile.write(f'{ind(3)}{field["name"]}.validate();\n')
                tfile.write(f'{ind(2)}}}\n')
            if 'constraints' not in field:
                continue
            for constraint in field['constraints']:
                if 'notnull' in constraint:
                    cons = constraint['notnull']
                    tfile.write(f'{ind(2)}ValidationUtil.notNull({field["name"]}, "{cons["error"]}");\n')
                if 'notblank' in constraint:
                    cons = constraint['notblank']
                    tfile.write(f'{ind(2)}ValidationUtil.notBlank({field["name"]}, "{cons["error"]}");\n')
                if 'length' in constraint:
                    cons = constraint['length']
                    tfile.write(f'{ind(2)}ValidationUtil.maxSize({field["name"]}, {cons["max"]}, "{cons["error"]}");\n')
                if 'value' in constraint:
                    cons = constraint['value']
                    if 'min' in cons:
                        tfile.write(
                            f'{ind(2)}ValidationUtil.minValue({field["name"]}, {cons["min"]}, "{cons["error"]}");\n'
                        )
                    if 'max' in cons:
                        tfile.write(
                            f'{ind(2)}ValidationUtil.maxValue({field["name"]}, {cons["max"]}, "{cons["error"]}");\n'
                        )
                if 'items' in constraint:
                    cons = constraint['items']
                    if 'min' in cons:
                        tfile.write(
                            f'{ind(2)}ValidationUtil.minItems({field["name"]}, {cons["min"]}, "{cons["error"]}");\n'
                        )
                    if 'max' in cons:
                        tfile.write(
                            f'{ind(2)}ValidationUtil.maxItems({field["name"]}, {cons["max"]}, "{cons["error"]}");\n'
                        )
                if 'domainname' in constraint:
                    cons = constraint['domainname']
                    tfile.write(f'{ind(2)}ValidationUtil.domainName({field["name"]}, "{cons["error"]}");\n')
                if 'email' in constraint:
                    cons = constraint['email']
                    tfile.write(f'{ind(2)}ValidationUtil.email({field["name"]}, "{cons["error"]}");\n')
                if 'emojilist' in constraint:
                    cons = constraint['emojilist']
                    tfile.write(f'{ind(2)}ValidationUtil.emojiList({field["name"]}, "{cons["error"]}");\n')
        tfile.write(f'{ind(1)}}}\n')

    def generate_equals(self, fields: List[Tuple[str, str, str]], tfile: TextIO) -> None:
        tfile.write(f'\n{ind(1)}/**\n')
        tfile.write(f'{ind(1)} * Compares this object to the specified object.\n')
        tfile.write(f'{ind(1)} *\n')
        tfile.write(f'{ind(1)} * @param peer the object to compare with this instance\n')
        tfile.write(
            f'{ind(1)} * @return {{@code true}} if the specified object is equal to this object,'
            f' otherwise {{@code false}}\n'
        )
        tfile.write(f'{ind(1)} */\n')
        tfile.write(f'{ind(1)}@Override\n')
        tfile.write(f'{ind(1)}public boolean equals(Object peer) {{\n')
        tfile.write(f'{ind(2)}if (this == peer) {{\n')
        tfile.write(f'{ind(3)}return true;\n')
        tfile.write(f'{ind(2)}}}\n')
        tfile.write(f'{ind(2)}if (peer == null || getClass() != peer.getClass()) {{\n')
        tfile.write(f'{ind(3)}return false;\n')
        tfile.write(f'{ind(2)}}}\n')
        tfile.write(f'{ind(2)}{self.get_name()} that = ({self.get_name()}) peer;\n')
        tfile.write(f'{ind(2)}return ')
        first = True
        for field in fields:
            if not first:
                tfile.write(f'\n{ind(3)}&& ')
            first = False
            tfile.write(f'Objects.equals({field[1]}, that.{field[1]})')
        tfile.write(';\n')
        tfile.write(f'{ind(1)}}}\n')
        tfile.write(f'\n{ind(1)}/**\n')
        tfile.write(f'{ind(1)} * Computes the hash code for this object using its attributes.\n')
        tfile.write(f'{ind(1)} *\n')
        tfile.write(f'{ind(1)} * @return a hash code value for this object\n')
        tfile.write(f'{ind(1)} */\n')
        tfile.write(f'{ind(1)}@Override\n')
        tfile.write(f'{ind(1)}public int hashCode() {{\n')
        hash_params = ', '.join([field[1] for field in fields])
        tfile.write(f'{ind(2)}return Objects.hash({hash_params});\n')
        tfile.write(f'{ind(1)}}}\n')


class Structure(BaseStructure):

    def get_extends(self) -> list[str]:
        return ['Structure']

    def get_implements(self) -> list[str]:
        return ['Cloneable'] + super().get_implements()

    def generate_methods(self, tfile: TextIO) -> None:
        tfile.write(CLONE_METHOD.replace('ClassName', self.get_name()))


class Notification(BaseStructure):
    log_names: list[tuple[str, Any]]

    def __init__(self, data: Any) -> None:
        super().__init__(data)
        self.log_names = [(field['name'], field) for field in self.get_fields() if field.get('log', False)]

    def get_name(self) -> str:
        return cap_first(to_camel(self.data["type"].lower())) + 'Notification'

    def get_package(self) -> str:
        return "types.notifications"

    def get_extends(self) -> list[str]:
        for field in self.data['fields']:
            if field['name'] == 'subscriberId':
                return ['SubscriberNotification']
        return ['Notification']

    def get_fields(self) -> list[Any]:
        return [field for field in self.data['fields'] if field['name'] != 'subscriberId']

    def add_imports(self, imports: set[str]) -> None:
        if self.log_names:
            imports.add('java.util.List')
            imports.add('org.moera.lib.util.LogUtil')

    def generate_constructor(self, tfile: TextIO) -> None:
        tfile.write(f'\n{ind(1)}public {self.get_name()}() {{\n')
        tfile.write(f'{ind(2)}super(NotificationType.{self.data["type"]});\n')
        tfile.write(f'{ind(1)}}}\n')

    def generate_methods(self, tfile: TextIO) -> None:
        if self.log_names:
            tfile.write(f'\n{ind(1)}@Override\n')
            tfile.write(f'{ind(1)}public void logParameters(List<LogPair> parameters) {{\n')
            tfile.write(f'{ind(2)}super.logParameters(parameters);\n')
            for name, field in self.log_names:
                reference = name
                if 'struct' in field:
                    reference = f'{name}.getId()'
                elif 'enum' in field:
                    reference = f'{name}.toString()'
                tfile.write(f'{ind(2)}parameters.add(LogPair.of("{name}", LogUtil.format({reference})));\n')
            tfile.write(f'{ind(1)}}}\n')


PREAMBLE_NOTIFICATION_TYPE = '''package org.moera.lib.node.types.notifications;

// This file is generated

/**
 * The type of the notification.
 */
public enum NotificationType {
'''

CONCLUSION_NOTIFICATION_TYPE = '''
    private final Class<? extends Notification> structure;

    NotificationType(Class<? extends Notification> structure) {
        this.structure = structure;
    }

    /**
     * Retrieves the structure corresponding to the notification type.
     *
     * @return a class object representing the structure
     */
    public Class<? extends Notification> getStructure() {
        return structure;
    }

    /**
     * Retrieves the notification type in its string representation.
     *
     * @return the string representation of the notification type
     */
    public String getValue() {
        return name().toLowerCase().replace('_', '-');
    }

    /**
     * Returns a {@code NotificationType} corresponding to the provided string value.
     *
     * @param value the string value
     * @return the {@code NotificationType} corresponding to the provided string value,
     *         or {@code null} if the notification type is unknown
     */
    public static NotificationType forValue(String value) {
        String name = value.toUpperCase().replace('-', '_');
        try {
            return valueOf(name);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}
'''

def generate_notification_type(notifs: List[Notification], outdir: str) -> None:
    with open(outdir + f'/node/types/notifications/NotificationType.java', 'w+') as tfile:
        tfile.write(PREAMBLE_NOTIFICATION_TYPE)
        values = sorted(notifs, key=lambda item: item.data.get('ordinal', 0))
        first = True
        ordinal = ''
        for item in values:
            tfile.write('\n' if first else f',{ordinal}\n')
            if 'description' in item.data:
                tfile.write(f'{ind(1)}/**\n')
                tfile.write(ind(1) + doc_wrap(cap_first(item.data["description"].strip()), 1))
                tfile.write(f'\n{ind(1)} */\n')
            tfile.write(f'{ind(1)}{item.data["type"]}({item.get_name()}.class)')
            ordinal = f' // {item.data["ordinal"]}' if 'ordinal' in item.data else ''
            first = False
        tfile.write(f';{ordinal}\n')
        tfile.write(CONCLUSION_NOTIFICATION_TYPE)


PREAMBLE_MOERA_NODE = '''package org.moera.lib.node;

// This file is generated

import java.nio.file.Path;

import com.fasterxml.jackson.core.type.TypeReference;
import org.moera.lib.node.exception.MoeraNodeException;
import org.moera.lib.node.types.*;

/**
 * {@code MoeraNode} is a client for interfacing with Moera nodes using the Moera Node API.
 */
public class MoeraNode extends NodeApiClient {

    /**
     * Constructs a new MoeraNode object.
     */
    public MoeraNode() {
    }

    /**
     * Constructs a new MoeraNode object with the specified node URL.
     *
     * @param nodeUrl node URL
     */
    public MoeraNode(String nodeUrl) {
        super(nodeUrl);
    }
'''

CONCLUSION_MOERA_NODE = '''
}
'''

def generate_calls(api: Any, afile: TextIO) -> None:
    afile.write(PREAMBLE_MOERA_NODE)

    for obj in api['objects']:
        for request in obj.get('requests', []):
            if 'function' not in request:
                continue

            params: list[str] = []
            tail_params: list[str] = []
            url_params: dict[str, str] = {}
            flag_name: str | None = None
            flags: list[Any] = []
            param_docs = []
            for param in request.get('params', []) + request.get('query', []):
                if 'name' not in param:
                    print('Missing name of parameter of the request "{method} {url}"'
                          .format(method=request['type'], url=request['url']))
                    exit(1)
                name = param['name']
                url_params[name] = name
                if 'enum' in param:
                    java_type = param['enum']
                else:
                    java_type = to_java_type(param['type'], param.get('optional', False))
                if 'flags' in param:
                    flag_name = name
                    flags = [flag for flag in param['flags']]
                    for flag in flags:
                        flag_param = f'with{flag["name"].capitalize()}'
                        params.append(f'boolean {flag_param}')
                        param_docs += [(flag_param, 'include ' + flag.get('description', ''), 'boolean')]
                else:
                    params.append(f'{java_type} {name}')
                    param_docs += [(name, param.get('description', ''), java_type)]
            body = 'null'
            if 'in' in request:
                if 'type' in request['in']:
                    if request['in']['type'] != 'blob':
                        print('Unrecognised type "{type}" of the input body of the request "{method} {url}"'
                              .format(type=request['in']['type'], method=request['type'], url=request['url']))
                        exit(1)
                    body = 'body, contentType'
                    params += ['Path body', 'String contentType']
                    param_docs += [('body', '', 'Path'), ('contentType', 'content-type of ``body``', 'string')]
                else:
                    if 'name' not in request['in']:
                        print('Missing name of body of the request "{method} {url}"'
                              .format(method=request['type'], url=request['url']))
                        exit(1)
                    name = request['in']['name']
                    java_type = request['in']['struct']
                    if request['in'].get('array', False):
                        java_type += '[]'
                    body = name
                    params.append(f'{java_type} {name}')
                    param_docs += [(name, request['in'].get('description', ''), java_type)]
            params += tail_params

            method = request['type']
            location: str = request['url']
            path_vars = []
            if len(url_params) > 0:
                p = re.compile(r'{(\w+)}')
                for name in p.findall(location):
                    if name not in url_params:
                        print('Unknown parameter "{param}" referenced in location "{url}"'
                              .format(param=name, url=request['url']))
                        exit(1)
                    path_vars.append(f'ue({name})')
                    location = location.replace(f'{{{name}}}', '%%')
                    del url_params[name]
            location = f'"{location}"'
            if len(path_vars) > 0:
                location += '.formatted(%s)'

            subs = []
            for name, java_name in url_params.items():
                subs.append(f'QueryParam.of("{name}", {java_name})')

            result = 'Result'
            if 'out' in request:
                if 'type' in request['out']:
                    if request['out']['type'] != 'blob':
                        print('Unrecognised type "{type}" of the output body of the request "{method} {url}"'
                              .format(type=request['out']['type'], method=request['type'], url=request['url']))
                        exit(1)
                    result = 'void'
                    params.append('ResponseConsumer responseConsumer')
                    param_docs += [('responseConsumer', 'consumer of the data received', 'ResponseConsumer')]
                else:
                    result = request['out']['struct']
                    if request['out'].get('array', False):
                        result += '[]'

            description = ''
            if 'description' in request:
                description = doc_wrap(request["description"], 1)
            description += f'\n{ind(1)} *'
            if len(param_docs) > 0:
                for pd in param_docs:
                    param_doc = pd[1] if pd[1] != '' else pd[0]
                    doc = doc_wrap(f'@param {pd[0]} {param_doc}', 1)
                    description += f'\n{ind(1)}{doc}'
            if result != 'void':
                description += f'\n{ind(1)}' + doc_wrap(f'@return {result}', 1)
            if description != '':
                description = f'\n{ind(1)}/**\n{ind(1)}{description}\n{ind(1)} */'

            afile.write(description)
            name = request['function']
            throws = 'throws MoeraNodeException'
            afile.write(params_wrap(f'\n{ind(1)}public {result} {name}(%s) {throws} {{\n', ', '.join(params), 2))
            if flag_name is not None:
                items = ', '.join(
                    'QueryParam.of("%s", with%s)' % (flag['name'], flag['name'].capitalize()) for flag in flags
                )
                afile.write(f'{ind(2)}var {flag_name} = commaSeparatedFlags({items});\n')
            if len(path_vars) > 0:
                afile.write(
                    params_wrap(f'{ind(2)}var location = {location};\n', ', '.join(path_vars), 3).replace('%', '%s')
                )
            else:
                afile.write(f'{ind(2)}var location = {location};\n')
            query_params = 'null'
            if len(subs) > 0:
                subs_list = f",\n{ind(3)}".join(subs)
                afile.write(f'{ind(2)}var params = new QueryParam[] {{\n{ind(3)}{subs_list}\n{ind(2)}}};\n')
                query_params = 'params'
            if result != 'void':
                afile.write(f'{ind(2)}var returnTypeRef = new TypeReference<{result}>() {{}};\n')
            if result != 'void':
                afile.write(f'{ind(2)}return call(location, {query_params}, "{method}", {body}, returnTypeRef);\n')
            else:
                afile.write(f'{ind(2)}call(location, {query_params}, "{method}", {body}, responseConsumer);\n')
            afile.write(f'{ind(1)}}}\n')

    afile.write(CONCLUSION_MOERA_NODE)

def scan_validation(records: Iterable[BaseStructure], structs: dict[str, Structure], excludeFields: list[str]) -> None:
    for record in records:
        for field in record.data['fields']:
            if field['name'] in excludeFields:
                continue
            if 'constraints' in field and any('other' not in constraint for constraint in field['constraints']):
                record.validated = True
                record.validation_utils = True
                break

    modified = True
    while modified:
        modified = False
        for record in records:
            if record.validated:
                continue
            for dep in record.depends:
                if dep in structs and structs[dep].validated:
                    record.validated = True
                    modified = True


def scan_structures(api: Any) -> dict[str, Structure]:
    structs: dict[str, Structure] = {struct['name']: Structure(struct) for struct in api['structures']}
    scan_validation(structs.values(), structs, [])
    return structs


def scan_notifications(notifications: Any, structs: dict[str, Structure]) -> List[Notification]:
    notifs: List[Notification] = [Notification(notif) for notif in notifications['notifications']]
    scan_validation(notifs, structs, ['subscriberId'])
    return notifs


EXCLUDED_STRUCTS = ['Body', 'FundraiserInfo', 'LinkPreview', 'Result']


def generate_types(api: Any, notifications: Any, outdir: str) -> None:
    structs = scan_structures(api)
    notifs = scan_notifications(notifications, api)

    for enum in api['enums']:
        generate_enum(enum, outdir)
    for operations in api['operations']:
        generate_operations(operations, outdir)
    for struct in structs.values():
        if struct.get_name() not in EXCLUDED_STRUCTS:
            struct.generate_class(structs, outdir)
    for notif in notifs:
        notif.generate_class(structs, outdir)
    generate_notification_type(notifs, outdir)
    with open(outdir + f'/node/MoeraNode.java', 'w+') as afile:
        generate_calls(api, afile)


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

/**
 * The Fingerprints class provides methods to generate a cryptographic fingerprint
 * for a set of fields using a predefined schema structure.
 */
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
    notifications = read_api(sys.argv[3])
    generate_types(node_api, notifications, outdir)
    generate_fingerprints(fp, outdir)


if len(sys.argv) < 4 or sys.argv[1] == '':
    print("Usage: java-moera-api <node_api.yml file path> <node_api_fingerprints.yml file path>"
          " <notifications.yml file path> <output directory>")
    exit(1)

outdir = sys.argv[4] if len(sys.argv) >= 5 else '.'
generate_code(outdir)
