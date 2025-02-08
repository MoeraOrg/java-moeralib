package org.moera.lib.pushrelay;

import org.moera.lib.jsonrpc.JsonRpcApiException;
import org.moera.lib.jsonrpc.JsonRpcError;

public class PushRelayApiException extends JsonRpcApiException {

    public PushRelayApiException(int rpcCode, String message) {
        super(rpcCode, message);
    }

    public PushRelayApiException(JsonRpcError jsonRpcError) {
        super(jsonRpcError.getCode(), jsonRpcError.getMessage());
    }

}
