package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupDetails extends Structure implements Cloneable {

    private String id;
    private String title;
    private long addedAt;
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
     * Retrieves title of the group of friends.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title of the group of friends.
     *
     * @param title the value to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the friendship timestamp - the real time when the node was added to the group of friends.
     *
     * @return the value
     */
    public long getAddedAt() {
        return addedAt;
    }

    /**
     * Sets the friendship timestamp - the real time when the node was added to the group of friends.
     *
     * @param addedAt the value to be set
     */
    public void setAddedAt(long addedAt) {
        this.addedAt = addedAt;
    }

    /**
     * Retrieves list of the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public FriendOperations getOperations() {
        return operations;
    }

    /**
     * Sets list of the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(FriendOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code FriendGroupDetails} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FriendGroupDetails clone() {
        try {
            return (FriendGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
