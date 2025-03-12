package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffOrderInfo extends Structure implements Cloneable {

    private String id;
    private Boolean delete;
    private String sheriffName;
    private String nodeName;
    private String nodeFullName;
    private String feedName;
    private String postingId;
    private String postingRevisionId;
    private String postingOwnerName;
    private String postingOwnerFullName;
    private String postingOwnerGender;
    private String postingHeading;
    private String commentId;
    private String commentRevisionId;
    private String commentOwnerName;
    private String commentOwnerFullName;
    private String commentOwnerGender;
    private String commentHeading;
    private SheriffOrderCategory category;
    private SheriffOrderReason reasonCode;
    private String reasonDetails;
    private long createdAt;
    private byte[] signature;
    private short signatureVersion;
    private String complaintGroupId;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets .
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves <code>true</code>, if the order is to cancel the previous order of this type, <code>false</code>
     * otherwise
     * .
     *
     * @return the value
     */
    public Boolean getDelete() {
        return delete;
    }

    /**
     * Sets <code>true</code>, if the order is to cancel the previous order of this type, <code>false</code> otherwise
     * .
     *
     * @param delete the value to be set
     */
    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    /**
     * Retrieves node name of the sheriff.
     *
     * @return the value
     */
    public String getSheriffName() {
        return sheriffName;
    }

    /**
     * Sets node name of the sheriff.
     *
     * @param sheriffName the value to be set
     */
    public void setSheriffName(String sheriffName) {
        this.sheriffName = sheriffName;
    }

    /**
     * Retrieves name of the node the order was sent to.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node the order was sent to.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves full name of the node the order was sent to.
     *
     * @return the value
     */
    public String getNodeFullName() {
        return nodeFullName;
    }

    /**
     * Sets full name of the node the order was sent to.
     *
     * @param nodeFullName the value to be set
     */
    public void setNodeFullName(String nodeFullName) {
        this.nodeFullName = nodeFullName;
    }

    /**
     * Retrieves name of the feed the order is related to.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets name of the feed the order is related to.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves ID of the posting the order is related to.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting the order is related to.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the posting's revision the order is related to.
     *
     * @return the value
     */
    public String getPostingRevisionId() {
        return postingRevisionId;
    }

    /**
     * Sets ID of the posting's revision the order is related to.
     *
     * @param postingRevisionId the value to be set
     */
    public void setPostingRevisionId(String postingRevisionId) {
        this.postingRevisionId = postingRevisionId;
    }

    /**
     * Retrieves posting owner's node name.
     *
     * @return the value
     */
    public String getPostingOwnerName() {
        return postingOwnerName;
    }

    /**
     * Sets posting owner's node name.
     *
     * @param postingOwnerName the value to be set
     */
    public void setPostingOwnerName(String postingOwnerName) {
        this.postingOwnerName = postingOwnerName;
    }

    /**
     * Retrieves posting owner's full name.
     *
     * @return the value
     */
    public String getPostingOwnerFullName() {
        return postingOwnerFullName;
    }

    /**
     * Sets posting owner's full name.
     *
     * @param postingOwnerFullName the value to be set
     */
    public void setPostingOwnerFullName(String postingOwnerFullName) {
        this.postingOwnerFullName = postingOwnerFullName;
    }

    /**
     * Retrieves posting owner's gender.
     *
     * @return the value
     */
    public String getPostingOwnerGender() {
        return postingOwnerGender;
    }

    /**
     * Sets posting owner's gender.
     *
     * @param postingOwnerGender the value to be set
     */
    public void setPostingOwnerGender(String postingOwnerGender) {
        this.postingOwnerGender = postingOwnerGender;
    }

    /**
     * Retrieves heading of the posting.
     *
     * @return the value
     */
    public String getPostingHeading() {
        return postingHeading;
    }

    /**
     * Sets heading of the posting.
     *
     * @param postingHeading the value to be set
     */
    public void setPostingHeading(String postingHeading) {
        this.postingHeading = postingHeading;
    }

    /**
     * Retrieves ID of the comment the order is related to.
     *
     * @return the value
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets ID of the comment the order is related to.
     *
     * @param commentId the value to be set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * Retrieves ID of the comment's revision the order is related to.
     *
     * @return the value
     */
    public String getCommentRevisionId() {
        return commentRevisionId;
    }

    /**
     * Sets ID of the comment's revision the order is related to.
     *
     * @param commentRevisionId the value to be set
     */
    public void setCommentRevisionId(String commentRevisionId) {
        this.commentRevisionId = commentRevisionId;
    }

    /**
     * Retrieves comment owner's node name.
     *
     * @return the value
     */
    public String getCommentOwnerName() {
        return commentOwnerName;
    }

    /**
     * Sets comment owner's node name.
     *
     * @param commentOwnerName the value to be set
     */
    public void setCommentOwnerName(String commentOwnerName) {
        this.commentOwnerName = commentOwnerName;
    }

    /**
     * Retrieves comment owner's full name.
     *
     * @return the value
     */
    public String getCommentOwnerFullName() {
        return commentOwnerFullName;
    }

    /**
     * Sets comment owner's full name.
     *
     * @param commentOwnerFullName the value to be set
     */
    public void setCommentOwnerFullName(String commentOwnerFullName) {
        this.commentOwnerFullName = commentOwnerFullName;
    }

    /**
     * Retrieves comment owner's gender.
     *
     * @return the value
     */
    public String getCommentOwnerGender() {
        return commentOwnerGender;
    }

    /**
     * Sets comment owner's gender.
     *
     * @param commentOwnerGender the value to be set
     */
    public void setCommentOwnerGender(String commentOwnerGender) {
        this.commentOwnerGender = commentOwnerGender;
    }

    /**
     * Retrieves heading of the comment.
     *
     * @return the value
     */
    public String getCommentHeading() {
        return commentHeading;
    }

    /**
     * Sets heading of the comment.
     *
     * @param commentHeading the value to be set
     */
    public void setCommentHeading(String commentHeading) {
        this.commentHeading = commentHeading;
    }

    /**
     * Retrieves category of the order.
     *
     * @return the value
     */
    public SheriffOrderCategory getCategory() {
        return category;
    }

    /**
     * Sets category of the order.
     *
     * @param category the value to be set
     */
    public void setCategory(SheriffOrderCategory category) {
        this.category = category;
    }

    /**
     * Retrieves reason of the order.
     *
     * @return the value
     */
    public SheriffOrderReason getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets reason of the order.
     *
     * @param reasonCode the value to be set
     */
    public void setReasonCode(SheriffOrderReason reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Retrieves detailed explanation of reason of the order in user-readable form.
     *
     * @return the value
     */
    public String getReasonDetails() {
        return reasonDetails;
    }

    /**
     * Sets detailed explanation of reason of the order in user-readable form.
     *
     * @param reasonDetails the value to be set
     */
    public void setReasonDetails(String reasonDetails) {
        this.reasonDetails = reasonDetails;
    }

    /**
     * Retrieves order creation timestamp - the real time when the order was created.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets order creation timestamp - the real time when the order was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves the sheriff's signature (use <code><a href="fingerprints.html#SheriffOrder">SheriffOrder</a></code>
     * fingerprint)
     * .
     *
     * @return the value
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the sheriff's signature (use <code><a href="fingerprints.html#SheriffOrder">SheriffOrder</a></code>
     * fingerprint)
     * .
     *
     * @param signature the value to be set
     */
    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    /**
     * Retrieves signature version (i.e. fingerprint version).
     *
     * @return the value
     */
    public short getSignatureVersion() {
        return signatureVersion;
    }

    /**
     * Sets signature version (i.e. fingerprint version).
     *
     * @param signatureVersion the value to be set
     */
    public void setSignatureVersion(short signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    /**
     * Retrieves ID of the groups of complaints that were the cause of the order.
     *
     * @return the value
     */
    public String getComplaintGroupId() {
        return complaintGroupId;
    }

    /**
     * Sets ID of the groups of complaints that were the cause of the order.
     *
     * @param complaintGroupId the value to be set
     */
    public void setComplaintGroupId(String complaintGroupId) {
        this.complaintGroupId = complaintGroupId;
    }

    /**
     * Creates and returns a copy of this {@code SheriffOrderInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SheriffOrderInfo clone() {
        try {
            return (SheriffOrderInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
