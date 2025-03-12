package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedByUserInfo extends Structure implements Cloneable {

    private String id;
    private BlockedOperation blockedOperation;
    private ContactInfo contact;
    private String nodeName;
    private String postingId;
    private long createdAt;
    private Long deadline;
    private String reason;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets .
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves operation that is blocked.
     *
     * @return the value
     */
    public BlockedOperation getBlockedOperation() {
        return blockedOperation;
    }

    /**
     * Sets operation that is blocked.
     *
     * @param blockedOperation the value to be set
     */
    public void setBlockedOperation(BlockedOperation blockedOperation) {
        this.blockedOperation = blockedOperation;
    }

    /**
     * Retrieves information known about the blocking node.
     *
     * @return the value
     */
    public ContactInfo getContact() {
        return contact;
    }

    /**
     * Sets information known about the blocking node.
     *
     * @param contact the value to be set
     */
    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    /**
     * Retrieves name of the blocking node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the blocking node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves ID of the posting, where the node is blocked; <code>null</code> or absent, if the node is blocked
     * globally
     * .
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting, where the node is blocked; <code>null</code> or absent, if the node is blocked globally
     * .
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves blocking timestamp - the real time when the node was blocked.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets blocking timestamp - the real time when the node was blocked.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves unblocking timestamp - the real time when the node will be unblocked; <code>null</code> or absent, if
     * the node is blocked permanently
     * .
     *
     * @return the value
     */
    public Long getDeadline() {
        return deadline;
    }

    /**
     * Sets unblocking timestamp - the real time when the node will be unblocked; <code>null</code> or absent, if the
     * node is blocked permanently
     * .
     *
     * @param deadline the value to be set
     */
    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    /**
     * Retrieves reason of blocking.
     *
     * @return the value
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason of blocking.
     *
     * @param reason the value to be set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Creates and returns a copy of this {@code BlockedByUserInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public BlockedByUserInfo clone() {
        try {
            return (BlockedByUserInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
