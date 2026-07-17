package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VisitedNodeAttributes extends Structure implements Cloneable {

    private String nodeName;

    /**
     * Retrieves name of the visited node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the visited node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(nodeName, "visited.node-name.blank");
        ValidationUtil.maxSize(nodeName, 135, "visited.node-name.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code VisitedNodeAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public VisitedNodeAttributes clone() {
        try {
            return (VisitedNodeAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
