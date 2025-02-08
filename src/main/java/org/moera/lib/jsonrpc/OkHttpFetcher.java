package org.moera.lib.jsonrpc;

import java.io.IOException;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpFetcher implements Function<JsonRpcRequest, JsonRpcResponse> {

    private static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json");

    private final String url;

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final OkHttpClient client = new OkHttpClient();

    public OkHttpFetcher(String url) {
        this.url = url;
    }

    @Override
    public JsonRpcResponse apply(JsonRpcRequest jsonRpcRequest) {
        assert MEDIA_TYPE_JSON != null;

        try {
            String body = objectMapper.writeValueAsString(jsonRpcRequest);
            Request request = new Request.Builder()
                .url(url)
                .method("POST", RequestBody.create(body, MEDIA_TYPE_JSON))
                .addHeader("accept", MEDIA_TYPE_JSON.toString())
                .build();
            try (Response response = client.newCall(request).execute()) {
                if (response.body() == null) {
                    throw new JsonRpcException("Request returned an empty result");
                }
                return objectMapper.readValue(response.body().string(), JsonRpcResponse.class);
            } catch (IOException e) {
                throw new JsonRpcConnectionException("Request failed", e);
            }
        } catch (JsonProcessingException e) {
            throw new JsonRpcException("Error converting to JSON", e);
        }
    }

}
