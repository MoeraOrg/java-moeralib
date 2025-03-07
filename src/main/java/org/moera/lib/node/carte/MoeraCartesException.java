package org.moera.lib.node.carte;

/**
 * This class represents an exception specific to operations related to cartes.
 * <p>
 * This exception is primarily used in the context of {@code MoeraCarteSource}
 * to signal errors encountered during carte-related operations.
 */
public class MoeraCartesException extends RuntimeException {

    /**
     * Constructs a new MoeraCartesException with the specified detail message.
     *
     * @param message the detail message that provides additional context about the exception
     */
    public MoeraCartesException(String message) {
        super(message);
    }

    /**
     * Constructs a new MoeraCartesException with the specified detail message and cause.
     *
     * @param message the detail message that provides additional context about the exception
     * @param cause the cause of the exception, which may be used to retrieve the original error
     */
    public MoeraCartesException(String message, Throwable cause) {
        super(message, cause);
    }

}
