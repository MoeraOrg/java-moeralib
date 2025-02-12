package org.moera.lib.node.types.principal;

public interface PrincipalFilter {

    PrincipalExpression a();

    boolean includes(boolean admin, String nodeName, boolean subscribed, String[] friendGroups);

}
