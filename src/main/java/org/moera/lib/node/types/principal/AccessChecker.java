package org.moera.lib.node.types.principal;

import org.moera.lib.node.types.Scope;

public interface AccessChecker {

    boolean isPrincipal(PrincipalFilter principal, Scope scope);

}
