package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceptedReactions extends Structure implements Cloneable {

    private String positive;
    private String negative;

    public String getPositive() {
        return positive;
    }

    public void setPositive(String positive) {
        this.positive = positive;
    }

    public String getNegative() {
        return negative;
    }

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

    @Override
    public AcceptedReactions clone() {
        try {
            return (AcceptedReactions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
