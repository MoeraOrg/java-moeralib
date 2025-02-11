package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SheriffComplaintStatus {

    POSTED,
    PREPARED,
    PREPARE_FAILED,
    NOT_FOUND,
    INVALID_TARGET,
    NOT_ORIGINAL,
    NOT_SHERIFF,
    APPROVED,
    REJECTED;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(SheriffComplaintStatus type) {
        return type != null ? type.getValue() : null;
    }

    public static SheriffComplaintStatus forValue(String value) {
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
    public static SheriffComplaintStatus parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
