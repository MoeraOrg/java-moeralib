package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyMnemonic extends Structure implements Cloneable {

    private List<String> mnemonic;

    public List<String> getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(List<String> mnemonic) {
        this.mnemonic = mnemonic;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(mnemonic, "node-name.mnemonic.missing");
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
