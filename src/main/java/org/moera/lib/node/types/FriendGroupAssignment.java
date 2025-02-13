package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupAssignment implements Cloneable {

    private String id;
    private FriendOperations operations;

    @JsonIgnore
    private Object extra;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FriendOperations getOperations() {
        return operations;
    }

    public void setOperations(FriendOperations operations) {
        this.operations = operations;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public FriendGroupAssignment clone() {
        try {
            return (FriendGroupAssignment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
