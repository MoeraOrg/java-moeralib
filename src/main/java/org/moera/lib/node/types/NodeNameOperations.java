package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NodeNameOperations implements Cloneable {

    private Principal manage;

    /**
     * Retrieves the permission to any modification of the node name, prolonging it etc..
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getManage() {
        return manage;
    }

    /**
     * Retrieves the permission to any modification of the node name, prolonging it etc.,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getManage(Principal defaultValue) {
        return manage != null ? manage : defaultValue;
    }

    /**
     * Retrieves the permission to any modification of the node name, prolonging it etc.,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getManage(NodeNameOperations operations, Principal defaultValue) {
        return operations != null ? operations.getManage(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to any modification of the node name, prolonging it etc..
     * If set to {@code null}, the default permission should be used.
     *
     * @param manage the permission to set, may be {@code null}
     */
    public void setManage(Principal manage) {
        this.manage = manage;
    }

    /**
     * Sets the permission to any modification of the node name, prolonging it etc..
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param manage the permission to set
     * @param defaultValue the default permission
     */
    public void setManage(Principal manage, Principal defaultValue) {
        this.manage = Objects.equals(manage, defaultValue) ? null : manage;
    }

    /**
     * Checks if all the permissions in the object are {@code null}.
     *
     * @return {@code true} if all the permissions are {@code null}, {@code false} otherwise.
     */
    @JsonIgnore
    public boolean isEmpty() {
        return manage == null;
    }

    /**
     * Creates and returns a copy of this {@code NodeNameOperations} object.
     *
     * @return a clone of this instance
     */
    @Override
    public NodeNameOperations clone() {
        try {
            return (NodeNameOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
