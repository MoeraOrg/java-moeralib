package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupInfo extends Structure implements Cloneable {

    private String id;
    private String title;
    private long createdAt;
    private FriendGroupOperations operations;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets .
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
     * Retrieves the group creation timestamp - the real time when the group of friends was created.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the group creation timestamp - the real time when the group of friends was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves list of the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public FriendGroupOperations getOperations() {
        return operations;
    }

    /**
     * Sets list of the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(FriendGroupOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code FriendGroupInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FriendGroupInfo clone() {
        try {
            return (FriendGroupInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
