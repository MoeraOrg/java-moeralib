package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionOverride implements Cloneable {

    private ReactionOperations operations;
    private ReactionOperations seniorOperations;
    private ReactionOperations majorOperations;

    public ReactionOperations getOperations() {
        return operations;
    }

    public void setOperations(ReactionOperations operations) {
        this.operations = operations;
    }

    public ReactionOperations getSeniorOperations() {
        return seniorOperations;
    }

    public void setSeniorOperations(ReactionOperations seniorOperations) {
        this.seniorOperations = seniorOperations;
    }

    public ReactionOperations getMajorOperations() {
        return majorOperations;
    }

    public void setMajorOperations(ReactionOperations majorOperations) {
        this.majorOperations = majorOperations;
    }

    @Override
    public ReactionOverride clone() {
        try {
            return (ReactionOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
