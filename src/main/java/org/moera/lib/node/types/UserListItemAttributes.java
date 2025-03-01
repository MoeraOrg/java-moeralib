package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserListItemAttributes extends Structure implements Cloneable {

    private String nodeName;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(nodeName, "user-list-item.node-name.blank");
        ValidationUtil.maxSize(nodeName, 63, "user-list-item.node-name.wrong-size");
    }

    @Override
    public UserListItemAttributes clone() {
        try {
            return (UserListItemAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
