package org.moera.lib.node.types.principal;

/**
 * The {@code AccessCheckers} class provides access checkers that represent some widely used types of clients.
 */
public class AccessCheckers {

    /**
     * Represents a non-authorized client.
     */
    public static final AccessChecker PUBLIC = (principal, scope) -> principal.includes(false, null, false, null);

    /**
     * Represents the administrator of the current node.
     */
    public static final AccessChecker ADMIN = (principal, scope) -> principal.includes(true, null, false, null);

    /**
     * Represents a node with the given name.
     *
     * @param nodeName name of the node
     * @return the access checker representing the node
     */
    public static AccessChecker node(String nodeName) {
        return (principal, scope) -> principal.includes(false, nodeName, false, null);
        // FIXME subscription status and friend groups should correspond the node
    }

}
