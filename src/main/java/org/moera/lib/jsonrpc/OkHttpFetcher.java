package org.moera.lib.jsonrpc;

import java.io.IOException;
import java.util.function.Function;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

/**
 * This class is responsible for fetching responses from a remote JSON-RPC server using the OkHttp client.
 */
public class OkHttpFetcher implements Function<JsonRpcRequest, JsonRpcResponse> {

    private static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json");

    private final String url;

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final OkHttpClient client = new OkHttpClient();

    /**
     * Constructs an instance of {@code OkHttpFetcher} with the specified URL.
     *
     * @param url the URL of the JSON-RPC server. It must be a valid HTTP or HTTPS URL
     *            and is used as the endpoint for all outgoing requests.
     */
    public OkHttpFetcher(String url) {
        this.url = url;
    }

    /**
     * Processes a JSON-RPC request and fetches the corresponding JSON-RPC response from a remote server.
     * The method uses the OkHttp client to send the request and parse the response.
     *
     * @param jsonRpcRequest the JSON-RPC request to be sent to the remote server
     * @return the JSON-RPC response received from the server
     * @throws JsonRpcException if the response cannot be parsed
     * @throws JsonRpcConnectionException if a network error occurs during the request execution
     */
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
                try {
                    return objectMapper.readValue(response.body().string(), JsonRpcResponse.class);
                } catch (JacksonException e) {
                    throw new JsonRpcException("Error parsing JSON", e);
                }
            } catch (IOException e) {
                throw new JsonRpcConnectionException("Request failed", e);
            }
        } catch (JacksonException e) {
            throw new JsonRpcException("Error converting to JSON", e);
        }
    }

}
