package org.moera.lib.node.types;

// This file is generated

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedUserAttributes {

    private BlockedOperation blockedOperation;
    private String nodeName;
    private String entryId;
    private String entryNodeName;
    private String entryPostingId;
    private Timestamp deadline;
    private String reasonSrc;
    private SourceFormat reasonSrcFormat;

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

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
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

}
