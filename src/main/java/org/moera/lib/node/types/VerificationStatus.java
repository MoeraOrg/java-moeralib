package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum VerificationStatus {

    /**
     * The verification is pending.
     */
    RUNNING,
    /**
     * The signature is correct.
     */
    CORRECT,
    /**
     * The signature is incorrect.
     */
    INCORRECT,
    /**
     * The verification cannot be performed due to an error.
     */
    ERROR;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(VerificationStatus type) {
        return type != null ? type.getValue() : null;
    }

    public static VerificationStatus forValue(String value) {
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
    public static VerificationStatus parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
