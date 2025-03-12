package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorySummaryFriendGroup extends Structure implements Cloneable {

    private String id;
    private String title;

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
     * Creates and returns a copy of this {@code StorySummaryFriendGroup} object.
     *
     * @return a clone of this instance
     */
    @Override
    public StorySummaryFriendGroup clone() {
        try {
            return (StorySummaryFriendGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
