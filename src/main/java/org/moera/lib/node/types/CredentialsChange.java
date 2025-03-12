package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CredentialsChange extends Structure implements Cloneable {

    private String token;
    private String oldPassword;
    private String login;
    private String password;

    /**
     * Retrieves credentials reset token.
     *
     * @return the value
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets credentials reset token.
     *
     * @param token the value to be set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Retrieves the current password.
     *
     * @return the value
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * Sets the current password.
     *
     * @param oldPassword the value to be set
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

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
     * Creates and returns a copy of this {@code CredentialsChange} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CredentialsChange clone() {
        try {
            return (CredentialsChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
