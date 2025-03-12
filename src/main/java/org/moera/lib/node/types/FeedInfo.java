package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedInfo extends Structure implements Cloneable {

    private String feedName;
    private String title;
    private int total;
    private Long firstCreatedAt;
    private Long lastCreatedAt;
    private FeedOperations operations;
    private List<String> sheriffs;
    private List<SheriffMark> sheriffMarks;

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
     * Retrieves title of the feed.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title of the feed.
     *
     * @param title the value to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves total number of stories in the feed.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of stories in the feed.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Retrieves creation timestamp of the earliest story in the feed.
     *
     * @return the value
     */
    public Long getFirstCreatedAt() {
        return firstCreatedAt;
    }

    /**
     * Sets creation timestamp of the earliest story in the feed.
     *
     * @param firstCreatedAt the value to be set
     */
    public void setFirstCreatedAt(Long firstCreatedAt) {
        this.firstCreatedAt = firstCreatedAt;
    }

    /**
     * Retrieves creation timestamp of the latest story in the feed.
     *
     * @return the value
     */
    public Long getLastCreatedAt() {
        return lastCreatedAt;
    }

    /**
     * Sets creation timestamp of the latest story in the feed.
     *
     * @param lastCreatedAt the value to be set
     */
    public void setLastCreatedAt(Long lastCreatedAt) {
        this.lastCreatedAt = lastCreatedAt;
    }

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public FeedOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(FeedOperations operations) {
        this.operations = operations;
    }

    /**
     * Retrieves list of sheriffs supervising the feed.
     *
     * @return the value
     */
    public List<String> getSheriffs() {
        return sheriffs;
    }

    /**
     * Sets list of sheriffs supervising the feed.
     *
     * @param sheriffs the value to be set
     */
    public void setSheriffs(List<String> sheriffs) {
        this.sheriffs = sheriffs;
    }

    /**
     * Retrieves list of sheriff marks on the feed.
     *
     * @return the value
     */
    public List<SheriffMark> getSheriffMarks() {
        return sheriffMarks;
    }

    /**
     * Sets list of sheriff marks on the feed.
     *
     * @param sheriffMarks the value to be set
     */
    public void setSheriffMarks(List<SheriffMark> sheriffMarks) {
        this.sheriffMarks = sheriffMarks;
    }

    /**
     * Creates and returns a copy of this {@code FeedInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FeedInfo clone() {
        try {
            return (FeedInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
