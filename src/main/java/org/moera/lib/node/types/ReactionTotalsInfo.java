package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionTotalsInfo {

    private String entryId;
    private List<ReactionTotalInfo> positive;
    private List<ReactionTotalInfo> negative;

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

}
