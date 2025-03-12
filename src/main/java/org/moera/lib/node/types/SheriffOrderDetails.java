package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffOrderDetails extends Structure implements Cloneable {

    private String id;
    private Boolean delete;
    private String sheriffName;
    private AvatarDescription sheriffAvatar;
    private String feedName;
    private String postingId;
    private String commentId;
    private SheriffOrderCategory category;
    private SheriffOrderReason reasonCode;
    private String reasonDetails;
    private long createdAt;
    private byte[] signature;
    private short signatureVersion;

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
     * Retrieves sheriff's avatar.
     *
     * @return the value
     */
    public AvatarDescription getSheriffAvatar() {
        return sheriffAvatar;
    }

    /**
     * Sets sheriff's avatar.
     *
     * @param sheriffAvatar the value to be set
     */
    public void setSheriffAvatar(AvatarDescription sheriffAvatar) {
        this.sheriffAvatar = sheriffAvatar;
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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(id, "sheriff-order.id.blank");
        ValidationUtil.maxSize(id, 40, "sheriff-order.id.wrong-size");
        ValidationUtil.notBlank(sheriffName, "sheriff-order.sheriff-name.blank");
        ValidationUtil.maxSize(sheriffName, 63, "sheriff-order.sheriff-name.wrong-size");
        ValidationUtil.notBlank(feedName, "sheriff-order.feed-name.blank");
        ValidationUtil.maxSize(feedName, 63, "sheriff-order.feed-name.wrong-size");
        ValidationUtil.maxSize(reasonDetails, 4096, "sheriff-order.reason-details.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code SheriffOrderDetails} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SheriffOrderDetails clone() {
        try {
            return (SheriffOrderDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
