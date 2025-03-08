package org.moera.lib.crypto;

import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/**
 * Represents a pair of cryptographic keys: a private key and a public key.
 * This class is specifically designed for Elliptic Curve cryptography (EC).
 */
public class KeyPair {

    private final ECPrivateKey privateKey;
    private final ECPublicKey publicKey;

    /**
     * Constructs a new {@code KeyPair} instance with the specified private and public keys.
     *
     * @param privateKey the elliptic curve private key associated with this key pair
     * @param publicKey the elliptic curve public key associated with this key pair
     */
    public KeyPair(ECPrivateKey privateKey, ECPublicKey publicKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }

    /**
     * Constructs a new {@code KeyPair} instance using a {@link java.security.KeyPair}.
     * The provided {@code KeyPair} must contain an Elliptic Curve private key and public key.
     *
     * @param keyPair the {@link java.security.KeyPair} containing the EC private and public keys
     */
    public KeyPair(java.security.KeyPair keyPair) {
        this.privateKey = (ECPrivateKey) keyPair.getPrivate();
        this.publicKey = (ECPublicKey) keyPair.getPublic();
    }

    /**
     * Retrieves the elliptic curve private key associated with the key pair.
     *
     * @return the elliptic curve private key
     */
    public ECPrivateKey getPrivateKey() {
        return privateKey;
    }

    /**
     * Retrieves the elliptic curve public key associated with the key pair.
     *
     * @return the elliptic curve public key
     */
    public ECPublicKey getPublicKey() {
        return publicKey;
    }

}
