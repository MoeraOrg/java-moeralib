package org.moera.lib.node.types.validate;

public class ValidationFailure extends RuntimeException {

    private final String errorCode;

    public ValidationFailure(String errorCode) {
        super("Validation failed: " + errorCode);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

}
