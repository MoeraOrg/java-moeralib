package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RejectedReactions extends Structure implements Cloneable {

    private String positive;
    private String negative;

    /**
     * Retrieves space-separated list of hexadecimal codes of the positive reactions that are rejected; a special code
     * <code>*</code> means rejection of any non-standard reaction
     * .
     *
     * @return the value
     */
    public String getPositive() {
        return positive;
    }

    /**
     * Sets space-separated list of hexadecimal codes of the positive reactions that are rejected; a special code
     * <code>*</code> means rejection of any non-standard reaction
     * .
     *
     * @param positive the value to be set
     */
    public void setPositive(String positive) {
        this.positive = positive;
    }

    /**
     * Retrieves space-separated list of hexadecimal codes of the negative reactions that are rejected (the format is
     * the same as above)
     * .
     *
     * @return the value
     */
    public String getNegative() {
        return negative;
    }

    /**
     * Sets space-separated list of hexadecimal codes of the negative reactions that are rejected (the format is the
     * same as above)
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
        ValidationUtil.maxSize(positive, 255, "rejected-reactions.positive.wrong-size");
        ValidationUtil.emojiList(positive, "rejected-reactions.positive.invalid");
        ValidationUtil.maxSize(negative, 255, "rejected-reactions.negative.wrong-size");
        ValidationUtil.emojiList(negative, "rejected-reactions.negative.invalid");
    }

    /**
     * Creates and returns a copy of this {@code RejectedReactions} object.
     *
     * @return a clone of this instance
     */
    @Override
    public RejectedReactions clone() {
        try {
            return (RejectedReactions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
