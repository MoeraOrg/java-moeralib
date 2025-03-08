package org.moera.lib.jsonrpc;

/**
 * Represents an exception specific to JSON-RPC operations.
 * This class serves as a base class for exceptions that occur during the processing
 * of JSON-RPC requests and responses.
 */
public class JsonRpcException extends RuntimeException {

    /**
     * Constructs a new {@code JsonRpcException} with the specified message.
     *
     * @param message the detail message explaining the reason for the exception
     */
    public JsonRpcException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code JsonRpcException} with the specified detail message and cause.
     *
     * @param message the detail message explaining the reason for the exception
     * @param cause the cause of the exception
     */
    public JsonRpcException(String message, Throwable cause) {
        super(message, cause);
    }

}
