package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedWithStatus extends Structure implements Cloneable {

    private String feedName;
    private int notViewed;
    private int notRead;
    private Long notViewedMoment;
    private Long notReadMoment;

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
     * Retrieves number of stories in the feed that have not been viewed yet.
     *
     * @return the value
     */
    public int getNotViewed() {
        return notViewed;
    }

    /**
     * Sets number of stories in the feed that have not been viewed yet.
     *
     * @param notViewed the value to be set
     */
    public void setNotViewed(int notViewed) {
        this.notViewed = notViewed;
    }

    /**
     * Retrieves number of stories in the feed that have not been read yet.
     *
     * @return the value
     */
    public int getNotRead() {
        return notRead;
    }

    /**
     * Sets number of stories in the feed that have not been read yet.
     *
     * @param notRead the value to be set
     */
    public void setNotRead(int notRead) {
        this.notRead = notRead;
    }

    /**
     * Retrieves moment of the oldest non-viewed story.
     *
     * @return the value
     */
    public Long getNotViewedMoment() {
        return notViewedMoment;
    }

    /**
     * Sets moment of the oldest non-viewed story.
     *
     * @param notViewedMoment the value to be set
     */
    public void setNotViewedMoment(Long notViewedMoment) {
        this.notViewedMoment = notViewedMoment;
    }

    /**
     * Retrieves moment of the oldest non-read story.
     *
     * @return the value
     */
    public Long getNotReadMoment() {
        return notReadMoment;
    }

    /**
     * Sets moment of the oldest non-read story.
     *
     * @param notReadMoment the value to be set
     */
    public void setNotReadMoment(Long notReadMoment) {
        this.notReadMoment = notReadMoment;
    }

    /**
     * Creates and returns a copy of this {@code FeedWithStatus} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FeedWithStatus clone() {
        try {
            return (FeedWithStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
