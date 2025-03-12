package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionTotalInfo extends Structure implements Cloneable {

    private int emoji;
    private Integer total;
    private Float share;

    /**
     * Retrieves reaction code, usually interpreted by clients as emoji code point.
     *
     * @return the value
     */
    public int getEmoji() {
        return emoji;
    }

    /**
     * Sets reaction code, usually interpreted by clients as emoji code point.
     *
     * @param emoji the value to be set
     */
    public void setEmoji(int emoji) {
        this.emoji = emoji;
    }

    /**
     * Retrieves total number of reactions with the given code.
     *
     * @return the value
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets total number of reactions with the given code.
     *
     * @param total the value to be set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Retrieves share the reactions with the given code stand from the total number of reactions (may be absent, if
     * <code>total</code> is present)
     * .
     *
     * @return the value
     */
    public Float getShare() {
        return share;
    }

    /**
     * Sets share the reactions with the given code stand from the total number of reactions (may be absent, if
     * <code>total</code> is present)
     * .
     *
     * @param share the value to be set
     */
    public void setShare(Float share) {
        this.share = share;
    }

    /**
     * Creates and returns a copy of this {@code ReactionTotalInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ReactionTotalInfo clone() {
        try {
            return (ReactionTotalInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
