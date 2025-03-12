package org.moera.lib.pushrelay;

import org.moera.lib.jsonrpc.JsonRpcApiException;
import org.moera.lib.jsonrpc.JsonRpcError;

/**
 * Represents an exception specific to errors encountered while interacting with the Push Relay API
 * over JSON-RPC. This exception extends {@link JsonRpcApiException} and provides additional
 * context for Push Relay API-specific errors by leveraging JSON-RPC error codes and messages.
 */
public class PushRelayApiException extends JsonRpcApiException {

    /**
     * Constructs a new {@code PushRelayApiException} instance with the specified JSON-RPC error
     * code and message.
     *
     * @param rpcCode the JSON-RPC error code associated with this exception
     * @param message the detail message providing additional information about the error
     */
    public PushRelayApiException(int rpcCode, String message) {
        super(rpcCode, message);
    }

    /**
     * Constructs a new {@code PushRelayApiException} instance using the provided {@code JsonRpcError}.
     * The error code and message from the {@code JsonRpcError} object are used to populate the
     * exception details.
     *
     * @param jsonRpcError the {@code JsonRpcError} instance containing the error code and message
     */
    public PushRelayApiException(JsonRpcError jsonRpcError) {
        super(jsonRpcError.getCode(), jsonRpcError.getMessage());
    }

}
