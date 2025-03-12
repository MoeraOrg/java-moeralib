package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendDescription extends Structure implements Cloneable {

    private String nodeName;
    private List<FriendGroupAssignment> groups;

    /**
     * Retrieves name of the node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves groups of friends the node is to be included into.
     *
     * @return the value
     */
    public List<FriendGroupAssignment> getGroups() {
        return groups;
    }

    /**
     * Sets groups of friends the node is to be included into.
     *
     * @param groups the value to be set
     */
    public void setGroups(List<FriendGroupAssignment> groups) {
        this.groups = groups;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(nodeName, "friend.node-name.blank");
        ValidationUtil.maxSize(nodeName, 63, "friend.node-name.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code FriendDescription} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FriendDescription clone() {
        try {
            return (FriendDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
