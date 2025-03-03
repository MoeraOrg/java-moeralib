package org.moera.lib.node.exception;

import org.moera.lib.node.types.Result;

public class MoeraNodeApiOperationException extends MoeraNodeApiException {

    public MoeraNodeApiOperationException(String errorCode, String errorMessage) {
        super(409, errorCode, errorMessage);
    }

    public MoeraNodeApiOperationException(Result result) {
        super(409, result);
    }

    public MoeraNodeApiOperationException(String body) {
        super(409, body);
    }

}
