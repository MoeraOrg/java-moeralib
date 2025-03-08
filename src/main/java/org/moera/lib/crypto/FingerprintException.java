package org.moera.lib.crypto;

/**
 * Represents an exception that occurs during the process of generating or
 * restoring fingerprints.
 */
public class FingerprintException extends RuntimeException {

    /**
     * Constructs a new {@code FingerprintException} with the specified detail message.
     *
     * @param message the detail message for the exception
     */
    public FingerprintException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code FingerprintException} with the specified detail message and cause.
     *
     * @param message the detail message for the exception
     * @param cause   the cause of the exception
     */
    public FingerprintException(String message, Throwable cause) {
        super(message, cause);
    }

}
