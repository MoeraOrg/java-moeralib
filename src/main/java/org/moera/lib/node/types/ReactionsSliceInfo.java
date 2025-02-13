package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionsSliceInfo implements Cloneable {

    private int before;
    private int after;
    private int total;
    private List<ReactionInfo> reactions;

    public int getBefore() {
        return before;
    }

    public void setBefore(int before) {
        this.before = before;
    }

    public int getAfter() {
        return after;
    }

    public void setAfter(int after) {
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

    @Override
    public ReactionsSliceInfo clone() {
        try {
            return (ReactionsSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
