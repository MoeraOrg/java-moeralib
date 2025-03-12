package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorySummaryData extends Structure implements Cloneable {

    private StorySummaryNode node;
    private StorySummaryEntry posting;
    private StorySummaryEntry comment;
    private List<StorySummaryEntry> comments;
    private Integer totalComments;
    private StorySummaryEntry repliedTo;
    private StorySummaryEntry parentPosting;
    private StorySummaryReaction reaction;
    private List<StorySummaryReaction> reactions;
    private Integer totalReactions;
    private String feedName;
    private SubscriptionReason subscriptionReason;
    private StorySummaryFriendGroup friendGroup;
    private StorySummaryBlocked blocked;
    private StorySummarySheriff sheriff;
    private String description;
    private List<StorySummaryPageClicks> clicks;

    /**
     * Retrieves a node.
     *
     * @return the value
     */
    public StorySummaryNode getNode() {
        return node;
    }

    /**
     * Sets a node.
     *
     * @param node the value to be set
     */
    public void setNode(StorySummaryNode node) {
        this.node = node;
    }

    /**
     * Retrieves a posting.
     *
     * @return the value
     */
    public StorySummaryEntry getPosting() {
        return posting;
    }

    /**
     * Sets a posting.
     *
     * @param posting the value to be set
     */
    public void setPosting(StorySummaryEntry posting) {
        this.posting = posting;
    }

    /**
     * Retrieves a comment.
     *
     * @return the value
     */
    public StorySummaryEntry getComment() {
        return comment;
    }

    /**
     * Sets a comment.
     *
     * @param comment the value to be set
     */
    public void setComment(StorySummaryEntry comment) {
        this.comment = comment;
    }

    /**
     * Retrieves list of comments.
     *
     * @return the value
     */
    public List<StorySummaryEntry> getComments() {
        return comments;
    }

    /**
     * Sets list of comments.
     *
     * @param comments the value to be set
     */
    public void setComments(List<StorySummaryEntry> comments) {
        this.comments = comments;
    }

    /**
     * Retrieves total number of comments.
     *
     * @return the value
     */
    public Integer getTotalComments() {
        return totalComments;
    }

    /**
     * Sets total number of comments.
     *
     * @param totalComments the value to be set
     */
    public void setTotalComments(Integer totalComments) {
        this.totalComments = totalComments;
    }

    /**
     * Retrieves the comment replied to.
     *
     * @return the value
     */
    public StorySummaryEntry getRepliedTo() {
        return repliedTo;
    }

    /**
     * Sets the comment replied to.
     *
     * @param repliedTo the value to be set
     */
    public void setRepliedTo(StorySummaryEntry repliedTo) {
        this.repliedTo = repliedTo;
    }

    /**
     * Retrieves the parent posting of the media.
     *
     * @return the value
     */
    public StorySummaryEntry getParentPosting() {
        return parentPosting;
    }

    /**
     * Sets the parent posting of the media.
     *
     * @param parentPosting the value to be set
     */
    public void setParentPosting(StorySummaryEntry parentPosting) {
        this.parentPosting = parentPosting;
    }

    /**
     * Retrieves a reaction.
     *
     * @return the value
     */
    public StorySummaryReaction getReaction() {
        return reaction;
    }

    /**
     * Sets a reaction.
     *
     * @param reaction the value to be set
     */
    public void setReaction(StorySummaryReaction reaction) {
        this.reaction = reaction;
    }

    /**
     * Retrieves list of reactions.
     *
     * @return the value
     */
    public List<StorySummaryReaction> getReactions() {
        return reactions;
    }

    /**
     * Sets list of reactions.
     *
     * @param reactions the value to be set
     */
    public void setReactions(List<StorySummaryReaction> reactions) {
        this.reactions = reactions;
    }

    /**
     * Retrieves total number of reactions.
     *
     * @return the value
     */
    public Integer getTotalReactions() {
        return totalReactions;
    }

    /**
     * Sets total number of reactions.
     *
     * @param totalReactions the value to be set
     */
    public void setTotalReactions(Integer totalReactions) {
        this.totalReactions = totalReactions;
    }

    /**
     * Retrieves name of a feed.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets name of a feed.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves subscription reason.
     *
     * @return the value
     */
    public SubscriptionReason getSubscriptionReason() {
        return subscriptionReason;
    }

    /**
     * Sets subscription reason.
     *
     * @param subscriptionReason the value to be set
     */
    public void setSubscriptionReason(SubscriptionReason subscriptionReason) {
        this.subscriptionReason = subscriptionReason;
    }

    /**
     * Retrieves a group of friends.
     *
     * @return the value
     */
    public StorySummaryFriendGroup getFriendGroup() {
        return friendGroup;
    }

    /**
     * Sets a group of friends.
     *
     * @param friendGroup the value to be set
     */
    public void setFriendGroup(StorySummaryFriendGroup friendGroup) {
        this.friendGroup = friendGroup;
    }

    /**
     * Retrieves summary of blocking a user.
     *
     * @return the value
     */
    public StorySummaryBlocked getBlocked() {
        return blocked;
    }

    /**
     * Sets summary of blocking a user.
     *
     * @param blocked the value to be set
     */
    public void setBlocked(StorySummaryBlocked blocked) {
        this.blocked = blocked;
    }

    /**
     * Retrieves summary of an action of a sheriff.
     *
     * @return the value
     */
    public StorySummarySheriff getSheriff() {
        return sheriff;
    }

    /**
     * Sets summary of an action of a sheriff.
     *
     * @param sheriff the value to be set
     */
    public void setSheriff(StorySummarySheriff sheriff) {
        this.sheriff = sheriff;
    }

    /**
     * Retrieves additional descriptive text.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets additional descriptive text.
     *
     * @param description the value to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves list of pages with number of clicks on each of them.
     *
     * @return the value
     */
    public List<StorySummaryPageClicks> getClicks() {
        return clicks;
    }

    /**
     * Sets list of pages with number of clicks on each of them.
     *
     * @param clicks the value to be set
     */
    public void setClicks(List<StorySummaryPageClicks> clicks) {
        this.clicks = clicks;
    }

    /**
     * Creates and returns a copy of this {@code StorySummaryData} object.
     *
     * @return a clone of this instance
     */
    @Override
    public StorySummaryData clone() {
        try {
            return (StorySummaryData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
