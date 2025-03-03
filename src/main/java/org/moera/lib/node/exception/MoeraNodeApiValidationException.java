package org.moera.lib.node.exception;

import org.moera.lib.node.types.Result;

public class MoeraNodeApiValidationException extends MoeraNodeApiException {

    public MoeraNodeApiValidationException(String errorCode, String errorMessage) {
        super(400, errorCode, errorMessage);
    }

    public MoeraNodeApiValidationException(Result result) {
        super(400, result);
    }

    public MoeraNodeApiValidationException(String body) {
        super(400, body);
    }

}
