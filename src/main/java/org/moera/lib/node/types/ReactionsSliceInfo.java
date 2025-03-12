package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionsSliceInfo extends Structure implements Cloneable {

    private long before;
    private long after;
    private int total;
    private List<ReactionInfo> reactions;

    /**
     * Retrieves the slice contains all reactions before this moment, inclusive. May be the far future.
     *
     * @return the value
     */
    public long getBefore() {
        return before;
    }

    /**
     * Sets the slice contains all reactions before this moment, inclusive. May be the far future.
     *
     * @param before the value to be set
     */
    public void setBefore(long before) {
        this.before = before;
    }

    /**
     * Retrieves the slice contains all reactions after this moment, exclusive. May be the far past.
     *
     * @return the value
     */
    public long getAfter() {
        return after;
    }

    /**
     * Sets the slice contains all reactions after this moment, exclusive. May be the far past.
     *
     * @param after the value to be set
     */
    public void setAfter(long after) {
        this.after = after;
    }

    /**
     * Retrieves total number of reactions in the whole list.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of reactions in the whole list.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Retrieves the reactions.
     *
     * @return the value
     */
    public List<ReactionInfo> getReactions() {
        return reactions;
    }

    /**
     * Sets the reactions.
     *
     * @param reactions the value to be set
     */
    public void setReactions(List<ReactionInfo> reactions) {
        this.reactions = reactions;
    }

    /**
     * Creates and returns a copy of this {@code ReactionsSliceInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ReactionsSliceInfo clone() {
        try {
            return (ReactionsSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
