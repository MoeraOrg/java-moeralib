package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteNodeStatus {

    private boolean requested;

    public boolean getRequested() {
        return requested;
    }

    public void setRequested(boolean requested) {
        this.requested = requested;
    }

}
