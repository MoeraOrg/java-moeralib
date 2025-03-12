package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedReference extends Structure implements Cloneable {

    private String feedName;
    private long publishedAt;
    private Boolean pinned;
    private long moment;
    private String storyId;
    private StoryOperations operations;

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
     * Retrieves ID of the story.
     *
     * @return the value
     */
    public String getStoryId() {
        return storyId;
    }

    /**
     * Sets ID of the story.
     *
     * @param storyId the value to be set
     */
    public void setStoryId(String storyId) {
        this.storyId = storyId;
    }

    /**
     * Retrieves the supported operations and the corresponding principals for the story in the feed.
     *
     * @return the value
     */
    public StoryOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals for the story in the feed.
     *
     * @param operations the value to be set
     */
    public void setOperations(StoryOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code FeedReference} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FeedReference clone() {
        try {
            return (FeedReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
