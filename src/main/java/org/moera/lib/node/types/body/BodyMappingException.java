package org.moera.lib.node.types.body;

/**
 * Exception thrown to indicate an error has occurred during conversion of
 * a {@code Body} object.
 */
public class BodyMappingException extends RuntimeException {

    /**
     * Constructs a new {@code BodyMappingException} with a default error message.
     */
    public BodyMappingException() {
        super("Error mapping a Body object");
    }

    /**
     * Constructs a new {@code BodyMappingException} with a default error message and a specified cause.
     *
     * @param cause the underlying cause of the exception
     */
    public BodyMappingException(Throwable cause) {
        super("Error mapping a Body object", cause);
    }

}
