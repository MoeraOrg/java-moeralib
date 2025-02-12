package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupDescription {

    private String title;
    private FriendGroupOperations operations;

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

}
