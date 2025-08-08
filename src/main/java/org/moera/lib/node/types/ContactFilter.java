package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactFilter extends Structure implements Cloneable {

    private List<String> nodeNames;

    /**
     * Retrieves list of node names to fetch.
     *
     * @return the value
     */
    public List<String> getNodeNames() {
        return nodeNames;
    }

    /**
     * Sets list of node names to fetch.
     *
     * @param nodeNames the value to be set
     */
    public void setNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
    }

    /**
     * Creates and returns a copy of this {@code ContactFilter} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ContactFilter clone() {
        try {
            return (ContactFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
