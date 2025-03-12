package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserListItemAttributes extends Structure implements Cloneable {

    private String nodeName;

    /**
     * Retrieves the name of the node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the name of the node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(nodeName, "user-list-item.node-name.blank");
        ValidationUtil.maxSize(nodeName, 63, "user-list-item.node-name.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code UserListItemAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public UserListItemAttributes clone() {
        try {
            return (UserListItemAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
