package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionCreated extends Structure implements Cloneable {

    private ReactionInfo reaction;
    private ReactionTotalsInfo totals;

    /**
     * Retrieves details of the reaction created.
     *
     * @return the value
     */
    public ReactionInfo getReaction() {
        return reaction;
    }

    /**
     * Sets details of the reaction created.
     *
     * @param reaction the value to be set
     */
    public void setReaction(ReactionInfo reaction) {
        this.reaction = reaction;
    }

    /**
     * Retrieves summary of reactions after the creation.
     *
     * @return the value
     */
    public ReactionTotalsInfo getTotals() {
        return totals;
    }

    /**
     * Sets summary of reactions after the creation.
     *
     * @param totals the value to be set
     */
    public void setTotals(ReactionTotalsInfo totals) {
        this.totals = totals;
    }

    /**
     * Creates and returns a copy of this {@code ReactionCreated} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ReactionCreated clone() {
        try {
            return (ReactionCreated) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
