package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsyncOperationCreated extends Structure implements Cloneable {

    private String id;

    /**
     * Retrieves ID of the asynchronous operation that was created.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of the asynchronous operation that was created.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Creates and returns a copy of this {@code AsyncOperationCreated} object.
     *
     * @return a clone of this instance
     */
    @Override
    public AsyncOperationCreated clone() {
        try {
            return (AsyncOperationCreated) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
