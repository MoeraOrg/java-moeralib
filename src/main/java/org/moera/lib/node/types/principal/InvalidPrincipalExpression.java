package org.moera.lib.node.types.principal;

/**
 * Exception thrown to indicate that a principal expression is invalid or does not meet
 * the required criteria for processing or evaluation in the given context.
 */
public class InvalidPrincipalExpression extends RuntimeException {

    /**
     * Constructs a new {@code InvalidPrincipalExpression} with the specified detail message.
     *
     * @param message the detail message
     */
    public InvalidPrincipalExpression(String message) {
        super(message);
    }

}
