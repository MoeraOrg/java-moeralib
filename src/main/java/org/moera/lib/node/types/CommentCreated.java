package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentCreated {

    private CommentInfo comment;
    private int total;

    public CommentInfo getComment() {
        return comment;
    }

    public void setComment(CommentInfo comment) {
        this.comment = comment;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
