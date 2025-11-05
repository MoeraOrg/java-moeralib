package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerificationInfo extends Structure implements Cloneable {

    private boolean correct;
    private String errorCode;
    private String errorMessage;

    /**
     * Retrieves <code>true</code> if the verified object is correct, <code>false</code> otherwise.
     *
     * @return the value
     */
    public boolean isCorrect() {
        return correct;
    }

    /**
     * Sets <code>true</code> if the verified object is correct, <code>false</code> otherwise.
     *
     * @param correct the value to be set
     */
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    /**
     * Retrieves error code.
     *
     * @return the value
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets error code.
     *
     * @param errorCode the value to be set
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Retrieves human-readable error message.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets human-readable error message.
     *
     * @param errorMessage the value to be set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Creates and returns a copy of this {@code VerificationInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public VerificationInfo clone() {
        try {
            return (VerificationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
