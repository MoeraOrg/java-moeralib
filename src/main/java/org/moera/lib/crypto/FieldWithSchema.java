package org.moera.lib.crypto;

public class FieldWithSchema {

    private final String name;
    private final Object[] schema;

    public FieldWithSchema(String name, Object[] schema) {
        this.name = name;
        this.schema = schema;
    }

    public String getName() {
        return name;
    }

    public Object[] getSchema() {
        return schema;
    }

}
