package org.moera.lib.node.types;

// This file is generated

import java.util.function.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserListItemAttributes implements Cloneable {

    private String nodeName;

    @JsonIgnore
    private Object extra;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Object getExtra() {
        return extra;
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrCreateExtra(Supplier<T> creator) {
        if (extra == null) {
            extra = creator.get();
        }
        return (T) extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
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
