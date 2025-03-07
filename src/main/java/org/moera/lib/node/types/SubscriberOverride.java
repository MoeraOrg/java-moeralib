package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriberOverride extends Structure implements Cloneable {

    private SubscriberOperations operations;
    private SubscriberOperations adminOperations;

    public SubscriberOperations getOperations() {
        return operations;
    }

    public void setOperations(SubscriberOperations operations) {
        this.operations = operations;
    }

    public SubscriberOperations getAdminOperations() {
        return adminOperations;
    }

    public void setAdminOperations(SubscriberOperations adminOperations) {
        this.adminOperations = adminOperations;
    }

    @Override
    public SubscriberOverride clone() {
        try {
            return (SubscriberOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
