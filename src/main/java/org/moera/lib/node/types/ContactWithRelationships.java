package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactWithRelationships extends Structure implements Cloneable {

    private ContactInfo contact;
    private SubscriberInfo subscriber;
    private SubscriptionInfo subscription;
    private FriendInfo friend;
    private FriendOfInfo friendOf;
    private List<BlockedUserInfo> blocked;
    private List<BlockedByUserInfo> blockedBy;

    /**
     * Retrieves contact's details.
     *
     * @return the value
     */
    public ContactInfo getContact() {
        return contact;
    }

    /**
     * Sets contact's details.
     *
     * @param contact the value to be set
     */
    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    /**
     * Retrieves information about the contact's subscription to the node's feeds.
     *
     * @return the value
     */
    public SubscriberInfo getSubscriber() {
        return subscriber;
    }

    /**
     * Sets information about the contact's subscription to the node's feeds.
     *
     * @param subscriber the value to be set
     */
    public void setSubscriber(SubscriberInfo subscriber) {
        this.subscriber = subscriber;
    }

    /**
     * Retrieves information about the nodes's subscription to the contact's feeds.
     *
     * @return the value
     */
    public SubscriptionInfo getSubscription() {
        return subscription;
    }

    /**
     * Sets information about the nodes's subscription to the contact's feeds.
     *
     * @param subscription the value to be set
     */
    public void setSubscription(SubscriptionInfo subscription) {
        this.subscription = subscription;
    }

    /**
     * Retrieves information about the node's friendship with the contact.
     *
     * @return the value
     */
    public FriendInfo getFriend() {
        return friend;
    }

    /**
     * Sets information about the node's friendship with the contact.
     *
     * @param friend the value to be set
     */
    public void setFriend(FriendInfo friend) {
        this.friend = friend;
    }

    /**
     * Retrieves information about the contact's friendship with the node.
     *
     * @return the value
     */
    public FriendOfInfo getFriendOf() {
        return friendOf;
    }

    /**
     * Sets information about the contact's friendship with the node.
     *
     * @param friendOf the value to be set
     */
    public void setFriendOf(FriendOfInfo friendOf) {
        this.friendOf = friendOf;
    }

    /**
     * Retrieves information about blocking the contact by the node.
     *
     * @return the value
     */
    public List<BlockedUserInfo> getBlocked() {
        return blocked;
    }

    /**
     * Sets information about blocking the contact by the node.
     *
     * @param blocked the value to be set
     */
    public void setBlocked(List<BlockedUserInfo> blocked) {
        this.blocked = blocked;
    }

    /**
     * Retrieves information about blocking the node by the contact.
     *
     * @return the value
     */
    public List<BlockedByUserInfo> getBlockedBy() {
        return blockedBy;
    }

    /**
     * Sets information about blocking the node by the contact.
     *
     * @param blockedBy the value to be set
     */
    public void setBlockedBy(List<BlockedByUserInfo> blockedBy) {
        this.blockedBy = blockedBy;
    }

    /**
     * Creates and returns a copy of this {@code ContactWithRelationships} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ContactWithRelationships clone() {
        try {
            return (ContactWithRelationships) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
