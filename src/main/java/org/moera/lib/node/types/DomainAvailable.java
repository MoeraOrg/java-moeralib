package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DomainAvailable extends Structure implements Cloneable {

    private String name;

    /**
     * Retrieves fully-qualified domain name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets fully-qualified domain name.
     *
     * @param name the value to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Creates and returns a copy of this {@code DomainAvailable} object.
     *
     * @return a clone of this instance
     */
    @Override
    public DomainAvailable clone() {
        try {
            return (DomainAvailable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
