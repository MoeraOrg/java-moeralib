package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserListInfo extends Structure implements Cloneable {

    private String name;
    private int total;

    /**
     * Retrieves name of the user list.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of the user list.
     *
     * @param name the value to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves number of items in the user list.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets number of items in the user list.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Creates and returns a copy of this {@code UserListInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public UserListInfo clone() {
        try {
            return (UserListInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
