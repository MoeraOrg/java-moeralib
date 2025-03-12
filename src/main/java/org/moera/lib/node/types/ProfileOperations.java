package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileOperations implements Cloneable {

    private Principal edit;
    private Principal viewEmail;

    /**
     * Retrieves the permission to change the profile.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getEdit() {
        return edit;
    }

    /**
     * Retrieves the permission to change the profile,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getEdit(Principal defaultValue) {
        return edit != null ? edit : defaultValue;
    }

    /**
     * Retrieves the permission to change the profile,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getEdit(ProfileOperations operations, Principal defaultValue) {
        return operations != null ? operations.getEdit(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to change the profile.
     * If set to {@code null}, the default permission should be used.
     *
     * @param edit the permission to set, may be {@code null}
     */
    public void setEdit(Principal edit) {
        this.edit = edit;
    }

    /**
     * Sets the permission to change the profile.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param edit the permission to set
     * @param defaultValue the default permission
     */
    public void setEdit(Principal edit, Principal defaultValue) {
        this.edit = Objects.equals(edit, defaultValue) ? null : edit;
    }

    /**
     * Retrieves the permission to view the e-mail address in the profile.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewEmail() {
        return viewEmail;
    }

    /**
     * Retrieves the permission to view the e-mail address in the profile,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewEmail(Principal defaultValue) {
        return viewEmail != null ? viewEmail : defaultValue;
    }

    /**
     * Retrieves the permission to view the e-mail address in the profile,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewEmail(ProfileOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewEmail(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the e-mail address in the profile.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewEmail the permission to set, may be {@code null}
     */
    public void setViewEmail(Principal viewEmail) {
        this.viewEmail = viewEmail;
    }

    /**
     * Sets the permission to view the e-mail address in the profile.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewEmail the permission to set
     * @param defaultValue the default permission
     */
    public void setViewEmail(Principal viewEmail, Principal defaultValue) {
        this.viewEmail = Objects.equals(viewEmail, defaultValue) ? null : viewEmail;
    }

    /**
     * Checks if all the permissions in the object are {@code null}.
     *
     * @return {@code true} if all the permissions are {@code null}, {@code false} otherwise.
     */
    @JsonIgnore
    public boolean isEmpty() {
        return edit == null
            && viewEmail == null;
    }

    /**
     * Creates and returns a copy of this {@code ProfileOperations} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ProfileOperations clone() {
        try {
            return (ProfileOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
