package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedStatusChange extends Structure implements Cloneable {

    private Boolean viewed;
    private Boolean read;
    private long before;

    /**
     * Retrieves new value of the <code>viewed</code> flag (<code>null</code>, if the flag is not changed).
     *
     * @return the value
     */
    public Boolean getViewed() {
        return viewed;
    }

    /**
     * Sets new value of the <code>viewed</code> flag (<code>null</code>, if the flag is not changed).
     *
     * @param viewed the value to be set
     */
    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * Retrieves new value of the <code>read</code> flag (<code>null</code>, if the flag is not changed).
     *
     * @return the value
     */
    public Boolean getRead() {
        return read;
    }

    /**
     * Sets new value of the <code>read</code> flag (<code>null</code>, if the flag is not changed).
     *
     * @param read the value to be set
     */
    public void setRead(Boolean read) {
        this.read = read;
    }

    /**
     * Retrieves change flags for all stories before this moment, inclusive.
     *
     * @return the value
     */
    public long getBefore() {
        return before;
    }

    /**
     * Sets change flags for all stories before this moment, inclusive.
     *
     * @param before the value to be set
     */
    public void setBefore(long before) {
        this.before = before;
    }

    /**
     * Creates and returns a copy of this {@code FeedStatusChange} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FeedStatusChange clone() {
        try {
            return (FeedStatusChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
