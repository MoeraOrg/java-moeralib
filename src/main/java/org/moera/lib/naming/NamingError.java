package org.moera.lib.naming;

import java.util.Arrays;

import org.moera.lib.Rules;

/**
 * The {@code NamingError} enum represents a collection of error codes related to Moera Naming API operations.
 * Each error includes a unique RPC code, an error code string, and a descriptive message to provide
 * details about the nature of the error.
 */
public enum NamingError {

    /**
     * Represents an error indicating that the provided name is empty.
     */
    NAME_EMPTY(1, "name.empty", "name is empty"),
    /**
     * Represents an error where the provided name exceeds the allowed length.
     */
    NAME_TOO_LONG(2, "name.too-long", "name is too long"),
    /**
     * Represents a rule violation where a name contains forbidden characters.
     */
    NAME_FORBIDDEN_CHARS(3, "name.forbidden-chars", "name contains forbidden characters"),
    /**
     * Represents an error indicating that the length of the provided node URI exceeds the allowed maximum limit.
     */
    NODE_URI_TOO_LONG(4, "node-uri.too-long", "nodeUri is too long"),
    /**
     * Represents an error indicating that the {@code updatingKey}
     * parameter is empty or {@code null} when it is required for a specific operation.
     */
    UPDATING_KEY_EMPTY(5, "updating-key.empty", "updatingKey is empty"),
    /**
     * Represents an error indicating that the provided updating key has an incorrect length.
     */
    UPDATING_KEY_WRONG_LENGTH(6, "updating-key.wrong-length", "updatingKey has wrong length"),
    /**
     * Represents an error indicating that the provided signing key has an incorrect length.
     */
    SIGNING_KEY_WRONG_LENGTH(7, "signing-key.wrong-length", "signingKey has wrong length"),
    /**
     * Represents a validation error indicating that the {@code validFrom} field is empty.
     */
    VALID_FROM_EMPTY(8, "valid-from.empty", "validFrom is empty"),
    /**
     * Represents a validation error indicating that the {@code validFrom} timestamp precedes
     * the creation of a name in the naming service.
     */
    VALID_FROM_BEFORE_CREATED(9, "valid-from.before-name-created", "validFrom is before name creation"),
    /**
     * Represents an error indicating that the {@code validFrom} timestamp is considered too far in the past.
     * The maximum allowed distance in the past is defined in {@link Rules#VALID_FROM_IN_PAST}
     */
    VALID_FROM_TOO_FAR_IN_PAST(10, "valid-from.too-far-in-past", "validFrom is too far in the past"),
    /**
     * Represents an error indicating that the provided signature exceeds the maximum allowable length.
     */
    SIGNATURE_TOO_LONG(11, "signature.too-long", "signature is too long"),
    /**
     * Represents an error indicating failed signature verification.
     */
    SIGNATURE_INVALID(12, "signature.failed", "signature check failed"),
    /**
     * Represents an exception related to cryptographic configurations or operations.
     */
    CRYPTO_EXCEPTION(13, "crypto.failure", "crypto configuration exception occured"),
    /**
     * Represents an error indicating that the provided {@code previousDigest} has an incorrect length.
     */
    PREVIOUS_DIGEST_WRONG_LENGTH(14, "previous-digest.wrong-length", "previousDigest has wrong length"),
    /**
     * Indicates that the previous digest provided in the request does not match the current digest
     * associated with the entity. This status may be returned when a modification to the entity
     * has occurred since the initial data was retrieved, potentially indicating a conflict or
     * concurrent modification.
     */
    PREVIOUS_DIGEST_INCORRECT(15, "previous-digest.incorrect", "previousDigest differs from the current one"),
    /**
     * Represents an error indicating that the generation provided in the operation
     * does not match the current generation.
     */
    GENERATION_NOT_SAME(16, "generation.not-same", "generation must be the same as the current one"),
    /**
     * Represents an error where the specified page number in a paginated query is incorrect.
     */
    PAGE_INCORRECT(17, "page.incorrect", "page number is incorrect"),
    /**
     * Represents an error indicating that the provided page size is incorrect.
     */
    PAGE_SIZE_INCORRECT(18, "size.incorrect", "page size is incorrect"),
    /**
     * Represents an error indicating that the requested page size exceeds the allowed limit.
     */
    PAGE_SIZE_TOO_LARGE(19, "size.too-large", "page size is too large"),
    /**
     * Represents an error where a specified service endpoint is incorrect or unreachable.
     */
    ENDPOINT_WRONG(20, "endpoint.wrong", "wrong service endpoint"),
    /**
     * Represents an error indicating that the specified generation of a name is reserved and cannot be used
     * for registrations.
     */
    GENERATION_RESERVED(21, "generation.reserved", "generation is reserved");

    private final int rpcCode;
    private final String errorCode;
    private final String message;

    NamingError(int rpcCode, String errorCode, String message) {
        this.rpcCode = rpcCode;
        this.errorCode = errorCode;
        this.message = message;
    }

    /**
     * Retrieves the RPC code.
     *
     * @return the integer value representing the RPC code
     */
    public int getRpcCode() {
        return rpcCode;
    }

    /**
     * Retrieves the error code associated with the error.
     *
     * @return a string representing the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Retrieves the message associated with the error.
     *
     * @return the message as a string
     */
    public String getMessage() {
        return message;
    }

    /**
     * Retrieves a {@code NamingError} based on the provided error code.
     *
     * @param code the error code for which the corresponding {@code NamingError} is to be retrieved
     * @return the {@code NamingError} that matches the provided error code,
     *         or {@code null} if no match is found or the input is {@code null}.
     */
    public static NamingError forCode(String code) {
        if (code == null) {
            return null;
        }
        return Arrays.stream(values()).filter(v -> v.getErrorCode().equals(code)).findFirst().orElse(null);
    }

}
