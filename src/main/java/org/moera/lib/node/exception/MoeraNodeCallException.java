package org.moera.lib.node.exception;

/**
 * Thrown to indicate errors like missing context of the call (authentication parameters or node URL)
 * when attempting to call Moera Node API.
 */
public class MoeraNodeCallException extends RuntimeException {

    /**
     * Constructs a new {@code MoeraNodeCallException} with the specified detail message.
     *
     * @param message the detail message
     */
    public MoeraNodeCallException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code MoeraNodeCallException} with the specified detail message and cause.
     *
     * @param message the detail message
     * @param cause the throwable that caused this exception to be thrown
     */
    public MoeraNodeCallException(String message, Throwable cause) {
        super(message, cause);
    }

}
