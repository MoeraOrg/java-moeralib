package org.moera.lib.jsonrpc;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Abstract base class representing a JSON-RPC response object following the JSON-RPC 2.0 specification.
 * This class encapsulates the common attributes such as the protocol version and ID associated with the request.
 * <p>
 * A JSON-RPC response can either be a {@link JsonRpcResultResponse} returning a successful result or
 * a {@link JsonRpcErrorResponse} containing error information to indicate a failure.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
    @JsonSubTypes.Type(JsonRpcResultResponse.class),
    @JsonSubTypes.Type(JsonRpcErrorResponse.class)
})
public abstract class JsonRpcResponse {

    private final String jsonrpc = "2.0";
    private Object id;

    /**
     * Default constructor for creating an empty instance of {@code JsonRpcResponse}.
     */
    public JsonRpcResponse() {
    }

    /**
     * Constructs a {@code JsonRpcResponse} object with the specified ID.
     *
     * @param id the identifier for the JSON-RPC request associated with this response.
     *           This parameter matches the ID of the request for which the response is
     *           being generated.
     */
    public JsonRpcResponse(Object id) {
        this.id = id;
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
