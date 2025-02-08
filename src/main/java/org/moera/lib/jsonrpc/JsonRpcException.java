package org.moera.lib.jsonrpc;

public class JsonRpcException extends RuntimeException {

    public JsonRpcException(String message) {
        super(message);
    }

    public JsonRpcException(String message, Throwable cause) {
        super(message, cause);
    }

}
