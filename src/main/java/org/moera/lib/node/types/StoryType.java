package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StoryType {

    /**
     * A remote node asked to add it to friends.
     */
    ASKED_TO_FRIEND,
    /**
     * A remote node asked to subscribe to it.
     */
    ASKED_TO_SUBSCRIBE,
    /**
     * A remote node has blocked the user globally.
     */
    BLOCKED_USER,
    /**
     * A remote node has blocked the user in a posting.
     */
    BLOCKED_USER_IN_POSTING,
    /**
     * A comment was added under the user's posting.
     */
    COMMENT_ADDED,
    /**
     * A positive reaction was added to a media attached to a comment.
     */
    COMMENT_MEDIA_REACTION_ADDED_NEGATIVE,
    /**
     * A positive reaction was added to a media attached to a comment.
     */
    COMMENT_MEDIA_REACTION_ADDED_POSITIVE,
    /**
     * A failed attempt to add a reaction to a media attached to a comment.
     */
    COMMENT_MEDIA_REACTION_FAILED,
    /**
     * A failed attempt to post a comment.
     */
    COMMENT_POST_TASK_FAILED,
    /**
     * A negative reaction was added to the user's comment.
     */
    COMMENT_REACTION_ADDED_NEGATIVE,
    /**
     * A positive reaction was added to the user's comment.
     */
    COMMENT_REACTION_ADDED_POSITIVE,
    /**
     * A failed attempt to post a reaction to a comment.
     */
    COMMENT_REACTION_TASK_FAILED,
    /**
     * A failed attempt to update a comment.
     */
    COMMENT_UPDATE_TASK_FAILED,
    /**
     * The node's owner has connected to it after long inactivity and the node is leaving the frozen state.
     */
    DEFROSTING,
    /**
     * A remote node has added the user to friends.
     */
    FRIEND_ADDED,
    /**
     * A remote node has removed the user from friends.
     */
    FRIEND_DELETED,
    /**
     * A remote group of friends, the user was a member of, has been deleted.
     */
    FRIEND_GROUP_DELETED,
    /**
     * The user was mentioned in a comment.
     */
    MENTION_COMMENT,
    /**
     * The user was mentioned in a posting on another node.
     */
    MENTION_POSTING,
    /**
     * A posting was added; **stories of this type are used for feeds containing postings**.
     */
    POSTING_ADDED,
    /**
     * A negative reaction was added to a media attached to a posting.
     */
    POSTING_MEDIA_REACTION_ADDED_NEGATIVE,
    /**
     * A positive reaction was added to a media attached to a posting.
     */
    POSTING_MEDIA_REACTION_ADDED_POSITIVE,
    /**
     * A failed attempt to add a reaction to a media attached to a posting.
     */
    POSTING_MEDIA_REACTION_FAILED,
    /**
     * A failed attempt to create a posting.
     */
    POSTING_POST_TASK_FAILED,
    /**
     * A failed attempt to post a reaction to a posting.
     */
    POSTING_REACTION_TASK_FAILED,
    /**
     * A failed attempt to subscribe to a posting.
     */
    POSTING_SUBSCRIBE_TASK_FAILED,
    /**
     * A failed attempt to update a posting.
     */
    POSTING_UPDATE_TASK_FAILED,
    /**
     * A posting was updated.
     */
    POSTING_UPDATED,
    /**
     * A negative reaction was added to the user's posting.
     */
    REACTION_ADDED_NEGATIVE,
    /**
     * A positive reaction was added to the user's posting.
     */
    REACTION_ADDED_POSITIVE,
    /**
     * Reminder for the user to set an avatar.
     */
    REMINDER_AVATAR,
    /**
     * Reminder for the user to set an email.
     */
    REMINDER_EMAIL,
    /**
     * Reminder for the user to set a full name.
     */
    REMINDER_FULL_NAME,
    /**
     * Reminder for the user to allow access for Google Play sheriff.
     */
    REMINDER_SHERIFF_ALLOW,
    /**
     * A comment was added under a posting the user is subscribed to.
     */
    REMOTE_COMMENT_ADDED,
    /**
     * A reply was added to the user's comment.
     */
    REPLY_COMMENT,
    /**
     * Visits from search engines report.
     */
    SEARCH_REPORT,
    /**
     * A new complaint was received.
     */
    SHERIFF_COMPLAINT_ADDED,
    /**
     * A decision was made on the user's complaint.
     */
    SHERIFF_COMPLAINT_DECIDED,
    /**
     * User's entry was marked by a sheriff.
     */
    SHERIFF_MARKED,
    /**
     * User's entry was unmarked by a sheriff.
     */
    SHERIFF_UNMARKED,
    /**
     * Another node subscribed to user's feed.
     */
    SUBSCRIBER_ADDED,
    /**
     * Another node unsubscribed from user's feed.
     */
    SUBSCRIBER_DELETED,
    /**
     * A remote node has unblocked the user globally.
     */
    UNBLOCKED_USER,
    /**
     * A remote node has unblocked the user in a posting.
     */
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
