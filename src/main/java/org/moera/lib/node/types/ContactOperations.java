package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactOperations {

    private Principal viewFeedSubscriber;
    private Principal viewFeedSubscription;
    private Principal viewFriend;
    private Principal viewFriendOf;
    private Principal viewBlock;
    private Principal viewBlockBy;

    public Principal getViewFeedSubscriber() {
        return viewFeedSubscriber;
    }

    public void setViewFeedSubscriber(Principal viewFeedSubscriber) {
        this.viewFeedSubscriber = viewFeedSubscriber;
    }

    public Principal getViewFeedSubscription() {
        return viewFeedSubscription;
    }

    public void setViewFeedSubscription(Principal viewFeedSubscription) {
        this.viewFeedSubscription = viewFeedSubscription;
    }

    public Principal getViewFriend() {
        return viewFriend;
    }

    public void setViewFriend(Principal viewFriend) {
        this.viewFriend = viewFriend;
    }

    public Principal getViewFriendOf() {
        return viewFriendOf;
    }

    public void setViewFriendOf(Principal viewFriendOf) {
        this.viewFriendOf = viewFriendOf;
    }

    public Principal getViewBlock() {
        return viewBlock;
    }

    public void setViewBlock(Principal viewBlock) {
        this.viewBlock = viewBlock;
    }

    public Principal getViewBlockBy() {
        return viewBlockBy;
    }

    public void setViewBlockBy(Principal viewBlockBy) {
        this.viewBlockBy = viewBlockBy;
    }

}
