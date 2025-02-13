package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionOverride implements Cloneable {

    private SubscriptionOperations operations;

    @JsonIgnore
    private Object extra;

    public SubscriptionOperations getOperations() {
        return operations;
    }

    public void setOperations(SubscriptionOperations operations) {
        this.operations = operations;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public SubscriptionOverride clone() {
        try {
            return (SubscriptionOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
