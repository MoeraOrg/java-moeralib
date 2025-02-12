package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BlockedOperation {

    /**
     * Add reactions to entries on the node.
     */
    REACTION,
    /**
     * Add comments to postings on the node.
     */
    COMMENT,
    /**
     * Add postings to the node.
     */
    POSTING,
    /**
     * Be visible to the node.
     */
    VISIBILITY,
    /**
     * Be visible in stories added to the instants feed of the node.
     */
    INSTANT;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(BlockedOperation type) {
        return type != null ? type.getValue() : null;
    }

    public static BlockedOperation forValue(String value) {
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
    public static BlockedOperation parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
