package org.moera.lib.node.types.principal;

/**
 * Exception thrown to indicate that a principal is not absolute, so cannot be verified.
 */
public class UnresolvedPrincipalException extends RuntimeException {

    /**
     * Constructs a new {@code UnresolvedPrincipalException} with the specified principal
     * that cannot be verified due to being relative or unknown.
     *
     * @param principal the principal that cannot be verified
     */
    public UnresolvedPrincipalException(Principal principal) {
        super("Relative or unknown principal cannot be verified: " + principal);
    }

}
