package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.SearchBlockUpdate;
import org.moera.lib.node.types.SearchCommentHeadingUpdate;
import org.moera.lib.node.types.SearchCommentMediaTextUpdate;
import org.moera.lib.node.types.SearchCommentUpdate;
import org.moera.lib.node.types.SearchContentUpdateType;
import org.moera.lib.node.types.SearchFriendUpdate;
import org.moera.lib.node.types.SearchPostingHeadingUpdate;
import org.moera.lib.node.types.SearchPostingMediaTextUpdate;
import org.moera.lib.node.types.SearchPostingUpdate;
import org.moera.lib.node.types.SearchReactionUpdate;
import org.moera.lib.node.types.SearchSubscriptionUpdate;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Notification sent to a Moera search engine when some content on the node was updated and needs reindexing.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchContentUpdatedNotification extends SubscriberNotification {

    private SearchContentUpdateType updateType;
    private SearchBlockUpdate blockUpdate;
    private SearchCommentHeadingUpdate commentHeadingUpdate;
    private SearchCommentMediaTextUpdate commentMediaTextUpdate;
    private SearchCommentUpdate commentUpdate;
    private SearchFriendUpdate friendUpdate;
    private SearchPostingHeadingUpdate postingHeadingUpdate;
    private SearchPostingMediaTextUpdate postingMediaTextUpdate;
    private SearchPostingUpdate postingUpdate;
    private SearchReactionUpdate reactionUpdate;
    private SearchSubscriptionUpdate subscriptionUpdate;

    public SearchContentUpdatedNotification() {
        super(NotificationType.SEARCH_CONTENT_UPDATED);
    }

    /**
     * Retrieves type of the content that was updated.
     *
     * @return the value
     */
    public SearchContentUpdateType getUpdateType() {
        return updateType;
    }

    /**
     * Sets type of the content that was updated.
     *
     * @param updateType the value to be set
     */
    public void setUpdateType(SearchContentUpdateType updateType) {
        this.updateType = updateType;
    }

    /**
     * Retrieves details about blocking/unblocking.
     *
     * @return the value
     */
    public SearchBlockUpdate getBlockUpdate() {
        return blockUpdate;
    }

    /**
     * Sets details about blocking/unblocking.
     *
     * @param blockUpdate the value to be set
     */
    public void setBlockUpdate(SearchBlockUpdate blockUpdate) {
        this.blockUpdate = blockUpdate;
    }

    /**
     * Retrieves details about the comment's heading.
     *
     * @return the value
     */
    public SearchCommentHeadingUpdate getCommentHeadingUpdate() {
        return commentHeadingUpdate;
    }

    /**
     * Sets details about the comment's heading.
     *
     * @param commentHeadingUpdate the value to be set
     */
    public void setCommentHeadingUpdate(SearchCommentHeadingUpdate commentHeadingUpdate) {
        this.commentHeadingUpdate = commentHeadingUpdate;
    }

    /**
     * Retrieves details about the comment's media attachment's text content.
     *
     * @return the value
     */
    public SearchCommentMediaTextUpdate getCommentMediaTextUpdate() {
        return commentMediaTextUpdate;
    }

    /**
     * Sets details about the comment's media attachment's text content.
     *
     * @param commentMediaTextUpdate the value to be set
     */
    public void setCommentMediaTextUpdate(SearchCommentMediaTextUpdate commentMediaTextUpdate) {
        this.commentMediaTextUpdate = commentMediaTextUpdate;
    }

    /**
     * Retrieves details about the comment.
     *
     * @return the value
     */
    public SearchCommentUpdate getCommentUpdate() {
        return commentUpdate;
    }

    /**
     * Sets details about the comment.
     *
     * @param commentUpdate the value to be set
     */
    public void setCommentUpdate(SearchCommentUpdate commentUpdate) {
        this.commentUpdate = commentUpdate;
    }

    /**
     * Retrieves details about the friendship.
     *
     * @return the value
     */
    public SearchFriendUpdate getFriendUpdate() {
        return friendUpdate;
    }

    /**
     * Sets details about the friendship.
     *
     * @param friendUpdate the value to be set
     */
    public void setFriendUpdate(SearchFriendUpdate friendUpdate) {
        this.friendUpdate = friendUpdate;
    }

    /**
     * Retrieves details about the posting's heading.
     *
     * @return the value
     */
    public SearchPostingHeadingUpdate getPostingHeadingUpdate() {
        return postingHeadingUpdate;
    }

    /**
     * Sets details about the posting's heading.
     *
     * @param postingHeadingUpdate the value to be set
     */
    public void setPostingHeadingUpdate(SearchPostingHeadingUpdate postingHeadingUpdate) {
        this.postingHeadingUpdate = postingHeadingUpdate;
    }

    /**
     * Retrieves details about the posting's media attachment's text content.
     *
     * @return the value
     */
    public SearchPostingMediaTextUpdate getPostingMediaTextUpdate() {
        return postingMediaTextUpdate;
    }

    /**
     * Sets details about the posting's media attachment's text content.
     *
     * @param postingMediaTextUpdate the value to be set
     */
    public void setPostingMediaTextUpdate(SearchPostingMediaTextUpdate postingMediaTextUpdate) {
        this.postingMediaTextUpdate = postingMediaTextUpdate;
    }

    /**
     * Retrieves details about the posting.
     *
     * @return the value
     */
    public SearchPostingUpdate getPostingUpdate() {
        return postingUpdate;
    }

    /**
     * Sets details about the posting.
     *
     * @param postingUpdate the value to be set
     */
    public void setPostingUpdate(SearchPostingUpdate postingUpdate) {
        this.postingUpdate = postingUpdate;
    }

    /**
     * Retrieves details about the reaction.
     *
     * @return the value
     */
    public SearchReactionUpdate getReactionUpdate() {
        return reactionUpdate;
    }

    /**
     * Sets details about the reaction.
     *
     * @param reactionUpdate the value to be set
     */
    public void setReactionUpdate(SearchReactionUpdate reactionUpdate) {
        this.reactionUpdate = reactionUpdate;
    }

    /**
     * Retrieves details about subscription/unsubscription.
     *
     * @return the value
     */
    public SearchSubscriptionUpdate getSubscriptionUpdate() {
        return subscriptionUpdate;
    }

    /**
     * Sets details about subscription/unsubscription.
     *
     * @param subscriptionUpdate the value to be set
     */
    public void setSubscriptionUpdate(SearchSubscriptionUpdate subscriptionUpdate) {
        this.subscriptionUpdate = subscriptionUpdate;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(updateType, "search.update-type.missing");
        if (blockUpdate != null) {
            blockUpdate.validate();
        }
        if (commentHeadingUpdate != null) {
            commentHeadingUpdate.validate();
        }
        if (commentMediaTextUpdate != null) {
            commentMediaTextUpdate.validate();
        }
        if (commentUpdate != null) {
            commentUpdate.validate();
        }
        if (friendUpdate != null) {
            friendUpdate.validate();
        }
        if (postingHeadingUpdate != null) {
            postingHeadingUpdate.validate();
        }
        if (postingMediaTextUpdate != null) {
            postingMediaTextUpdate.validate();
        }
        if (postingUpdate != null) {
            postingUpdate.validate();
        }
        if (reactionUpdate != null) {
            reactionUpdate.validate();
        }
        if (subscriptionUpdate != null) {
            subscriptionUpdate.validate();
        }
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("updateType", LogUtil.format(updateType.toString())));
    }

}
