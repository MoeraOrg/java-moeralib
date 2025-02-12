package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DraftType {

    /**
     * Draft of a new posting.
     */
    NEW_POSTING,
    /**
     * Draft of an update to a posting.
     */
    POSTING_UPDATE,
    /**
     * Draft of a new comment.
     */
    NEW_COMMENT,
    /**
     * Draft of an update to a comment.
     */
    COMMENT_UPDATE;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(DraftType type) {
        return type != null ? type.getValue() : null;
    }

    public static DraftType forValue(String value) {
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
    public static DraftType parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
