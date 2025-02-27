package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AskSubject {

    /**
     * "subscribe to me" - asking remote node to subscribe to this node.
     */
    SUBSCRIBE,
    /**
     * "add me to your friends" - asking remote node to add this node to friends.
     */
    FRIEND;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(AskSubject type) {
        return type != null ? type.getValue() : null;
    }

    public static AskSubject forValue(String value) {
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
    public static AskSubject parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
