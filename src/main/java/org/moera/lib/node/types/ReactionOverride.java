package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionOverride extends Structure implements Cloneable {

    private ReactionOperations operations;
    private ReactionOperations seniorOperations;
    private ReactionOperations majorOperations;

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public ReactionOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(ReactionOperations operations) {
        this.operations = operations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden by the reaction's "senior": the
     * posting's owner in the case of reaction to a posting or the comment's owner in the case of reaction to a comment
     * .
     *
     * @return the value
     */
    public ReactionOperations getSeniorOperations() {
        return seniorOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden by the reaction's "senior": the
     * posting's owner in the case of reaction to a posting or the comment's owner in the case of reaction to a comment
     * .
     *
     * @param seniorOperations the value to be set
     */
    public void setSeniorOperations(ReactionOperations seniorOperations) {
        this.seniorOperations = seniorOperations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden by the posting's owner ("major")
     * in the case of reaction to a comment; not set in the case of reaction to a posting
     * .
     *
     * @return the value
     */
    public ReactionOperations getMajorOperations() {
        return majorOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden by the posting's owner ("major") in the
     * case of reaction to a comment; not set in the case of reaction to a posting
     * .
     *
     * @param majorOperations the value to be set
     */
    public void setMajorOperations(ReactionOperations majorOperations) {
        this.majorOperations = majorOperations;
    }

    /**
     * Creates and returns a copy of this {@code ReactionOverride} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ReactionOverride clone() {
        try {
            return (ReactionOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
