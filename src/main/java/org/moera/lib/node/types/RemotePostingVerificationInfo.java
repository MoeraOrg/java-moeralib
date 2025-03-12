package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemotePostingVerificationInfo extends Structure implements Cloneable {

    private String id;
    private String nodeName;
    private String postingId;
    private String revisionId;
    private VerificationStatus status;
    private String errorCode;
    private String errorMessage;

    /**
     * Retrieves asynchronous operation ID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets asynchronous operation ID.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets .
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets .
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * Sets .
     *
     * @param revisionId the value to be set
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * Retrieves status of the operation.
     *
     * @return the value
     */
    public VerificationStatus getStatus() {
        return status;
    }

    /**
     * Sets status of the operation.
     *
     * @param status the value to be set
     */
    public void setStatus(VerificationStatus status) {
        this.status = status;
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
     * Creates and returns a copy of this {@code RemotePostingVerificationInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public RemotePostingVerificationInfo clone() {
        try {
            return (RemotePostingVerificationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
