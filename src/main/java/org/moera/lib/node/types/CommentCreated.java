package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentCreated extends Structure implements Cloneable {

    private CommentInfo comment;
    private int total;

    /**
     * Retrieves details of the comment created.
     *
     * @return the value
     */
    public CommentInfo getComment() {
        return comment;
    }

    /**
     * Sets details of the comment created.
     *
     * @param comment the value to be set
     */
    public void setComment(CommentInfo comment) {
        this.comment = comment;
    }

    /**
     * Retrieves total number of comments in the posting after the creation.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of comments in the posting after the creation.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public void validate() {
        super.validate();
        if (comment != null) {
            comment.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code CommentCreated} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CommentCreated clone() {
        try {
            return (CommentCreated) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
