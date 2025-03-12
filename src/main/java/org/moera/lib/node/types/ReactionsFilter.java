package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionsFilter extends Structure implements Cloneable {

    private String ownerName;
    private List<String> postings;

    /**
     * Retrieves reaction owner's name.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets reaction owner's name.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

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
     * Creates and returns a copy of this {@code ReactionsFilter} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ReactionsFilter clone() {
        try {
            return (ReactionsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
