package org.moera.lib.naming;

import org.moera.lib.jsonrpc.JsonRpcException;

/**
 * Represents an exception that is specific to naming-related errors.
 */
public class MoeraNamingException extends JsonRpcException {

    /**
     * Constructs a new {@code MoeraNamingException} with the specified detail message.
     *
     * @param message the detail message explaining the reason for the exception
     */
    public MoeraNamingException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code MoeraNamingException} with the specified detail message and cause.
     *
     * @param message the detail message explaining the reason for the exception
     * @param cause the cause of the exception
     */
    public MoeraNamingException(String message, Throwable cause) {
        super(message, cause);
    }

}
