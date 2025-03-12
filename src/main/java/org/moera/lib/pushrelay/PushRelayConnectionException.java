package org.moera.lib.pushrelay;

import org.moera.lib.jsonrpc.JsonRpcConnectionException;

/**
 * Represents an exception that indicates a connection-related issue specific to the Push Relay API.
 */
public class PushRelayConnectionException extends JsonRpcConnectionException {

    /**
     * Constructs a new {@code PushRelayConnectionException} with the specified detail message.
     *
     * @param message the detail message
     */
    public PushRelayConnectionException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code PushRelayConnectionException} with the specified detail message and cause.
     *
     * @param message the detail message
     * @param cause the underlying cause of the exception
     */
    public PushRelayConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
