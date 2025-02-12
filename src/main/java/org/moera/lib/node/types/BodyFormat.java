package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BodyFormat {

    /**
     * <code><a href="#Body">Body</a></code> structure.
     */
    MESSAGE,
    /**
     * An application-specific structure.
     */
    APPLICATION;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(BodyFormat type) {
        return type != null ? type.getValue() : null;
    }

    public static BodyFormat forValue(String value) {
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
    public static BodyFormat parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
