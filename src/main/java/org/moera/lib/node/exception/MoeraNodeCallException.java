package org.moera.lib.node.exception;

/**
 * Missing context of the call (authentication parameters or node URL).
 */
public class MoeraNodeCallException extends RuntimeException {

    /**
     * @param message error message
     */
    public MoeraNodeCallException(String message) {
        super(message);
    }

    public MoeraNodeCallException(String message, Throwable cause) {
        super(message, cause);
    }

}
