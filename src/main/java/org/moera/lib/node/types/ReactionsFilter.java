package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionsFilter implements Cloneable {

    private String ownerName;
    private List<String> postings;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<String> getPostings() {
        return postings;
    }

    public void setPostings(List<String> postings) {
        this.postings = postings;
    }

    @Override
    public ReactionsFilter clone() {
        try {
            return (ReactionsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
