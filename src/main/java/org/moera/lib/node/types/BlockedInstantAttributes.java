package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedInstantAttributes extends Structure implements Cloneable {

    private StoryType storyType;
    private String entryId;
    private String remoteNodeName;
    private String remotePostingId;
    private String remoteOwnerName;
    private Long deadline;

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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(storyType, "blocked-instant.story-type.missing");
    }

    /**
     * Creates and returns a copy of this {@code BlockedInstantAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public BlockedInstantAttributes clone() {
        try {
            return (BlockedInstantAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
