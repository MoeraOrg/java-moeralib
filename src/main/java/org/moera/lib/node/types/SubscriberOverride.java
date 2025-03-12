package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriberOverride extends Structure implements Cloneable {

    private SubscriberOperations operations;
    private SubscriberOperations adminOperations;

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public SubscriberOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(SubscriberOperations operations) {
        this.operations = operations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden by the node administrator.
     *
     * @return the value
     */
    public SubscriberOperations getAdminOperations() {
        return adminOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden by the node administrator.
     *
     * @param adminOperations the value to be set
     */
    public void setAdminOperations(SubscriberOperations adminOperations) {
        this.adminOperations = adminOperations;
    }

    /**
     * Creates and returns a copy of this {@code SubscriberOverride} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SubscriberOverride clone() {
        try {
            return (SubscriberOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
