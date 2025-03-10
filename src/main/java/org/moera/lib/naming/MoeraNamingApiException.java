package org.moera.lib.naming;

import org.moera.lib.jsonrpc.JsonRpcError;
import org.moera.lib.jsonrpc.JsonRpcApiException;

/**
 * Represents an exception specific to errors returned by the Moera Naming API calls.
 */
public class MoeraNamingApiException extends JsonRpcApiException {

    /**
     * Constructs a new instance of {@code MoeraNamingApiException} with the specified RPC error code
     * and detail message.
     *
     * @param rpcCode the JSON-RPC error code associated with this exception
     * @param message the detail message providing additional information about the error
     */
    public MoeraNamingApiException(int rpcCode, String message) {
        super(rpcCode, message);
    }

    /**
     * Constructs a new {@code MoeraNamingApiException} instance using the provided {@link JsonRpcError}.
     * The exception encapsulates the error code and message from the specified JSON-RPC error object.
     *
     * @param jsonRpcError the {@link JsonRpcError} instance containing the error code and message
     */
    public MoeraNamingApiException(JsonRpcError jsonRpcError) {
        super(jsonRpcError.getCode(), jsonRpcError.getMessage());
    }

}
