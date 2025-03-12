package org.moera.lib.node.types.validate;

/**
 * Represents a validation failure exception thrown when a validation
 * check does not pass. This exception is used to indicate specific validation
 * errors, accompanied by an error code describing the type of failure.
 */
public class ValidationFailure extends RuntimeException {

    private final String errorCode;

    /**
     * Constructs a new {@code ValidationFailure} exception with the specified error code.
     * The error code provides additional context regarding the type of validation failure.
     *
     * @param errorCode the specific error code associated with the validation failure
     */
    public ValidationFailure(String errorCode) {
        super("Validation failed: " + errorCode);
        this.errorCode = errorCode;
    }

    /**
     * Retrieves the error code associated with this validation failure.
     *
     * @return the error code representing the type of validation failure
     */
    public String getErrorCode() {
        return errorCode;
    }

}
