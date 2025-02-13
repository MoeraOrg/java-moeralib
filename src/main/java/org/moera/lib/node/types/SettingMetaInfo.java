package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SettingMetaInfo implements Cloneable {

    private String name;
    private String type;
    private String defaultValue;
    private Boolean privileged;
    private String title;
    private SettingTypeModifiers modifiers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SettingTypeModifiers getModifiers() {
        return modifiers;
    }

    public void setModifiers(SettingTypeModifiers modifiers) {
        this.modifiers = modifiers;
    }

    @Override
    public SettingMetaInfo clone() {
        try {
            return (SettingMetaInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
