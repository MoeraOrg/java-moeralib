package org.moera.lib.node.exception;

public class MoeraNodeException extends Exception {

    public MoeraNodeException(String message) {
        super("Node error: " + message);
    }

    public MoeraNodeException(String message, Throwable cause) {
        super("Node error: " + message + ": " + cause.getMessage(), cause);
    }

    public MoeraNodeException(Throwable cause) {
        super("Node error: " + cause.getMessage(), cause);
    }

}
