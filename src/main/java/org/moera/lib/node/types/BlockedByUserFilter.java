package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedByUserFilter {

    private List<BlockedOperation> blockedOperations;
    private List<RemotePostingOrNode> postings;
    private Boolean strict;

    public List<BlockedOperation> getBlockedOperations() {
        return blockedOperations;
    }

    public void setBlockedOperations(List<BlockedOperation> blockedOperations) {
        this.blockedOperations = blockedOperations;
    }

    public List<RemotePostingOrNode> getPostings() {
        return postings;
    }

    public void setPostings(List<RemotePostingOrNode> postings) {
        this.postings = postings;
    }

    public Boolean getStrict() {
        return strict;
    }

    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

}
