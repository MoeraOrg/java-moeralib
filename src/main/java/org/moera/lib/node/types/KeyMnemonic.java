package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyMnemonic extends Structure implements Cloneable {

    private List<String> mnemonic;

    /**
     * Retrieves the words.
     *
     * @return the value
     */
    public List<String> getMnemonic() {
        return mnemonic;
    }

    /**
     * Sets the words.
     *
     * @param mnemonic the value to be set
     */
    public void setMnemonic(List<String> mnemonic) {
        this.mnemonic = mnemonic;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(mnemonic, "node-name.mnemonic.missing");
    }

    /**
     * Creates and returns a copy of this {@code KeyMnemonic} object.
     *
     * @return a clone of this instance
     */
    @Override
    public KeyMnemonic clone() {
        try {
            return (KeyMnemonic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
