package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionTotalsInfo extends Structure implements Cloneable {

    private String entryId;
    private List<ReactionTotalInfo> positive;
    private List<ReactionTotalInfo> negative;

    /**
     * Retrieves ID of the entry.
     *
     * @return the value
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * Sets ID of the entry.
     *
     * @param entryId the value to be set
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * Retrieves summary of positive reactions.
     *
     * @return the value
     */
    public List<ReactionTotalInfo> getPositive() {
        return positive;
    }

    /**
     * Sets summary of positive reactions.
     *
     * @param positive the value to be set
     */
    public void setPositive(List<ReactionTotalInfo> positive) {
        this.positive = positive;
    }

    /**
     * Retrieves summary of negative reactions.
     *
     * @return the value
     */
    public List<ReactionTotalInfo> getNegative() {
        return negative;
    }

    /**
     * Sets summary of negative reactions.
     *
     * @param negative the value to be set
     */
    public void setNegative(List<ReactionTotalInfo> negative) {
        this.negative = negative;
    }

    @Override
    public void validate() {
        super.validate();
        if (positive != null) {
            positive.forEach(ReactionTotalInfo::validate);
        }
        if (negative != null) {
            negative.forEach(ReactionTotalInfo::validate);
        }
    }

    /**
     * Creates and returns a copy of this {@code ReactionTotalsInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ReactionTotalsInfo clone() {
        try {
            return (ReactionTotalsInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
