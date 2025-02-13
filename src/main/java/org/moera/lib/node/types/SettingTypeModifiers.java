package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SettingTypeModifiers implements Cloneable {

    private String format;
    private String min;
    private String max;
    private Boolean multiline;
    private Boolean never;
    private Boolean always;
    private List<String> principals;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public Boolean getMultiline() {
        return multiline;
    }

    public void setMultiline(Boolean multiline) {
        this.multiline = multiline;
    }

    public Boolean getNever() {
        return never;
    }

    public void setNever(Boolean never) {
        this.never = never;
    }

    public Boolean getAlways() {
        return always;
    }

    public void setAlways(Boolean always) {
        this.always = always;
    }

    public List<String> getPrincipals() {
        return principals;
    }

    public void setPrincipals(List<String> principals) {
        this.principals = principals;
    }

    @Override
    public SettingTypeModifiers clone() {
        try {
            return (SettingTypeModifiers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
