package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInfo extends Structure implements Cloneable {

    private Boolean important;
    private String description;

    /**
     * Retrieves <code>true</code>, if the update is important, <code>false</code> (the default) otherwise.
     *
     * @return the value
     */
    public Boolean getImportant() {
        return important;
    }

    /**
     * Sets <code>true</code>, if the update is important, <code>false</code> (the default) otherwise.
     *
     * @param important the value to be set
     */
    public void setImportant(Boolean important) {
        this.important = important;
    }

    /**
     * Retrieves description of the update.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description of the update.
     *
     * @param description the value to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(description, 128, "update.description.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code UpdateInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public UpdateInfo clone() {
        try {
            return (UpdateInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
