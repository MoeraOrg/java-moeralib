package org.moera.lib.node.types;

// This file is generated

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NodeNameInfo {

    private String name;
    private OperationStatus operationStatus;
    private Timestamp operationStatusUpdated;
    private String operationErrorCode;
    private String operationErrorMessage;
    private Boolean storedMnemonic;
    private NodeNameOperations operations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public Timestamp getOperationStatusUpdated() {
        return operationStatusUpdated;
    }

    public void setOperationStatusUpdated(Timestamp operationStatusUpdated) {
        this.operationStatusUpdated = operationStatusUpdated;
    }

    public String getOperationErrorCode() {
        return operationErrorCode;
    }

    public void setOperationErrorCode(String operationErrorCode) {
        this.operationErrorCode = operationErrorCode;
    }

    public String getOperationErrorMessage() {
        return operationErrorMessage;
    }

    public void setOperationErrorMessage(String operationErrorMessage) {
        this.operationErrorMessage = operationErrorMessage;
    }

    public Boolean getStoredMnemonic() {
        return storedMnemonic;
    }

    public void setStoredMnemonic(Boolean storedMnemonic) {
        this.storedMnemonic = storedMnemonic;
    }

    public NodeNameOperations getOperations() {
        return operations;
    }

    public void setOperations(NodeNameOperations operations) {
        this.operations = operations;
    }

}
