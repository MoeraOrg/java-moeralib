package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionTotalsFilter {

    private List<String> postings;

    public List<String> getPostings() {
        return postings;
    }

    public void setPostings(List<String> postings) {
        this.postings = postings;
    }

}
