package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedOperations implements Cloneable {

    private Principal add;

    public Principal getAdd() {
        return add;
    }

    public Principal getAdd(Principal defaultValue) {
        return add != null ? add : defaultValue;
    }

    public static Principal getAdd(FeedOperations operations, Principal defaultValue) {
        return operations != null ? operations.getAdd(defaultValue) : defaultValue;
    }

    public void setAdd(Principal add) {
        this.add = add;
    }

    public void setAdd(Principal add, Principal defaultValue) {
        this.add = Objects.equals(add, defaultValue) ? null : add;
    }

    public boolean isEmpty() {
        return add == null;
    }

    @Override
    public FeedOperations clone() {
        try {
            return (FeedOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
