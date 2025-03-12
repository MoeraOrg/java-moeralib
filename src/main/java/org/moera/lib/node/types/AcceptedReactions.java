package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceptedReactions extends Structure implements Cloneable {

    private String positive;
    private String negative;

    /**
     * Retrieves comma-separated list of codes of the positive reactions that are accepted; a code may be prefixed by
     * <code>0x</code> to designate hexadecimal number and <code>+</code> to designate a recommended reaction
     * .
     *
     * @return the value
     */
    public String getPositive() {
        return positive;
    }

    /**
     * Sets comma-separated list of codes of the positive reactions that are accepted; a code may be prefixed by
     * <code>0x</code> to designate hexadecimal number and <code>+</code> to designate a recommended reaction
     * .
     *
     * @param positive the value to be set
     */
    public void setPositive(String positive) {
        this.positive = positive;
    }

    /**
     * Retrieves comma-separated list of codes of the negative reactions that are accepted (the format is the same as
     * above)
     * .
     *
     * @return the value
     */
    public String getNegative() {
        return negative;
    }

    /**
     * Sets comma-separated list of codes of the negative reactions that are accepted (the format is the same as above)
     * .
     *
     * @param negative the value to be set
     */
    public void setNegative(String negative) {
        this.negative = negative;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(positive, 255, "accepted-reactions.positive.wrong-size");
        ValidationUtil.emojiList(positive, "accepted-reactions.positive.invalid");
        ValidationUtil.maxSize(negative, 255, "accepted-reactions.negative.wrong-size");
        ValidationUtil.emojiList(negative, "accepted-reactions.negative.invalid");
    }

    /**
     * Creates and returns a copy of this {@code AcceptedReactions} object.
     *
     * @return a clone of this instance
     */
    @Override
    public AcceptedReactions clone() {
        try {
            return (AcceptedReactions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
