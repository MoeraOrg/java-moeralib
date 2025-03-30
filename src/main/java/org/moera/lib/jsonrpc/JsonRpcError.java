package org.moera.lib.jsonrpc;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents an error object in the JSON-RPC protocol.
 * JSON-RPC defines error objects for various failure scenarios, and this class provides
 * a structured way to define and retrieve error codes and messages based on the protocol.
 * <p>
 * Instances of this class include predefined standard errors, as well as the ability
 * to define custom errors by providing a code and a message.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonRpcError {

    /**
     * Represents a JSON-RPC success indicator with no error.
     */
    public static final JsonRpcError OK = new JsonRpcError(0, "ok");
    /**
     * Represents the JSON-RPC standard error for parsing issues.
     */
    public static final JsonRpcError PARSE_ERROR = new JsonRpcError(-32700, "JSON parse error");
    /**
     * Represents a standard JSON-RPC error indicating that the received request is invalid.
     * This error typically occurs when the JSON sent by the client is not a valid JSON object,
     * or when the provided JSON does not conform to the structure expected by the JSON-RPC protocol.
     */
    public static final JsonRpcError INVALID_REQUEST = new JsonRpcError(-32600, "invalid request");
    /**
     * Represents a JSON-RPC predefined error indicating that the requested method does not exist or is unavailable.
     */
    public static final JsonRpcError METHOD_NOT_FOUND = new JsonRpcError(-32601, "method not found");
    /**
     * Represents a standard JSON-RPC error that occurs when the parameters provided to a JSON-RPC method
     * are invalid or do not meet the method's requirements.
     */
    public static final JsonRpcError METHOD_PARAMS_INVALID = new JsonRpcError(-32602, "method parameters invalid");
    /**
     * Represents a predefined error in the JSON-RPC protocol indicating an internal server error.
     * <p>
     * This error is used as a catch-all for cases where no other specific error codes apply,
     * and is typically returned when an unexpected condition is encountered on the server.
     */
    public static final JsonRpcError INTERNAL_ERROR = new JsonRpcError(-32603, "internal error");
    /**
     * Represents a standard JSON-RPC error indicating that the error
     * encountered during the execution of a request was not specifically handled.
     * This error typically occurs when an unexpected or unhandled issue arises
     * within the server's processing logic.
     * <p>
     * It serves as a generic, non-specific error response in the JSON-RPC protocol
     * when no other predefined error is applicable.
     */
    public static final JsonRpcError ERROR_NOT_HANDLED = new JsonRpcError(-32001, "error not handled");
    /**
     * Represents a standard JSON-RPC error indicating a "bulk error".
     * This error is typically used to signal issues occurring when processing multiple
     * requests or operations in bulk.
     */
    public static final JsonRpcError BULK_ERROR = new JsonRpcError(-32002, "bulk error");
    /**
     * Upper bound for custom server error codes in the JSON-RPC protocol.
     * JSON-RPC allows the definition of custom server error codes within
     * a specific range. This constant represents the upper limit of that range.
     * Custom server error codes must fall between {@link #CUSTOM_SERVER_ERROR_LOWER}
     * and this value.
     */
    public static final int CUSTOM_SERVER_ERROR_UPPER = -32000;
    /**
     * Represents the lower bound for custom-defined server error codes in the JSON-RPC protocol.
     * Error codes in the range from {@code CUSTOM_SERVER_ERROR_LOWER} to {@link #CUSTOM_SERVER_ERROR_UPPER}
     * are reserved for non-standard, application-specific server errors.
     */
    public static final int CUSTOM_SERVER_ERROR_LOWER = -32099;

    private int code;
    private String message;

    /**
     * Creates an instance of {@code JsonRpcError} without specifying an error code or message.
     */
    public JsonRpcError() {
    }

    /**
     * Constructs a new {@code JsonRpcError} instance with the specified error code and message.
     * This class represents an error in the JSON-RPC protocol, where an error response includes
     * a code indicating the error type and a message providing additional details.
     *
     * @param code the error code representing the type of error. It must be an integer and
     *             conform to the JSON-RPC specification or custom-defined codes.
     * @param message the error message providing details about the error. It must be a non-{@code null} and
     *                descriptive string to provide clarity about the nature of the error.
     */
    public JsonRpcError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Retrieves the code associated with the JSON-RPC error.
     *
     * @return an integer representing the error code.
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the code for this JSON-RPC error.
     *
     * @param code the error code representing the type of error. It must be an integer and
     *             conform to the JSON-RPC specification or custom-defined codes.
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Retrieves the message associated with the JSON-RPC error.
     *
     * @return the error message as a string.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message associated with this JSON-RPC error.
     *
     * @param message the error message providing details about the error. It must be a non-{@code null} and
     *                descriptive string to provide clarity about the nature of the error.
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
