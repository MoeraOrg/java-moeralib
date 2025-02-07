package org.moera.lib.jsonrpc;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.moera.lib.naming.OkHttpFetcher;

public class JsonRpcClient {

    private final Function<JsonRpcRequest, JsonRpcResponse> fetcher;
    private final AtomicInteger id = new AtomicInteger(0);
    private final ObjectMapper objectMapper = new ObjectMapper();

    public JsonRpcClient(String url) {
        this(new OkHttpFetcher(url));
    }

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
            throw new JsonRpcException(response.getError());
        }
        return objectMapper.convertValue(response.getResult(), result);
    }

}
