package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CredentialsCreated extends Structure implements Cloneable {

    private boolean created;
    private Boolean loginDisabled;

    /**
     * Retrieves <code>true</code> if the credentials are initialized already, <code>false</code> otherwise.
     *
     * @return the value
     */
    public boolean isCreated() {
        return created;
    }

    /**
     * Sets <code>true</code> if the credentials are initialized already, <code>false</code> otherwise.
     *
     * @param created the value to be set
     */
    public void setCreated(boolean created) {
        this.created = created;
    }

    /**
     * Retrieves <code>true</code> if login and password reset are disabled.
     *
     * @return the value
     */
    public Boolean getLoginDisabled() {
        return loginDisabled;
    }

    /**
     * Sets <code>true</code> if login and password reset are disabled.
     *
     * @param loginDisabled the value to be set
     */
    public void setLoginDisabled(Boolean loginDisabled) {
        this.loginDisabled = loginDisabled;
    }

    /**
     * Creates and returns a copy of this {@code CredentialsCreated} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CredentialsCreated clone() {
        try {
            return (CredentialsCreated) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
