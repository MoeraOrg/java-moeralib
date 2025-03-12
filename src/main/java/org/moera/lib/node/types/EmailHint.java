package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmailHint extends Structure implements Cloneable {

    private String emailHint;

    /**
     * Retrieves a masked E-mail address that should help user to understand which E-mail address was used without
     * revealing it
     * .
     *
     * @return the value
     */
    public String getEmailHint() {
        return emailHint;
    }

    /**
     * Sets a masked E-mail address that should help user to understand which E-mail address was used without revealing
     * it
     * .
     *
     * @param emailHint the value to be set
     */
    public void setEmailHint(String emailHint) {
        this.emailHint = emailHint;
    }

    /**
     * Creates and returns a copy of this {@code EmailHint} object.
     *
     * @return a clone of this instance
     */
    @Override
    public EmailHint clone() {
        try {
            return (EmailHint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
