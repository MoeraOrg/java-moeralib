package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupInfo extends Structure implements Cloneable {

    private String id;
    private String title;
    private long createdAt;
    private FriendGroupOperations operations;

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

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public FriendGroupOperations getOperations() {
        return operations;
    }

    public void setOperations(FriendGroupOperations operations) {
        this.operations = operations;
    }

    @Override
    public FriendGroupInfo clone() {
        try {
            return (FriendGroupInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
