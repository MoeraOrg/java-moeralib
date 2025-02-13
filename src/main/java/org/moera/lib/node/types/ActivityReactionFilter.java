package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivityReactionFilter implements Cloneable {

    private List<RemotePosting> postings;

    public List<RemotePosting> getPostings() {
        return postings;
    }

    public void setPostings(List<RemotePosting> postings) {
        this.postings = postings;
    }

    @Override
    public ActivityReactionFilter clone() {
        try {
            return (ActivityReactionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
