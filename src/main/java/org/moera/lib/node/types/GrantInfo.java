package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GrantInfo extends Structure implements Cloneable {

    private String nodeName;
    private List<String> scope;

    /**
     * Retrieves name of the node the permissions are granted to.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node the permissions are granted to.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves the set of administrative permissions granted to the node.
     *
     * @return the value
     */
    public List<String> getScope() {
        return scope;
    }

    /**
     * Sets the set of administrative permissions granted to the node.
     *
     * @param scope the value to be set
     */
    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    /**
     * Creates and returns a copy of this {@code GrantInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public GrantInfo clone() {
        try {
            return (GrantInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
