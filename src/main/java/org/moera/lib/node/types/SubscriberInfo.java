package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriberInfo implements Cloneable {

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

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public SubscriberOperations getOperations() {
        return operations;
    }

    public void setOperations(SubscriberOperations operations) {
        this.operations = operations;
    }

    public SubscriberOperations getOwnerOperations() {
        return ownerOperations;
    }

    public void setOwnerOperations(SubscriberOperations ownerOperations) {
        this.ownerOperations = ownerOperations;
    }

    public SubscriberOperations getAdminOperations() {
        return adminOperations;
    }

    public void setAdminOperations(SubscriberOperations adminOperations) {
        this.adminOperations = adminOperations;
    }

    @Override
    public SubscriberInfo clone() {
        try {
            return (SubscriberInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
