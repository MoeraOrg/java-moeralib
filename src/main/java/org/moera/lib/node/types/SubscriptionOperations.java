package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionOperations implements Cloneable {

    private Principal view;
    private Principal delete;

    /**
     * Retrieves the permission to see the subscription.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getView() {
        return view;
    }

    /**
     * Retrieves the permission to see the subscription,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getView(Principal defaultValue) {
        return view != null ? view : defaultValue;
    }

    /**
     * Retrieves the permission to see the subscription,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getView(SubscriptionOperations operations, Principal defaultValue) {
        return operations != null ? operations.getView(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to see the subscription.
     * If set to {@code null}, the default permission should be used.
     *
     * @param view the permission to set, may be {@code null}
     */
    public void setView(Principal view) {
        this.view = view;
    }

    /**
     * Sets the permission to see the subscription.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param view the permission to set
     * @param defaultValue the default permission
     */
    public void setView(Principal view, Principal defaultValue) {
        this.view = Objects.equals(view, defaultValue) ? null : view;
    }

    /**
     * Retrieves the permission to delete the subscription (this operation cannot be modified or overridden).
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getDelete() {
        return delete;
    }

    /**
     * Retrieves the permission to delete the subscription (this operation cannot be modified or overridden),
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getDelete(Principal defaultValue) {
        return delete != null ? delete : defaultValue;
    }

    /**
     * Retrieves the permission to delete the subscription (this operation cannot be modified or overridden),
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getDelete(SubscriptionOperations operations, Principal defaultValue) {
        return operations != null ? operations.getDelete(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to delete the subscription (this operation cannot be modified or overridden).
     * If set to {@code null}, the default permission should be used.
     *
     * @param delete the permission to set, may be {@code null}
     */
    public void setDelete(Principal delete) {
        this.delete = delete;
    }

    /**
     * Sets the permission to delete the subscription (this operation cannot be modified or overridden).
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
        return view == null
            && delete == null;
    }

    /**
     * Creates and returns a copy of this {@code SubscriptionOperations} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SubscriptionOperations clone() {
        try {
            return (SubscriptionOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
