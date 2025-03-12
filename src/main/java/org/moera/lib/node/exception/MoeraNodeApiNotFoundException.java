package org.moera.lib.node.exception;

import org.moera.lib.node.types.Result;

/**
 * Represents an exception thrown when a requested resource is not found in the Moera Node API.
 * This exception specifically corresponds to HTTP 404 Not Found errors and provides additional context
 * about the error through error codes and error messages.
 */
public class MoeraNodeApiNotFoundException extends MoeraNodeApiException {

    /**
     * Constructs a new {@code MoeraNodeApiNotFoundException} with the specified error code and error message.
     *
     * @param errorCode the specific error code returned by the API, may be {@code null}
     * @param errorMessage the detailed error message returned by the API, may be {@code null}
     */
    public MoeraNodeApiNotFoundException(String errorCode, String errorMessage) {
        super(404, errorCode, errorMessage);
    }

    /**
     * Constructs a new {@code MoeraNodeApiNotFoundException} with the provided {@link Result} object.
     *
     * @param result the {@code Result} object containing an error code and message, may be {@code null}
     */
    public MoeraNodeApiNotFoundException(Result result) {
        super(404, result);
    }

    /**
     * Constructs a new {@code MoeraNodeApiNotFoundException} with the provided response body.
     *
     * @param body the response body containing a serialized {@link Result} object, may be {@code null}
     */
    public MoeraNodeApiNotFoundException(String body) {
        super(404, parseResult(body));
    }

    protected static Result parseResult(String body) {
        Result result = MoeraNodeApiException.parseResult(body);
        if (result != null) {
            return result;
        }
        return body != null ? new Result("", body) : null;
    }

}
