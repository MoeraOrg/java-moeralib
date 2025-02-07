package org.moera.lib.naming;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.moera.lib.jsonrpc.JsonRpcRequest;
import org.moera.lib.jsonrpc.JsonRpcResponse;
import org.moera.lib.naming.types.OperationStatusInfo;
import org.moera.lib.naming.types.RegisteredNameInfo;
import org.moera.lib.naming.types.SigningKeyInfo;

public class MoeraNaming implements NamingApi {

    public static final String MAIN_NAMING_SERVER = "https://naming.moera.org/moera-naming";
    public static final String DEV_NAMING_SERVER = "https://naming-dev.moera.org/moera-naming";

    private final Function<JsonRpcRequest, JsonRpcResponse> fetcher;
    private final AtomicInteger id = new AtomicInteger(0);
    private final ObjectMapper objectMapper = new ObjectMapper();

    public MoeraNaming() {
        this(MAIN_NAMING_SERVER);
    }

    public MoeraNaming(String url) {
        this(new OkHttpFetcher(url));
    }

    public MoeraNaming(Function<JsonRpcRequest, JsonRpcResponse> fetcher) {
        this.fetcher = fetcher;
    }

    private <T> T fetch(Class<T> result, String method, Object... parameters) {
        JsonRpcRequest request = new JsonRpcRequest();
        request.setId(id.incrementAndGet());
        request.setMethod(method);
        request.setParams(objectMapper.valueToTree(parameters));
        JsonRpcResponse response = fetcher.apply(request);
        if (response.getError() != null) {
            throw new MoeraNamingApiException(response.getError());
        }
        return objectMapper.convertValue(response.getResult(), result);
    }

    @Override
    public UUID put(
        String name,
        int generation,
        byte[] updatingKey,
        String nodeUri,
        byte[] signingKey,
        Long validFrom,
        byte[] previousDigest,
        byte[] signature
    ) {
        return fetch(
            UUID.class, "put",
            name, generation, updatingKey, nodeUri, signingKey, validFrom, previousDigest, signature
        );
    }

    @Override
    public OperationStatusInfo getStatus(UUID operationId) {
        return fetch(OperationStatusInfo.class, "getStatus", operationId);
    }

    @Override
    public RegisteredNameInfo getCurrent(String name, int generation) {
        return fetch(RegisteredNameInfo.class, "getCurrent", name, generation);
    }

    @Override
    public RegisteredNameInfo getPast(String name, int generation, long at) {
        return fetch(RegisteredNameInfo.class, "getPast", name, generation, at);
    }

    @Override
    public boolean isFree(String name, int generation) {
        return fetch(Boolean.class, "isFree", name, generation);
    }

    @Override
    public List<SigningKeyInfo> getAllKeys(String name, int generation) {
        return fetch(List.class, "getAllKeys", name, generation);
    }

    @Override
    public RegisteredNameInfo getSimilar(String name) {
        return fetch(RegisteredNameInfo.class, "getSimilar", name);
    }

    @Override
    public List<RegisteredNameInfo> getAll(long at, int page, int size) {
        return fetch(List.class, "getAll", at, page, size);
    }

    @Override
    public List<RegisteredNameInfo> getAllNewer(long at, int page, int size) {
        return fetch(List.class, "getAllNewer", at, page, size);
    }

}
