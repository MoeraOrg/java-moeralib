package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedSliceInfo extends Structure implements Cloneable {

    private long before;
    private long after;
    private List<StoryInfo> stories;
    private int totalInPast;
    private int totalInFuture;

    /**
     * Retrieves the slice contains all stories before this moment, inclusive. May be the far future.
     *
     * @return the value
     */
    public long getBefore() {
        return before;
    }

    /**
     * Sets the slice contains all stories before this moment, inclusive. May be the far future.
     *
     * @param before the value to be set
     */
    public void setBefore(long before) {
        this.before = before;
    }

    /**
     * Retrieves the slice contains all stories after this moment, exclusive. May be the far past.
     *
     * @return the value
     */
    public long getAfter() {
        return after;
    }

    /**
     * Sets the slice contains all stories after this moment, exclusive. May be the far past.
     *
     * @param after the value to be set
     */
    public void setAfter(long after) {
        this.after = after;
    }

    /**
     * Retrieves the stories.
     *
     * @return the value
     */
    public List<StoryInfo> getStories() {
        return stories;
    }

    /**
     * Sets the stories.
     *
     * @param stories the value to be set
     */
    public void setStories(List<StoryInfo> stories) {
        this.stories = stories;
    }

    /**
     * Retrieves total number of stories in the feed before this slice.
     *
     * @return the value
     */
    public int getTotalInPast() {
        return totalInPast;
    }

    /**
     * Sets total number of stories in the feed before this slice.
     *
     * @param totalInPast the value to be set
     */
    public void setTotalInPast(int totalInPast) {
        this.totalInPast = totalInPast;
    }

    /**
     * Retrieves total number of stories in the feed after this slice.
     *
     * @return the value
     */
    public int getTotalInFuture() {
        return totalInFuture;
    }

    /**
     * Sets total number of stories in the feed after this slice.
     *
     * @param totalInFuture the value to be set
     */
    public void setTotalInFuture(int totalInFuture) {
        this.totalInFuture = totalInFuture;
    }

    @Override
    public void validate() {
        super.validate();
        if (stories != null) {
            stories.forEach(StoryInfo::validate);
        }
    }

    /**
     * Creates and returns a copy of this {@code FeedSliceInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FeedSliceInfo clone() {
        try {
            return (FeedSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
