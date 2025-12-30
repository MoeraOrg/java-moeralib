package org.moera.lib.jsonrpc;

import org.moera.lib.naming.NamingError;

/**
 * Represents an error JSON-RPC response that contains error information.
 * This class extends {@link JsonRpcResponse} and includes the error field
 * for returning error details when a JSON-RPC operation fails.
 */
public class JsonRpcErrorResponse extends JsonRpcResponse {

    private JsonRpcError error;

    /**
     * Default constructor for creating an empty instance of {@code JsonRpcErrorResponse}.
     */
    public JsonRpcErrorResponse() {
    }

    /**
     * Constructs a JSON-RPC response object with the specified ID and error details.
     *
     * @param id the unique identifier of the JSON-RPC request to which this response corresponds.
     *           It can be any object type, depending on the client's implementation.
     * @param error the {@link JsonRpcError} containing error code and message. This represents
     *              the error details in the response when the request has failed.
     */
    public JsonRpcErrorResponse(Object id, JsonRpcError error) {
        super(id);
        this.error = error;
    }

    /**
     * Constructs a new {@code JsonRpcErrorResponse} object with the specified request ID and a {@link NamingError}.
     *
     * @param id the identifier of the JSON-RPC request, used to match this response to the request
     * @param error the {@link NamingError} associated with this response, providing details about the error
     */
    public JsonRpcErrorResponse(Object id, NamingError error) {
        super(id);
        this.error = new JsonRpcError(error.getRpcCode(), error.getErrorCode() + ": " + error.getMessage());
    }

    /**
     * Constructs a JSON-RPC response with an error.
     * This constructor is used to signify an error response in the JSON-RPC 2.0 format.
     *
     * @param id      the identifier of the JSON-RPC request. It is used to correlate the
     *                response with its corresponding request and can be of any type.
     * @param code    the error code that indicates the type of error. Common codes are
     *                defined in the JSON-RPC specification, or custom codes may be used.
     * @param message the error message providing additional details about the error.
     */
    public JsonRpcErrorResponse(Object id, int code, String message) {
        super(id);
        this.error = new JsonRpcError(code, message);
    }

    /**
     * Retrieves the error associated with the JSON-RPC response.
     *
     * @return the {@link JsonRpcError} object representing the error details.
     */
    public JsonRpcError getError() {
        return error;
    }

    /**
     * Sets the error attribute of the JSON-RPC response.
     *
     * @param error the {@link JsonRpcError} object representing the error details
     *              associated with the response.
     */
    public void setError(JsonRpcError error) {
        this.error = error;
    }

}
