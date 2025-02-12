package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SubscriptionType {

    /**
     * Subscribe to new stories in the feed.
     */
    FEED,
    /**
     * Subscribe to updates to the posting.
     */
    POSTING,
    /**
     * Subscribe to new comments to the posting.
     */
    POSTING_COMMENTS,
    /**
     * Subscribe to updates to the node profile.
     */
    PROFILE,
    /**
     * Subscribe to updates to the user list (its name is passed in <code>feedName</code> field).
     */
    USER_LIST;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(SubscriptionType type) {
        return type != null ? type.getValue() : null;
    }

    public static SubscriptionType forValue(String value) {
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
    public static SubscriptionType parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
