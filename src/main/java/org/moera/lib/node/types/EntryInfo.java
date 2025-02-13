package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntryInfo implements Cloneable {

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
    public EntryInfo clone() {
        try {
            return (EntryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
