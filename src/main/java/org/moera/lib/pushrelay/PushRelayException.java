package org.moera.lib.pushrelay;

import org.moera.lib.jsonrpc.JsonRpcException;

public class PushRelayException extends JsonRpcException {

    public PushRelayException(String message) {
        super(message);
    }

    public PushRelayException(String message, Throwable cause) {
        super(message, cause);
    }

}
