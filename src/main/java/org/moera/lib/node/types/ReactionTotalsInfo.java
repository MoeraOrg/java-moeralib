package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionTotalsInfo implements Cloneable {

    private String entryId;
    private List<ReactionTotalInfo> positive;
    private List<ReactionTotalInfo> negative;

    @JsonIgnore
    private Object extra;

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public List<ReactionTotalInfo> getPositive() {
        return positive;
    }

    public void setPositive(List<ReactionTotalInfo> positive) {
        this.positive = positive;
    }

    public List<ReactionTotalInfo> getNegative() {
        return negative;
    }

    public void setNegative(List<ReactionTotalInfo> negative) {
        this.negative = negative;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public ReactionTotalsInfo clone() {
        try {
            return (ReactionTotalsInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
