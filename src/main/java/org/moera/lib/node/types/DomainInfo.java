package org.moera.lib.node.types;

// This file is generated

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DomainInfo extends Structure implements Cloneable {

    private String name;
    private UUID nodeId;
    private long createdAt;

    /**
     * Retrieves domain's hostname or <code>_default_</code> for the default domain.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets domain's hostname or <code>_default_</code> for the default domain.
     *
     * @param name the value to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves domain's node ID.
     *
     * @return the value
     */
    public UUID getNodeId() {
        return nodeId;
    }

    /**
     * Sets domain's node ID.
     *
     * @param nodeId the value to be set
     */
    public void setNodeId(UUID nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Retrieves domain creation timestamp.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets domain creation timestamp.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Creates and returns a copy of this {@code DomainInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public DomainInfo clone() {
        try {
            return (DomainInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
