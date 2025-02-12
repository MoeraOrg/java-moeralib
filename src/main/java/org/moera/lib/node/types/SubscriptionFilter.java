package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionFilter {

    private SubscriptionType type;
    private List<RemoteFeed> feeds;
    private List<RemotePosting> postings;

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

}
