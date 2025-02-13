package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriberOperations implements Cloneable {

    private Principal view;
    private Principal delete;

    public Principal getView() {
        return view;
    }

    public Principal getView(Principal defaultValue) {
        return view != null ? view : defaultValue;
    }

    public static Principal getView(SubscriberOperations operations, Principal defaultValue) {
        return operations != null ? operations.getView(defaultValue) : defaultValue;
    }

    public void setView(Principal view) {
        this.view = view;
    }

    public void setView(Principal view, Principal defaultValue) {
        this.view = Objects.equals(view, defaultValue) ? null : view;
    }

    public Principal getDelete() {
        return delete;
    }

    public Principal getDelete(Principal defaultValue) {
        return delete != null ? delete : defaultValue;
    }

    public static Principal getDelete(SubscriberOperations operations, Principal defaultValue) {
        return operations != null ? operations.getDelete(defaultValue) : defaultValue;
    }

    public void setDelete(Principal delete) {
        this.delete = delete;
    }

    public void setDelete(Principal delete, Principal defaultValue) {
        this.delete = Objects.equals(delete, defaultValue) ? null : delete;
    }

    @Override
    public SubscriberOperations clone() {
        try {
            return (SubscriberOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
