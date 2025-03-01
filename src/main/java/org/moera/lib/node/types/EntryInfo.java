package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntryInfo extends Structure implements Cloneable {

    private PostingInfo posting;
    private CommentInfo comment;

    public PostingInfo getPosting() {
        return posting;
    }

    public void setPosting(PostingInfo posting) {
        this.posting = posting;
    }

    public CommentInfo getComment() {
        return comment;
    }

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

    @Override
    public EntryInfo clone() {
        try {
            return (EntryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
