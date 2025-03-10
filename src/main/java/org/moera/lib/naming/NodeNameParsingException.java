package org.moera.lib.naming;

/**
 * Represents an exception that occurs during the parsing of a node name in the {@link NodeName} class.
 * This exception is typically thrown when the generation part of a node name is not a valid integer or
 * when the format of the node name string is invalid.
 */
public class NodeNameParsingException extends RuntimeException {

    /**
     * Constructs a new {@code NodeNameParsingException} with the specified detail message.
     *
     * @param message the detail message
     */
    public NodeNameParsingException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code NodeNameParsingException} with the specified detail message and cause.
     *
     * @param message the detail message
     * @param cause the cause
     */
    public NodeNameParsingException(String message, Throwable cause) {
        super(message, cause);
    }

}
