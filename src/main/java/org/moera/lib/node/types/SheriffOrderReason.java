package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SheriffOrderReason {

    /**
     * Violation of a law.
     */
    UNLAWFUL,
    /**
     * Defamatory content.
     */
    DEFAMATORY,
    /**
     * Contains a threat against a person.
     */
    THREAT,
    /**
     * Spam.
     */
    SPAM,
    /**
     * Fraudulent content.
     */
    SCAM,
    /**
     * Distribution of a malware.
     */
    MALWARE,
    /**
     * Copyright infringement.
     */
    COPYRIGHT,
    /**
     * The author pretends to be someone else.
     */
    IMPERSONATING,
    /**
     * Violation of someone's privacy.
     */
    PRIVACY,
    /**
     * Any other reason.
     */
    OTHER;

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
