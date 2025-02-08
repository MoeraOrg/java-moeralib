package org.moera.lib.jsonrpc;

public class JsonRpcApiException extends RuntimeException {

    private final int rpcCode;

    public JsonRpcApiException(int rpcCode, String message) {
        super(message);
        this.rpcCode = rpcCode;
    }

    public JsonRpcApiException(JsonRpcError jsonRpcError) {
        this(jsonRpcError.getCode(), jsonRpcError.getMessage());
    }

    public int getRpcCode() {
        return rpcCode;
    }

    public JsonRpcError getRpcError() {
        return new JsonRpcError(rpcCode, getMessage());
    }

}
