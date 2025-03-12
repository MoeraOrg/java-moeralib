package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedInstantInfo extends Structure implements Cloneable {

    private String id;
    private StoryType storyType;
    private String entryId;
    private String remoteNodeName;
    private String remotePostingId;
    private String remoteOwnerName;
    private long createdAt;
    private Long deadline;

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
     * Retrieves ID of the local entry the blocked story should be related to.
     *
     * @return the value
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * Sets ID of the local entry the blocked story should be related to.
     *
     * @param entryId the value to be set
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * Retrieves node name of the remote posting the blocked story should be related to.
     *
     * @return the value
     */
    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    /**
     * Sets node name of the remote posting the blocked story should be related to.
     *
     * @param remoteNodeName the value to be set
     */
    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    /**
     * Retrieves ID of the remote posting the blocked story should be related to.
     *
     * @return the value
     */
    public String getRemotePostingId() {
        return remotePostingId;
    }

    /**
     * Sets ID of the remote posting the blocked story should be related to.
     *
     * @param remotePostingId the value to be set
     */
    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
    }

    /**
     * Retrieves owner name of the remote object the blocked story should be related to.
     *
     * @return the value
     */
    public String getRemoteOwnerName() {
        return remoteOwnerName;
    }

    /**
     * Sets owner name of the remote object the blocked story should be related to.
     *
     * @param remoteOwnerName the value to be set
     */
    public void setRemoteOwnerName(String remoteOwnerName) {
        this.remoteOwnerName = remoteOwnerName;
    }

    /**
     * Retrieves blocking timestamp - the real time when the story was blocked.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets blocking timestamp - the real time when the story was blocked.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves unblocking timestamp - the real time when the story will be unblocked; <code>null</code> or absent, if
     * the story is blocked permanently
     * .
     *
     * @return the value
     */
    public Long getDeadline() {
        return deadline;
    }

    /**
     * Sets unblocking timestamp - the real time when the story will be unblocked; <code>null</code> or absent, if the
     * story is blocked permanently
     * .
     *
     * @param deadline the value to be set
     */
    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    /**
     * Creates and returns a copy of this {@code BlockedInstantInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public BlockedInstantInfo clone() {
        try {
            return (BlockedInstantInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
