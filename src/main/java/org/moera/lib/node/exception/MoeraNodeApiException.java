package org.moera.lib.node.exception;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.moera.lib.node.types.Result;
import org.moera.lib.util.LogUtil;

public class MoeraNodeApiException extends MoeraNodeException {

    protected int status;
    protected String errorCode;

    protected MoeraNodeApiException(String message) {
        super(message);
    }

    public MoeraNodeApiException(int status, String errorCode, String errorMessage) {
        super(
            getErrorTypeMessage(status)
            + String.format(": (%s %s)", LogUtil.format(errorCode), LogUtil.format(errorMessage))
        );
    }

    public MoeraNodeApiException(int status, Result result) {
        this(status, result != null ? result.getErrorCode(): null, result != null ? result.getMessage() : null);
    }

    public MoeraNodeApiException(int status, String body) {
        this(status, parseResult(body));
    }

    private static String getErrorTypeMessage(int status) {
        return switch (status) {
            case 400 -> "Validation failed";
            case 404 -> "Object not found";
            case 409 -> "Operation failed";
            default -> String.format("Error status returned: %d", status);
        };
    }

    protected static Result parseResult(String body) {
        if (body == null) {
            return null;
        }

        try {
            return new ObjectMapper().readValue(body, Result.class);
        } catch (IOException e) {
            return null;
        }
    }

    public int getStatus() {
        return status;
    }

    public String getErrorCode() {
        return errorCode;
    }

}
