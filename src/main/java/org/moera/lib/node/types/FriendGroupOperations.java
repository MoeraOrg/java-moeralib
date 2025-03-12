package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupOperations implements Cloneable {

    private Principal view;

    /**
     * Retrieves the permission to view the group of friends.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getView() {
        return view;
    }

    /**
     * Retrieves the permission to view the group of friends,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getView(Principal defaultValue) {
        return view != null ? view : defaultValue;
    }

    /**
     * Retrieves the permission to view the group of friends,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getView(FriendGroupOperations operations, Principal defaultValue) {
        return operations != null ? operations.getView(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the group of friends.
     * If set to {@code null}, the default permission should be used.
     *
     * @param view the permission to set, may be {@code null}
     */
    public void setView(Principal view) {
        this.view = view;
    }

    /**
     * Sets the permission to view the group of friends.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param view the permission to set
     * @param defaultValue the default permission
     */
    public void setView(Principal view, Principal defaultValue) {
        this.view = Objects.equals(view, defaultValue) ? null : view;
    }

    /**
     * Checks if all the permissions in the object are {@code null}.
     *
     * @return {@code true} if all the permissions are {@code null}, {@code false} otherwise.
     */
    @JsonIgnore
    public boolean isEmpty() {
        return view == null;
    }

    /**
     * Creates and returns a copy of this {@code FriendGroupOperations} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FriendGroupOperations clone() {
        try {
            return (FriendGroupOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
