package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentTotalInfo extends Structure implements Cloneable {

    private int total;

    /**
     * Retrieves total number of comments in the posting after the operation.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of comments in the posting after the operation.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Creates and returns a copy of this {@code CommentTotalInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CommentTotalInfo clone() {
        try {
            return (CommentTotalInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
