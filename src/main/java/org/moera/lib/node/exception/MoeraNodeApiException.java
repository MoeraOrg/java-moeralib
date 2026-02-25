package org.moera.lib.node.exception;

import org.moera.lib.node.types.Result;
import org.moera.lib.util.LogUtil;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

/**
 * Represents an exception thrown when an error occurs while interacting with the Moera Node API.
 * This exception is specifically used for API-related errors, including issues with request validation,
 * missing objects, or failed operations, as indicated by the HTTP status codes.
 * <p>
 * The exception provides additional context about the error, including the status code and optional error
 * code details.
 */
public class MoeraNodeApiException extends MoeraNodeException {

    protected int status;
    protected String errorCode;

    /**
     * Constructs a {@code MoeraNodeApiException} with the specified detail message.
     *
     * @param message the detail message
     */
    protected MoeraNodeApiException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code MoeraNodeApiException} with the specified status code, error code, and error message.
     *
     * @param status the HTTP status code
     * @param errorCode the specific error code returned by the API, may be {@code null}
     * @param errorMessage the detailed error message returned by the API, may be {@code null}
     */
    public MoeraNodeApiException(int status, String errorCode, String errorMessage) {
        super(
            getErrorTypeMessage(status)
            + ": (%s %s)".formatted(LogUtil.format(errorCode), LogUtil.format(errorMessage))
        );
        this.status = status;
        this.errorCode = errorCode;
    }

    /**
     * Constructs a new {@code MoeraNodeApiException} based on the provided status and result.
     * This constructor allows creating an exception using an HTTP status and a {@link Result} object,
     * which contains an error code and message.
     *
     * @param status the HTTP status code
     * @param result the {@code Result} object containing an error code and message, may be {@code null}
     */
    public MoeraNodeApiException(int status, Result result) {
        this(status, result != null ? result.getErrorCode(): null, result != null ? result.getMessage() : null);
    }

    /**
     * Constructs a new {@code MoeraNodeApiException} with the specified HTTP status code
     * and the response body that may contain additional error details.
     *
     * @param status the HTTP status code associated with the error
     * @param body the response body that may contain a {@link Result} object in serialized format
     */
    public MoeraNodeApiException(int status, String body) {
        this(status, parseResult(body));
    }

    private static String getErrorTypeMessage(int status) {
        return switch (status) {
            case 400 -> "Validation failed";
            case 404 -> "Object not found";
            case 409 -> "Operation failed";
            default -> "Error status returned: %d".formatted(status);
        };
    }

    /**
     * Parses the given string representation of a JSON response body into a {@link Result} object.
     *
     * @param body the response body in JSON format, may be {@code null}
     * @return a {@link Result} object if the parsing succeeds, or {@code null} if the body is {@code null}
     *         or an error occurs during deserialization
     */
    protected static Result parseResult(String body) {
        if (body == null) {
            return null;
        }

        try {
            return new ObjectMapper().readValue(body, Result.class);
        } catch (JacksonException e) {
            return null;
        }
    }

    /**
     * Retrieves the HTTP status code associated with this exception.
     *
     * @return the HTTP status code
     */
    public int getStatus() {
        return status;
    }

    /**
     * Retrieves the specific error code associated with this exception.
     *
     * @return the error code, or {@code null} if no error code is set
     */
    public String getErrorCode() {
        return errorCode;
    }

}
