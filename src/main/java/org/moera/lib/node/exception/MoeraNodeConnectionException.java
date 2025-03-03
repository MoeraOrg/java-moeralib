package org.moera.lib.node.exception;

/**
 * Error while connecting the node.
 */
public class MoeraNodeConnectionException extends Exception {

    /**
     * @param message error message
     */
    public MoeraNodeConnectionException(String message) {
        super("Node connection error: " + message);
    }

    public MoeraNodeConnectionException(String message, Throwable cause) {
        super("Node connection error: " + message, cause);
    }

}
