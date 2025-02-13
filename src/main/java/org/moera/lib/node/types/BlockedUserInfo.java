package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedUserInfo implements Cloneable {

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BlockedOperation getBlockedOperation() {
        return blockedOperation;
    }

    public void setBlockedOperation(BlockedOperation blockedOperation) {
        this.blockedOperation = blockedOperation;
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

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public String getEntryNodeName() {
        return entryNodeName;
    }

    public void setEntryNodeName(String entryNodeName) {
        this.entryNodeName = entryNodeName;
    }

    public String getEntryPostingId() {
        return entryPostingId;
    }

    public void setEntryPostingId(String entryPostingId) {
        this.entryPostingId = entryPostingId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getDeadline() {
        return deadline;
    }

    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    public String getReasonSrc() {
        return reasonSrc;
    }

    public void setReasonSrc(String reasonSrc) {
        this.reasonSrc = reasonSrc;
    }

    public SourceFormat getReasonSrcFormat() {
        return reasonSrcFormat;
    }

    public void setReasonSrcFormat(SourceFormat reasonSrcFormat) {
        this.reasonSrcFormat = reasonSrcFormat;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public BlockedUserInfo clone() {
        try {
            return (BlockedUserInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
