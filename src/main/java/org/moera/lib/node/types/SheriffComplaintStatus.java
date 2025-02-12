package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SheriffComplaintStatus {

    /**
     * The group is just added.
     */
    POSTED,
    /**
     * Automatic preprocessing is done.
     */
    PREPARED,
    /**
     * Automatic preprocessing is failed.
     */
    PREPARE_FAILED,
    /**
     * The entry the group is related to is not found.
     */
    NOT_FOUND,
    /**
     * The entry the group is related to is specified incorrectly.
     */
    INVALID_TARGET,
    /**
     * The posting the group is related to is a copy of the original posting.
     */
    NOT_ORIGINAL,
    /**
     * The entry the group is related to is not under supervision of the sheriff.
     */
    NOT_SHERIFF,
    /**
     * The group is approved by the sheriff.
     */
    APPROVED,
    /**
     * The group is rejected by the sheriff.
     */
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
