package org.moera.lib.node.types.validate;

public class ValidationException extends RuntimeException {

    private final String errorCode;

    protected ValidationException(String errorCode) {
        super("Validation failed: " + errorCode);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

}
