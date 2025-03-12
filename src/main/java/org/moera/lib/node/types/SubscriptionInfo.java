package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionInfo extends Structure implements Cloneable {

    private String id;
    private SubscriptionType type;
    private String feedName;
    private String remoteNodeName;
    private ContactInfo contact;
    private String remoteFeedName;
    private String remotePostingId;
    private long createdAt;
    private SubscriptionReason reason;
    private SubscriptionOperations operations;

    /**
     * Retrieves subscription ID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets subscription ID.
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
     * Retrieves feed name on this node that receives notifications.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets feed name on this node that receives notifications.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves name of the node this node is subscribed to.
     *
     * @return the value
     */
    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    /**
     * Sets name of the node this node is subscribed to.
     *
     * @param remoteNodeName the value to be set
     */
    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    /**
     * Retrieves information known about the remote node.
     *
     * @return the value
     */
    public ContactInfo getContact() {
        return contact;
    }

    /**
     * Sets information known about the remote node.
     *
     * @param contact the value to be set
     */
    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    /**
     * Retrieves feed name on the remote node, if the subscription type requires one.
     *
     * @return the value
     */
    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    /**
     * Sets feed name on the remote node, if the subscription type requires one.
     *
     * @param remoteFeedName the value to be set
     */
    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
    }

    /**
     * Retrieves posting ID on the remote node, if the subscription type requires one.
     *
     * @return the value
     */
    public String getRemotePostingId() {
        return remotePostingId;
    }

    /**
     * Sets posting ID on the remote node, if the subscription type requires one.
     *
     * @param remotePostingId the value to be set
     */
    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
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
     * Retrieves subscription reason.
     *
     * @return the value
     */
    public SubscriptionReason getReason() {
        return reason;
    }

    /**
     * Sets subscription reason.
     *
     * @param reason the value to be set
     */
    public void setReason(SubscriptionReason reason) {
        this.reason = reason;
    }

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public SubscriptionOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(SubscriptionOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code SubscriptionInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SubscriptionInfo clone() {
        try {
            return (SubscriptionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
