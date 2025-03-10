package org.moera.lib.naming.types;

import java.util.UUID;

/**
 * Represents the status information of a Moera naming service operation.
 */
public class OperationStatusInfo {

    private UUID operationId;
    private String name;
    private int generation;
    private OperationStatus status;
    private Long added;
    private Long completed;
    private String errorCode;
    private String errorMessage;

    /**
     * Retrieves the unique identifier associated with the operation.
     *
     * @return the unique identifier of the operation
     */
    public UUID getOperationId() {
        return operationId;
    }

    /**
     * Sets the unique identifier for the operation.
     *
     * @param operationId the unique identifier to be assigned to the operation
     */
    public void setOperationId(UUID operationId) {
        this.operationId = operationId;
    }

    /**
     * Retrieves the node name the operation is performed on.
     *
     * @return the node name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the node name the operation is performed on.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the node name generation the operation is performed on.
     *
     * @return the generation
     */
    public int getGeneration() {
        return generation;
    }

    /**
     * Sets the node name generation the operation is performed on.
     *
     * @param generation the generation to be set
     */
    public void setGeneration(int generation) {
        this.generation = generation;
    }

    /**
     * Retrieves the current status of the operation.
     *
     * @return the current {@link OperationStatus} of the operation
     */
    public OperationStatus getStatus() {
        return status;
    }

    /**
     * Sets the status of the operation.
     *
     * @param status the {@link OperationStatus} to set for the operation
     */
    public void setStatus(OperationStatus status) {
        this.status = status;
    }

    /**
     * Returns the timestamp (in epoch seconds) indicating when the operation was added.
     *
     * @return the timestamp of when the operation was added, or {@code null} if the operation is not added yet
     */
    public Long getAdded() {
        return added;
    }

    /**
     * Sets the timestamp (in epoch seconds) indicating when the operation was added.
     *
     * @param added the timestamp when the operation was added
     */
    public void setAdded(Long added) {
        this.added = added;
    }

    /**
     * Retrieves the timestamp (in epoch seconds) indicating when the operation was completed.
     *
     * @return the timestamp of the operation completion, or {@code null} if the operation has not completed yet
     */
    public Long getCompleted() {
        return completed;
    }

    /**
     * Sets the timestamp indicating (in epoch seconds) when the operation was completed.
     *
     * @param completed the timestamp of the operation completion
     */
    public void setCompleted(Long completed) {
        this.completed = completed;
    }

    /**
     * Retrieves the error code returned by the operation.
     *
     * @return the error code, or {@code null} if no error code is available
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the error code returned by the operation.
     *
     * @param errorCode the error code to be set
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Retrieves the error message associated with the operation status.
     *
     * @return the error message
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the error message associated with the operation status.
     *
     * @param errorMessage the error message to be set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
