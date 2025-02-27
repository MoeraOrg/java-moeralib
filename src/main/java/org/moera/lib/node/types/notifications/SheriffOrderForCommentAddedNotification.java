package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

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

    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
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

    public String getPostingHeading() {
        return postingHeading;
    }

    public void setPostingHeading(String postingHeading) {
        this.postingHeading = postingHeading;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public String getCommentHeading() {
        return commentHeading;
    }

    public void setCommentHeading(String commentHeading) {
        this.commentHeading = commentHeading;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getOrderId() {
        return orderId;
    }

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
