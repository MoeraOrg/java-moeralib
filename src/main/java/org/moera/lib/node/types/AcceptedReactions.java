package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceptedReactions implements Cloneable {

    private String positive;
    private String negative;

    @JsonIgnore
    private Object extra;

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

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
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
