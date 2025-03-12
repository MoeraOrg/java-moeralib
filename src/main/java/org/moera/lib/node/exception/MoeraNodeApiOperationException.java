package org.moera.lib.node.exception;

import org.moera.lib.node.types.Result;

/**
 * Represents an exception indicating that an operation failed when interacting with the Moera Node API.
 * This exception is thrown for failures specifically tied to API operations, which return an HTTP 409
 * Conflict status code.
 */
public class MoeraNodeApiOperationException extends MoeraNodeApiException {

    /**
     * Constructs a new {@code MoeraNodeApiOperationException} with the specified error code and error message.
     *
     * @param errorCode the specific error code returned by the API, may be {@code null}
     * @param errorMessage the detailed error message returned by the API, may be {@code null}
     */
    public MoeraNodeApiOperationException(String errorCode, String errorMessage) {
        super(409, errorCode, errorMessage);
    }

    /**
     * Constructs a new {@code MoeraNodeApiOperationException} using the provided {@link Result}.
     *
     * @param result the {@link Result} object containing the error code and message, may be {@code null}
     */
    public MoeraNodeApiOperationException(Result result) {
        super(409, result);
    }

    /**
     * Constructs a new {@code MoeraNodeApiOperationException} with the specified response body.
     *
     * @param body the response body containing a serialized {@link Result} object, may be {@code null}
     */
    public MoeraNodeApiOperationException(String body) {
        super(409, body);
    }

}
