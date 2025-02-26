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

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(SheriffOrderReason type) {
        return type != null ? type.getValue() : null;
    }

    public static SheriffOrderReason forValue(String value) {
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
    public static SheriffOrderReason parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
