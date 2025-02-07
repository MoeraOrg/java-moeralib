package org.moera.lib.jsonrpc;

public class JsonRpcException extends RuntimeException {

    private final int rpcCode;

    public JsonRpcException(int rpcCode, String message) {
        super(message);
        this.rpcCode = rpcCode;
    }

    public JsonRpcException(JsonRpcError jsonRpcError) {
        this(jsonRpcError.getCode(), jsonRpcError.getMessage());
    }

    public int getRpcCode() {
        return rpcCode;
    }

    public JsonRpcError getRpcError() {
        return new JsonRpcError(rpcCode, getMessage());
    }

}
