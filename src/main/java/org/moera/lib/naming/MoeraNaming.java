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

/**
 * {@code MoeraNaming} is a client for interfacing with the Moera Naming Service.
 * It extends {@link JsonRpcClient} to perform JSON-RPC based calls to the naming service,
 * and implements {@link NamingApi} to provide specific operations related to name resolution
 * and management on the Moera Naming Service.
 */
public class MoeraNaming extends JsonRpcClient implements NamingApi {

    /**
     * The default URL of the main Moera naming server used for resolving and interacting
     * with names in the Moera Naming system. This constant represents the primary
     * endpoint for the naming server, which is used when no alternative server URL
     * is specified.
     */
    public static final String MAIN_NAMING_SERVER = "https://naming.moera.org/moera-naming";

    /**
     * The URL of the development naming server. This server is used for testing and development purposes.
     */
    public static final String DEV_NAMING_SERVER = "https://naming-dev.moera.org/moera-naming";

    /**
     * Constructs a new instance of the {@code MoeraNaming} class using the default naming server
     * ({@link #MAIN_NAMING_SERVER}).
     */
    public MoeraNaming() {
        this(MAIN_NAMING_SERVER);
    }

    /**
     * Constructs a new instance of the {@code MoeraNaming} class and initializes it with
     * the specified naming server.
     *
     * @param server the URL of the naming server to be used. It must be a valid HTTP or HTTPS URL.
     */
    public MoeraNaming(String server) {
        super(server);
    }

    /**
     * Constructs a new instance of the {@code MoeraNaming} class using the provided fetcher function.
     *
     * @param fetcher a {@link Function} that takes a {@link JsonRpcRequest} as input and
     *                returns a corresponding {@link JsonRpcResponse} as output. This function
     *                is responsible for handling the communication with the naming server.
     */
    public MoeraNaming(Function<JsonRpcRequest, JsonRpcResponse> fetcher) {
        super(fetcher);
    }

    /**
     * Resolves the specified name using the default naming server.
     *
     * @param name the name to be resolved. It should be a valid Moera node name.
     * @return the resolved node URI if the specified name exists, or {@code null} if no record is found.
     */
    public static String resolve(String name) {
        return resolve(name, MAIN_NAMING_SERVER);
    }

    /**
     * Resolves the given name using the specified naming server.
     *
     * @param name the name to be resolved. It should be a valid Moera node name.
     * @param namingServer the URL of the naming server to be used for name resolution
     * @return the node URI associated with the resolved name if it exists, or {@code null} if no record is found.
     */
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
