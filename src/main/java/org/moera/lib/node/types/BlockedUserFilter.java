package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedUserFilter {

    private List<BlockedOperation> blockedOperations;
    private String nodeName;
    private String entryId;
    private String entryNodeName;
    private String entryPostingId;
    private Boolean strict;

    public List<BlockedOperation> getBlockedOperations() {
        return blockedOperations;
    }

    public void setBlockedOperations(List<BlockedOperation> blockedOperations) {
        this.blockedOperations = blockedOperations;
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

    public Boolean getStrict() {
        return strict;
    }

    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

}
