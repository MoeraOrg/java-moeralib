package org.moera.lib.jsonrpc;

/**
 * Represents a successful JSON-RPC response that contains a result.
 * This class extends {@link JsonRpcResponse} and includes the result field
 * for returning the successful output of a JSON-RPC operation.
 */
public class JsonRpcResultResponse extends JsonRpcResponse {

    private Object result;

    /**
     * Default constructor for creating an empty instance of {@code JsonRpcResultResponse}.
     */
    public JsonRpcResultResponse() {
    }

    /**
     * Constructs a {@code JsonRpcResultResponse} object with the specified ID and result.
     *
     * @param id the identifier for the JSON-RPC request associated with this response.
     *           This parameter matches the ID of the request for which the response is
     *           being generated.
     * @param result the result value of the JSON-RPC response. It represents the output
     *               of the operation performed and can be of any type. If the request
     *               was successful, this parameter contains the result value.
     */
    public JsonRpcResultResponse(Object id, Object result) {
        super(id);
        this.result = result;
    }

    /**
     * Retrieves the result of the JSON-RPC response.
     *
     * @return the result object of the response.
     */
    public Object getResult() {
        return result;
    }

    /**
     * Sets the result object for the JSON-RPC response.
     *
     * @param result the result of the JSON-RPC operation, which can be any object.
     */
    public void setResult(Object result) {
        this.result = result;
    }

}
