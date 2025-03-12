package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorySummaryBlocked extends Structure implements Cloneable {

    private List<BlockedOperation> operations;
    private Long period;

    /**
     * Retrieves list of the operations blocked.
     *
     * @return the value
     */
    public List<BlockedOperation> getOperations() {
        return operations;
    }

    /**
     * Sets list of the operations blocked.
     *
     * @param operations the value to be set
     */
    public void setOperations(List<BlockedOperation> operations) {
        this.operations = operations;
    }

    /**
     * Retrieves the period of blocking in seconds.
     *
     * @return the value
     */
    public Long getPeriod() {
        return period;
    }

    /**
     * Sets the period of blocking in seconds.
     *
     * @param period the value to be set
     */
    public void setPeriod(Long period) {
        this.period = period;
    }

    /**
     * Creates and returns a copy of this {@code StorySummaryBlocked} object.
     *
     * @return a clone of this instance
     */
    @Override
    public StorySummaryBlocked clone() {
        try {
            return (StorySummaryBlocked) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
