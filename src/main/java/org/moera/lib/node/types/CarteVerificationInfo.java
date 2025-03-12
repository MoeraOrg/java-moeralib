package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarteVerificationInfo extends Structure implements Cloneable {

    private boolean valid;
    private String clientName;
    private List<String> clientScope;
    private List<String> adminScope;
    private String errorCode;
    private String errorMessage;

    /**
     * Retrieves <code>true</code>, if the carte can be accepted for authentication, <code>false</code> otherwise.
     *
     * @return the value
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Sets <code>true</code>, if the carte can be accepted for authentication, <code>false</code> otherwise.
     *
     * @param valid the value to be set
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    /**
     * Retrieves name of the node the carte authenticates.
     *
     * @return the value
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets name of the node the carte authenticates.
     *
     * @param clientName the value to be set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Retrieves the list of permissions granted to the carte.
     *
     * @return the value
     */
    public List<String> getClientScope() {
        return clientScope;
    }

    /**
     * Sets the list of permissions granted to the carte.
     *
     * @param clientScope the value to be set
     */
    public void setClientScope(List<String> clientScope) {
        this.clientScope = clientScope;
    }

    /**
     * Retrieves the list of additional administrative permissions (of those granted to the carte's owner by the target
     * node) granted to the carte
     * .
     *
     * @return the value
     */
    public List<String> getAdminScope() {
        return adminScope;
    }

    /**
     * Sets the list of additional administrative permissions (of those granted to the carte's owner by the target
     * node) granted to the carte
     * .
     *
     * @param adminScope the value to be set
     */
    public void setAdminScope(List<String> adminScope) {
        this.adminScope = adminScope;
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
     * Creates and returns a copy of this {@code CarteVerificationInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CarteVerificationInfo clone() {
        try {
            return (CarteVerificationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
