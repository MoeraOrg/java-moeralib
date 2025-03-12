package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserListItemInfo extends Structure implements Cloneable {

    private String nodeName;
    private long createdAt;
    private long moment;

    /**
     * Retrieves the name of the node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the name of the node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves the node addition timestamp - the real time when the node was added to the list.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the node addition timestamp - the real time when the node was added to the list.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves moment of the node.
     *
     * @return the value
     */
    public long getMoment() {
        return moment;
    }

    /**
     * Sets moment of the node.
     *
     * @param moment the value to be set
     */
    public void setMoment(long moment) {
        this.moment = moment;
    }

    /**
     * Creates and returns a copy of this {@code UserListItemInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public UserListItemInfo clone() {
        try {
            return (UserListItemInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
