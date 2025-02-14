package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionsSliceInfo implements Cloneable {

    private long before;
    private long after;
    private int total;
    private List<ReactionInfo> reactions;

    @JsonIgnore
    private Object extra;

    public long getBefore() {
        return before;
    }

    public void setBefore(long before) {
        this.before = before;
    }

    public long getAfter() {
        return after;
    }

    public void setAfter(long after) {
        this.after = after;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ReactionInfo> getReactions() {
        return reactions;
    }

    public void setReactions(List<ReactionInfo> reactions) {
        this.reactions = reactions;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public ReactionsSliceInfo clone() {
        try {
            return (ReactionsSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
