package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendDescription implements Cloneable {

    private String nodeName;
    private List<FriendGroupAssignment> groups;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public List<FriendGroupAssignment> getGroups() {
        return groups;
    }

    public void setGroups(List<FriendGroupAssignment> groups) {
        this.groups = groups;
    }

    @Override
    public FriendDescription clone() {
        try {
            return (FriendDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
