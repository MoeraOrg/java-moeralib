package org.moera.lib.node.types;

// This file is generated

import java.util.function.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffComplaintText implements Cloneable {

    private String ownerFullName;
    private String ownerGender;
    private String nodeName;
    private String fullName;
    private String feedName;
    private String postingId;
    private String postingOwnerName;
    private String postingOwnerFullName;
    private String postingOwnerGender;
    private String postingHeading;
    private String commentId;
    private String commentOwnerName;
    private String commentOwnerFullName;
    private String commentOwnerGender;
    private String commentHeading;
    private SheriffOrderReason reasonCode;
    private String reasonDetails;
    private Boolean anonymous;

    @JsonIgnore
    private Object extra;

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public String getOwnerGender() {
        return ownerGender;
    }

    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getPostingOwnerName() {
        return postingOwnerName;
    }

    public void setPostingOwnerName(String postingOwnerName) {
        this.postingOwnerName = postingOwnerName;
    }

    public String getPostingOwnerFullName() {
        return postingOwnerFullName;
    }

    public void setPostingOwnerFullName(String postingOwnerFullName) {
        this.postingOwnerFullName = postingOwnerFullName;
    }

    public String getPostingOwnerGender() {
        return postingOwnerGender;
    }

    public void setPostingOwnerGender(String postingOwnerGender) {
        this.postingOwnerGender = postingOwnerGender;
    }

    public String getPostingHeading() {
        return postingHeading;
    }

    public void setPostingHeading(String postingHeading) {
        this.postingHeading = postingHeading;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCommentOwnerName() {
        return commentOwnerName;
    }

    public void setCommentOwnerName(String commentOwnerName) {
        this.commentOwnerName = commentOwnerName;
    }

    public String getCommentOwnerFullName() {
        return commentOwnerFullName;
    }

    public void setCommentOwnerFullName(String commentOwnerFullName) {
        this.commentOwnerFullName = commentOwnerFullName;
    }

    public String getCommentOwnerGender() {
        return commentOwnerGender;
    }

    public void setCommentOwnerGender(String commentOwnerGender) {
        this.commentOwnerGender = commentOwnerGender;
    }

    public String getCommentHeading() {
        return commentHeading;
    }

    public void setCommentHeading(String commentHeading) {
        this.commentHeading = commentHeading;
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

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    public Object getExtra() {
        return extra;
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrCreateExtra(Supplier<T> creator) {
        if (extra == null) {
            extra = creator.get();
        }
        return (T) extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
        ValidationUtil.maxSize(ownerFullName, 96, "sheriff-complaint.owner-full-name.wrong-size");
        ValidationUtil.maxSize(ownerGender, 31, "sheriff-complaint.owner-gender.wrong-size");
        ValidationUtil.notBlank(nodeName, "sheriff-complaint.node-name.blank");
        ValidationUtil.maxSize(nodeName, 63, "sheriff-complaint.node-name.wrong-size");
        ValidationUtil.maxSize(fullName, 96, "sheriff-complaint.full-name.wrong-size");
        ValidationUtil.notBlank(feedName, "sheriff-complaint.feed-name.blank");
        ValidationUtil.maxSize(feedName, 63, "sheriff-complaint.feed-name.wrong-size");
        ValidationUtil.maxSize(postingId, 40, "sheriff-complaint.posting-id.wrong-size");
        ValidationUtil.maxSize(postingOwnerName, 63, "sheriff-complaint.posting-owner-name.wrong-size");
        ValidationUtil.maxSize(postingOwnerFullName, 96, "sheriff-complaint.posting-owner-full-name.wrong-size");
        ValidationUtil.maxSize(postingOwnerGender, 31, "sheriff-complaint.posting-owner-gender.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "sheriff-complaint.posting-heading.wrong-size");
        ValidationUtil.maxSize(commentId, 40, "sheriff-complaint.comment-id.wrong-size");
        ValidationUtil.maxSize(commentOwnerName, 63, "sheriff-complaint.comment-owner-name.wrong-size");
        ValidationUtil.maxSize(commentOwnerFullName, 96, "sheriff-complaint.comment-owner-full-name.wrong-size");
        ValidationUtil.maxSize(commentOwnerGender, 31, "sheriff-complaint.comment-owner-gender.wrong-size");
        ValidationUtil.maxSize(commentHeading, 255, "sheriff-complaint.comment-heading.wrong-size");
        ValidationUtil.maxSize(reasonDetails, 4096, "sheriff-complaint.reason-details.wrong-size");
    }

    @Override
    public SheriffComplaintText clone() {
        try {
            return (SheriffComplaintText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
