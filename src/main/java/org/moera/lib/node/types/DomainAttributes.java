package org.moera.lib.node.types;

// This file is generated

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DomainAttributes extends Structure implements Cloneable {

    private String name;
    private UUID nodeId;

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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.domainName(name, "domain.name.invalid-domain");
    }

    /**
     * Creates and returns a copy of this {@code DomainAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public DomainAttributes clone() {
        try {
            return (DomainAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
