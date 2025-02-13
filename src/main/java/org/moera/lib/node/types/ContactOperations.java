package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

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

    public Principal getViewFeedSubscriber() {
        return viewFeedSubscriber;
    }

    public Principal getViewFeedSubscriber(Principal defaultValue) {
        return viewFeedSubscriber != null ? viewFeedSubscriber : defaultValue;
    }

    public static Principal getViewFeedSubscriber(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFeedSubscriber(defaultValue) : defaultValue;
    }

    public void setViewFeedSubscriber(Principal viewFeedSubscriber) {
        this.viewFeedSubscriber = viewFeedSubscriber;
    }

    public void setViewFeedSubscriber(Principal viewFeedSubscriber, Principal defaultValue) {
        this.viewFeedSubscriber = Objects.equals(viewFeedSubscriber, defaultValue) ? null : viewFeedSubscriber;
    }

    public Principal getViewFeedSubscription() {
        return viewFeedSubscription;
    }

    public Principal getViewFeedSubscription(Principal defaultValue) {
        return viewFeedSubscription != null ? viewFeedSubscription : defaultValue;
    }

    public static Principal getViewFeedSubscription(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFeedSubscription(defaultValue) : defaultValue;
    }

    public void setViewFeedSubscription(Principal viewFeedSubscription) {
        this.viewFeedSubscription = viewFeedSubscription;
    }

    public void setViewFeedSubscription(Principal viewFeedSubscription, Principal defaultValue) {
        this.viewFeedSubscription = Objects.equals(viewFeedSubscription, defaultValue) ? null : viewFeedSubscription;
    }

    public Principal getViewFriend() {
        return viewFriend;
    }

    public Principal getViewFriend(Principal defaultValue) {
        return viewFriend != null ? viewFriend : defaultValue;
    }

    public static Principal getViewFriend(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriend(defaultValue) : defaultValue;
    }

    public void setViewFriend(Principal viewFriend) {
        this.viewFriend = viewFriend;
    }

    public void setViewFriend(Principal viewFriend, Principal defaultValue) {
        this.viewFriend = Objects.equals(viewFriend, defaultValue) ? null : viewFriend;
    }

    public Principal getViewFriendOf() {
        return viewFriendOf;
    }

    public Principal getViewFriendOf(Principal defaultValue) {
        return viewFriendOf != null ? viewFriendOf : defaultValue;
    }

    public static Principal getViewFriendOf(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewFriendOf(defaultValue) : defaultValue;
    }

    public void setViewFriendOf(Principal viewFriendOf) {
        this.viewFriendOf = viewFriendOf;
    }

    public void setViewFriendOf(Principal viewFriendOf, Principal defaultValue) {
        this.viewFriendOf = Objects.equals(viewFriendOf, defaultValue) ? null : viewFriendOf;
    }

    public Principal getViewBlock() {
        return viewBlock;
    }

    public Principal getViewBlock(Principal defaultValue) {
        return viewBlock != null ? viewBlock : defaultValue;
    }

    public static Principal getViewBlock(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewBlock(defaultValue) : defaultValue;
    }

    public void setViewBlock(Principal viewBlock) {
        this.viewBlock = viewBlock;
    }

    public void setViewBlock(Principal viewBlock, Principal defaultValue) {
        this.viewBlock = Objects.equals(viewBlock, defaultValue) ? null : viewBlock;
    }

    public Principal getViewBlockBy() {
        return viewBlockBy;
    }

    public Principal getViewBlockBy(Principal defaultValue) {
        return viewBlockBy != null ? viewBlockBy : defaultValue;
    }

    public static Principal getViewBlockBy(ContactOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewBlockBy(defaultValue) : defaultValue;
    }

    public void setViewBlockBy(Principal viewBlockBy) {
        this.viewBlockBy = viewBlockBy;
    }

    public void setViewBlockBy(Principal viewBlockBy, Principal defaultValue) {
        this.viewBlockBy = Objects.equals(viewBlockBy, defaultValue) ? null : viewBlockBy;
    }

    @Override
    public ContactOperations clone() {
        try {
            return (ContactOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
