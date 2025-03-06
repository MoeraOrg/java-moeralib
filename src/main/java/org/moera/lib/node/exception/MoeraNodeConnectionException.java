package org.moera.lib.node.exception;

/**
 * Error while connecting the node.
 */
public class MoeraNodeConnectionException extends MoeraNodeException {

    public MoeraNodeConnectionException(Throwable cause) {
        super("Node connection error: " + cause.getMessage(), cause);
    }

}
