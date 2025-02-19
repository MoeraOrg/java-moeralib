package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CredentialsChange implements Cloneable {

    private String token;
    private String oldPassword;
    private String login;
    private String password;

    @JsonIgnore
    private Object extra;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
        ValidationUtil.notBlank(login, "credentials.login.blank");
        ValidationUtil.notBlank(password, "credentials.password.blank");
    }

    @Override
    public CredentialsChange clone() {
        try {
            return (CredentialsChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
