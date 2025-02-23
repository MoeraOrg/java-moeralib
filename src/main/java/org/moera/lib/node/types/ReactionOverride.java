package org.moera.lib.node.types;

// This file is generated

import java.util.function.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionOverride implements Cloneable {

    private ReactionOperations operations;
    private ReactionOperations seniorOperations;
    private ReactionOperations majorOperations;

    @JsonIgnore
    private Object extra;

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

    public Object getExtra() {
        return extra;
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrCreateExtra(Supplier<T> creator) {
        if (extra == null) {
            extra = creator.get();
        }
        return (T) extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
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
