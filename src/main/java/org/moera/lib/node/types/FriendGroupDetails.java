package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupDetails implements Cloneable {

    private String id;
    private String title;
    private long addedAt;
    private FriendOperations operations;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(long addedAt) {
        this.addedAt = addedAt;
    }

    public FriendOperations getOperations() {
        return operations;
    }

    public void setOperations(FriendOperations operations) {
        this.operations = operations;
    }

    @Override
    public FriendGroupDetails clone() {
        try {
            return (FriendGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
