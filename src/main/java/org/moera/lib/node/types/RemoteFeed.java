package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteFeed extends Structure implements Cloneable {

    private String nodeName;
    private String feedName;

    /**
     * Retrieves name of the node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves name of the feed on the node.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets name of the feed on the node.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Creates and returns a copy of this {@code RemoteFeed} object.
     *
     * @return a clone of this instance
     */
    @Override
    public RemoteFeed clone() {
        try {
            return (RemoteFeed) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

    /**
     * Compares this object to the specified object.
     *
     * @param peer the object to compare with this instance
     * @return {@code true} if the specified object is equal to this object, otherwise {@code false}
     */
    @Override
    public boolean equals(Object peer) {
        if (this == peer) {
            return true;
        }
        if (peer == null || getClass() != peer.getClass()) {
            return false;
        }
        RemoteFeed that = (RemoteFeed) peer;
        return Objects.equals(nodeName, that.nodeName)
            && Objects.equals(feedName, that.feedName);
    }

    /**
     * Computes the hash code for this object using its attributes.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(nodeName, feedName);
    }

}
