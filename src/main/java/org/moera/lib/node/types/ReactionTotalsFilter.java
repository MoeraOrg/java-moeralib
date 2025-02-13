package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionTotalsFilter implements Cloneable {

    private List<String> postings;

    @JsonIgnore
    private Object extra;

    public List<String> getPostings() {
        return postings;
    }

    public void setPostings(List<String> postings) {
        this.postings = postings;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public ReactionTotalsFilter clone() {
        try {
            return (ReactionTotalsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
