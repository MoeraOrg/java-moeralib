package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoryOperations implements Cloneable {

    private Principal edit;
    private Principal delete;

    /**
     * Retrieves the permission to update the story.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getEdit() {
        return edit;
    }

    /**
     * Retrieves the permission to update the story,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getEdit(Principal defaultValue) {
        return edit != null ? edit : defaultValue;
    }

    /**
     * Retrieves the permission to update the story,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getEdit(StoryOperations operations, Principal defaultValue) {
        return operations != null ? operations.getEdit(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to update the story.
     * If set to {@code null}, the default permission should be used.
     *
     * @param edit the permission to set, may be {@code null}
     */
    public void setEdit(Principal edit) {
        this.edit = edit;
    }

    /**
     * Sets the permission to update the story.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param edit the permission to set
     * @param defaultValue the default permission
     */
    public void setEdit(Principal edit, Principal defaultValue) {
        this.edit = Objects.equals(edit, defaultValue) ? null : edit;
    }

    /**
     * Retrieves the permission to delete the story.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getDelete() {
        return delete;
    }

    /**
     * Retrieves the permission to delete the story,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getDelete(Principal defaultValue) {
        return delete != null ? delete : defaultValue;
    }

    /**
     * Retrieves the permission to delete the story,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getDelete(StoryOperations operations, Principal defaultValue) {
        return operations != null ? operations.getDelete(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to delete the story.
     * If set to {@code null}, the default permission should be used.
     *
     * @param delete the permission to set, may be {@code null}
     */
    public void setDelete(Principal delete) {
        this.delete = delete;
    }

    /**
     * Sets the permission to delete the story.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param delete the permission to set
     * @param defaultValue the default permission
     */
    public void setDelete(Principal delete, Principal defaultValue) {
        this.delete = Objects.equals(delete, defaultValue) ? null : delete;
    }

    /**
     * Checks if all the permissions in the object are {@code null}.
     *
     * @return {@code true} if all the permissions are {@code null}, {@code false} otherwise.
     */
    @JsonIgnore
    public boolean isEmpty() {
        return edit == null
            && delete == null;
    }

    /**
     * Creates and returns a copy of this {@code StoryOperations} object.
     *
     * @return a clone of this instance
     */
    @Override
    public StoryOperations clone() {
        try {
            return (StoryOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
