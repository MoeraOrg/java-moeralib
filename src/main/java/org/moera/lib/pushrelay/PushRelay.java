package org.moera.lib.pushrelay;

import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;
import org.moera.lib.jsonrpc.JsonRpcApiException;
import org.moera.lib.jsonrpc.JsonRpcClient;
import org.moera.lib.jsonrpc.JsonRpcConnectionException;
import org.moera.lib.jsonrpc.JsonRpcException;
import org.moera.lib.jsonrpc.JsonRpcRequest;
import org.moera.lib.jsonrpc.JsonRpcResponse;
import org.moera.lib.node.types.StoryInfo;

/**
 * The {@code PushRelay} class provides an implementation of the {@link PushRelayApi} interface
 * to interact with the Moera Push Relay API. It extends the {@link JsonRpcClient} class to
 * handle JSON-RPC interactions with relays and sending push notifications.
 */
public class PushRelay extends JsonRpcClient implements PushRelayApi {

    /**
     * Constructs a new {@code PushRelay} instance and initializes it with
     * the specified Push Relay server URL.
     *
     * @param url the URL of the Push Relay server to connect to.
     *            It must be a valid HTTP or HTTPS URL.
     */
    public PushRelay(String url) {
        super(url);
    }

    /**
     * Constructs a new {@code PushRelay} instance using a custom fetcher function
     * to handle JSON-RPC requests and responses.
     *
     * @param fetcher a {@code Function} that takes a {@link JsonRpcRequest} and returns a
     *                {@link JsonRpcResponse}. This function serves as a custom handler
     *                for executing JSON-RPC interactions.
     */
    public PushRelay(Function<JsonRpcRequest, JsonRpcResponse> fetcher) {
        super(fetcher);
    }

    @Override
    protected <T> T fetch(TypeReference<T> result, String method, Object... parameters) {
        try {
            return super.fetch(result, method, parameters);
        } catch (JsonRpcException e) {
            throw new PushRelayException(e.getMessage());
        } catch (JsonRpcConnectionException e) {
            throw new PushRelayConnectionException(e.getMessage());
        } catch (JsonRpcApiException e) {
            throw new PushRelayApiException(e.getRpcError());
        }
    }

    @Override
    public void register(String clientId, String nodeName, String lang, long signedAt, byte[] signature) {
        fetch(null, "register", clientId, nodeName, lang, signedAt, signature);
    }

    @Override
    public void feedStatus(
        String feedName, int notViewed, long notViewedMoment, String nodeName, long signedAt,
        byte[] signature
    ) {
        fetch(null, "feedStatus", feedName, notViewed, notViewedMoment, nodeName, signedAt, signature);
    }

    @Override
    public void storyAdded(StoryInfo story, String nodeName, long signedAt, byte[] signature) {
        fetch(null, "storyAdded", story, nodeName, signedAt, signature);
    }

    @Override
    public void storyDeleted(String storyId, String nodeName, long signedAt, byte[] signature) {
        fetch(null, "storyDeleted", storyId, nodeName, signedAt, signature);
    }

}
