package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactInfo extends Structure implements Cloneable {

    private String nodeName;
    private String fullName;
    private String gender;
    private AvatarImage avatar;
    private float closeness;
    private Boolean hasFeedSubscriber;
    private Boolean hasFeedSubscription;
    private Boolean hasFriend;
    private Boolean hasFriendOf;
    private Boolean hasBlock;
    private Boolean hasBlockBy;
    private ContactOperations operations;
    private ContactOperations ownerOperations;
    private ContactOperations adminOperations;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public AvatarImage getAvatar() {
        return avatar;
    }

    public void setAvatar(AvatarImage avatar) {
        this.avatar = avatar;
    }

    public float getCloseness() {
        return closeness;
    }

    public void setCloseness(float closeness) {
        this.closeness = closeness;
    }

    public Boolean getHasFeedSubscriber() {
        return hasFeedSubscriber;
    }

    public void setHasFeedSubscriber(Boolean hasFeedSubscriber) {
        this.hasFeedSubscriber = hasFeedSubscriber;
    }

    public Boolean getHasFeedSubscription() {
        return hasFeedSubscription;
    }

    public void setHasFeedSubscription(Boolean hasFeedSubscription) {
        this.hasFeedSubscription = hasFeedSubscription;
    }

    public Boolean getHasFriend() {
        return hasFriend;
    }

    public void setHasFriend(Boolean hasFriend) {
        this.hasFriend = hasFriend;
    }

    public Boolean getHasFriendOf() {
        return hasFriendOf;
    }

    public void setHasFriendOf(Boolean hasFriendOf) {
        this.hasFriendOf = hasFriendOf;
    }

    public Boolean getHasBlock() {
        return hasBlock;
    }

    public void setHasBlock(Boolean hasBlock) {
        this.hasBlock = hasBlock;
    }

    public Boolean getHasBlockBy() {
        return hasBlockBy;
    }

    public void setHasBlockBy(Boolean hasBlockBy) {
        this.hasBlockBy = hasBlockBy;
    }

    public ContactOperations getOperations() {
        return operations;
    }

    public void setOperations(ContactOperations operations) {
        this.operations = operations;
    }

    public ContactOperations getOwnerOperations() {
        return ownerOperations;
    }

    public void setOwnerOperations(ContactOperations ownerOperations) {
        this.ownerOperations = ownerOperations;
    }

    public ContactOperations getAdminOperations() {
        return adminOperations;
    }

    public void setAdminOperations(ContactOperations adminOperations) {
        this.adminOperations = adminOperations;
    }

    @Override
    public ContactInfo clone() {
        try {
            return (ContactInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
