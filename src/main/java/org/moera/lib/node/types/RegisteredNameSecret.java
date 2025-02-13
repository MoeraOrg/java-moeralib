package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisteredNameSecret implements Cloneable {

    private String name;
    private List<String> mnemonic;
    private String secret;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(List<String> mnemonic) {
        this.mnemonic = mnemonic;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public RegisteredNameSecret clone() {
        try {
            return (RegisteredNameSecret) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
