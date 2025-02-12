package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorySummaryBlocked {

    private List<BlockedOperation> operations;
    private Integer period;

    public List<BlockedOperation> getOperations() {
        return operations;
    }

    public void setOperations(List<BlockedOperation> operations) {
        this.operations = operations;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

}
