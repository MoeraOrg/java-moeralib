package org.moera.lib.pushrelay;

import java.util.function.Function;

import org.moera.lib.jsonrpc.JsonRpcApiException;
import org.moera.lib.jsonrpc.JsonRpcClient;
import org.moera.lib.jsonrpc.JsonRpcConnectionException;
import org.moera.lib.jsonrpc.JsonRpcException;
import org.moera.lib.jsonrpc.JsonRpcRequest;
import org.moera.lib.jsonrpc.JsonRpcResponse;
import org.moera.lib.node.types.StoryInfo;

public class PushRelay extends JsonRpcClient implements PushRelayApi {

    public PushRelay(String url) {
        super(url);
    }

    public PushRelay(Function<JsonRpcRequest, JsonRpcResponse> fetcher) {
        super(fetcher);
    }

    @Override
    protected <T> T fetch(Class<T> result, String method, Object... parameters) {
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
        fetch(Void.class, "register", clientId, nodeName, lang, signedAt, signature);
    }

    @Override
    public void feedStatus(
        String feedName, int notViewed, long notViewedMoment, String nodeName, long signedAt,
        byte[] signature
    ) {
        fetch(Void.class, "feedStatus", feedName, notViewed, notViewedMoment, nodeName, signedAt, signature);
    }

    @Override
    public void storyAdded(StoryInfo story, String nodeName, long signedAt, byte[] signature) {
        fetch(Void.class, "storyAdded", story, nodeName, signedAt, signature);
    }

    @Override
    public void storyDeleted(String storyId, String nodeName, long signedAt, byte[] signature) {
        fetch(Void.class, "storyDeleted", storyId, nodeName, signedAt, signature);
    }

}
