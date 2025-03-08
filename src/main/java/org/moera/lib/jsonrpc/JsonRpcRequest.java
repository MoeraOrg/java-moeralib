package org.moera.lib.jsonrpc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Represents a JSON-RPC 2.0 request as specified by the JSON-RPC protocol.
 * This class contains the structure required for a compliant JSON-RPC request.
 * <p>
 * JSON-RPC is a lightweight remote procedure call protocol encoded in JSON.
 * Each request includes a method name, optional parameters, and an identifier
 * that allows for asynchronous processing of requests.
 * <p>
 * The {@code JsonRpcRequest} class supports setting and retrieving the following properties:
 * <p>
 * - {@code jsonrpc}: Specifies the JSON-RPC protocol version (hardcoded to "2.0").<br>
 * - {@code method}: Specifies the method to be invoked on the remote server.<br>
 * - {@code params}: Provides the parameters to be passed to the method (if applicable).<br>
 * - {@code id}: Identifies the request to match it with a corresponding response.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonRpcRequest {

    private final String jsonrpc = "2.0";
    private String method;
    private JsonNode params;
    private Object id;

    /**
     * Retrieves the JSON-RPC protocol version used in the request.
     *
     * @return the JSON-RPC protocol version as a string, always "2.0".
     */
    public String getJsonrpc() {
        return jsonrpc;
    }

    /**
     * Retrieves the name of the method to be invoked in the JSON-RPC request.
     *
     * @return the method name as a string, which represents the procedure to be executed on the server.
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the name of the JSON-RPC method to be invoked in the request.
     * The method name must correspond to a valid procedure on the JSON-RPC server.
     *
     * @param method the name of the method to be invoked. It cannot be {@code null} or empty
     *               and should adhere to the JSON-RPC protocol specifications.
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * Retrieves the parameters associated with the JSON-RPC request.
     *
     * @return the parameters of the request as a {@link JsonNode}, or {@code null} if no parameters are set.
     */
    public JsonNode getParams() {
        return params;
    }

    /**
     * Sets the parameters to be passed to the remote method in a JSON-RPC request.
     *
     * @param params the parameters to be sent with the JSON-RPC request.
     *               This is expected to be a JSON structure represented by a {@link JsonNode}.
     */
    public void setParams(JsonNode params) {
        this.params = params;
    }

    /**
     * Retrieves the identifier of the JSON-RPC request.
     *
     * @return an {@code Object} representing the identifier of the request.
     *         The identifier is used to match the request with its corresponding response.
     */
    public Object getId() {
        return id;
    }

    /**
     * Sets the identifier for this JSON-RPC request.
     *
     * @param id the identifier to associate with this request.
     *           It can be used to match the request with its corresponding response.
     */
    public void setId(Object id) {
        this.id = id;
    }

}
