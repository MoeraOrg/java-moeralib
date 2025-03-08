package org.moera.lib.crypto;

/**
 * Represents a reconstructed fingerprint and the number of bytes remaining in the input array
 */
public record RestoredFingerprint(Fingerprint fingerprint, int available) {
}
