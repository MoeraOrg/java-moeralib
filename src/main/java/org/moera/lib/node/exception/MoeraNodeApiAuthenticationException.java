package org.moera.lib.node.exception;

/**
 * Thrown to indicate that an API request to a Moera Node requires authentication.
 * This exception is a specialized form of {@link MoeraNodeApiException}, representing
 * errors related to missing or invalid authentication credentials.
 */
public class MoeraNodeApiAuthenticationException extends MoeraNodeApiException {

    /**
     * Constructs a new {@code MoeraNodeApiAuthenticationException}.
     */
    public MoeraNodeApiAuthenticationException() {
        super("Authentication required");
    }

}
