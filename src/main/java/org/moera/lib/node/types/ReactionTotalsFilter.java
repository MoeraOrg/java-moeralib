package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionTotalsFilter extends Structure implements Cloneable {

    private List<String> postings;

    /**
     * Retrieves list of IDs of postings.
     *
     * @return the value
     */
    public List<String> getPostings() {
        return postings;
    }

    /**
     * Sets list of IDs of postings.
     *
     * @param postings the value to be set
     */
    public void setPostings(List<String> postings) {
        this.postings = postings;
    }

    /**
     * Creates and returns a copy of this {@code ReactionTotalsFilter} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ReactionTotalsFilter clone() {
        try {
            return (ReactionTotalsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
