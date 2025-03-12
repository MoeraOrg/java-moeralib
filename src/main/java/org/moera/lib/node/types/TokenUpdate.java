package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenUpdate extends Structure implements Cloneable {

    private String name;
    private List<String> permissions;

    /**
     * Retrieves a user-readable name of the token.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a user-readable name of the token.
     *
     * @param name the value to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves a bit mask describing which permissions should be granted to the token; if not set, the token
     * permissions are left untouched
     * .
     *
     * @return the value
     */
    public List<String> getPermissions() {
        return permissions;
    }

    /**
     * Sets a bit mask describing which permissions should be granted to the token; if not set, the token permissions
     * are left untouched
     * .
     *
     * @param permissions the value to be set
     */
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    /**
     * Creates and returns a copy of this {@code TokenUpdate} object.
     *
     * @return a clone of this instance
     */
    @Override
    public TokenUpdate clone() {
        try {
            return (TokenUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
