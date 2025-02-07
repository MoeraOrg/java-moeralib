package org.moera.lib.naming;

import org.moera.lib.jsonrpc.JsonRpcError;

public class MoeraNamingApiException extends RuntimeException {

    private final int rpcCode;

    public MoeraNamingApiException(int rpcCode, String message) {
        super(message);
        this.rpcCode = rpcCode;
    }

    public MoeraNamingApiException(JsonRpcError jsonRpcError) {
        this(jsonRpcError.getCode(), jsonRpcError.getMessage());
    }

    public int getRpcCode() {
        return rpcCode;
    }

}
