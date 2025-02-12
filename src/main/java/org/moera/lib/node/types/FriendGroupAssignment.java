package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupAssignment {

    private String id;
    private FriendOperations operations;

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

}
