package org.moera.lib.jsonrpc;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.naming.NamingError;

/**
 * Represents a JSON-RPC response object following the JSON-RPC 2.0 specification.
 * This class encapsulates the response attributes such as the protocol version,
 * result, error, and ID associated with the request.
 * <p>
 * The `JsonRpcResponse` object can either return a successful result or
 * contain error information to indicate a failure.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonRpcResponse {

    private final String jsonrpc = "2.0";
    private Object result;
    private JsonRpcError error;
    private Object id;

    /**
     * Default constructor for creating an empty instance of {@code JsonRpcResponse}.
     */
    public JsonRpcResponse() {
    }

    /**
     * Constructs a {@code JsonRpcResponse} object with the specified ID and result.
     *
     * @param id the identifier for the JSON-RPC request associated with this response.
     *           This parameter matches the ID of the request for which the response is
     *           being generated.
     * @param result the result value of the JSON-RPC response. It represents the output
     *               of the operation performed and can be of any type. If the request
     *               was successful, this parameter contains the result value.
     */
    public JsonRpcResponse(Object id, Object result) {
        this.id = id;
        this.result = result;
    }

    /**
     * Constructs a JSON-RPC response object with the specified ID and error details.
     *
     * @param id the unique identifier of the JSON-RPC request to which this response corresponds.
     *           It can be any object type, depending on the client's implementation.
     * @param error the {@link JsonRpcError} containing error code and message. This represents
     *              the error details in the response when the request has failed.
     */
    public JsonRpcResponse(Object id, JsonRpcError error) {
        this.id = id;
        this.error = error;
    }

    /**
     * Constructs a new {@code JsonRpcResponse} object with the specified request ID and a {@link NamingError}.
     *
     * @param id the identifier of the JSON-RPC request, used to match this response to the request
     * @param error the {@link NamingError} associated with this response, providing details about the error
     */
    public JsonRpcResponse(Object id, NamingError error) {
        this.id = id;
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
    public JsonRpcResponse(Object id, int code, String message) {
        this.id = id;
        this.error = new JsonRpcError(code, message);
    }

    /**
     * Retrieves the JSON-RPC protocol version used in this response.
     *
     * @return the JSON-RPC protocol version as a {@code String}. Typically, this will return "2.0".
     */
    public String getJsonrpc() {
        return jsonrpc;
    }

    /**
     * Retrieves the result of the JSON-RPC response.
     *
     * @return the result object of the response, or {@code null} if no result is returned or
     *         the response contains an error.
     */
    public Object getResult() {
        return result;
    }

    /**
     * Sets the result object for the JSON-RPC response.
     *
     * @param result the result of the JSON-RPC operation, which can be any object or {@code null}
     *               depending on the success or failure of the corresponding request.
     */
    public void setResult(Object result) {
        this.result = result;
    }

    /**
     * Retrieves the error associated with the JSON-RPC response.
     *
     * @return the {@link JsonRpcError} object representing the error details,
     * or {@code null} if the response does not contain an error.
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

    /**
     * Retrieves the identifier associated with the JSON-RPC response.
     * The identifier is used to correlate the response with the original request.
     *
     * @return the ID of the response. It can be any object type, including {@code null} if no
     *         identifier was assigned.
     */
    public Object getId() {
        return id;
    }

    /**
     * Sets the ID of the JSON-RPC response. The ID is used to correlate requests
     * and responses in JSON-RPC communication.
     *
     * @param id the ID to be associated with the response. It can be of any object type.
     */
    public void setId(Object id) {
        this.id = id;
    }

}
