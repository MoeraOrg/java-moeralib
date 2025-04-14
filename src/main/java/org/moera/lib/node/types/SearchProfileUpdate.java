package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchProfileUpdate extends Structure implements Cloneable {

    private String nodeName;

    /**
     * Retrieves name of the node which profile has been updated.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node which profile has been updated.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(nodeName, 40, "search.node-name.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code SearchProfileUpdate} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchProfileUpdate clone() {
        try {
            return (SearchProfileUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
