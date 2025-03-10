package org.moera.lib.naming;

import org.moera.lib.jsonrpc.JsonRpcConnectionException;

/**
 * Represents a specialized exception indicating a connection-related issue
 * during interactions with the Moera Naming service.
 */
public class MoeraNamingConnectionException extends JsonRpcConnectionException {

    /**
     * Constructs a new {@code MoeraNamingConnectionException} with the specified detail message.
     *
     * @param message the detail message explaining the reason for the exception
     */
    public MoeraNamingConnectionException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code MoeraNamingConnectionException} with the specified detail message
     * and cause.
     *
     * @param message the detail message explaining the reason for the exception
     * @param cause the cause of the exception
     */
    public MoeraNamingConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
