package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntryInfo extends Structure implements Cloneable {

    private PostingInfo posting;
    private CommentInfo comment;

    /**
     * Retrieves posting details, set if the entry is a posting.
     *
     * @return the value
     */
    public PostingInfo getPosting() {
        return posting;
    }

    /**
     * Sets posting details, set if the entry is a posting.
     *
     * @param posting the value to be set
     */
    public void setPosting(PostingInfo posting) {
        this.posting = posting;
    }

    /**
     * Retrieves comment details, set if the entry is a comment.
     *
     * @return the value
     */
    public CommentInfo getComment() {
        return comment;
    }

    /**
     * Sets comment details, set if the entry is a comment.
     *
     * @param comment the value to be set
     */
    public void setComment(CommentInfo comment) {
        this.comment = comment;
    }

    @Override
    public void validate() {
        super.validate();
        if (posting != null) {
            posting.validate();
        }
        if (comment != null) {
            comment.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code EntryInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public EntryInfo clone() {
        try {
            return (EntryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
