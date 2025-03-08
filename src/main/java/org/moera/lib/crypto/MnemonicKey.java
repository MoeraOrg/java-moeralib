package org.moera.lib.crypto;

import java.security.interfaces.ECPublicKey;

/**
 * Represents a cryptographic key derived from a mnemonic phrase.
 * This class is designed to store a secret, a mnemonic phrase, and the associated public key.
 * <p>
 * The mnemonic phrase is used as a human-readable representation of a cryptographic seed,
 * which can be securely stored or transferred. The public key is derived from this key
 * material and can be used in cryptographic operations.
 * <p>
 * Fields:<br>
 * - {@code secret}: The secret key material associated with the mnemonic.<br>
 * - {@code mnemonic}: The mnemonic phrase used as a human-friendly representation of the secret.<br>
 * - {@code publicKey}: The elliptic curve public key generated from the secret.
 */
public record MnemonicKey(String secret, String mnemonic, ECPublicKey publicKey) {
}
