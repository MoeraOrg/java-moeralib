package org.moera.lib.crypto;

/**
 * Represents an exception related to cryptographic operations.
 * This exception serves as a wrapper for other cryptographic errors,
 * providing a unified and descriptive way to handle such exceptions.
 */
public class CryptoException extends RuntimeException {

    /**
     * Constructs a new {@code CryptoException} with the specified detail message.
     *
     * @param message the detail message explaining the cause of the exception
     */
    public CryptoException(String message) {
        super("Crypto exception: " + message);
    }

    /**
     * Constructs a new {@code CryptoException} with the specified cause.
     *
     * @param cause the underlying cause of this exception
     */
    public CryptoException(Throwable cause) {
        super("Crypto exception: " + cause.getMessage(), cause);
    }

}
