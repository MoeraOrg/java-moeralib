package org.moera.lib.naming;

import java.util.List;
import java.util.UUID;

import org.moera.lib.naming.types.OperationStatusInfo;
import org.moera.lib.naming.types.RegisteredNameInfo;
import org.moera.lib.naming.types.SigningKeyInfo;

public interface NamingApi {

    UUID put(
        String name,
        int generation,
        byte[] updatingKey,
        String nodeUri,
        byte[] signingKey,
        Long validFrom,
        byte[] previousDigest,
        byte[] signature
    );

    OperationStatusInfo getStatus(UUID operationId);

    RegisteredNameInfo getCurrent(String name, int generation);

    RegisteredNameInfo getPast(String name, int generation, long at);

    boolean isFree(String name, int generation);

    List<SigningKeyInfo> getAllKeys(String name, int generation);

    RegisteredNameInfo getSimilar(String name);

    List<RegisteredNameInfo> getAll(long at, int page, int size);

    List<RegisteredNameInfo> getAllNewer(long at, int page, int size);

}
