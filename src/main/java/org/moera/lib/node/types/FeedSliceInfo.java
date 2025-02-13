package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedSliceInfo implements Cloneable {

    private int before;
    private int after;
    private List<StoryInfo> stories;
    private int totalInPast;
    private int totalInFuture;

    public int getBefore() {
        return before;
    }

    public void setBefore(int before) {
        this.before = before;
    }

    public int getAfter() {
        return after;
    }

    public void setAfter(int after) {
        this.after = after;
    }

    public List<StoryInfo> getStories() {
        return stories;
    }

    public void setStories(List<StoryInfo> stories) {
        this.stories = stories;
    }

    public int getTotalInPast() {
        return totalInPast;
    }

    public void setTotalInPast(int totalInPast) {
        this.totalInPast = totalInPast;
    }

    public int getTotalInFuture() {
        return totalInFuture;
    }

    public void setTotalInFuture(int totalInFuture) {
        this.totalInFuture = totalInFuture;
    }

    @Override
    public FeedSliceInfo clone() {
        try {
            return (FeedSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
