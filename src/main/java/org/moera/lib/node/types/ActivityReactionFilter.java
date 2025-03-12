package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivityReactionFilter extends Structure implements Cloneable {

    private List<RemotePosting> postings;

    /**
     * Retrieves include only reactions to remote postings from this list.
     *
     * @return the value
     */
    public List<RemotePosting> getPostings() {
        return postings;
    }

    /**
     * Sets include only reactions to remote postings from this list.
     *
     * @param postings the value to be set
     */
    public void setPostings(List<RemotePosting> postings) {
        this.postings = postings;
    }

    /**
     * Creates and returns a copy of this {@code ActivityReactionFilter} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ActivityReactionFilter clone() {
        try {
            return (ActivityReactionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
