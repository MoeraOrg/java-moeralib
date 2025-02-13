package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorySummaryBlocked implements Cloneable {

    private List<BlockedOperation> operations;
    private Long period;

    @JsonIgnore
    private Object extra;

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

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
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
