package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeopleOperations implements Cloneable {

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

    public Principal getViewSubscribers(Principal defaultValue) {
        return viewSubscribers != null ? viewSubscribers : defaultValue;
    }

    public static Principal getViewSubscribers(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewSubscribers(defaultValue) : defaultValue;
    }

    public void setViewSubscribers(Principal viewSubscribers) {
        this.viewSubscribers = viewSubscribers;
    }

    public void setViewSubscribers(Principal viewSubscribers, Principal defaultValue) {
        this.viewSubscribers = Objects.equals(viewSubscribers, defaultValue) ? null : viewSubscribers;
    }

    public Principal getViewSubscriptions() {
        return viewSubscriptions;
    }

    public Principal getViewSubscriptions(Principal defaultValue) {
        return viewSubscriptions != null ? viewSubscriptions : defaultValue;
    }

    public static Principal getViewSubscriptions(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewSubscriptions(defaultValue) : defaultValue;
    }

    public void setViewSubscriptions(Principal viewSubscriptions) {
        this.viewSubscriptions = viewSubscriptions;
    }

    public void setViewSubscriptions(Principal viewSubscriptions, Principal defaultValue) {
        this.viewSubscriptions = Objects.equals(viewSubscriptions, defaultValue) ? null : viewSubscriptions;
    }

    public Principal getViewFriends() {
        return viewFriends;
    }

    public Principal getViewFriends(Principal defaultValue) {
        return viewFriends != null ? viewFriends : defaultValue;
    }

    public static Principal getViewFriends(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriends(defaultValue) : defaultValue;
    }

    public void setViewFriends(Principal viewFriends) {
        this.viewFriends = viewFriends;
    }

    public void setViewFriends(Principal viewFriends, Principal defaultValue) {
        this.viewFriends = Objects.equals(viewFriends, defaultValue) ? null : viewFriends;
    }

    public Principal getViewFriendOfs() {
        return viewFriendOfs;
    }

    public Principal getViewFriendOfs(Principal defaultValue) {
        return viewFriendOfs != null ? viewFriendOfs : defaultValue;
    }

    public static Principal getViewFriendOfs(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriendOfs(defaultValue) : defaultValue;
    }

    public void setViewFriendOfs(Principal viewFriendOfs) {
        this.viewFriendOfs = viewFriendOfs;
    }

    public void setViewFriendOfs(Principal viewFriendOfs, Principal defaultValue) {
        this.viewFriendOfs = Objects.equals(viewFriendOfs, defaultValue) ? null : viewFriendOfs;
    }

    public Principal getViewBlocked() {
        return viewBlocked;
    }

    public Principal getViewBlocked(Principal defaultValue) {
        return viewBlocked != null ? viewBlocked : defaultValue;
    }

    public static Principal getViewBlocked(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewBlocked(defaultValue) : defaultValue;
    }

    public void setViewBlocked(Principal viewBlocked) {
        this.viewBlocked = viewBlocked;
    }

    public void setViewBlocked(Principal viewBlocked, Principal defaultValue) {
        this.viewBlocked = Objects.equals(viewBlocked, defaultValue) ? null : viewBlocked;
    }

    public Principal getViewBlockedBy() {
        return viewBlockedBy;
    }

    public Principal getViewBlockedBy(Principal defaultValue) {
        return viewBlockedBy != null ? viewBlockedBy : defaultValue;
    }

    public static Principal getViewBlockedBy(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewBlockedBy(defaultValue) : defaultValue;
    }

    public void setViewBlockedBy(Principal viewBlockedBy) {
        this.viewBlockedBy = viewBlockedBy;
    }

    public void setViewBlockedBy(Principal viewBlockedBy, Principal defaultValue) {
        this.viewBlockedBy = Objects.equals(viewBlockedBy, defaultValue) ? null : viewBlockedBy;
    }

    public Principal getViewSubscribersTotal() {
        return viewSubscribersTotal;
    }

    public Principal getViewSubscribersTotal(Principal defaultValue) {
        return viewSubscribersTotal != null ? viewSubscribersTotal : defaultValue;
    }

    public static Principal getViewSubscribersTotal(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewSubscribersTotal(defaultValue) : defaultValue;
    }

    public void setViewSubscribersTotal(Principal viewSubscribersTotal) {
        this.viewSubscribersTotal = viewSubscribersTotal;
    }

    public void setViewSubscribersTotal(Principal viewSubscribersTotal, Principal defaultValue) {
        this.viewSubscribersTotal = Objects.equals(viewSubscribersTotal, defaultValue) ? null : viewSubscribersTotal;
    }

    public Principal getViewSubscriptionsTotal() {
        return viewSubscriptionsTotal;
    }

    public Principal getViewSubscriptionsTotal(Principal defaultValue) {
        return viewSubscriptionsTotal != null ? viewSubscriptionsTotal : defaultValue;
    }

    public static Principal getViewSubscriptionsTotal(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewSubscriptionsTotal(defaultValue) : defaultValue;
    }

    public void setViewSubscriptionsTotal(Principal viewSubscriptionsTotal) {
        this.viewSubscriptionsTotal = viewSubscriptionsTotal;
    }

    public void setViewSubscriptionsTotal(Principal viewSubscriptionsTotal, Principal defaultValue) {
        this.viewSubscriptionsTotal =
             Objects.equals(viewSubscriptionsTotal, defaultValue) ? null : viewSubscriptionsTotal;
    }

    public Principal getViewFriendsTotal() {
        return viewFriendsTotal;
    }

    public Principal getViewFriendsTotal(Principal defaultValue) {
        return viewFriendsTotal != null ? viewFriendsTotal : defaultValue;
    }

    public static Principal getViewFriendsTotal(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriendsTotal(defaultValue) : defaultValue;
    }

    public void setViewFriendsTotal(Principal viewFriendsTotal) {
        this.viewFriendsTotal = viewFriendsTotal;
    }

    public void setViewFriendsTotal(Principal viewFriendsTotal, Principal defaultValue) {
        this.viewFriendsTotal = Objects.equals(viewFriendsTotal, defaultValue) ? null : viewFriendsTotal;
    }

    public Principal getViewFriendOfsTotal() {
        return viewFriendOfsTotal;
    }

    public Principal getViewFriendOfsTotal(Principal defaultValue) {
        return viewFriendOfsTotal != null ? viewFriendOfsTotal : defaultValue;
    }

    public static Principal getViewFriendOfsTotal(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriendOfsTotal(defaultValue) : defaultValue;
    }

    public void setViewFriendOfsTotal(Principal viewFriendOfsTotal) {
        this.viewFriendOfsTotal = viewFriendOfsTotal;
    }

    public void setViewFriendOfsTotal(Principal viewFriendOfsTotal, Principal defaultValue) {
        this.viewFriendOfsTotal = Objects.equals(viewFriendOfsTotal, defaultValue) ? null : viewFriendOfsTotal;
    }

    @JsonIgnore
    public boolean isEmpty() {
        return viewSubscribers == null
            && viewSubscriptions == null
            && viewFriends == null
            && viewFriendOfs == null
            && viewBlocked == null
            && viewBlockedBy == null
            && viewSubscribersTotal == null
            && viewSubscriptionsTotal == null
            && viewFriendsTotal == null
            && viewFriendOfsTotal == null;
    }

    @Override
    public PeopleOperations clone() {
        try {
            return (PeopleOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
