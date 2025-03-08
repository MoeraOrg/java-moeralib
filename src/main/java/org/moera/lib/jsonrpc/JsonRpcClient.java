package org.moera.lib.jsonrpc;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Represents a JSON-RPC client capable of sending requests to a server and retrieving responses.
 * It supports handling of JSON-RPC 2.0 requests and responses.
 * <p>
 * This class is thread-safe.
 */
public class JsonRpcClient {

    private final Function<JsonRpcRequest, JsonRpcResponse> fetcher;
    private final AtomicInteger id = new AtomicInteger(0);
    private final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Constructs a new {@code JsonRpcClient} instance and initializes it with
     * the specified server URL. This constructor creates an {@link OkHttpFetcher}
     * for handling the communication with the JSON-RPC server.
     *
     * @param url the URL of the JSON-RPC server to connect to.
     *            It must be a valid HTTP or HTTPS URL.
     */
    public JsonRpcClient(String url) {
        this(new OkHttpFetcher(url));
    }

    /**
     * Constructs a new instance of {@code JsonRpcClient} with the specified fetcher function,
     * which handles sending JSON-RPC requests and receiving responses.
     *
     * @param fetcher a function that takes a {@link JsonRpcRequest} as input and returns a {@link JsonRpcResponse}.
     *                This function is responsible for communicating with the JSON-RPC server.
     */
    public JsonRpcClient(Function<JsonRpcRequest, JsonRpcResponse> fetcher) {
        this.fetcher = fetcher;
    }

    protected <T> T fetch(Class<T> result, String method, Object... parameters) {
        JsonRpcRequest request = new JsonRpcRequest();
        request.setId(id.incrementAndGet());
        request.setMethod(method);
        request.setParams(objectMapper.valueToTree(parameters));
        JsonRpcResponse response = fetcher.apply(request);
        if (response.getError() != null) {
            throw new JsonRpcApiException(response.getError());
        }
        if (result != null && result != Void.class) {
            return objectMapper.convertValue(response.getResult(), result);
        } else {
            return null;
        }
    }

}
