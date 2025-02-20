package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PushContent implements Cloneable {

    private PushContentType type;
    private String id;
    private StoryInfo story;
    private FeedWithStatus feedStatus;

    @JsonIgnore
    private Object extra;

    public PushContentType getType() {
        return type;
    }

    public void setType(PushContentType type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StoryInfo getStory() {
        return story;
    }

    public void setStory(StoryInfo story) {
        this.story = story;
    }

    public FeedWithStatus getFeedStatus() {
        return feedStatus;
    }

    public void setFeedStatus(FeedWithStatus feedStatus) {
        this.feedStatus = feedStatus;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
        if (story != null) {
            story.validate();
        }
    }

    @Override
    public PushContent clone() {
        try {
            return (PushContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
