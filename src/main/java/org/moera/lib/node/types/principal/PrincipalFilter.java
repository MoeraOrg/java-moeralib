package org.moera.lib.node.types.principal;

/**
 * The {@code PrincipalFilter} interface defines methods for filtering and evaluating
 * access or permissions based on specific criteria, such as roles, node names,
 * subscription status, or group association.
 */
public interface PrincipalFilter {

    /**
     * Converts the implementing object to a {@link PrincipalExpression}.
     *
     * @return the instance of {@link PrincipalExpression}
     */
    PrincipalExpression a();

    /**
     * Evaluates whether a client is included based on the provided criteria.
     *
     * @param admin indicates if the client has admin privileges
     * @param nodeName the name of the client's node to evaluate
     * @param subscribed indicates if the node is subscribed to the client
     * @param friendGroups an array of friend groups the client is a member of
     * @return {@code true} if the client is included based on the criteria; {@code false} otherwise
     */
    boolean includes(boolean admin, String nodeName, boolean subscribed, String[] friendGroups);

}
