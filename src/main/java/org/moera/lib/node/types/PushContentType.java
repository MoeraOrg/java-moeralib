package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PushContentType {

    /**
     * A story was added to a feed.
     */
    STORY_ADDED,
    /**
     * A story was deleted from a feed.
     */
    STORY_DELETED,
    /**
     * Feed status was updated.
     */
    FEED_UPDATED;

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
    public static String toValue(PushContentType type) {
        return type != null ? type.getValue() : null;
    }

    /**
     * Converts the given string value to an enum constant.
     * If the conversion fails due to an invalid value, {@code null} is returned.
     *
     * @param value the string representation of an enum constant; must not be {@code null}
     * @return the corresponding enum constant, or {@code null} if the value is invalid
     */
    public static PushContentType forValue(String value) {
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
     * Parses the given string value into an instance of {@link PushContentType}.
     *
     * @param value the input string to parse; must not be {@code null}
     * @return the corresponding enum constant
     * @throws IllegalArgumentException if the input string does not match any enum constant
     */
    @JsonCreator
    public static PushContentType parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
