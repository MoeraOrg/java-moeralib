package org.moera.lib.naming;

import org.moera.lib.jsonrpc.JsonRpcConnectionException;

public class MoeraNamingConnectionException extends JsonRpcConnectionException {

    public MoeraNamingConnectionException(String message) {
        super(message);
    }

    public MoeraNamingConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
