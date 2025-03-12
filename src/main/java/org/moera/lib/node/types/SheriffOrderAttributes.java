package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffOrderAttributes extends Structure implements Cloneable {

    private Boolean delete;
    private String feedName;
    private String postingId;
    private String commentId;
    private SheriffOrderCategory category;
    private SheriffOrderReason reasonCode;
    private String reasonDetails;

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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(feedName, "sheriff-order.feed-name.blank");
        ValidationUtil.maxSize(feedName, 63, "sheriff-order.feed-name.wrong-size");
        ValidationUtil.maxSize(reasonDetails, 4096, "sheriff-order.reason-details.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code SheriffOrderAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SheriffOrderAttributes clone() {
        try {
            return (SheriffOrderAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
