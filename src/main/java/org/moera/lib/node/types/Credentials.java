package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Credentials extends Structure implements Cloneable {

    private String login;
    private String password;

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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(login, "credentials.login.blank");
        ValidationUtil.notBlank(password, "credentials.password.blank");
    }

    /**
     * Creates and returns a copy of this {@code Credentials} object.
     *
     * @return a clone of this instance
     */
    @Override
    public Credentials clone() {
        try {
            return (Credentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
