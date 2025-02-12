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

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(PushContentType type) {
        return type != null ? type.getValue() : null;
    }

    public static PushContentType forValue(String value) {
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
    public static PushContentType parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
