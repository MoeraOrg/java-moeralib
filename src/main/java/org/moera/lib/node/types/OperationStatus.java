package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OperationStatus {

    /**
     * The operation is waiting to be sent to the naming server.
     */
    WAITING,
    /**
     * The operation was accepted by the naming server.
     */
    ADDED,
    /**
     * The naming server started to proceed the operation.
     */
    STARTED,
    /**
     * The operation completed successfully.
     */
    SUCCEEDED,
    /**
     * The operation failed.
     */
    FAILED,
    /**
     * The operation status is unknown.
     */
    UNKNOWN;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(OperationStatus type) {
        return type != null ? type.getValue() : null;
    }

    public static OperationStatus forValue(String value) {
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
    public static OperationStatus parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
