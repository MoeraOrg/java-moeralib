package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvatarOrdinal extends Structure implements Cloneable {

    private String id;
    private int ordinal;

    /**
     * Retrieves ID of the avatar.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of the avatar.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves ordinal of the avatar.
     *
     * @return the value
     */
    public int getOrdinal() {
        return ordinal;
    }

    /**
     * Sets ordinal of the avatar.
     *
     * @param ordinal the value to be set
     */
    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    /**
     * Creates and returns a copy of this {@code AvatarOrdinal} object.
     *
     * @return a clone of this instance
     */
    @Override
    public AvatarOrdinal clone() {
        try {
            return (AvatarOrdinal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
