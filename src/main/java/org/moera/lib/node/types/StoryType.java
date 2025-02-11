package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StoryType {

    ASKED_TO_FRIEND,
    ASKED_TO_SUBSCRIBE,
    BLOCKED_USER,
    BLOCKED_USER_IN_POSTING,
    COMMENT_ADDED,
    COMMENT_MEDIA_REACTION_ADDED_NEGATIVE,
    COMMENT_MEDIA_REACTION_ADDED_POSITIVE,
    COMMENT_MEDIA_REACTION_FAILED,
    COMMENT_POST_TASK_FAILED,
    COMMENT_REACTION_ADDED_NEGATIVE,
    COMMENT_REACTION_ADDED_POSITIVE,
    COMMENT_REACTION_TASK_FAILED,
    COMMENT_UPDATE_TASK_FAILED,
    DEFROSTING,
    FRIEND_ADDED,
    FRIEND_DELETED,
    FRIEND_GROUP_DELETED,
    MENTION_COMMENT,
    MENTION_POSTING,
    POSTING_ADDED,
    POSTING_MEDIA_REACTION_ADDED_NEGATIVE,
    POSTING_MEDIA_REACTION_ADDED_POSITIVE,
    POSTING_MEDIA_REACTION_FAILED,
    POSTING_POST_TASK_FAILED,
    POSTING_REACTION_TASK_FAILED,
    POSTING_SUBSCRIBE_TASK_FAILED,
    POSTING_UPDATE_TASK_FAILED,
    POSTING_UPDATED,
    REACTION_ADDED_NEGATIVE,
    REACTION_ADDED_POSITIVE,
    REMINDER_AVATAR,
    REMINDER_EMAIL,
    REMINDER_FULL_NAME,
    REMINDER_SHERIFF_ALLOW,
    REMOTE_COMMENT_ADDED,
    REPLY_COMMENT,
    SEARCH_REPORT,
    SHERIFF_COMPLAINT_ADDED,
    SHERIFF_COMPLAINT_DECIDED,
    SHERIFF_MARKED,
    SHERIFF_UNMARKED,
    SUBSCRIBER_ADDED,
    SUBSCRIBER_DELETED,
    UNBLOCKED_USER,
    UNBLOCKED_USER_IN_POSTING;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(StoryType type) {
        return type != null ? type.getValue() : null;
    }

    public static StoryType forValue(String value) {
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
    public static StoryType parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
