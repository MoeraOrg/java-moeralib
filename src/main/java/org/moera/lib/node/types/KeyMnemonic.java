package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyMnemonic implements Cloneable {

    private List<String> mnemonic;

    @JsonIgnore
    private Object extra;

    public List<String> getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(List<String> mnemonic) {
        this.mnemonic = mnemonic;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
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
