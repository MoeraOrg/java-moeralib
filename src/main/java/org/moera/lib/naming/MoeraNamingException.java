package org.moera.lib.naming;

import org.moera.lib.jsonrpc.JsonRpcException;

public class MoeraNamingException extends JsonRpcException {

    public MoeraNamingException(String message) {
        super(message);
    }

    public MoeraNamingException(String message, Throwable cause) {
        super(message, cause);
    }

}
