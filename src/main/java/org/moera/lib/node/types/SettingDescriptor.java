package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SettingDescriptor extends Structure implements Cloneable {

    private String name;
    private String type;
    private String defaultValue;
    private Boolean internal;
    private Boolean privileged;
    private Boolean encrypted;
    private String title;
    private SettingTypeModifiers modifiers;

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
     * Retrieves type of the setting.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type of the setting.
     *
     * @param type the value to be set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Retrieves default value of the setting.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets default value of the setting.
     *
     * @param defaultValue the value to be set
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * Retrieves the setting is internal - not displayed to the user.
     *
     * @return the value
     */
    public Boolean getInternal() {
        return internal;
    }

    /**
     * Sets the setting is internal - not displayed to the user.
     *
     * @param internal the value to be set
     */
    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    /**
     * Retrieves the setting is privileged - may be changed by server owner only.
     *
     * @return the value
     */
    public Boolean getPrivileged() {
        return privileged;
    }

    /**
     * Sets the setting is privileged - may be changed by server owner only.
     *
     * @param privileged the value to be set
     */
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * Retrieves the setting is stored in the database in encrypted form.
     *
     * @return the value
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * Sets the setting is stored in the database in encrypted form.
     *
     * @param encrypted the value to be set
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * Retrieves human-friendly description of the setting.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets human-friendly description of the setting.
     *
     * @param title the value to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves additional modifiers that may help to choose a proper UI component for the setting value and to
     * validate the input; the meaning of the modifiers depends on the setting type
     * .
     *
     * @return the value
     */
    public SettingTypeModifiers getModifiers() {
        return modifiers;
    }

    /**
     * Sets additional modifiers that may help to choose a proper UI component for the setting value and to validate
     * the input; the meaning of the modifiers depends on the setting type
     * .
     *
     * @param modifiers the value to be set
     */
    public void setModifiers(SettingTypeModifiers modifiers) {
        this.modifiers = modifiers;
    }

    /**
     * Creates and returns a copy of this {@code SettingDescriptor} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SettingDescriptor clone() {
        try {
            return (SettingDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
