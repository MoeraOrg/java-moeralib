package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SettingMetaAttributes extends Structure implements Cloneable {

    private String name;
    private String defaultValue;
    private Boolean privileged;

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
     * Retrieves default value of the setting (if absent or <code>null</code>, the built-in default value will be used)
     * .
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets default value of the setting (if absent or <code>null</code>, the built-in default value will be used)
     * .
     *
     * @param defaultValue the value to be set
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * Retrieves the setting should be privileged (if absent or <code>null</code>, the built-in value of the flag will
     * be used)
     * .
     *
     * @return the value
     */
    public Boolean getPrivileged() {
        return privileged;
    }

    /**
     * Sets the setting should be privileged (if absent or <code>null</code>, the built-in value of the flag will be
     * used)
     * .
     *
     * @param privileged the value to be set
     */
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * Creates and returns a copy of this {@code SettingMetaAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SettingMetaAttributes clone() {
        try {
            return (SettingMetaAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
