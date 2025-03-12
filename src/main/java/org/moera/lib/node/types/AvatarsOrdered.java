package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvatarsOrdered extends Structure implements Cloneable {

    private List<String> ids;

    /**
     * Retrieves IDs of avatars.
     *
     * @return the value
     */
    public List<String> getIds() {
        return ids;
    }

    /**
     * Sets IDs of avatars.
     *
     * @param ids the value to be set
     */
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    /**
     * Creates and returns a copy of this {@code AvatarsOrdered} object.
     *
     * @return a clone of this instance
     */
    @Override
    public AvatarsOrdered clone() {
        try {
            return (AvatarsOrdered) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
