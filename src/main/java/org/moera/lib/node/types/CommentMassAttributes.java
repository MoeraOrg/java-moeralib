package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentMassAttributes extends Structure implements Cloneable {

    private CommentOperations seniorOperations;
    private RejectedReactions seniorRejectedReactions;

    /**
     * Retrieves the operations and the corresponding principals that are overridden by the comment's owner ("senior")
     * .
     *
     * @return the value
     */
    public CommentOperations getSeniorOperations() {
        return seniorOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden by the comment's owner ("senior")
     * .
     *
     * @param seniorOperations the value to be set
     */
    public void setSeniorOperations(CommentOperations seniorOperations) {
        this.seniorOperations = seniorOperations;
    }

    /**
     * Retrieves types of reactions that the comment rejects, as defined by the posting's owner ("senior").
     *
     * @return the value
     */
    public RejectedReactions getSeniorRejectedReactions() {
        return seniorRejectedReactions;
    }

    /**
     * Sets types of reactions that the comment rejects, as defined by the posting's owner ("senior").
     *
     * @param seniorRejectedReactions the value to be set
     */
    public void setSeniorRejectedReactions(RejectedReactions seniorRejectedReactions) {
        this.seniorRejectedReactions = seniorRejectedReactions;
    }

    @Override
    public void validate() {
        super.validate();
        if (seniorRejectedReactions != null) {
            seniorRejectedReactions.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code CommentMassAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CommentMassAttributes clone() {
        try {
            return (CommentMassAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
