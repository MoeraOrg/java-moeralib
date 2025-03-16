package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisteredNameSecret extends Structure implements Cloneable {

    private String name;
    private List<String> mnemonic;
    private String secret;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets .
     *
     * @param name the value to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves human-friendly mnemonic of the updating key.
     *
     * @return the value
     */
    public List<String> getMnemonic() {
        return mnemonic;
    }

    /**
     * Sets human-friendly mnemonic of the updating key.
     *
     * @param mnemonic the value to be set
     */
    public void setMnemonic(List<String> mnemonic) {
        this.mnemonic = mnemonic;
    }

    /**
     * Retrieves base64-encoded secret of the updating key.
     *
     * @return the value
     */
    public String getSecret() {
        return secret;
    }

    /**
     * Sets base64-encoded secret of the updating key.
     *
     * @param secret the value to be set
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.minItems(mnemonic, 24, "node-name.secret.wrong-number");
        ValidationUtil.maxItems(mnemonic, 24, "node-name.secret.wrong-number");
    }

    /**
     * Creates and returns a copy of this {@code RegisteredNameSecret} object.
     *
     * @return a clone of this instance
     */
    @Override
    public RegisteredNameSecret clone() {
        try {
            return (RegisteredNameSecret) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
