package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionFilter implements Cloneable {

    private SubscriptionType type;
    private List<RemoteFeed> feeds;
    private List<RemotePosting> postings;

    @JsonIgnore
    private Object extra;

    public SubscriptionType getType() {
        return type;
    }

    public void setType(SubscriptionType type) {
        this.type = type;
    }

    public List<RemoteFeed> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<RemoteFeed> feeds) {
        this.feeds = feeds;
    }

    public List<RemotePosting> getPostings() {
        return postings;
    }

    public void setPostings(List<RemotePosting> postings) {
        this.postings = postings;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public SubscriptionFilter clone() {
        try {
            return (SubscriptionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
