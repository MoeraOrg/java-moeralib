package org.moera.lib.pushrelay;

import org.moera.lib.jsonrpc.JsonRpcException;

/**
 * Represents an exception specific to the Push Relay API interactions.
 */
public class PushRelayException extends JsonRpcException {

    /**
     * Constructs a new {@code PushRelayException} with the specified detail message.
     *
     * @param message the detail message
     */
    public PushRelayException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code PushRelayException} with the specified detail message and cause.
     *
     * @param message the detail message
     * @param cause the underlying cause of the exception
     */
    public PushRelayException(String message, Throwable cause) {
        super(message, cause);
    }

}
