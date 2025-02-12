package org.moera.lib.node.types;

// This file is generated

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedReference {

    private String feedName;
    private Timestamp publishedAt;
    private Boolean pinned;
    private int moment;
    private String storyId;
    private StoryOperations operations;

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public Timestamp getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Timestamp publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public int getMoment() {
        return moment;
    }

    public void setMoment(int moment) {
        this.moment = moment;
    }

    public String getStoryId() {
        return storyId;
    }

    public void setStoryId(String storyId) {
        this.storyId = storyId;
    }

    public StoryOperations getOperations() {
        return operations;
    }

    public void setOperations(StoryOperations operations) {
        this.operations = operations;
    }

}
