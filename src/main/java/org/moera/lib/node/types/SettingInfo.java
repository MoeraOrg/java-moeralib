package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SettingInfo extends Structure implements Cloneable {

    private String name;
    private String value;

    /**
     * Retrieves name of the setting.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of the setting.
     *
     * @param name the value to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves value of the setting.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets value of the setting.
     *
     * @param value the value to be set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Creates and returns a copy of this {@code SettingInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SettingInfo clone() {
        try {
            return (SettingInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
