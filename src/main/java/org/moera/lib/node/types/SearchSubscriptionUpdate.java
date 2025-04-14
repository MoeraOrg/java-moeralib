package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchSubscriptionUpdate extends Structure implements Cloneable {

    private String nodeName;
    private String feedName;

    /**
     * Retrieves name of the node being subscribed to/unsubscribed from.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node being subscribed to/unsubscribed from.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves name of the feed on the remote node being subscribed to/unsubscribed from.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets name of the feed on the remote node being subscribed to/unsubscribed from.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(nodeName, 40, "search.node-name.wrong-size");
        ValidationUtil.maxSize(feedName, 63, "search.feed-name.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code SearchSubscriptionUpdate} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchSubscriptionUpdate clone() {
        try {
            return (SearchSubscriptionUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
