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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubscriptionType getType() {
        return type;
    }

    public void setType(SubscriptionType type) {
        this.type = type;
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
    }

    public String getRemotePostingId() {
        return remotePostingId;
    }

    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public SubscriptionReason getReason() {
        return reason;
    }

    public void setReason(SubscriptionReason reason) {
        this.reason = reason;
    }

    public SubscriptionOperations getOperations() {
        return operations;
    }

    public void setOperations(SubscriptionOperations operations) {
        this.operations = operations;
    }

    @Override
    public SubscriptionInfo clone() {
        try {
            return (SubscriptionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
