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

    public Integer getFeedSubscribersTotal() {
        return feedSubscribersTotal;
    }

    public void setFeedSubscribersTotal(Integer feedSubscribersTotal) {
        this.feedSubscribersTotal = feedSubscribersTotal;
    }

    public Integer getFeedSubscriptionsTotal() {
        return feedSubscriptionsTotal;
    }

    public void setFeedSubscriptionsTotal(Integer feedSubscriptionsTotal) {
        this.feedSubscriptionsTotal = feedSubscriptionsTotal;
    }

    public Map<String, Integer> getFriendsTotal() {
        return friendsTotal;
    }

    public void setFriendsTotal(Map<String, Integer> friendsTotal) {
        this.friendsTotal = friendsTotal;
    }

    public Integer getFriendOfsTotal() {
        return friendOfsTotal;
    }

    public void setFriendOfsTotal(Integer friendOfsTotal) {
        this.friendOfsTotal = friendOfsTotal;
    }

    public Integer getBlockedTotal() {
        return blockedTotal;
    }

    public void setBlockedTotal(Integer blockedTotal) {
        this.blockedTotal = blockedTotal;
    }

    public Integer getBlockedByTotal() {
        return blockedByTotal;
    }

    public void setBlockedByTotal(Integer blockedByTotal) {
        this.blockedByTotal = blockedByTotal;
    }

    public PeopleOperations getOperations() {
        return operations;
    }

    public void setOperations(PeopleOperations operations) {
        this.operations = operations;
    }

    @Override
    public PeopleGeneralInfo clone() {
        try {
            return (PeopleGeneralInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
