package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteNodeStatus extends Structure implements Cloneable {

    private boolean requested;

    /**
     * Retrieves <code>true</code> if the request is sent, <code>false</code> otherwise.
     *
     * @return the value
     */
    public boolean isRequested() {
        return requested;
    }

    /**
     * Sets <code>true</code> if the request is sent, <code>false</code> otherwise.
     *
     * @param requested the value to be set
     */
    public void setRequested(boolean requested) {
        this.requested = requested;
    }

    /**
     * Creates and returns a copy of this {@code DeleteNodeStatus} object.
     *
     * @return a clone of this instance
     */
    @Override
    public DeleteNodeStatus clone() {
        try {
            return (DeleteNodeStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
