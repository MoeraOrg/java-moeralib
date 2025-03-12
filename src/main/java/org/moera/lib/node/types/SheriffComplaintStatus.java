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
    public static String toValue(SheriffComplaintStatus type) {
        return type != null ? type.getValue() : null;
    }

    /**
     * Converts the given string value to an enum constant.
     * If the conversion fails due to an invalid value, {@code null} is returned.
     *
     * @param value the string representation of an enum constant; must not be {@code null}
     * @return the corresponding enum constant, or {@code null} if the value is invalid
     */
    public static SheriffComplaintStatus forValue(String value) {
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
     * Parses the given string value into an instance of {@link SheriffComplaintStatus}.
     *
     * @param value the input string to parse; must not be {@code null}
     * @return the corresponding enum constant
     * @throws IllegalArgumentException if the input string does not match any enum constant
     */
    @JsonCreator
    public static SheriffComplaintStatus parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
