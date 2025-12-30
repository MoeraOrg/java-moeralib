package org.moera.lib.jsonrpc;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Represents a JSON-RPC client capable of sending requests to a server and retrieving responses.
 * It supports the handling of JSON-RPC 2.0 requests and responses.
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

    /**
     * Performs a JSON-RPC call to invoke a method on a remote server. Constructs a JSON-RPC request,
     * sends it using the pre-configured fetcher, and processes the response. If the response contains
     * an error, it throws a {@link JsonRpcApiException}. If the response is successful, the result
     * is converted to the specified type and returned.
     *
     * @param <T> the type of the result object expected from the remote method
     * @param result the class type of the result object. If the expected result is {@code null} or the remote method
     *               does not return a value, the method will return {@code null}.
     * @param method the name of the remote method to invoke
     * @param parameters the parameters to pass to the remote method
     * @return the result of the remote method call, converted to the specified type, or {@code null} if
     *         the remote method does not return a value
     * @throws JsonRpcApiException if the method call returned an error
     */
    protected <T> T fetch(TypeReference<T> result, String method, Object... parameters) {
        JsonRpcRequest request = new JsonRpcRequest();
        request.setId(id.incrementAndGet());
        request.setMethod(method);
        request.setParams(objectMapper.valueToTree(parameters));
        return convertResponse(result, fetcher.apply(request));
    }

    /**
     * Performs a JSON-RPC call to invoke a method on a remote server. Constructs a JSON-RPC request,
     * sends it using the pre-configured fetcher, and processes the response. If the response contains
     * an error, it throws a {@link JsonRpcApiException}. If the response is successful, the result
     * is converted to the specified type and returned.
     *
     * @param <T> the type of the result object expected from the remote method
     * @param result the class type of the result object. If the expected result is {@code null} or the remote method
     *               does not return a value, the method will return {@code null}.
     * @param method the name of the remote method to invoke
     * @param parameters the parameters to pass to the remote method
     * @return the result of the remote method call, converted to the specified type, or {@code null} if
     *         the remote method does not return a value
     * @throws JsonRpcApiException if the method call returned an error
     */
    protected <T> T fetch(TypeReference<T> result, String method, Map<String, Object> parameters) {
        JsonRpcRequest request = new JsonRpcRequest();
        request.setId(id.incrementAndGet());
        request.setMethod(method);
        request.setParams(objectMapper.valueToTree(parameters));
        return convertResponse(result, fetcher.apply(request));
    }

    private <T> T convertResponse(TypeReference<T> result, JsonRpcResponse response) {
        if (response instanceof JsonRpcErrorResponse err) {
            throw new JsonRpcApiException(err.getError());
        }
        assert response instanceof JsonRpcResultResponse;
        if (result != null) {
            return objectMapper.convertValue(((JsonRpcResultResponse) response).getResult(), result);
        } else {
            return null;
        }
    }

}
