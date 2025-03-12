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

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets .
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets .
     *
     * @param fullName the value to be set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets .
     *
     * @param gender the value to be set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Retrieves .
     *
     * @return the value
     */
    public AvatarImage getAvatar() {
        return avatar;
    }

    /**
     * Sets .
     *
     * @param avatar the value to be set
     */
    public void setAvatar(AvatarImage avatar) {
        this.avatar = avatar;
    }

    /**
     * Retrieves closeness of the contact to the node, which is calculated from the number of reactions and comments
     * and their age
     * .
     *
     * @return the value
     */
    public float getCloseness() {
        return closeness;
    }

    /**
     * Sets closeness of the contact to the node, which is calculated from the number of reactions and comments and
     * their age
     * .
     *
     * @param closeness the value to be set
     */
    public void setCloseness(float closeness) {
        this.closeness = closeness;
    }

    /**
     * Retrieves the contact is subscribed to at least one of the node's feeds.
     *
     * @return the value
     */
    public Boolean getHasFeedSubscriber() {
        return hasFeedSubscriber;
    }

    /**
     * Sets the contact is subscribed to at least one of the node's feeds.
     *
     * @param hasFeedSubscriber the value to be set
     */
    public void setHasFeedSubscriber(Boolean hasFeedSubscriber) {
        this.hasFeedSubscriber = hasFeedSubscriber;
    }

    /**
     * Retrieves the node is subscribed to at least one of the contact's feeds.
     *
     * @return the value
     */
    public Boolean getHasFeedSubscription() {
        return hasFeedSubscription;
    }

    /**
     * Sets the node is subscribed to at least one of the contact's feeds.
     *
     * @param hasFeedSubscription the value to be set
     */
    public void setHasFeedSubscription(Boolean hasFeedSubscription) {
        this.hasFeedSubscription = hasFeedSubscription;
    }

    /**
     * Retrieves the contact is a friend of the node.
     *
     * @return the value
     */
    public Boolean getHasFriend() {
        return hasFriend;
    }

    /**
     * Sets the contact is a friend of the node.
     *
     * @param hasFriend the value to be set
     */
    public void setHasFriend(Boolean hasFriend) {
        this.hasFriend = hasFriend;
    }

    /**
     * Retrieves the node is a friend of the contact.
     *
     * @return the value
     */
    public Boolean getHasFriendOf() {
        return hasFriendOf;
    }

    /**
     * Sets the node is a friend of the contact.
     *
     * @param hasFriendOf the value to be set
     */
    public void setHasFriendOf(Boolean hasFriendOf) {
        this.hasFriendOf = hasFriendOf;
    }

    /**
     * Retrieves the contact is blocked by the node.
     *
     * @return the value
     */
    public Boolean getHasBlock() {
        return hasBlock;
    }

    /**
     * Sets the contact is blocked by the node.
     *
     * @param hasBlock the value to be set
     */
    public void setHasBlock(Boolean hasBlock) {
        this.hasBlock = hasBlock;
    }

    /**
     * Retrieves the node is blocked by the contact.
     *
     * @return the value
     */
    public Boolean getHasBlockBy() {
        return hasBlockBy;
    }

    /**
     * Sets the node is blocked by the contact.
     *
     * @param hasBlockBy the value to be set
     */
    public void setHasBlockBy(Boolean hasBlockBy) {
        this.hasBlockBy = hasBlockBy;
    }

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public ContactOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(ContactOperations operations) {
        this.operations = operations;
    }

    /**
     * Retrieves the supported operations and the corresponding principals as defined by the contact's owner.
     *
     * @return the value
     */
    public ContactOperations getOwnerOperations() {
        return ownerOperations;
    }

    /**
     * Sets the supported operations and the corresponding principals as defined by the contact's owner.
     *
     * @param ownerOperations the value to be set
     */
    public void setOwnerOperations(ContactOperations ownerOperations) {
        this.ownerOperations = ownerOperations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden by the node administrator.
     *
     * @return the value
     */
    public ContactOperations getAdminOperations() {
        return adminOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden by the node administrator.
     *
     * @param adminOperations the value to be set
     */
    public void setAdminOperations(ContactOperations adminOperations) {
        this.adminOperations = adminOperations;
    }

    /**
     * Creates and returns a copy of this {@code ContactInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ContactInfo clone() {
        try {
            return (ContactInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
