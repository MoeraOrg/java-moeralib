package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyMnemonic {

    private List<String> mnemonic;

    public List<String> getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(List<String> mnemonic) {
        this.mnemonic = mnemonic;
    }

}
