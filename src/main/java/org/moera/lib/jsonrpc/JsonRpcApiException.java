package org.moera.lib.jsonrpc;

/**
 * Represents an exception thrown when a JSON-RPC API interaction encounters an error.
 * This exception provides additional information about the error through an associated JSON-RPC error code.
 */
public class JsonRpcApiException extends RuntimeException {

    private final int rpcCode;

    /**
     * Constructs a new {@code JsonRpcApiException} instance with a specified JSON-RPC error code and message.
     *
     * @param rpcCode the JSON-RPC error code associated with this exception
     * @param message the detail message providing additional information about the error
     */
    public JsonRpcApiException(int rpcCode, String message) {
        super(message);
        this.rpcCode = rpcCode;
    }

    /**
     * Constructs a new {@code JsonRpcApiException} instance using the specified {@link JsonRpcError}.
     *
     * @param jsonRpcError the JSON-RPC error containing error code and message to associate with this exception
     */
    public JsonRpcApiException(JsonRpcError jsonRpcError) {
        this(jsonRpcError.getCode(), jsonRpcError.getMessage());
    }

    /**
     * Retrieves the JSON-RPC error code associated with this exception.
     *
     * @return the JSON-RPC error code representing the specific error condition
     */
    public int getRpcCode() {
        return rpcCode;
    }

    /**
     * Constructs and returns a {@link JsonRpcError} object representing the JSON-RPC error
     * associated with this exception. The returned error object will contain the error code
     * and message of this exception.
     *
     * @return a {@link JsonRpcError} object containing the error code and message.
     */
    public JsonRpcError getRpcError() {
        return new JsonRpcError(rpcCode, getMessage());
    }

}
