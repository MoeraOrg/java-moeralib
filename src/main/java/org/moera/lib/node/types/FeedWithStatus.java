package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedWithStatus implements Cloneable {

    private String feedName;
    private int notViewed;
    private int notRead;

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public int getNotViewed() {
        return notViewed;
    }

    public void setNotViewed(int notViewed) {
        this.notViewed = notViewed;
    }

    public int getNotRead() {
        return notRead;
    }

    public void setNotRead(int notRead) {
        this.notRead = notRead;
    }

    @Override
    public FeedWithStatus clone() {
        try {
            return (FeedWithStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
