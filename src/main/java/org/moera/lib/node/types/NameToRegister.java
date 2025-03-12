package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NameToRegister extends Structure implements Cloneable {

    private String name;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets .
     *
     * @param name the value to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(name, "node-name.name.blank");
    }

    /**
     * Creates and returns a copy of this {@code NameToRegister} object.
     *
     * @return a clone of this instance
     */
    @Override
    public NameToRegister clone() {
        try {
            return (NameToRegister) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
