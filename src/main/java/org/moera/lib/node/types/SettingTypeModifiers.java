package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SettingTypeModifiers extends Structure implements Cloneable {

    private String format;
    private String min;
    private String max;
    private Boolean multiline;
    private Boolean never;
    private Boolean always;
    private List<String> principals;

    /**
     * Retrieves preferred format of displaying the value<br> (<code>int</code>) <ul>
     * <li><code>size</code> - data size in bytes/kilobytes/megabytes etc.</li>
     * </ul>
     * .
     *
     * @return the value
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets preferred format of displaying the value<br> (<code>int</code>) <ul>
     * <li><code>size</code> - data size in bytes/kilobytes/megabytes etc.</li>
     * </ul>
     * .
     *
     * @param format the value to be set
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Retrieves (<code>int</code>, <code>Duration</code>) minimal value.
     *
     * @return the value
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets (<code>int</code>, <code>Duration</code>) minimal value.
     *
     * @param min the value to be set
     */
    public void setMin(String min) {
        this.min = min;
    }

    /**
     * Retrieves (<code>int</code>, <code>Duration</code>) maximal value.
     *
     * @return the value
     */
    public String getMax() {
        return max;
    }

    /**
     * Sets (<code>int</code>, <code>Duration</code>) maximal value.
     *
     * @param max the value to be set
     */
    public void setMax(String max) {
        this.max = max;
    }

    /**
     * Retrieves (<code>string</code>) <code>true</code>, if the value is a multiline text.
     *
     * @return the value
     */
    public Boolean getMultiline() {
        return multiline;
    }

    /**
     * Sets (<code>string</code>) <code>true</code>, if the value is a multiline text.
     *
     * @param multiline the value to be set
     */
    public void setMultiline(Boolean multiline) {
        this.multiline = multiline;
    }

    /**
     * Retrieves (<code>Duration</code>) <code>true</code>, if value <code>never</code> is allowed.
     *
     * @return the value
     */
    public Boolean getNever() {
        return never;
    }

    /**
     * Sets (<code>Duration</code>) <code>true</code>, if value <code>never</code> is allowed.
     *
     * @param never the value to be set
     */
    public void setNever(Boolean never) {
        this.never = never;
    }

    /**
     * Retrieves (<code>Duration</code>) <code>true</code>, if value <code>always</code> is allowed.
     *
     * @return the value
     */
    public Boolean getAlways() {
        return always;
    }

    /**
     * Sets (<code>Duration</code>) <code>true</code>, if value <code>always</code> is allowed.
     *
     * @param always the value to be set
     */
    public void setAlways(Boolean always) {
        this.always = always;
    }

    /**
     * Retrieves (<code>Principal</code>) list of allowed principals.
     *
     * @return the value
     */
    public List<String> getPrincipals() {
        return principals;
    }

    /**
     * Sets (<code>Principal</code>) list of allowed principals.
     *
     * @param principals the value to be set
     */
    public void setPrincipals(List<String> principals) {
        this.principals = principals;
    }

    /**
     * Creates and returns a copy of this {@code SettingTypeModifiers} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SettingTypeModifiers clone() {
        try {
            return (SettingTypeModifiers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
