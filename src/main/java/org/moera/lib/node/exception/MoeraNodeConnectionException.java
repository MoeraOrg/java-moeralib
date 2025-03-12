package org.moera.lib.node.exception;

/**
 * Thrown to indicate an error occurred while attempting to connect to a Moera node.
 */
public class MoeraNodeConnectionException extends MoeraNodeException {

    /**
     * Constructs a new {@code MoeraNodeConnectionException} with the specified cause.
     *
     * @param cause the throwable that caused this exception to be thrown
     */
    public MoeraNodeConnectionException(Throwable cause) {
        super("Node connection error: " + cause.getMessage(), cause);
    }

}
