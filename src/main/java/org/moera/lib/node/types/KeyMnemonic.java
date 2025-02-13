package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyMnemonic implements Cloneable {

    private List<String> mnemonic;

    public List<String> getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(List<String> mnemonic) {
        this.mnemonic = mnemonic;
    }

    @Override
    public KeyMnemonic clone() {
        try {
            return (KeyMnemonic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
