package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileOperations implements Cloneable {

    private Principal edit;
    private Principal viewEmail;

    public Principal getEdit() {
        return edit;
    }

    public Principal getEdit(Principal defaultValue) {
        return edit != null ? edit : defaultValue;
    }

    public static Principal getEdit(ProfileOperations operations, Principal defaultValue) {
        return operations != null ? operations.getEdit(defaultValue) : defaultValue;
    }

    public void setEdit(Principal edit) {
        this.edit = edit;
    }

    public void setEdit(Principal edit, Principal defaultValue) {
        this.edit = Objects.equals(edit, defaultValue) ? null : edit;
    }

    public Principal getViewEmail() {
        return viewEmail;
    }

    public Principal getViewEmail(Principal defaultValue) {
        return viewEmail != null ? viewEmail : defaultValue;
    }

    public static Principal getViewEmail(ProfileOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewEmail(defaultValue) : defaultValue;
    }

    public void setViewEmail(Principal viewEmail) {
        this.viewEmail = viewEmail;
    }

    public void setViewEmail(Principal viewEmail, Principal defaultValue) {
        this.viewEmail = Objects.equals(viewEmail, defaultValue) ? null : viewEmail;
    }

    public boolean isEmpty() {
        return edit == null
            && viewEmail == null;
    }

    @Override
    public ProfileOperations clone() {
        try {
            return (ProfileOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
