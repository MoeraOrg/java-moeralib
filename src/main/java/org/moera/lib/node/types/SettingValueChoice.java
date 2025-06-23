package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SettingValueChoice extends Structure implements Cloneable {

    private String title;
    private String value;

    /**
     * Retrieves human-friendly description of the value.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets human-friendly description of the value.
     *
     * @param title the value to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value the value to be set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Creates and returns a copy of this {@code SettingValueChoice} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SettingValueChoice clone() {
        try {
            return (SettingValueChoice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
