package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedInfo implements Cloneable {

    private String feedName;
    private String title;
    private int total;
    private Long firstCreatedAt;
    private Long lastCreatedAt;
    private FeedOperations operations;
    private List<String> sheriffs;
    private List<SheriffMark> sheriffMarks;

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Long getFirstCreatedAt() {
        return firstCreatedAt;
    }

    public void setFirstCreatedAt(Long firstCreatedAt) {
        this.firstCreatedAt = firstCreatedAt;
    }

    public Long getLastCreatedAt() {
        return lastCreatedAt;
    }

    public void setLastCreatedAt(Long lastCreatedAt) {
        this.lastCreatedAt = lastCreatedAt;
    }

    public FeedOperations getOperations() {
        return operations;
    }

    public void setOperations(FeedOperations operations) {
        this.operations = operations;
    }

    public List<String> getSheriffs() {
        return sheriffs;
    }

    public void setSheriffs(List<String> sheriffs) {
        this.sheriffs = sheriffs;
    }

    public List<SheriffMark> getSheriffMarks() {
        return sheriffMarks;
    }

    public void setSheriffMarks(List<SheriffMark> sheriffMarks) {
        this.sheriffMarks = sheriffMarks;
    }

    @Override
    public FeedInfo clone() {
        try {
            return (FeedInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
