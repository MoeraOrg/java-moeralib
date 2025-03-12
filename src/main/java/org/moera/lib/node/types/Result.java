package org.moera.lib.node.types;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Represents a structure containing the result of an operation, including an error code and a message.
 */
public class Result extends Structure {

    /**
     * Represents a successful result with an error code of "ok".
     */
    public static final Result OK = new Result("ok", "OK");
    /**
     * Represents a successful result with an error code of "frozen",
     * indicating that the target node is currently in the frozen state.
     */
    public static final Result FROZEN = new Result("frozen", "Frozen");

    private String errorCode;
    private String message;

    /**
     * Constructs a new, empty instance of the Result class.
     */
    public Result() {
    }

    /**
     * Constructs a new Result instance with the specified error code and message.
     *
     * @param errorCode the error code
     * @param message the message
     */
    public Result(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    /**
     * Retrieves the error code associated with the result.
     *
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the error code for this result.
     *
     * @param errorCode the error code to be assigned
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Retrieves the message associated with this result.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message for this result.
     *
     * @param message the message to be assigned
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Determines whether the current result represents a successful operation.
     *
     * @return {@code true} if the error code of the result equals "ok", {@code false} otherwise.
     */
    @JsonIgnore
    public boolean isOk() {
        return errorCode.equals("ok");
    }

    /**
     * Determines if the result indicates a frozen state of the target node.
     *
     * @return {@code true} if the error code is "frozen", {@code false} otherwise.
     */
    @JsonIgnore
    public boolean isFrozen() {
        return errorCode.equals("frozen");
    }

}
