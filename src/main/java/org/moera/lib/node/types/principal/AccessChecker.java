package org.moera.lib.node.types.principal;

import org.moera.lib.node.types.Scope;

/**
 * The {@code AccessChecker} interface is implemented by a class representing a client of the current node.
 * It evaluates whether the client is permitted to perform an operation in the given scope that is allowed only for
 * clients described by the given principal.
 */
public interface AccessChecker {

    /**
     * Determines if the client is authorized to perform actions in the given scope that are allowed only for
     * clients described by the given principal.
     *
     * @param principal an instance of {@code PrincipalFilter} defining the criteria to match
     * @param scope an instance of {@code Scope} describing the subset of operations that require permission
     * @return {@code true} if the principal meets the required criteria for the specified scope;
     *         {@code false} otherwise
     */
    boolean isPrincipal(PrincipalFilter principal, Scope scope);

}
