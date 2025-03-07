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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public String getSheriffName() {
        return sheriffName;
    }

    public void setSheriffName(String sheriffName) {
        this.sheriffName = sheriffName;
    }

    public AvatarDescription getSheriffAvatar() {
        return sheriffAvatar;
    }

    public void setSheriffAvatar(AvatarDescription sheriffAvatar) {
        this.sheriffAvatar = sheriffAvatar;
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public SheriffOrderCategory getCategory() {
        return category;
    }

    public void setCategory(SheriffOrderCategory category) {
        this.category = category;
    }

    public SheriffOrderReason getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(SheriffOrderReason reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonDetails() {
        return reasonDetails;
    }

    public void setReasonDetails(String reasonDetails) {
        this.reasonDetails = reasonDetails;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    public short getSignatureVersion() {
        return signatureVersion;
    }

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

    @Override
    public SheriffOrderDetails clone() {
        try {
            return (SheriffOrderDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
