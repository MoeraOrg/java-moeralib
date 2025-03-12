package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * The sending node got a sheriff's order related to the receiver's comment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffOrderForCommentAddedNotification extends Notification {

    private String remoteNodeName;
    private String remoteFeedName;
    private String postingOwnerName;
    private String postingOwnerFullName;
    private String postingHeading;
    private String postingId;
    private String commentHeading;
    private String commentId;
    private String orderId;

    public SheriffOrderForCommentAddedNotification() {
        super(NotificationType.SHERIFF_ORDER_FOR_COMMENT_ADDED);
    }

    /**
     * Retrieves name of the node the order was sent to.
     *
     * @return the value
     */
    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    /**
     * Sets name of the node the order was sent to.
     *
     * @param remoteNodeName the value to be set
     */
    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    /**
     * Retrieves name of the feed the order is related to.
     *
     * @return the value
     */
    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    /**
     * Sets name of the feed the order is related to.
     *
     * @param remoteFeedName the value to be set
     */
    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
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
     * Retrieves ID of the order.
     *
     * @return the value
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets ID of the order.
     *
     * @param orderId the value to be set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(remoteNodeName, "sheriff-order.remote-node-name.empty");
        ValidationUtil.maxSize(remoteNodeName, 63, "sheriff-order.remote-node-name.wrong-size");
        ValidationUtil.notBlank(remoteFeedName, "sheriff-order.remote-feed-name.empty");
        ValidationUtil.maxSize(remoteFeedName, 63, "sheriff-order.remote-feed-name.wrong-size");
        ValidationUtil.notBlank(postingOwnerName, "sheriff-order.posting-owner-name.empty");
        ValidationUtil.maxSize(postingOwnerName, 63, "sheriff-order.posting-owner-name.wrong-size");
        ValidationUtil.maxSize(postingOwnerFullName, 96, "sheriff-order.posting-owner-full-name.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "sheriff-order.posting-heading.wrong-size");
        ValidationUtil.notBlank(postingId, "sheriff-order.posting-id.empty");
        ValidationUtil.maxSize(postingId, 40, "sheriff-order.posting-id.wrong-size");
        ValidationUtil.maxSize(commentHeading, 255, "sheriff-order.comment-heading.wrong-size");
        ValidationUtil.notBlank(commentId, "sheriff-order.comment-id.empty");
        ValidationUtil.maxSize(commentId, 40, "sheriff-order.comment-id.wrong-size");
        ValidationUtil.notBlank(orderId, "sheriff-order.order-id.empty");
        ValidationUtil.maxSize(orderId, 40, "sheriff-order.order-id.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("remoteNodeName", LogUtil.format(remoteNodeName)));
        parameters.add(LogPair.of("remoteFeedName", LogUtil.format(remoteFeedName)));
        parameters.add(LogPair.of("postingOwnerName", LogUtil.format(postingOwnerName)));
        parameters.add(LogPair.of("postingHeading", LogUtil.format(postingHeading)));
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("commentHeading", LogUtil.format(commentHeading)));
        parameters.add(LogPair.of("commentId", LogUtil.format(commentId)));
        parameters.add(LogPair.of("orderId", LogUtil.format(orderId)));
    }

}
