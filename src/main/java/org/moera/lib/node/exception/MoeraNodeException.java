package org.moera.lib.node.exception;

/**
 * Represents a general exception related to errors encountered when calling Moera Node API.
 * This exception serves as a base class for all exceptions specific to node-related errors.
 */
public class MoeraNodeException extends Exception {

    /**
     * Constructs a new {@code MoeraNodeException} with the specified detail message.
     *
     * @param message the detail message
     */
    public MoeraNodeException(String message) {
        super("Node error: " + message);
    }

    /**
     * Constructs a new {@code MoeraNodeException} with the specified detail message and cause.
     *
     * @param message the detail message
     * @param cause the throwable that caused this exception to be thrown
     */
    public MoeraNodeException(String message, Throwable cause) {
        super("Node error: " + message + ": " + cause.getMessage(), cause);
    }

    /**
     * Constructs a new {@code MoeraNodeException} with the provided cause.
     *
     * @param cause the throwable that caused this exception to be thrown
     */
    public MoeraNodeException(Throwable cause) {
        super("Node error: " + cause.getMessage(), cause);
    }

}
