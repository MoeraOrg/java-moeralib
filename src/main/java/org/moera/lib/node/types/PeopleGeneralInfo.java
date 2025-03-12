package org.moera.lib.node.types;

// This file is generated

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeopleGeneralInfo extends Structure implements Cloneable {

    private Integer feedSubscribersTotal;
    private Integer feedSubscriptionsTotal;
    private Map<String, Integer> friendsTotal;
    private Integer friendOfsTotal;
    private Integer blockedTotal;
    private Integer blockedByTotal;
    private PeopleOperations operations;

    /**
     * Retrieves total number of subscribers of the node.
     *
     * @return the value
     */
    public Integer getFeedSubscribersTotal() {
        return feedSubscribersTotal;
    }

    /**
     * Sets total number of subscribers of the node.
     *
     * @param feedSubscribersTotal the value to be set
     */
    public void setFeedSubscribersTotal(Integer feedSubscribersTotal) {
        this.feedSubscribersTotal = feedSubscribersTotal;
    }

    /**
     * Retrieves total number of subscriptions of the node.
     *
     * @return the value
     */
    public Integer getFeedSubscriptionsTotal() {
        return feedSubscriptionsTotal;
    }

    /**
     * Sets total number of subscriptions of the node.
     *
     * @param feedSubscriptionsTotal the value to be set
     */
    public void setFeedSubscriptionsTotal(Integer feedSubscriptionsTotal) {
        this.feedSubscriptionsTotal = feedSubscriptionsTotal;
    }

    /**
     * Retrieves total number of friends in every group.
     *
     * @return the value
     */
    public Map<String, Integer> getFriendsTotal() {
        return friendsTotal;
    }

    /**
     * Sets total number of friends in every group.
     *
     * @param friendsTotal the value to be set
     */
    public void setFriendsTotal(Map<String, Integer> friendsTotal) {
        this.friendsTotal = friendsTotal;
    }

    /**
     * Retrieves total number of nodes that added this node to their friends.
     *
     * @return the value
     */
    public Integer getFriendOfsTotal() {
        return friendOfsTotal;
    }

    /**
     * Sets total number of nodes that added this node to their friends.
     *
     * @param friendOfsTotal the value to be set
     */
    public void setFriendOfsTotal(Integer friendOfsTotal) {
        this.friendOfsTotal = friendOfsTotal;
    }

    /**
     * Retrieves total number of blocked nodes.
     *
     * @return the value
     */
    public Integer getBlockedTotal() {
        return blockedTotal;
    }

    /**
     * Sets total number of blocked nodes.
     *
     * @param blockedTotal the value to be set
     */
    public void setBlockedTotal(Integer blockedTotal) {
        this.blockedTotal = blockedTotal;
    }

    /**
     * Retrieves total number of nodes that blocked this node.
     *
     * @return the value
     */
    public Integer getBlockedByTotal() {
        return blockedByTotal;
    }

    /**
     * Sets total number of nodes that blocked this node.
     *
     * @param blockedByTotal the value to be set
     */
    public void setBlockedByTotal(Integer blockedByTotal) {
        this.blockedByTotal = blockedByTotal;
    }

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public PeopleOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(PeopleOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code PeopleGeneralInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PeopleGeneralInfo clone() {
        try {
            return (PeopleGeneralInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
