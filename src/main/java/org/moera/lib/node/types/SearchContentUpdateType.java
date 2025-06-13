package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SearchContentUpdateType {

    /**
     * The node was blocked.
     */
    BLOCK,
    /**
     * A comment was added.
     */
    COMMENT_ADD,
    /**
     * A comment was updated.
     */
    COMMENT_UPDATE,
    /**
     * A comment's heading was updated.
     */
    COMMENT_UPDATE_HEADING,
    /**
     * Text content of a media attached to a comment was updated.
     */
    COMMENT_UPDATE_MEDIA_TEXT,
    /**
     * A comment was deleted.
     */
    COMMENT_DELETE,
    /**
     * The node was added to the list of friends.
     */
    FRIEND,
    /**
     * The profile was updated.
     */
    PROFILE,
    /**
     * A posting was added.
     */
    POSTING_ADD,
    /**
     * A posting was updated; sent by the original node only.
     */
    POSTING_UPDATE,
    /**
     * A posting's heading was updated; sent by the original node only.
     */
    POSTING_UPDATE_HEADING,
    /**
     * Text content of a media attached to a posting was updated; sent by the original node only.
     */
    POSTING_UPDATE_MEDIA_TEXT,
    /**
     * A posting was deleted.
     */
    POSTING_DELETE,
    /**
     * A reaction was added.
     */
    REACTION_ADD,
    /**
     * A reaction was deleted.
     */
    REACTION_DELETE,
    /**
     * All reaction were deleted.
     */
    REACTIONS_DELETE_ALL,
    /**
     * Subscribed to the node.
     */
    SUBSCRIBE,
    /**
     * The node was unblocked.
     */
    UNBLOCK,
    /**
     * The node was removed from the list of friends.
     */
    UNFRIEND,
    /**
     * Unsubscribed from the node.
     */
    UNSUBSCRIBE;

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
    public static String toValue(SearchContentUpdateType type) {
        return type != null ? type.getValue() : null;
    }

    /**
     * Converts the given string value to an enum constant.
     * If the conversion fails due to an invalid value, {@code null} is returned.
     *
     * @param value the string representation of an enum constant; must not be {@code null}
     * @return the corresponding enum constant, or {@code null} if the value is invalid
     */
    public static SearchContentUpdateType forValue(String value) {
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
     * Parses the given string value into an instance of {@link SearchContentUpdateType}.
     *
     * @param value the input string to parse; must not be {@code null}
     * @return the corresponding enum constant
     * @throws IllegalArgumentException if the input string does not match any enum constant
     */
    @JsonCreator
    public static SearchContentUpdateType parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
