package org.moera.lib.node.types.notifications;

// This file is generated

/**
 * The type of the notification.
 */
public enum NotificationType {

    /**
     * A mention of the receiver in a posting on the sending node added.
     */
    MENTION_POSTING_ADDED(MentionPostingAddedNotification.class), // 0
    /**
     * A mention of the receiver in a posting on the sending node deleted.
     */
    MENTION_POSTING_DELETED(MentionPostingDeletedNotification.class), // 1
    /**
     * A new story has been added to a feed the receiver is subscribed to.
     */
    STORY_ADDED(StoryAddedNotification.class), // 2
    /**
     * Posting the receiver is subscribed to has been updated.
     */
    POSTING_UPDATED(PostingUpdatedNotification.class), // 3
    /**
     * Posting the receiver is subscribed to has been deleted.
     */
    POSTING_DELETED(PostingDeletedNotification.class), // 4
    /**
     * Reactions have been updated at the posting the receiver is subscribed to.
     */
    POSTING_REACTIONS_UPDATED(PostingReactionsUpdatedNotification.class), // 5
    /**
     * A mention of the receiver in a comment on the sending node added.
     */
    MENTION_COMMENT_ADDED(MentionCommentAddedNotification.class), // 6
    /**
     * A mention of the receiver in a comment on the sending node deleted.
     */
    MENTION_COMMENT_DELETED(MentionCommentDeletedNotification.class), // 7
    /**
     * Comments have been updated at the posting the receiver is subscribed to.
     */
    POSTING_COMMENTS_UPDATED(PostingCommentsUpdatedNotification.class), // 8
    /**
     * A reply to a comment of the receiver on the sending node added.
     */
    REPLY_COMMENT_ADDED(ReplyCommentAddedNotification.class), // 9
    /**
     * A reply to a comment of the receiver on the sending node deleted.
     */
    REPLY_COMMENT_DELETED(ReplyCommentDeletedNotification.class), // 10
    /**
     * Reaction added to a comment owned by the receiver.
     */
    COMMENT_REACTION_ADDED(CommentReactionAddedNotification.class), // 11
    /**
     * Reaction deleted from a comment owned by the receiver.
     */
    COMMENT_REACTION_DELETED(CommentReactionDeletedNotification.class), // 12
    /**
     * All reactions deleted from a comment owned by the receiver.
     */
    COMMENT_REACTION_DELETED_ALL(CommentReactionDeletedAllNotification.class), // 13
    /**
     * A comment added to the posting the receiver is subscribed to.
     */
    POSTING_COMMENT_ADDED(PostingCommentAddedNotification.class), // 14
    /**
     * A comment deleted from the posting the receiver is subscribed to.
     */
    POSTING_COMMENT_DELETED(PostingCommentDeletedNotification.class), // 15
    /**
     * Sender's profile the receiver is subscribed to has been updated.
     */
    PROFILE_UPDATED(ProfileUpdatedNotification.class), // 16
    /**
     * An important update was done to the posting the receiver is subscribed to (subscription to comments is enough).
     */
    POSTING_IMPORTANT_UPDATE(PostingImportantUpdateNotification.class), // 17
    /**
     * Reaction added to a posting owned by the receiver.
     */
    POSTING_REACTION_ADDED(PostingReactionAddedNotification.class), // 18
    /**
     * Reaction deleted from a posting owned by the receiver.
     */
    POSTING_REACTION_DELETED(PostingReactionDeletedNotification.class), // 19
    /**
     * Deleted all reactions from a posting owned by the receiver.
     */
    POSTING_REACTION_DELETED_ALL(PostingReactionDeletedAllNotification.class), // 20
    /**
     * The receiver was added to or removed from groups of friends on the sending node.
     */
    FRIENDSHIP_UPDATED(FriendshipUpdatedNotification.class), // 21
    /**
     * A group of friends that includes the receiver has been updated on the sending node.
     */
    FRIEND_GROUP_UPDATED(FriendGroupUpdatedNotification.class), // 22
    /**
     * A group of friends that includes the receiver has been deleted on the sending node.
     */
    FRIEND_GROUP_DELETED(FriendGroupDeletedNotification.class), // 23
    /**
     * A remote node asks this node for something.
     */
    ASKED(AskedNotification.class), // 24
    /**
     * A remote node has blocked this node.
     */
    BLOCKING_ADDED(BlockingAddedNotification.class), // 25
    /**
     * A remote node has unblocked this node.
     */
    BLOCKING_DELETED(BlockingDeletedNotification.class), // 26
    /**
     * The sending node got a sheriff's order related to the receiver's posting.
     */
    SHERIFF_ORDER_FOR_POSTING_ADDED(SheriffOrderForPostingAddedNotification.class), // 27
    /**
     * The sending node got a cancellation of a sheriff's order related to the receiver's posting.
     */
    SHERIFF_ORDER_FOR_POSTING_DELETED(SheriffOrderForPostingDeletedNotification.class), // 28
    /**
     * The sending node got a sheriff's order related to the receiver's comment.
     */
    SHERIFF_ORDER_FOR_COMMENT_ADDED(SheriffOrderForCommentAddedNotification.class), // 29
    /**
     * The sending node got a cancellation of a sheriff's order related to the receiver's comment.
     */
    SHERIFF_ORDER_FOR_COMMENT_DELETED(SheriffOrderForCommentDeletedNotification.class), // 30
    /**
     * The sheriff made a decision on the receiver's complaint.
     */
    SHERIFF_COMPLAINT_DECIDED(SheriffComplaintDecidedNotification.class), // 31
    /**
     * A node was added to a user list the receiver is subscribed to.
     */
    USER_LIST_ITEM_ADDED(UserListItemAddedNotification.class), // 32
    /**
     * A node was deleted from a user list the receiver is subscribed to.
     */
    USER_LIST_ITEM_DELETED(UserListItemDeletedNotification.class), // 33
    /**
     * The set of administrative permissions granted by the sending node to this node has been updated.
     */
    GRANT_UPDATED(GrantUpdatedNotification.class), // 34
    /**
     * The receiver's posting/comment/media has been visited on the sending node from a search engine.
     */
    SEARCH_ENGINE_CLICKED(SearchEngineClickedNotification.class), // 35
    /**
     * Notification sent to a Moera search engine when some content on the node was updated and needs reindexing.
     */
    SEARCH_CONTENT_UPDATED(SearchContentUpdatedNotification.class), // 36
    /**
     * The sending node got a sheriff's order related to all postings in the receiver's feed.
     */
    SHERIFF_ORDER_FOR_FEED_ADDED(SheriffOrderForFeedAddedNotification.class), // 37
    /**
     * The sending node got a cancellation of a sheriff's order related to all postings in the receiver's feed.
     */
    SHERIFF_ORDER_FOR_FEED_DELETED(SheriffOrderForFeedDeletedNotification.class), // 38
    /**
     * Heading of a posting the receiver is subscribed to has been updated.
     */
    POSTING_HEADING_UPDATED(PostingHeadingUpdatedNotification.class), // 39
    /**
     * Text content of a media attached to a posting the receiver is subscribed to has been updated.
     */
    POSTING_MEDIA_TEXT_UPDATED(PostingMediaTextUpdatedNotification.class); // 40

    private final Class<? extends Notification> structure;

    NotificationType(Class<? extends Notification> structure) {
        this.structure = structure;
    }

    /**
     * Retrieves the structure corresponding to the notification type.
     *
     * @return a class object representing the structure
     */
    public Class<? extends Notification> getStructure() {
        return structure;
    }

    /**
     * Retrieves the notification type in its string representation.
     *
     * @return the string representation of the notification type
     */
    public String getValue() {
        return name().toLowerCase().replace('_', '-');
    }

    /**
     * Returns a {@code NotificationType} corresponding to the provided string value.
     *
     * @param value the string value
     * @return the {@code NotificationType} corresponding to the provided string value,
     *         or {@code null} if the notification type is unknown
     */
    public static NotificationType forValue(String value) {
        String name = value.toUpperCase().replace('-', '_');
        try {
            return valueOf(name);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}
