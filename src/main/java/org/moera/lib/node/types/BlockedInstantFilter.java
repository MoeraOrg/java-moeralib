package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedInstantFilter extends Structure implements Cloneable {

    private StoryType storyType;
    private String entryId;
    private String remoteNodeName;
    private String remotePostingId;
    private String remoteOwnerName;

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
     * Creates and returns a copy of this {@code BlockedInstantFilter} object.
     *
     * @return a clone of this instance
     */
    @Override
    public BlockedInstantFilter clone() {
        try {
            return (BlockedInstantFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
