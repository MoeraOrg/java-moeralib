package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PushContent extends Structure implements Cloneable {

    private PushContentType type;
    private String id;
    private StoryInfo story;
    private FeedWithStatus feedStatus;

    /**
     * Retrieves type of the notification.
     *
     * @return the value
     */
    public PushContentType getType() {
        return type;
    }

    /**
     * Sets type of the notification.
     *
     * @param type the value to be set
     */
    public void setType(PushContentType type) {
        this.type = type;
    }

    /**
     * Retrieves ID of the story (<code>story-deleted</code> notifications only).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of the story (<code>story-deleted</code> notifications only).
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves the story (<code>story-added</code> notifications only).
     *
     * @return the value
     */
    public StoryInfo getStory() {
        return story;
    }

    /**
     * Sets the story (<code>story-added</code> notifications only).
     *
     * @param story the value to be set
     */
    public void setStory(StoryInfo story) {
        this.story = story;
    }

    /**
     * Retrieves status of the feed (<code>feed-updated</code> notifications only).
     *
     * @return the value
     */
    public FeedWithStatus getFeedStatus() {
        return feedStatus;
    }

    /**
     * Sets status of the feed (<code>feed-updated</code> notifications only).
     *
     * @param feedStatus the value to be set
     */
    public void setFeedStatus(FeedWithStatus feedStatus) {
        this.feedStatus = feedStatus;
    }

    @Override
    public void validate() {
        super.validate();
        if (story != null) {
            story.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code PushContent} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PushContent clone() {
        try {
            return (PushContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
