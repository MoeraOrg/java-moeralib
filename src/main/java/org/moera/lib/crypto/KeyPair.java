package org.moera.lib.crypto;

import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

public class KeyPair {

    private final ECPrivateKey privateKey;
    private final ECPublicKey publicKey;

    public KeyPair(ECPrivateKey privateKey, ECPublicKey publicKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }

    public KeyPair(java.security.KeyPair keyPair) {
        this.privateKey = (ECPrivateKey) keyPair.getPrivate();
        this.publicKey = (ECPublicKey) keyPair.getPublic();
    }

    public ECPrivateKey getPrivateKey() {
        return privateKey;
    }

    public ECPublicKey getPublicKey() {
        return publicKey;
    }

}
