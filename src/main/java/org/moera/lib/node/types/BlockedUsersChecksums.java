package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockedUsersChecksums extends Structure implements Cloneable {

    private long visibility;

    /**
     * Retrieves checksum of the list of users that are hidden.
     *
     * @return the value
     */
    public long getVisibility() {
        return visibility;
    }

    /**
     * Sets checksum of the list of users that are hidden.
     *
     * @param visibility the value to be set
     */
    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    /**
     * Creates and returns a copy of this {@code BlockedUsersChecksums} object.
     *
     * @return a clone of this instance
     */
    @Override
    public BlockedUsersChecksums clone() {
        try {
            return (BlockedUsersChecksums) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
