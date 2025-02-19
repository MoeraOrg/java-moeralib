package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedInstantAttributes implements Cloneable {

    private StoryType storyType;
    private String entryId;
    private String remoteNodeName;
    private String remotePostingId;
    private String remoteOwnerName;
    private Long deadline;

    @JsonIgnore
    private Object extra;

    public StoryType getStoryType() {
        return storyType;
    }

    public void setStoryType(StoryType storyType) {
        this.storyType = storyType;
    }

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    public String getRemotePostingId() {
        return remotePostingId;
    }

    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
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

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
        ValidationUtil.notNull(storyType, "blocked-instant.story-type.missing");
    }

    @Override
    public BlockedInstantAttributes clone() {
        try {
            return (BlockedInstantAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
