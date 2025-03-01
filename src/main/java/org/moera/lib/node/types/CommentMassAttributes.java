package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentMassAttributes extends Structure implements Cloneable {

    private CommentOperations seniorOperations;

    public CommentOperations getSeniorOperations() {
        return seniorOperations;
    }

    public void setSeniorOperations(CommentOperations seniorOperations) {
        this.seniorOperations = seniorOperations;
    }

    @Override
    public CommentMassAttributes clone() {
        try {
            return (CommentMassAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
