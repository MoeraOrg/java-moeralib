package org.moera.lib.node.exception;

import org.moera.lib.node.types.Result;

public class MoeraNodeApiNotFoundException extends MoeraNodeApiException {

    public MoeraNodeApiNotFoundException(String errorCode, String errorMessage) {
        super(404, errorCode, errorMessage);
    }

    public MoeraNodeApiNotFoundException(Result result) {
        super(404, result);
    }

    public MoeraNodeApiNotFoundException(String body) {
        super(404, parseResult(body));
    }

    protected static Result parseResult(String body) {
        Result result = MoeraNodeApiException.parseResult(body);
        if (result != null) {
            return result;
        }
        return body != null ? new Result("", body) : null;
    }

}
