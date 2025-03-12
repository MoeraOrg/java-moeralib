package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupAssignment extends Structure implements Cloneable {

    private String id;
    private FriendOperations operations;

    /**
     * Retrieves ID of the group of friends.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of the group of friends.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves the operations and the corresponding principals.
     *
     * @return the value
     */
    public FriendOperations getOperations() {
        return operations;
    }

    /**
     * Sets the operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(FriendOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code FriendGroupAssignment} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FriendGroupAssignment clone() {
        try {
            return (FriendGroupAssignment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
