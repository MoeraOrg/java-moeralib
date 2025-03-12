package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedUserInfo extends Structure implements Cloneable {

    private String id;
    private BlockedOperation blockedOperation;
    private String nodeName;
    private ContactInfo contact;
    private String entryId;
    private String entryNodeName;
    private String entryPostingId;
    private long createdAt;
    private Long deadline;
    private String reasonSrc;
    private SourceFormat reasonSrcFormat;
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
     * Retrieves name of the blocked node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the blocked node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves information known about the blocked node.
     *
     * @return the value
     */
    public ContactInfo getContact() {
        return contact;
    }

    /**
     * Sets information known about the blocked node.
     *
     * @param contact the value to be set
     */
    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    /**
     * Retrieves ID of the local entry, where the node is blocked; <code>null</code> or absent, if the node is blocked
     * globally
     * .
     *
     * @return the value
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * Sets ID of the local entry, where the node is blocked; <code>null</code> or absent, if the node is blocked
     * globally
     * .
     *
     * @param entryId the value to be set
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * Retrieves node name of the remote posting, where the node is blocked; <code>null</code> or absent, if the node
     * is blocked globally
     * .
     *
     * @return the value
     */
    public String getEntryNodeName() {
        return entryNodeName;
    }

    /**
     * Sets node name of the remote posting, where the node is blocked; <code>null</code> or absent, if the node is
     * blocked globally
     * .
     *
     * @param entryNodeName the value to be set
     */
    public void setEntryNodeName(String entryNodeName) {
        this.entryNodeName = entryNodeName;
    }

    /**
     * Retrieves ID of the remote posting, where the node is blocked; <code>null</code> or absent, if the node is
     * blocked globally
     * .
     *
     * @return the value
     */
    public String getEntryPostingId() {
        return entryPostingId;
    }

    /**
     * Sets ID of the remote posting, where the node is blocked; <code>null</code> or absent, if the node is blocked
     * globally
     * .
     *
     * @param entryPostingId the value to be set
     */
    public void setEntryPostingId(String entryPostingId) {
        this.entryPostingId = entryPostingId;
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
     * Retrieves source text of the reason of blocking.
     *
     * @return the value
     */
    public String getReasonSrc() {
        return reasonSrc;
    }

    /**
     * Sets source text of the reason of blocking.
     *
     * @param reasonSrc the value to be set
     */
    public void setReasonSrc(String reasonSrc) {
        this.reasonSrc = reasonSrc;
    }

    /**
     * Retrieves format of the source text of the reason of blocking, the list of available formats is returned in
     * <code><a href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @return the value
     */
    public SourceFormat getReasonSrcFormat() {
        return reasonSrcFormat;
    }

    /**
     * Sets format of the source text of the reason of blocking, the list of available formats is returned in <code><a
     * href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @param reasonSrcFormat the value to be set
     */
    public void setReasonSrcFormat(SourceFormat reasonSrcFormat) {
        this.reasonSrcFormat = reasonSrcFormat;
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
     * Creates and returns a copy of this {@code BlockedUserInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public BlockedUserInfo clone() {
        try {
            return (BlockedUserInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
