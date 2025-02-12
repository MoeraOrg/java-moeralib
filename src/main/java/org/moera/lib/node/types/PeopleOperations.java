package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeopleOperations {

    private Principal viewSubscribers;
    private Principal viewSubscriptions;
    private Principal viewFriends;
    private Principal viewFriendOfs;
    private Principal viewBlocked;
    private Principal viewBlockedBy;
    private Principal viewSubscribersTotal;
    private Principal viewSubscriptionsTotal;
    private Principal viewFriendsTotal;
    private Principal viewFriendOfsTotal;

    public Principal getViewSubscribers() {
        return viewSubscribers;
    }

    public void setViewSubscribers(Principal viewSubscribers) {
        this.viewSubscribers = viewSubscribers;
    }

    public Principal getViewSubscriptions() {
        return viewSubscriptions;
    }

    public void setViewSubscriptions(Principal viewSubscriptions) {
        this.viewSubscriptions = viewSubscriptions;
    }

    public Principal getViewFriends() {
        return viewFriends;
    }

    public void setViewFriends(Principal viewFriends) {
        this.viewFriends = viewFriends;
    }

    public Principal getViewFriendOfs() {
        return viewFriendOfs;
    }

    public void setViewFriendOfs(Principal viewFriendOfs) {
        this.viewFriendOfs = viewFriendOfs;
    }

    public Principal getViewBlocked() {
        return viewBlocked;
    }

    public void setViewBlocked(Principal viewBlocked) {
        this.viewBlocked = viewBlocked;
    }

    public Principal getViewBlockedBy() {
        return viewBlockedBy;
    }

    public void setViewBlockedBy(Principal viewBlockedBy) {
        this.viewBlockedBy = viewBlockedBy;
    }

    public Principal getViewSubscribersTotal() {
        return viewSubscribersTotal;
    }

    public void setViewSubscribersTotal(Principal viewSubscribersTotal) {
        this.viewSubscribersTotal = viewSubscribersTotal;
    }

    public Principal getViewSubscriptionsTotal() {
        return viewSubscriptionsTotal;
    }

    public void setViewSubscriptionsTotal(Principal viewSubscriptionsTotal) {
        this.viewSubscriptionsTotal = viewSubscriptionsTotal;
    }

    public Principal getViewFriendsTotal() {
        return viewFriendsTotal;
    }

    public void setViewFriendsTotal(Principal viewFriendsTotal) {
        this.viewFriendsTotal = viewFriendsTotal;
    }

    public Principal getViewFriendOfsTotal() {
        return viewFriendOfsTotal;
    }

    public void setViewFriendOfsTotal(Principal viewFriendOfsTotal) {
        this.viewFriendOfsTotal = viewFriendOfsTotal;
    }

}
