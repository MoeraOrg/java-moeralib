package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedUserFilter extends Structure implements Cloneable {

    private List<BlockedOperation> blockedOperations;
    private String nodeName;
    private String entryId;
    private String entryNodeName;
    private String entryPostingId;
    private Boolean strict;

    /**
     * Retrieves operations that are blocked.
     *
     * @return the value
     */
    public List<BlockedOperation> getBlockedOperations() {
        return blockedOperations;
    }

    /**
     * Sets operations that are blocked.
     *
     * @param blockedOperations the value to be set
     */
    public void setBlockedOperations(List<BlockedOperation> blockedOperations) {
        this.blockedOperations = blockedOperations;
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
     * Retrieves if set to <code>true</code>, only the blockings that strictly fit the criteria are returned; otherwise
     * global blockings are returned even if the search is limited to a particular posting
     * .
     *
     * @return the value
     */
    public Boolean getStrict() {
        return strict;
    }

    /**
     * Sets if set to <code>true</code>, only the blockings that strictly fit the criteria are returned; otherwise
     * global blockings are returned even if the search is limited to a particular posting
     * .
     *
     * @param strict the value to be set
     */
    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

    /**
     * Creates and returns a copy of this {@code BlockedUserFilter} object.
     *
     * @return a clone of this instance
     */
    @Override
    public BlockedUserFilter clone() {
        try {
            return (BlockedUserFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
