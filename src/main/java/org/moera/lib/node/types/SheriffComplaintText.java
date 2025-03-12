package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffComplaintText extends Structure implements Cloneable {

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

    /**
     * Retrieves complaint owner's full name.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets complaint owner's full name.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves complaint owner's gender.
     *
     * @return the value
     */
    public String getOwnerGender() {
        return ownerGender;
    }

    /**
     * Sets complaint owner's gender.
     *
     * @param ownerGender the value to be set
     */
    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    /**
     * Retrieves name of the node the complaint is related to.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node the complaint is related to.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves full name of the node the complaint is related to.
     *
     * @return the value
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets full name of the node the complaint is related to.
     *
     * @param fullName the value to be set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Retrieves name of the feed the complaint is related to.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets name of the feed the complaint is related to.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves ID of the posting the complaint is related to.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting the complaint is related to.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
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
     * Retrieves ID of the comment the complaint is related to.
     *
     * @return the value
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets ID of the comment the complaint is related to.
     *
     * @param commentId the value to be set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
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
     * Retrieves reason of the complaint.
     *
     * @return the value
     */
    public SheriffOrderReason getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets reason of the complaint.
     *
     * @param reasonCode the value to be set
     */
    public void setReasonCode(SheriffOrderReason reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Retrieves detailed explanation of reason of the complaint in user-readable form.
     *
     * @return the value
     */
    public String getReasonDetails() {
        return reasonDetails;
    }

    /**
     * Sets detailed explanation of reason of the complaint in user-readable form.
     *
     * @param reasonDetails the value to be set
     */
    public void setReasonDetails(String reasonDetails) {
        this.reasonDetails = reasonDetails;
    }

    /**
     * Retrieves <code>true</code>, if the complaint's owner wants his name not to be published, <code>false</code>
     * otherwise
     * .
     *
     * @return the value
     */
    public Boolean getAnonymous() {
        return anonymous;
    }

    /**
     * Sets <code>true</code>, if the complaint's owner wants his name not to be published, <code>false</code>
     * otherwise
     * .
     *
     * @param anonymous the value to be set
     */
    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    @Override
    public void validate() {
        super.validate();
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

    /**
     * Creates and returns a copy of this {@code SheriffComplaintText} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SheriffComplaintText clone() {
        try {
            return (SheriffComplaintText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
