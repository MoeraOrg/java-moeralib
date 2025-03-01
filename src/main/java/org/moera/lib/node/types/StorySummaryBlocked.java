package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorySummaryBlocked extends Structure implements Cloneable {

    private List<BlockedOperation> operations;
    private Long period;

    public List<BlockedOperation> getOperations() {
        return operations;
    }

    public void setOperations(List<BlockedOperation> operations) {
        this.operations = operations;
    }

    public Long getPeriod() {
        return period;
    }

    public void setPeriod(Long period) {
        this.period = period;
    }

    @Override
    public StorySummaryBlocked clone() {
        try {
            return (StorySummaryBlocked) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
