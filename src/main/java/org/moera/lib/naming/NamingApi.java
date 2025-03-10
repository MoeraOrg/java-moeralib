package org.moera.lib.naming;

import java.util.List;
import java.util.UUID;

import org.moera.lib.naming.types.OperationStatusInfo;
import org.moera.lib.naming.types.RegisteredNameInfo;
import org.moera.lib.naming.types.SigningKeyInfo;

/**
 * The {@code NamingApi} interface provides prototypes of Moera Naming API calls.
 */
public interface NamingApi {

    /**
     * Registers or updates the given name in the Moera Naming Service.
     * See Architecture Overview for the <a href="https://moera.org/overview/naming.html">detailed description</a>
     * of the algorithm.
     *
     * @param name the name to be registered or updated. Required.
     * @param generation the generation of the name. Required.
     * @param updatingKey the public key for verifying signatures of further updates of the name.
     *                   May be {@code null} – the current key is preserved in this case.
     * @param nodeUri URI of the REST API endpoint of the node to which the name is assigned.
     *               May be {@code null} – the current URI is preserved in this case.
     * @param signingKey the public signing key of the name owner.
     *                  May be {@code null} – the current key is preserved in this case.
     * @param validFrom the moment in time (in epoch seconds) the owner's key is valid from.
     *                 May be {@code null}, if {@code signingKey} is also {@code null}.
     * @param previousDigest the unique identifier as reported by a naming server of the current state of the name.
     *                      Used to detect the situations when the name was changed by someone else between sending
     *                      the request and processing it. May be {@code null}, if the name was never registered before.
     * @param signature the signature, if required, {@code null} otherwise.
     * @return the unique operation ID, which can be used to track the status of the operation
     */
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

    /**
     * Retrieves the status of the operation based on the provided operation ID.
     *
     * @param operationId the unique identifier of the operation
     * @return an {@link OperationStatusInfo} object containing details about the operation's status,
     *         or {@code null} if the operation ID is unknown
     */
    OperationStatusInfo getStatus(UUID operationId);

    /**
     * Retrieves the current state of a registered name based on the specified name and generation.
     *
     * @param name the name for which the current state is to be retrieved
     * @param generation the generation of the name for which the current state is required
     * @return a {@link RegisteredNameInfo} object containing the current state information of the registered name,
     *         or {@code null} if the name with the specified generation is not found.
     */
    RegisteredNameInfo getCurrent(String name, int generation);

    /**
     * Retrieves historical information about a registered name at a specific point in time.
     *
     * @param name the name to retrieve information for
     * @param generation the generation of the name to retrieve information for
     * @param at the specific timestamp (in epoch seconds) for which the historical information is requested
     * @return a {@link RegisteredNameInfo} object containing details about the registered name at the specified time,
     *         or {@code null} if no matching information is found.
     */
    RegisteredNameInfo getPast(String name, int generation, long at);

    /**
     * Checks whether a given name is free for registration in the naming service.
     *
     * @param name the name to be checked for availability
     * @param generation the generation of the name to check
     * @return {@code true} if the name is free for the specified generation, {@code false} otherwise
     */
    boolean isFree(String name, int generation);

    /**
     * Retrieves all signing keys associated with the specified name and generation.
     *
     * @param name the name for which the signing keys are to be retrieved
     * @param generation the generation of the name
     * @return a list of {@link SigningKeyInfo} objects containing signing keys and their validity periods
     */
    List<SigningKeyInfo> getAllKeys(String name, int generation);

    /**
     * Retrieves a {@link RegisteredNameInfo} object that represents a name similar to the specified name.
     * This may be useful for obtaining details of a name that closely resembles the one provided.
     *
     * @param name the name to search for a similar registered name
     * @return an instance of {@link RegisteredNameInfo} containing details of a similar registered name,
     *         or {@code null} if no similar name is found.
     */
    RegisteredNameInfo getSimilar(String name);

    /**
     * Retrieves a paginated list of all registered names up to a specific moment in time.
     *
     * @param at the timestamp (in epoch seconds) up to which the registered names are returned
     * @param page the page number of the results (starting from 0)
     * @param size the number of entries per page
     * @return a list of {@link RegisteredNameInfo} containing details of the registered names
     */
    List<RegisteredNameInfo> getAll(long at, int page, int size);

    /**
     * Retrieves a list of registered names that were created or updated after the specified timestamp.
     * The results are paginated based on the provided page number and size.
     *
     * @param at the timestamp (in epoch seconds) to filter names that are newer
     * @param page the page number of the results (starting from 0)
     * @param size the number of entries per page
     * @return a list of {@link RegisteredNameInfo} objects representing the names
     *         that match the criteria, or an empty list if no such names exist
     */
    List<RegisteredNameInfo> getAllNewer(long at, int page, int size);

}
