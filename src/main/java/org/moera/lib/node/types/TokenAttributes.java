package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenAttributes extends Structure implements Cloneable {

    private String login;
    private String password;
    private List<String> permissions;
    private String name;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets .
     *
     * @param login the value to be set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets .
     *
     * @param password the value to be set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Retrieves a bit mask describing which permissions should be granted to the token; if not set, all permissions of
     * the administrator are granted.
     * .
     *
     * @return the value
     */
    public List<String> getPermissions() {
        return permissions;
    }

    /**
     * Sets a bit mask describing which permissions should be granted to the token; if not set, all permissions of the
     * administrator are granted.
     * .
     *
     * @param permissions the value to be set
     */
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(login, "credentials.login.blank");
        ValidationUtil.notBlank(password, "credentials.password.blank");
    }

    /**
     * Creates and returns a copy of this {@code TokenAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public TokenAttributes clone() {
        try {
            return (TokenAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
