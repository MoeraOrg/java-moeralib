package org.moera.lib.node.types;

// This file is generated

import java.util.function.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentTotalInfo implements Cloneable {

    private int total;

    @JsonIgnore
    private Object extra;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Object getExtra() {
        return extra;
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrCreateExtra(Supplier<T> creator) {
        if (extra == null) {
            extra = creator.get();
        }
        return (T) extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public CommentTotalInfo clone() {
        try {
            return (CommentTotalInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
