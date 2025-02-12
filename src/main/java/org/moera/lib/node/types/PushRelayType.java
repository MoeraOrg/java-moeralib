package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PushRelayType {

    /**
     * Google Firebase Cloud Messaging (FCM) relay.
     */
    FCM;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(PushRelayType type) {
        return type != null ? type.getValue() : null;
    }

    public static PushRelayType forValue(String value) {
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
    public static PushRelayType parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
