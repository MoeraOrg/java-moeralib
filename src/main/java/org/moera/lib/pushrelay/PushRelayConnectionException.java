package org.moera.lib.pushrelay;

import org.moera.lib.jsonrpc.JsonRpcConnectionException;

public class PushRelayConnectionException extends JsonRpcConnectionException {

    public PushRelayConnectionException(String message) {
        super(message);
    }

    public PushRelayConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
