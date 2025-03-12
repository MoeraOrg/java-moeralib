package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedOperations implements Cloneable {

    private Principal add;

    /**
     * Retrieves the permission to add stories to the feed.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getAdd() {
        return add;
    }

    /**
     * Retrieves the permission to add stories to the feed,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getAdd(Principal defaultValue) {
        return add != null ? add : defaultValue;
    }

    /**
     * Retrieves the permission to add stories to the feed,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getAdd(FeedOperations operations, Principal defaultValue) {
        return operations != null ? operations.getAdd(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to add stories to the feed.
     * If set to {@code null}, the default permission should be used.
     *
     * @param add the permission to set, may be {@code null}
     */
    public void setAdd(Principal add) {
        this.add = add;
    }

    /**
     * Sets the permission to add stories to the feed.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param add the permission to set
     * @param defaultValue the default permission
     */
    public void setAdd(Principal add, Principal defaultValue) {
        this.add = Objects.equals(add, defaultValue) ? null : add;
    }

    /**
     * Checks if all the permissions in the object are {@code null}.
     *
     * @return {@code true} if all the permissions are {@code null}, {@code false} otherwise.
     */
    @JsonIgnore
    public boolean isEmpty() {
        return add == null;
    }

    /**
     * Creates and returns a copy of this {@code FeedOperations} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FeedOperations clone() {
        try {
            return (FeedOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
