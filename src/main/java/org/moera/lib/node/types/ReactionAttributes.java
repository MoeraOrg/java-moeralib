package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionAttributes implements Cloneable {

    private boolean negative;
    private int emoji;
    private ReactionOperations operations;

    public boolean getNegative() {
        return negative;
    }

    public void setNegative(boolean negative) {
        this.negative = negative;
    }

    public int getEmoji() {
        return emoji;
    }

    public void setEmoji(int emoji) {
        this.emoji = emoji;
    }

    public ReactionOperations getOperations() {
        return operations;
    }

    public void setOperations(ReactionOperations operations) {
        this.operations = operations;
    }

    @Override
    public ReactionAttributes clone() {
        try {
            return (ReactionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
