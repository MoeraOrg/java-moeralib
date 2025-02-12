package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SubscriptionReason {

    /**
     * Node owner asked to subscribe.
     */
    USER,
    /**
     * Node name was mentioned.
     */
    MENTION,
    /**
     * Node owner commented the posting.
     */
    COMMENT,
    /**
     * Node was subscribed automatically according to the settings.
     */
    AUTO;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(SubscriptionReason type) {
        return type != null ? type.getValue() : null;
    }

    public static SubscriptionReason forValue(String value) {
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
    public static SubscriptionReason parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
