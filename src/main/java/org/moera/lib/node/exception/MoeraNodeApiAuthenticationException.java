package org.moera.lib.node.exception;

public class MoeraNodeApiAuthenticationException extends MoeraNodeApiException {

    public MoeraNodeApiAuthenticationException() {
        super("Authentication required");
    }

}
