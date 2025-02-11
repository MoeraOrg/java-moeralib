package org.moera.lib.crypto;

import java.security.interfaces.ECPublicKey;

public class MnemonicKey {

    private final String secret;
    private final String mnemonic;
    private final ECPublicKey publicKey;

    public MnemonicKey(String secret, String mnemonic, ECPublicKey publicKey) {
        this.secret = secret;
        this.mnemonic = mnemonic;
        this.publicKey = publicKey;
    }

    public String getSecret() {
        return secret;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public ECPublicKey getPublicKey() {
        return publicKey;
    }

}
