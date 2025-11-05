package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CredentialsResetToken extends Structure implements Cloneable {

    private String token;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets .
     *
     * @param token the value to be set
     */
    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(token, "credentials-reset-token.token.blank");
    }

    /**
     * Creates and returns a copy of this {@code CredentialsResetToken} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CredentialsResetToken clone() {
        try {
            return (CredentialsResetToken) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
