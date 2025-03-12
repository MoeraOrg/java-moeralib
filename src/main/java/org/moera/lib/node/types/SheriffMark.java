package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffMark extends Structure implements Cloneable {

    private String sheriffName;

    /**
     * Retrieves name of the sheriff that added the mark.
     *
     * @return the value
     */
    public String getSheriffName() {
        return sheriffName;
    }

    /**
     * Sets name of the sheriff that added the mark.
     *
     * @param sheriffName the value to be set
     */
    public void setSheriffName(String sheriffName) {
        this.sheriffName = sheriffName;
    }

    /**
     * Creates and returns a copy of this {@code SheriffMark} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SheriffMark clone() {
        try {
            return (SheriffMark) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
