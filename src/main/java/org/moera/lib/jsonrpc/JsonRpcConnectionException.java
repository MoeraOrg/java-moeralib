package org.moera.lib.jsonrpc;

public class JsonRpcConnectionException extends RuntimeException {

    public JsonRpcConnectionException(String message) {
        super(message);
    }

    public JsonRpcConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
