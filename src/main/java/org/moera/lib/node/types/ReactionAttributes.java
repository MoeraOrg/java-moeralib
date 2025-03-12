package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionAttributes extends Structure implements Cloneable {

    private boolean negative;
    private int emoji;
    private ReactionOperations operations;

    /**
     * Retrieves <code>true</code>, if the reaction is negative, <code>false</code>, if positive.
     *
     * @return the value
     */
    public boolean isNegative() {
        return negative;
    }

    /**
     * Sets <code>true</code>, if the reaction is negative, <code>false</code>, if positive.
     *
     * @param negative the value to be set
     */
    public void setNegative(boolean negative) {
        this.negative = negative;
    }

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
     * Retrieves the operations and the corresponding principals.
     *
     * @return the value
     */
    public ReactionOperations getOperations() {
        return operations;
    }

    /**
     * Sets the operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(ReactionOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code ReactionAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ReactionAttributes clone() {
        try {
            return (ReactionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
