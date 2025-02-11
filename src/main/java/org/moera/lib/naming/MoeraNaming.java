package org.moera.lib.naming;

import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.moera.lib.jsonrpc.JsonRpcClient;
import org.moera.lib.jsonrpc.JsonRpcApiException;
import org.moera.lib.jsonrpc.JsonRpcConnectionException;
import org.moera.lib.jsonrpc.JsonRpcException;
import org.moera.lib.jsonrpc.JsonRpcRequest;
import org.moera.lib.jsonrpc.JsonRpcResponse;
import org.moera.lib.naming.types.OperationStatusInfo;
import org.moera.lib.naming.types.RegisteredNameInfo;
import org.moera.lib.naming.types.SigningKeyInfo;

public class MoeraNaming extends JsonRpcClient implements NamingApi {

    public static final String MAIN_NAMING_SERVER = "https://naming.moera.org/moera-naming";
    public static final String DEV_NAMING_SERVER = "https://naming-dev.moera.org/moera-naming";

    public MoeraNaming() {
        this(MAIN_NAMING_SERVER);
    }

    public MoeraNaming(String server) {
        super(server);
    }

    public MoeraNaming(Function<JsonRpcRequest, JsonRpcResponse> fetcher) {
        super(fetcher);
    }

    public static String resolve(String name) {
        return resolve(name, MAIN_NAMING_SERVER);
    }

    public static String resolve(String name, String namingServer) {
        NodeName nodeName = NodeName.parse(name);
        MoeraNaming naming = new MoeraNaming(namingServer);
        RegisteredNameInfo nameInfo = naming.getCurrent(nodeName.getName(), nodeName.getGeneration());
        return nameInfo != null ? nameInfo.getNodeUri() : null;
    }

    @Override
    protected <T> T fetch(Class<T> result, String method, Object... parameters) {
        try {
            return super.fetch(result, method, parameters);
        } catch (JsonRpcException e) {
            throw new MoeraNamingException(e.getMessage());
        } catch (JsonRpcConnectionException e) {
            throw new MoeraNamingConnectionException(e.getMessage());
        } catch (JsonRpcApiException e) {
            throw new MoeraNamingApiException(e.getRpcError());
        }
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
    @SuppressWarnings("unchecked")
    public List<SigningKeyInfo> getAllKeys(String name, int generation) {
        return fetch(List.class, "getAllKeys", name, generation);
    }

    @Override
    public RegisteredNameInfo getSimilar(String name) {
        return fetch(RegisteredNameInfo.class, "getSimilar", name);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<RegisteredNameInfo> getAll(long at, int page, int size) {
        return fetch(List.class, "getAll", at, page, size);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<RegisteredNameInfo> getAllNewer(long at, int page, int size) {
        return fetch(List.class, "getAllNewer", at, page, size);
    }

}
