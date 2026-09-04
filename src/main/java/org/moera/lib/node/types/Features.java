package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Features extends Structure implements Cloneable {

    private PostingFeatures posting;
    private int feedWidth;
    private FriendGroupsFeatures friendGroups;
    private List<AskSubject> ask;
    private Boolean subscribed;

    /**
     * Retrieves features of a posting.
     *
     * @return the value
     */
    public PostingFeatures getPosting() {
        return posting;
    }

    /**
     * Sets features of a posting.
     *
     * @param posting the value to be set
     */
    public void setPosting(PostingFeatures posting) {
        this.posting = posting;
    }

    /**
     * Retrieves width of the feed in pixels.
     *
     * @return the value
     */
    public int getFeedWidth() {
        return feedWidth;
    }

    /**
     * Sets width of the feed in pixels.
     *
     * @param feedWidth the value to be set
     */
    public void setFeedWidth(int feedWidth) {
        this.feedWidth = feedWidth;
    }

    /**
     * Retrieves features of groups of friends.
     *
     * @return the value
     */
    public FriendGroupsFeatures getFriendGroups() {
        return friendGroups;
    }

    /**
     * Sets features of groups of friends.
     *
     * @param friendGroups the value to be set
     */
    public void setFriendGroups(FriendGroupsFeatures friendGroups) {
        this.friendGroups = friendGroups;
    }

    /**
     * Retrieves list of requests to the node owner that are accepted by the node.
     *
     * @return the value
     */
    public List<AskSubject> getAsk() {
        return ask;
    }

    /**
     * Sets list of requests to the node owner that are accepted by the node.
     *
     * @param ask the value to be set
     */
    public void setAsk(List<AskSubject> ask) {
        this.ask = ask;
    }

    /**
     * Retrieves <code>true</code>, if the node is subscribed to the client, <code>false</code> otherwise.
     *
     * @return the value
     */
    public Boolean getSubscribed() {
        return subscribed;
    }

    /**
     * Sets <code>true</code>, if the node is subscribed to the client, <code>false</code> otherwise.
     *
     * @param subscribed the value to be set
     */
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    /**
     * Creates and returns a copy of this {@code Features} object.
     *
     * @return a clone of this instance
     */
    @Override
    public Features clone() {
        try {
            return (Features) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
