package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingSourceInfo extends Structure implements Cloneable {

    private String nodeName;
    private String fullName;
    private AvatarImage avatar;
    private String feedName;
    private String postingId;
    private long createdAt;

    /**
     * Retrieves name of the remote node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the remote node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves full name of the remote node.
     *
     * @return the value
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets full name of the remote node.
     *
     * @param fullName the value to be set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Retrieves avatar of the remote node.
     *
     * @return the value
     */
    public AvatarImage getAvatar() {
        return avatar;
    }

    /**
     * Sets avatar of the remote node.
     *
     * @param avatar the value to be set
     */
    public void setAvatar(AvatarImage avatar) {
        this.avatar = avatar;
    }

    /**
     * Retrieves name of the feed on the remote node.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets name of the feed on the remote node.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves ID of the posting on the remote node.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting on the remote node.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves timestamp when the posting was received from this source.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets timestamp when the posting was received from this source.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Creates and returns a copy of this {@code PostingSourceInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PostingSourceInfo clone() {
        try {
            return (PostingSourceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
