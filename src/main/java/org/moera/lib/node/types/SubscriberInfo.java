package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriberInfo extends Structure implements Cloneable {

    private String id;
    private SubscriptionType type;
    private String feedName;
    private String postingId;
    private String nodeName;
    private ContactInfo contact;
    private long createdAt;
    private SubscriberOperations operations;
    private SubscriberOperations ownerOperations;
    private SubscriberOperations adminOperations;

    /**
     * Retrieves subscriber ID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets subscriber ID.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves subscription type.
     *
     * @return the value
     */
    public SubscriptionType getType() {
        return type;
    }

    /**
     * Sets subscription type.
     *
     * @param type the value to be set
     */
    public void setType(SubscriptionType type) {
        this.type = type;
    }

    /**
     * Retrieves feed name, if the subscription type requires one.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets feed name, if the subscription type requires one.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves posting ID, if the subscription type requires one.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets posting ID, if the subscription type requires one.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves name of the subscribed node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the subscribed node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves information known about the subscribed node.
     *
     * @return the value
     */
    public ContactInfo getContact() {
        return contact;
    }

    /**
     * Sets information known about the subscribed node.
     *
     * @param contact the value to be set
     */
    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    /**
     * Retrieves subscription creation timestamp.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets subscription creation timestamp.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public SubscriberOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(SubscriberOperations operations) {
        this.operations = operations;
    }

    /**
     * Retrieves the supported operations and the corresponding principals as defined by the subscriber.
     *
     * @return the value
     */
    public SubscriberOperations getOwnerOperations() {
        return ownerOperations;
    }

    /**
     * Sets the supported operations and the corresponding principals as defined by the subscriber.
     *
     * @param ownerOperations the value to be set
     */
    public void setOwnerOperations(SubscriberOperations ownerOperations) {
        this.ownerOperations = ownerOperations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden by the node administrator.
     *
     * @return the value
     */
    public SubscriberOperations getAdminOperations() {
        return adminOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden by the node administrator.
     *
     * @param adminOperations the value to be set
     */
    public void setAdminOperations(SubscriberOperations adminOperations) {
        this.adminOperations = adminOperations;
    }

    /**
     * Creates and returns a copy of this {@code SubscriberInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SubscriberInfo clone() {
        try {
            return (SubscriberInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
