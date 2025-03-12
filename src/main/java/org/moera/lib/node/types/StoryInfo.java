package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoryInfo extends Structure implements Cloneable {

    private String id;
    private String feedName;
    private StoryType storyType;
    private long createdAt;
    private long publishedAt;
    private Boolean pinned;
    private long moment;
    private Boolean viewed;
    private Boolean read;
    private Boolean satisfied;
    private String summaryNodeName;
    private String summaryFullName;
    private AvatarImage summaryAvatar;
    private String summary;
    private StorySummaryData summaryData;
    private PostingInfo posting;
    private String postingId;
    private CommentInfo comment;
    private String commentId;
    private String remoteNodeName;
    private String remoteFullName;
    private String remotePostingId;
    private String remoteCommentId;
    private String remoteMediaId;
    private StoryOperations operations;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets .
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves name of the feed.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets name of the feed.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves type of the story.
     *
     * @return the value
     */
    public StoryType getStoryType() {
        return storyType;
    }

    /**
     * Sets type of the story.
     *
     * @param storyType the value to be set
     */
    public void setStoryType(StoryType storyType) {
        this.storyType = storyType;
    }

    /**
     * Retrieves story creation timestamp - the real time when the story was created.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets story creation timestamp - the real time when the story was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves story publication timestamp - the time the story is published under in the feed.
     *
     * @return the value
     */
    public long getPublishedAt() {
        return publishedAt;
    }

    /**
     * Sets story publication timestamp - the time the story is published under in the feed.
     *
     * @param publishedAt the value to be set
     */
    public void setPublishedAt(long publishedAt) {
        this.publishedAt = publishedAt;
    }

    /**
     * Retrieves <code>true</code>, if the story is pinned (should appear before any non-pinned story in the feed),
     * <code>false</code> otherwise
     * .
     *
     * @return the value
     */
    public Boolean getPinned() {
        return pinned;
    }

    /**
     * Sets <code>true</code>, if the story is pinned (should appear before any non-pinned story in the feed),
     * <code>false</code> otherwise
     * .
     *
     * @param pinned the value to be set
     */
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    /**
     * Retrieves .
     *
     * @return the value
     */
    public long getMoment() {
        return moment;
    }

    /**
     * Sets .
     *
     * @param moment the value to be set
     */
    public void setMoment(long moment) {
        this.moment = moment;
    }

    /**
     * Retrieves <code>true</code>, if the story has been viewed by node owner, <code>false</code> otherwise.
     *
     * @return the value
     */
    public Boolean getViewed() {
        return viewed;
    }

    /**
     * Sets <code>true</code>, if the story has been viewed by node owner, <code>false</code> otherwise.
     *
     * @param viewed the value to be set
     */
    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * Retrieves <code>true</code>, if the story has been read by node owner, <code>false</code> otherwise.
     *
     * @return the value
     */
    public Boolean getRead() {
        return read;
    }

    /**
     * Sets <code>true</code>, if the story has been read by node owner, <code>false</code> otherwise.
     *
     * @param read the value to be set
     */
    public void setRead(Boolean read) {
        this.read = read;
    }

    /**
     * Retrieves if the story is associated with a user action (for example, it contains a form that should be
     * submitted), this flag is set to <code>true</code> if the action is done already, and <code>false</code>
     * otherwise
     * .
     *
     * @return the value
     */
    public Boolean getSatisfied() {
        return satisfied;
    }

    /**
     * Sets if the story is associated with a user action (for example, it contains a form that should be submitted),
     * this flag is set to <code>true</code> if the action is done already, and <code>false</code> otherwise
     * .
     *
     * @param satisfied the value to be set
     */
    public void setSatisfied(Boolean satisfied) {
        this.satisfied = satisfied;
    }

    /**
     * Retrieves name of the node related to the summary of the story.
     *
     * @return the value
     */
    public String getSummaryNodeName() {
        return summaryNodeName;
    }

    /**
     * Sets name of the node related to the summary of the story.
     *
     * @param summaryNodeName the value to be set
     */
    public void setSummaryNodeName(String summaryNodeName) {
        this.summaryNodeName = summaryNodeName;
    }

    /**
     * Retrieves full name of the node related to the summary of the story.
     *
     * @return the value
     */
    public String getSummaryFullName() {
        return summaryFullName;
    }

    /**
     * Sets full name of the node related to the summary of the story.
     *
     * @param summaryFullName the value to be set
     */
    public void setSummaryFullName(String summaryFullName) {
        this.summaryFullName = summaryFullName;
    }

    /**
     * Retrieves avatar of the summary of the story.
     *
     * @return the value
     */
    public AvatarImage getSummaryAvatar() {
        return summaryAvatar;
    }

    /**
     * Sets avatar of the summary of the story.
     *
     * @param summaryAvatar the value to be set
     */
    public void setSummaryAvatar(AvatarImage summaryAvatar) {
        this.summaryAvatar = summaryAvatar;
    }

    /**
     * Retrieves user-readable summary of the story - this field is <b>deprecated</b> in favor of
     * <code>summaryData</code>
     * .
     *
     * @return the value
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets user-readable summary of the story - this field is <b>deprecated</b> in favor of <code>summaryData</code>
     * .
     *
     * @param summary the value to be set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Retrieves details of the story; they are used by the client to build a user-readable summary of the story.
     *
     * @return the value
     */
    public StorySummaryData getSummaryData() {
        return summaryData;
    }

    /**
     * Sets details of the story; they are used by the client to build a user-readable summary of the story.
     *
     * @param summaryData the value to be set
     */
    public void setSummaryData(StorySummaryData summaryData) {
        this.summaryData = summaryData;
    }

    /**
     * Retrieves the posting this story is about.
     *
     * @return the value
     */
    public PostingInfo getPosting() {
        return posting;
    }

    /**
     * Sets the posting this story is about.
     *
     * @param posting the value to be set
     */
    public void setPosting(PostingInfo posting) {
        this.posting = posting;
    }

    /**
     * Retrieves ID of the posting this story is about, used if the whole posting is not returned.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting this story is about, used if the whole posting is not returned.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves the comment this story is about.
     *
     * @return the value
     */
    public CommentInfo getComment() {
        return comment;
    }

    /**
     * Sets the comment this story is about.
     *
     * @param comment the value to be set
     */
    public void setComment(CommentInfo comment) {
        this.comment = comment;
    }

    /**
     * Retrieves ID of the comment this story is about, used if the whole posting is not returned.
     *
     * @return the value
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets ID of the comment this story is about, used if the whole posting is not returned.
     *
     * @param commentId the value to be set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * Retrieves name of the node this story is about.
     *
     * @return the value
     */
    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    /**
     * Sets name of the node this story is about.
     *
     * @param remoteNodeName the value to be set
     */
    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    /**
     * Retrieves full name of the node this story is about.
     *
     * @return the value
     */
    public String getRemoteFullName() {
        return remoteFullName;
    }

    /**
     * Sets full name of the node this story is about.
     *
     * @param remoteFullName the value to be set
     */
    public void setRemoteFullName(String remoteFullName) {
        this.remoteFullName = remoteFullName;
    }

    /**
     * Retrieves ID of the posting at remote node this story is about.
     *
     * @return the value
     */
    public String getRemotePostingId() {
        return remotePostingId;
    }

    /**
     * Sets ID of the posting at remote node this story is about.
     *
     * @param remotePostingId the value to be set
     */
    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
    }

    /**
     * Retrieves ID of the comment at remote node this story is about.
     *
     * @return the value
     */
    public String getRemoteCommentId() {
        return remoteCommentId;
    }

    /**
     * Sets ID of the comment at remote node this story is about.
     *
     * @param remoteCommentId the value to be set
     */
    public void setRemoteCommentId(String remoteCommentId) {
        this.remoteCommentId = remoteCommentId;
    }

    /**
     * Retrieves ID of the media at remote node this story is about.
     *
     * @return the value
     */
    public String getRemoteMediaId() {
        return remoteMediaId;
    }

    /**
     * Sets ID of the media at remote node this story is about.
     *
     * @param remoteMediaId the value to be set
     */
    public void setRemoteMediaId(String remoteMediaId) {
        this.remoteMediaId = remoteMediaId;
    }

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public StoryOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(StoryOperations operations) {
        this.operations = operations;
    }

    @Override
    public void validate() {
        super.validate();
        if (posting != null) {
            posting.validate();
        }
        if (comment != null) {
            comment.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code StoryInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public StoryInfo clone() {
        try {
            return (StoryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
