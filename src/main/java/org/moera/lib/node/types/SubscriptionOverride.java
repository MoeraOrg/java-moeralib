package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionOverride extends Structure implements Cloneable {

    private SubscriptionOperations operations;

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public SubscriptionOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(SubscriptionOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code SubscriptionOverride} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SubscriptionOverride clone() {
        try {
            return (SubscriptionOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
