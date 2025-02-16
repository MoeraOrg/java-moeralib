package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoryOperations implements Cloneable {

    private Principal edit;
    private Principal delete;

    public Principal getEdit() {
        return edit;
    }

    public Principal getEdit(Principal defaultValue) {
        return edit != null ? edit : defaultValue;
    }

    public static Principal getEdit(StoryOperations operations, Principal defaultValue) {
        return operations != null ? operations.getEdit(defaultValue) : defaultValue;
    }

    public void setEdit(Principal edit) {
        this.edit = edit;
    }

    public void setEdit(Principal edit, Principal defaultValue) {
        this.edit = Objects.equals(edit, defaultValue) ? null : edit;
    }

    public Principal getDelete() {
        return delete;
    }

    public Principal getDelete(Principal defaultValue) {
        return delete != null ? delete : defaultValue;
    }

    public static Principal getDelete(StoryOperations operations, Principal defaultValue) {
        return operations != null ? operations.getDelete(defaultValue) : defaultValue;
    }

    public void setDelete(Principal delete) {
        this.delete = delete;
    }

    public void setDelete(Principal delete, Principal defaultValue) {
        this.delete = Objects.equals(delete, defaultValue) ? null : delete;
    }

    public boolean isEmpty() {
        return edit == null
            && delete == null;
    }

    @Override
    public StoryOperations clone() {
        try {
            return (StoryOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
