package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendDescription implements Cloneable {

    private String nodeName;
    private List<FriendGroupAssignment> groups;

    @JsonIgnore
    private Object extra;

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

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
        ValidationUtil.notBlank(nodeName, "friend.node-name.blank");
        ValidationUtil.maxSize(nodeName, 63, "friend.node-name.wrong-size");
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
