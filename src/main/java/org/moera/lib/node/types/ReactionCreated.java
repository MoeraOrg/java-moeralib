package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionCreated {

    private ReactionInfo reaction;
    private ReactionTotalsInfo totals;

    public ReactionInfo getReaction() {
        return reaction;
    }

    public void setReaction(ReactionInfo reaction) {
        this.reaction = reaction;
    }

    public ReactionTotalsInfo getTotals() {
        return totals;
    }

    public void setTotals(ReactionTotalsInfo totals) {
        this.totals = totals;
    }

}
