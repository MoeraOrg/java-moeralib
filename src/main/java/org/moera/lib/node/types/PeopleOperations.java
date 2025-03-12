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

    /**
     * Retrieves the permission to view the list of subscribers.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewSubscribers() {
        return viewSubscribers;
    }

    /**
     * Retrieves the permission to view the list of subscribers,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewSubscribers(Principal defaultValue) {
        return viewSubscribers != null ? viewSubscribers : defaultValue;
    }

    /**
     * Retrieves the permission to view the list of subscribers,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewSubscribers(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewSubscribers(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the list of subscribers.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewSubscribers the permission to set, may be {@code null}
     */
    public void setViewSubscribers(Principal viewSubscribers) {
        this.viewSubscribers = viewSubscribers;
    }

    /**
     * Sets the permission to view the list of subscribers.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewSubscribers the permission to set
     * @param defaultValue the default permission
     */
    public void setViewSubscribers(Principal viewSubscribers, Principal defaultValue) {
        this.viewSubscribers = Objects.equals(viewSubscribers, defaultValue) ? null : viewSubscribers;
    }

    /**
     * Retrieves the permission to view the list of subscriptions.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewSubscriptions() {
        return viewSubscriptions;
    }

    /**
     * Retrieves the permission to view the list of subscriptions,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewSubscriptions(Principal defaultValue) {
        return viewSubscriptions != null ? viewSubscriptions : defaultValue;
    }

    /**
     * Retrieves the permission to view the list of subscriptions,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewSubscriptions(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewSubscriptions(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the list of subscriptions.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewSubscriptions the permission to set, may be {@code null}
     */
    public void setViewSubscriptions(Principal viewSubscriptions) {
        this.viewSubscriptions = viewSubscriptions;
    }

    /**
     * Sets the permission to view the list of subscriptions.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewSubscriptions the permission to set
     * @param defaultValue the default permission
     */
    public void setViewSubscriptions(Principal viewSubscriptions, Principal defaultValue) {
        this.viewSubscriptions = Objects.equals(viewSubscriptions, defaultValue) ? null : viewSubscriptions;
    }

    /**
     * Retrieves the permission to view the list of friends.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewFriends() {
        return viewFriends;
    }

    /**
     * Retrieves the permission to view the list of friends,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewFriends(Principal defaultValue) {
        return viewFriends != null ? viewFriends : defaultValue;
    }

    /**
     * Retrieves the permission to view the list of friends,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewFriends(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriends(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the list of friends.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewFriends the permission to set, may be {@code null}
     */
    public void setViewFriends(Principal viewFriends) {
        this.viewFriends = viewFriends;
    }

    /**
     * Sets the permission to view the list of friends.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewFriends the permission to set
     * @param defaultValue the default permission
     */
    public void setViewFriends(Principal viewFriends, Principal defaultValue) {
        this.viewFriends = Objects.equals(viewFriends, defaultValue) ? null : viewFriends;
    }

    /**
     * Retrieves the permission to view the list of those who added this node to friends.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewFriendOfs() {
        return viewFriendOfs;
    }

    /**
     * Retrieves the permission to view the list of those who added this node to friends,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewFriendOfs(Principal defaultValue) {
        return viewFriendOfs != null ? viewFriendOfs : defaultValue;
    }

    /**
     * Retrieves the permission to view the list of those who added this node to friends,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewFriendOfs(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriendOfs(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the list of those who added this node to friends.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewFriendOfs the permission to set, may be {@code null}
     */
    public void setViewFriendOfs(Principal viewFriendOfs) {
        this.viewFriendOfs = viewFriendOfs;
    }

    /**
     * Sets the permission to view the list of those who added this node to friends.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewFriendOfs the permission to set
     * @param defaultValue the default permission
     */
    public void setViewFriendOfs(Principal viewFriendOfs, Principal defaultValue) {
        this.viewFriendOfs = Objects.equals(viewFriendOfs, defaultValue) ? null : viewFriendOfs;
    }

    /**
     * Retrieves the permission to view the list of blocked nodes.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewBlocked() {
        return viewBlocked;
    }

    /**
     * Retrieves the permission to view the list of blocked nodes,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewBlocked(Principal defaultValue) {
        return viewBlocked != null ? viewBlocked : defaultValue;
    }

    /**
     * Retrieves the permission to view the list of blocked nodes,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewBlocked(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewBlocked(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the list of blocked nodes.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewBlocked the permission to set, may be {@code null}
     */
    public void setViewBlocked(Principal viewBlocked) {
        this.viewBlocked = viewBlocked;
    }

    /**
     * Sets the permission to view the list of blocked nodes.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewBlocked the permission to set
     * @param defaultValue the default permission
     */
    public void setViewBlocked(Principal viewBlocked, Principal defaultValue) {
        this.viewBlocked = Objects.equals(viewBlocked, defaultValue) ? null : viewBlocked;
    }

    /**
     * Retrieves the permission to view the list of those who blocked this node.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewBlockedBy() {
        return viewBlockedBy;
    }

    /**
     * Retrieves the permission to view the list of those who blocked this node,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewBlockedBy(Principal defaultValue) {
        return viewBlockedBy != null ? viewBlockedBy : defaultValue;
    }

    /**
     * Retrieves the permission to view the list of those who blocked this node,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewBlockedBy(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewBlockedBy(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the list of those who blocked this node.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewBlockedBy the permission to set, may be {@code null}
     */
    public void setViewBlockedBy(Principal viewBlockedBy) {
        this.viewBlockedBy = viewBlockedBy;
    }

    /**
     * Sets the permission to view the list of those who blocked this node.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewBlockedBy the permission to set
     * @param defaultValue the default permission
     */
    public void setViewBlockedBy(Principal viewBlockedBy, Principal defaultValue) {
        this.viewBlockedBy = Objects.equals(viewBlockedBy, defaultValue) ? null : viewBlockedBy;
    }

    /**
     * Retrieves the permission to view the number of subscribers.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewSubscribersTotal() {
        return viewSubscribersTotal;
    }

    /**
     * Retrieves the permission to view the number of subscribers,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewSubscribersTotal(Principal defaultValue) {
        return viewSubscribersTotal != null ? viewSubscribersTotal : defaultValue;
    }

    /**
     * Retrieves the permission to view the number of subscribers,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewSubscribersTotal(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewSubscribersTotal(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the number of subscribers.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewSubscribersTotal the permission to set, may be {@code null}
     */
    public void setViewSubscribersTotal(Principal viewSubscribersTotal) {
        this.viewSubscribersTotal = viewSubscribersTotal;
    }

    /**
     * Sets the permission to view the number of subscribers.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewSubscribersTotal the permission to set
     * @param defaultValue the default permission
     */
    public void setViewSubscribersTotal(Principal viewSubscribersTotal, Principal defaultValue) {
        this.viewSubscribersTotal = Objects.equals(viewSubscribersTotal, defaultValue) ? null : viewSubscribersTotal;
    }

    /**
     * Retrieves the permission to view the number of subscriptions.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewSubscriptionsTotal() {
        return viewSubscriptionsTotal;
    }

    /**
     * Retrieves the permission to view the number of subscriptions,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewSubscriptionsTotal(Principal defaultValue) {
        return viewSubscriptionsTotal != null ? viewSubscriptionsTotal : defaultValue;
    }

    /**
     * Retrieves the permission to view the number of subscriptions,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewSubscriptionsTotal(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewSubscriptionsTotal(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the number of subscriptions.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewSubscriptionsTotal the permission to set, may be {@code null}
     */
    public void setViewSubscriptionsTotal(Principal viewSubscriptionsTotal) {
        this.viewSubscriptionsTotal = viewSubscriptionsTotal;
    }

    /**
     * Sets the permission to view the number of subscriptions.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewSubscriptionsTotal the permission to set
     * @param defaultValue the default permission
     */
    public void setViewSubscriptionsTotal(Principal viewSubscriptionsTotal, Principal defaultValue) {
        this.viewSubscriptionsTotal =
             Objects.equals(viewSubscriptionsTotal, defaultValue) ? null : viewSubscriptionsTotal;
    }

    /**
     * Retrieves the permission to view the number of friends.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewFriendsTotal() {
        return viewFriendsTotal;
    }

    /**
     * Retrieves the permission to view the number of friends,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewFriendsTotal(Principal defaultValue) {
        return viewFriendsTotal != null ? viewFriendsTotal : defaultValue;
    }

    /**
     * Retrieves the permission to view the number of friends,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewFriendsTotal(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriendsTotal(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the number of friends.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewFriendsTotal the permission to set, may be {@code null}
     */
    public void setViewFriendsTotal(Principal viewFriendsTotal) {
        this.viewFriendsTotal = viewFriendsTotal;
    }

    /**
     * Sets the permission to view the number of friends.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewFriendsTotal the permission to set
     * @param defaultValue the default permission
     */
    public void setViewFriendsTotal(Principal viewFriendsTotal, Principal defaultValue) {
        this.viewFriendsTotal = Objects.equals(viewFriendsTotal, defaultValue) ? null : viewFriendsTotal;
    }

    /**
     * Retrieves the permission to view the number of those who added this node to friends.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewFriendOfsTotal() {
        return viewFriendOfsTotal;
    }

    /**
     * Retrieves the permission to view the number of those who added this node to friends,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewFriendOfsTotal(Principal defaultValue) {
        return viewFriendOfsTotal != null ? viewFriendOfsTotal : defaultValue;
    }

    /**
     * Retrieves the permission to view the number of those who added this node to friends,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewFriendOfsTotal(PeopleOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriendOfsTotal(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the number of those who added this node to friends.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewFriendOfsTotal the permission to set, may be {@code null}
     */
    public void setViewFriendOfsTotal(Principal viewFriendOfsTotal) {
        this.viewFriendOfsTotal = viewFriendOfsTotal;
    }

    /**
     * Sets the permission to view the number of those who added this node to friends.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewFriendOfsTotal the permission to set
     * @param defaultValue the default permission
     */
    public void setViewFriendOfsTotal(Principal viewFriendOfsTotal, Principal defaultValue) {
        this.viewFriendOfsTotal = Objects.equals(viewFriendOfsTotal, defaultValue) ? null : viewFriendOfsTotal;
    }

    /**
     * Checks if all the permissions in the object are {@code null}.
     *
     * @return {@code true} if all the permissions are {@code null}, {@code false} otherwise.
     */
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

    /**
     * Creates and returns a copy of this {@code PeopleOperations} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PeopleOperations clone() {
        try {
            return (PeopleOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
