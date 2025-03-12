package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionFilter extends Structure implements Cloneable {

    private SubscriptionType type;
    private List<RemoteFeed> feeds;
    private List<RemotePosting> postings;

    /**
     * Retrieves subscription type.
     *
     * @return the value
     */
    public SubscriptionType getType() {
        return type;
    }

    /**
     * Sets subscription type.
     *
     * @param type the value to be set
     */
    public void setType(SubscriptionType type) {
        this.type = type;
    }

    /**
     * Retrieves list of feeds.
     *
     * @return the value
     */
    public List<RemoteFeed> getFeeds() {
        return feeds;
    }

    /**
     * Sets list of feeds.
     *
     * @param feeds the value to be set
     */
    public void setFeeds(List<RemoteFeed> feeds) {
        this.feeds = feeds;
    }

    /**
     * Retrieves list of postings.
     *
     * @return the value
     */
    public List<RemotePosting> getPostings() {
        return postings;
    }

    /**
     * Sets list of postings.
     *
     * @param postings the value to be set
     */
    public void setPostings(List<RemotePosting> postings) {
        this.postings = postings;
    }

    /**
     * Creates and returns a copy of this {@code SubscriptionFilter} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SubscriptionFilter clone() {
        try {
            return (SubscriptionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
