package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupDescription implements Cloneable {

    private String title;
    private FriendGroupOperations operations;

    @JsonIgnore
    private Object extra;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FriendGroupOperations getOperations() {
        return operations;
    }

    public void setOperations(FriendGroupOperations operations) {
        this.operations = operations;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
        ValidationUtil.notBlank(title, "friend-group.title.blank");
        ValidationUtil.maxSize(title, 63, "friend-group.title.wrong-size");
    }

    @Override
    public FriendGroupDescription clone() {
        try {
            return (FriendGroupDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
