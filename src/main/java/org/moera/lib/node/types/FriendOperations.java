package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendOperations implements Cloneable {

    private Principal view;

    public Principal getView() {
        return view;
    }

    public Principal getView(Principal defaultValue) {
        return view != null ? view : defaultValue;
    }

    public static Principal getView(FriendOperations operations, Principal defaultValue) {
        return operations != null ? operations.getView(defaultValue) : defaultValue;
    }

    public void setView(Principal view) {
        this.view = view;
    }

    public void setView(Principal view, Principal defaultValue) {
        this.view = Objects.equals(view, defaultValue) ? null : view;
    }

    public boolean isEmpty() {
        return view == null;
    }

    @Override
    public FriendOperations clone() {
        try {
            return (FriendOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
