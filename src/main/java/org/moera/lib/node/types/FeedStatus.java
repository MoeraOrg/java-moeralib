package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedStatus extends Structure implements Cloneable {

    private int total;
    private int totalPinned;
    private Long lastMoment;
    private Integer notViewed;
    private Integer notRead;
    private Long notViewedMoment;
    private Long notReadMoment;

    /**
     * Retrieves total number of stories.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of stories.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Retrieves total number of pinned stories.
     *
     * @return the value
     */
    public int getTotalPinned() {
        return totalPinned;
    }

    /**
     * Sets total number of pinned stories.
     *
     * @param totalPinned the value to be set
     */
    public void setTotalPinned(int totalPinned) {
        this.totalPinned = totalPinned;
    }

    /**
     * Retrieves moment of the most recent story.
     *
     * @return the value
     */
    public Long getLastMoment() {
        return lastMoment;
    }

    /**
     * Sets moment of the most recent story.
     *
     * @param lastMoment the value to be set
     */
    public void setLastMoment(Long lastMoment) {
        this.lastMoment = lastMoment;
    }

    /**
     * Retrieves number of stories that have not been viewed yet, admin only.
     *
     * @return the value
     */
    public Integer getNotViewed() {
        return notViewed;
    }

    /**
     * Sets number of stories that have not been viewed yet, admin only.
     *
     * @param notViewed the value to be set
     */
    public void setNotViewed(Integer notViewed) {
        this.notViewed = notViewed;
    }

    /**
     * Retrieves number of stories that have not been read yet, admin only.
     *
     * @return the value
     */
    public Integer getNotRead() {
        return notRead;
    }

    /**
     * Sets number of stories that have not been read yet, admin only.
     *
     * @param notRead the value to be set
     */
    public void setNotRead(Integer notRead) {
        this.notRead = notRead;
    }

    /**
     * Retrieves moment of the oldest non-viewed story, admin only.
     *
     * @return the value
     */
    public Long getNotViewedMoment() {
        return notViewedMoment;
    }

    /**
     * Sets moment of the oldest non-viewed story, admin only.
     *
     * @param notViewedMoment the value to be set
     */
    public void setNotViewedMoment(Long notViewedMoment) {
        this.notViewedMoment = notViewedMoment;
    }

    /**
     * Retrieves moment of the oldest non-read story, admin only.
     *
     * @return the value
     */
    public Long getNotReadMoment() {
        return notReadMoment;
    }

    /**
     * Sets moment of the oldest non-read story, admin only.
     *
     * @param notReadMoment the value to be set
     */
    public void setNotReadMoment(Long notReadMoment) {
        this.notReadMoment = notReadMoment;
    }

    /**
     * Creates and returns a copy of this {@code FeedStatus} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FeedStatus clone() {
        try {
            return (FeedStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
