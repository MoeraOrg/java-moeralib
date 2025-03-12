package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedPostingInstantInfo extends Structure implements Cloneable {

    private String id;
    private StoryType storyType;
    private String remoteOwnerName;
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

    /**
     * Creates and returns a copy of this {@code BlockedPostingInstantInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public BlockedPostingInstantInfo clone() {
        try {
            return (BlockedPostingInstantInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
