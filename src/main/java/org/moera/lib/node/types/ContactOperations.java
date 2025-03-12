package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactOperations implements Cloneable {

    private Principal viewFeedSubscriber;
    private Principal viewFeedSubscription;
    private Principal viewFriend;
    private Principal viewFriendOf;
    private Principal viewBlock;
    private Principal viewBlockBy;

    /**
     * Retrieves the permission to see the subscriber information.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewFeedSubscriber() {
        return viewFeedSubscriber;
    }

    /**
     * Retrieves the permission to see the subscriber information,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewFeedSubscriber(Principal defaultValue) {
        return viewFeedSubscriber != null ? viewFeedSubscriber : defaultValue;
    }

    /**
     * Retrieves the permission to see the subscriber information,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewFeedSubscriber(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFeedSubscriber(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to see the subscriber information.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewFeedSubscriber the permission to set, may be {@code null}
     */
    public void setViewFeedSubscriber(Principal viewFeedSubscriber) {
        this.viewFeedSubscriber = viewFeedSubscriber;
    }

    /**
     * Sets the permission to see the subscriber information.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewFeedSubscriber the permission to set
     * @param defaultValue the default permission
     */
    public void setViewFeedSubscriber(Principal viewFeedSubscriber, Principal defaultValue) {
        this.viewFeedSubscriber = Objects.equals(viewFeedSubscriber, defaultValue) ? null : viewFeedSubscriber;
    }

    /**
     * Retrieves the permission to see the subscription information.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewFeedSubscription() {
        return viewFeedSubscription;
    }

    /**
     * Retrieves the permission to see the subscription information,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewFeedSubscription(Principal defaultValue) {
        return viewFeedSubscription != null ? viewFeedSubscription : defaultValue;
    }

    /**
     * Retrieves the permission to see the subscription information,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewFeedSubscription(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFeedSubscription(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to see the subscription information.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewFeedSubscription the permission to set, may be {@code null}
     */
    public void setViewFeedSubscription(Principal viewFeedSubscription) {
        this.viewFeedSubscription = viewFeedSubscription;
    }

    /**
     * Sets the permission to see the subscription information.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewFeedSubscription the permission to set
     * @param defaultValue the default permission
     */
    public void setViewFeedSubscription(Principal viewFeedSubscription, Principal defaultValue) {
        this.viewFeedSubscription = Objects.equals(viewFeedSubscription, defaultValue) ? null : viewFeedSubscription;
    }

    /**
     * Retrieves the permission to see the friend information.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewFriend() {
        return viewFriend;
    }

    /**
     * Retrieves the permission to see the friend information,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewFriend(Principal defaultValue) {
        return viewFriend != null ? viewFriend : defaultValue;
    }

    /**
     * Retrieves the permission to see the friend information,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewFriend(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriend(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to see the friend information.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewFriend the permission to set, may be {@code null}
     */
    public void setViewFriend(Principal viewFriend) {
        this.viewFriend = viewFriend;
    }

    /**
     * Sets the permission to see the friend information.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewFriend the permission to set
     * @param defaultValue the default permission
     */
    public void setViewFriend(Principal viewFriend, Principal defaultValue) {
        this.viewFriend = Objects.equals(viewFriend, defaultValue) ? null : viewFriend;
    }

    /**
     * Retrieves the permission to see the friend-of information (this operation can be modified by admin only).
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewFriendOf() {
        return viewFriendOf;
    }

    /**
     * Retrieves the permission to see the friend-of information (this operation can be modified by admin only),
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewFriendOf(Principal defaultValue) {
        return viewFriendOf != null ? viewFriendOf : defaultValue;
    }

    /**
     * Retrieves the permission to see the friend-of information (this operation can be modified by admin only),
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewFriendOf(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriendOf(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to see the friend-of information (this operation can be modified by admin only).
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewFriendOf the permission to set, may be {@code null}
     */
    public void setViewFriendOf(Principal viewFriendOf) {
        this.viewFriendOf = viewFriendOf;
    }

    /**
     * Sets the permission to see the friend-of information (this operation can be modified by admin only).
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewFriendOf the permission to set
     * @param defaultValue the default permission
     */
    public void setViewFriendOf(Principal viewFriendOf, Principal defaultValue) {
        this.viewFriendOf = Objects.equals(viewFriendOf, defaultValue) ? null : viewFriendOf;
    }

    /**
     * Retrieves the permission to see the blocking information (this operation can be modified by admin only).
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewBlock() {
        return viewBlock;
    }

    /**
     * Retrieves the permission to see the blocking information (this operation can be modified by admin only),
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewBlock(Principal defaultValue) {
        return viewBlock != null ? viewBlock : defaultValue;
    }

    /**
     * Retrieves the permission to see the blocking information (this operation can be modified by admin only),
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewBlock(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewBlock(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to see the blocking information (this operation can be modified by admin only).
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewBlock the permission to set, may be {@code null}
     */
    public void setViewBlock(Principal viewBlock) {
        this.viewBlock = viewBlock;
    }

    /**
     * Sets the permission to see the blocking information (this operation can be modified by admin only).
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewBlock the permission to set
     * @param defaultValue the default permission
     */
    public void setViewBlock(Principal viewBlock, Principal defaultValue) {
        this.viewBlock = Objects.equals(viewBlock, defaultValue) ? null : viewBlock;
    }

    /**
     * Retrieves the permission to see the blocked-by information (this operation can be modified by admin only).
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewBlockBy() {
        return viewBlockBy;
    }

    /**
     * Retrieves the permission to see the blocked-by information (this operation can be modified by admin only),
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewBlockBy(Principal defaultValue) {
        return viewBlockBy != null ? viewBlockBy : defaultValue;
    }

    /**
     * Retrieves the permission to see the blocked-by information (this operation can be modified by admin only),
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewBlockBy(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewBlockBy(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to see the blocked-by information (this operation can be modified by admin only).
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewBlockBy the permission to set, may be {@code null}
     */
    public void setViewBlockBy(Principal viewBlockBy) {
        this.viewBlockBy = viewBlockBy;
    }

    /**
     * Sets the permission to see the blocked-by information (this operation can be modified by admin only).
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewBlockBy the permission to set
     * @param defaultValue the default permission
     */
    public void setViewBlockBy(Principal viewBlockBy, Principal defaultValue) {
        this.viewBlockBy = Objects.equals(viewBlockBy, defaultValue) ? null : viewBlockBy;
    }

    /**
     * Checks if all the permissions in the object are {@code null}.
     *
     * @return {@code true} if all the permissions are {@code null}, {@code false} otherwise.
     */
    @JsonIgnore
    public boolean isEmpty() {
        return viewFeedSubscriber == null
            && viewFeedSubscription == null
            && viewFriend == null
            && viewFriendOf == null
            && viewBlock == null
            && viewBlockBy == null;
    }

    /**
     * Creates and returns a copy of this {@code ContactOperations} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ContactOperations clone() {
        try {
            return (ContactOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
