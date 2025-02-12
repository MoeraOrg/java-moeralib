package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionOverride {

    private SubscriptionOperations operations;

    public SubscriptionOperations getOperations() {
        return operations;
    }

    public void setOperations(SubscriptionOperations operations) {
        this.operations = operations;
    }

}
