package org.moera.lib.naming;

import org.moera.lib.jsonrpc.JsonRpcError;
import org.moera.lib.jsonrpc.JsonRpcException;

public class MoeraNamingApiException extends JsonRpcException {

    public MoeraNamingApiException(int rpcCode, String message) {
        super(rpcCode, message);
    }

    public MoeraNamingApiException(JsonRpcError jsonRpcError) {
        super(jsonRpcError.getCode(), jsonRpcError.getMessage());
    }

}
