package org.moera.lib.node.exception;

import org.moera.lib.node.types.Result;

/**
 * Represents an exception thrown when a validation error occurs while interacting with the Moera Node API.
 * This exception specifically indicates that the request failed due to validation issues
 * and is associated with an HTTP status code of 400 Bad Request.
 */
public class MoeraNodeApiValidationException extends MoeraNodeApiException {

    /**
     * Constructs a new {@code MoeraNodeApiValidationException} with the specified error code and error message.
     *
     * @param errorCode the specific error code indicating the validation error, may be {@code null}
     * @param errorMessage the detailed error message describing the validation error, may be {@code null}
     */
    public MoeraNodeApiValidationException(String errorCode, String errorMessage) {
        super(400, errorCode, errorMessage);
    }

    /**
     * Constructs a new {@code MoeraNodeApiValidationException} based on the provided {@link Result}.
     *
     * @param result the {@code Result} object, containing an error code and message
     */
    public MoeraNodeApiValidationException(Result result) {
        super(400, result);
    }

    /**
     * Constructs a new {@code MoeraNodeApiValidationException} with the specified response body.
     *
     * @param body the response body containing a serialized {@link Result} object, may be {@code null}
     */
    public MoeraNodeApiValidationException(String body) {
        super(400, body);
    }

}
