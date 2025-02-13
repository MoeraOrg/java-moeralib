package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedPostingInstantInfo implements Cloneable {

    private String id;
    private StoryType storyType;
    private String remoteOwnerName;
    private Long deadline;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StoryType getStoryType() {
        return storyType;
    }

    public void setStoryType(StoryType storyType) {
        this.storyType = storyType;
    }

    public String getRemoteOwnerName() {
        return remoteOwnerName;
    }

    public void setRemoteOwnerName(String remoteOwnerName) {
        this.remoteOwnerName = remoteOwnerName;
    }

    public Long getDeadline() {
        return deadline;
    }

    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    @Override
    public BlockedPostingInstantInfo clone() {
        try {
            return (BlockedPostingInstantInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
