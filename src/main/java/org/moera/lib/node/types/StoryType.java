package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StoryType {

    /**
     * A posting was added; **stories of this type are used for feeds containing postings**.
     */
    POSTING_ADDED, // 0
    /**
     * A positive reaction was added to the user's posting.
     */
    REACTION_ADDED_POSITIVE, // 1
    /**
     * A negative reaction was added to the user's posting.
     */
    REACTION_ADDED_NEGATIVE, // 2
    /**
     * The user was mentioned in a posting on another node.
     */
    MENTION_POSTING, // 3
    /**
     * Another node subscribed to user's feed.
     */
    SUBSCRIBER_ADDED, // 4
    /**
     * Another node unsubscribed from user's feed.
     */
    SUBSCRIBER_DELETED, // 5
    /**
     * A comment was added under the user's posting.
     */
    COMMENT_ADDED, // 6
    /**
     * The user was mentioned in a comment.
     */
    MENTION_COMMENT, // 7
    /**
     * A reply was added to the user's comment.
     */
    REPLY_COMMENT, // 8
    /**
     * A positive reaction was added to the user's comment.
     */
    COMMENT_REACTION_ADDED_POSITIVE, // 9
    /**
     * A negative reaction was added to the user's comment.
     */
    COMMENT_REACTION_ADDED_NEGATIVE, // 10
    /**
     * A comment was added under a posting the user is subscribed to.
     */
    REMOTE_COMMENT_ADDED, // 11
    /**
     * A failed attempt to post a comment.
     */
    COMMENT_POST_TASK_FAILED, // 12
    /**
     * A failed attempt to update a comment.
     */
    COMMENT_UPDATE_TASK_FAILED, // 13
    /**
     * A posting was updated.
     */
    POSTING_UPDATED, // 14
    /**
     * A failed attempt to create a posting.
     */
    POSTING_POST_TASK_FAILED, // 15
    /**
     * A failed attempt to update a posting.
     */
    POSTING_UPDATE_TASK_FAILED, // 16
    /**
     * A positive reaction was added to a media attached to a posting.
     */
    POSTING_MEDIA_REACTION_ADDED_POSITIVE, // 17
    /**
     * A negative reaction was added to a media attached to a posting.
     */
    POSTING_MEDIA_REACTION_ADDED_NEGATIVE, // 18
    /**
     * A positive reaction was added to a media attached to a comment.
     */
    COMMENT_MEDIA_REACTION_ADDED_POSITIVE, // 19
    /**
     * A positive reaction was added to a media attached to a comment.
     */
    COMMENT_MEDIA_REACTION_ADDED_NEGATIVE, // 20
    /**
     * A failed attempt to add a reaction to a media attached to a posting.
     */
    POSTING_MEDIA_REACTION_FAILED, // 21
    /**
     * A failed attempt to add a reaction to a media attached to a comment.
     */
    COMMENT_MEDIA_REACTION_FAILED, // 22
    /**
     * A failed attempt to subscribe to a posting.
     */
    POSTING_SUBSCRIBE_TASK_FAILED, // 23
    /**
     * A failed attempt to post a reaction to a posting.
     */
    POSTING_REACTION_TASK_FAILED, // 24
    /**
     * A failed attempt to post a reaction to a comment.
     */
    COMMENT_REACTION_TASK_FAILED, // 25
    /**
     * A remote node has added the user to friends.
     */
    FRIEND_ADDED, // 26
    /**
     * A remote node has removed the user from friends.
     */
    FRIEND_DELETED, // 27
    /**
     * A remote group of friends, the user was a member of, has been deleted.
     */
    FRIEND_GROUP_DELETED, // 28
    /**
     * A remote node asked to subscribe to it.
     */
    ASKED_TO_SUBSCRIBE, // 29
    /**
     * A remote node asked to add it to friends.
     */
    ASKED_TO_FRIEND, // 30
    /**
     * A remote node has blocked the user globally.
     */
    BLOCKED_USER, // 31
    /**
     * A remote node has unblocked the user globally.
     */
    UNBLOCKED_USER, // 32
    /**
     * A remote node has blocked the user in a posting.
     */
    BLOCKED_USER_IN_POSTING, // 33
    /**
     * A remote node has unblocked the user in a posting.
     */
    UNBLOCKED_USER_IN_POSTING, // 34
    /**
     * User's entry was marked by a sheriff.
     */
    SHERIFF_MARKED, // 35
    /**
     * User's entry was unmarked by a sheriff.
     */
    SHERIFF_UNMARKED, // 36
    /**
     * A new complaint was received.
     */
    SHERIFF_COMPLAINT_ADDED, // 37
    /**
     * A decision was made on the user's complaint.
     */
    SHERIFF_COMPLAINT_DECIDED, // 38
    /**
     * The node's owner has connected to it after long inactivity and the node is leaving the frozen state.
     */
    DEFROSTING, // 39
    /**
     * Visits from search engines report.
     */
    SEARCH_REPORT, // 40
    /**
     * Reminder for the user to set a full name.
     */
    REMINDER_FULL_NAME, // 41
    /**
     * Reminder for the user to set an avatar.
     */
    REMINDER_AVATAR, // 42
    /**
     * Reminder for the user to set an email.
     */
    REMINDER_EMAIL, // 43
    /**
     * Reminder for the user to allow access for Google Play sheriff.
     */
    REMINDER_SHERIFF_ALLOW; // 44

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
