package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GrantChange extends Structure implements Cloneable {

    private List<String> scope;
    private boolean revoke;

    /**
     * Retrieves a set of permissions to be granted or revoked.
     *
     * @return the value
     */
    public List<String> getScope() {
        return scope;
    }

    /**
     * Sets a set of permissions to be granted or revoked.
     *
     * @param scope the value to be set
     */
    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    /**
     * Retrieves <code>true</code> if the permissions must be revoked, <code>false</code> if the permissions must be
     * granted
     * .
     *
     * @return the value
     */
    public boolean isRevoke() {
        return revoke;
    }

    /**
     * Sets <code>true</code> if the permissions must be revoked, <code>false</code> if the permissions must be granted
     * .
     *
     * @param revoke the value to be set
     */
    public void setRevoke(boolean revoke) {
        this.revoke = revoke;
    }

    /**
     * Creates and returns a copy of this {@code GrantChange} object.
     *
     * @return a clone of this instance
     */
    @Override
    public GrantChange clone() {
        try {
            return (GrantChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
