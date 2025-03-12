package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedByUserFilter extends Structure implements Cloneable {

    private List<BlockedOperation> blockedOperations;
    private List<RemotePostingOrNode> postings;
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
     * Retrieves the postings or whole nodes, where the node is blocked.
     *
     * @return the value
     */
    public List<RemotePostingOrNode> getPostings() {
        return postings;
    }

    /**
     * Sets the postings or whole nodes, where the node is blocked.
     *
     * @param postings the value to be set
     */
    public void setPostings(List<RemotePostingOrNode> postings) {
        this.postings = postings;
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
     * Creates and returns a copy of this {@code BlockedByUserFilter} object.
     *
     * @return a clone of this instance
     */
    @Override
    public BlockedByUserFilter clone() {
        try {
            return (BlockedByUserFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
