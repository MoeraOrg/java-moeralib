package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SheriffOrderReason {

    /**
     * Any other reason.
     */
    OTHER, // 0
    /**
     * Violation of a law.
     */
    UNLAWFUL, // 1
    /**
     * Defamatory content.
     */
    DEFAMATORY, // 2
    /**
     * Contains a threat against a person.
     */
    THREAT, // 3
    /**
     * Spam.
     */
    SPAM, // 4
    /**
     * Fraudulent content.
     */
    SCAM, // 5
    /**
     * Distribution of malware.
     */
    MALWARE, // 6
    /**
     * Copyright infringement.
     */
    COPYRIGHT, // 7
    /**
     * The author pretends to be someone else.
     */
    IMPERSONATING, // 8
    /**
     * Violation of someone's privacy.
     */
    PRIVACY; // 9

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
    public static String toValue(SheriffOrderReason type) {
        return type != null ? type.getValue() : null;
    }

    /**
     * Converts the given string value to an enum constant.
     * If the conversion fails due to an invalid value, {@code null} is returned.
     *
     * @param value the string representation of an enum constant; must not be {@code null}
     * @return the corresponding enum constant, or {@code null} if the value is invalid
     */
    public static SheriffOrderReason forValue(String value) {
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
     * Parses the given string value into an instance of {@link SheriffOrderReason}.
     *
     * @param value the input string to parse; must not be {@code null}
     * @return the corresponding enum constant
     * @throws IllegalArgumentException if the input string does not match any enum constant
     */
    @JsonCreator
    public static SheriffOrderReason parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
