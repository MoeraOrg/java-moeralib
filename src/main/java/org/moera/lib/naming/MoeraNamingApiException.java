package org.moera.lib.naming;

import org.moera.lib.jsonrpc.JsonRpcError;
import org.moera.lib.jsonrpc.JsonRpcApiException;

public class MoeraNamingApiException extends JsonRpcApiException {

    public MoeraNamingApiException(int rpcCode, String message) {
        super(rpcCode, message);
    }

    public MoeraNamingApiException(JsonRpcError jsonRpcError) {
        super(jsonRpcError.getCode(), jsonRpcError.getMessage());
    }

}
