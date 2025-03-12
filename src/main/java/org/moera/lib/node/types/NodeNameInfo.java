package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NodeNameInfo extends Structure implements Cloneable {

    private String name;
    private OperationStatus operationStatus;
    private Long operationStatusUpdated;
    private String operationErrorCode;
    private String operationErrorMessage;
    private Boolean storedMnemonic;
    private NodeNameOperations operations;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets .
     *
     * @param name the value to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves status of the latest operation with the node name.
     *
     * @return the value
     */
    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    /**
     * Sets status of the latest operation with the node name.
     *
     * @param operationStatus the value to be set
     */
    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    /**
     * Retrieves the last time the operation status was updated.
     *
     * @return the value
     */
    public Long getOperationStatusUpdated() {
        return operationStatusUpdated;
    }

    /**
     * Sets the last time the operation status was updated.
     *
     * @param operationStatusUpdated the value to be set
     */
    public void setOperationStatusUpdated(Long operationStatusUpdated) {
        this.operationStatusUpdated = operationStatusUpdated;
    }

    /**
     * Retrieves if the operation with the node name was failed, the code of the failure.
     *
     * @return the value
     */
    public String getOperationErrorCode() {
        return operationErrorCode;
    }

    /**
     * Sets if the operation with the node name was failed, the code of the failure.
     *
     * @param operationErrorCode the value to be set
     */
    public void setOperationErrorCode(String operationErrorCode) {
        this.operationErrorCode = operationErrorCode;
    }

    /**
     * Retrieves if the operation with the node name was failed, the human-readable description of the failure.
     *
     * @return the value
     */
    public String getOperationErrorMessage() {
        return operationErrorMessage;
    }

    /**
     * Sets if the operation with the node name was failed, the human-readable description of the failure.
     *
     * @param operationErrorMessage the value to be set
     */
    public void setOperationErrorMessage(String operationErrorMessage) {
        this.operationErrorMessage = operationErrorMessage;
    }

    /**
     * Retrieves <code>true</code>, if updating key mnemonic is being stored on the node, <code>false</code> otherwise
     * .
     *
     * @return the value
     */
    public Boolean getStoredMnemonic() {
        return storedMnemonic;
    }

    /**
     * Sets <code>true</code>, if updating key mnemonic is being stored on the node, <code>false</code> otherwise
     * .
     *
     * @param storedMnemonic the value to be set
     */
    public void setStoredMnemonic(Boolean storedMnemonic) {
        this.storedMnemonic = storedMnemonic;
    }

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public NodeNameOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(NodeNameOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code NodeNameInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public NodeNameInfo clone() {
        try {
            return (NodeNameInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
