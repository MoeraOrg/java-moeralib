package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffComplaintDecidedNotification extends Notification {

    private String remoteNodeName;
    private String remoteFeedName;
    private String postingOwnerName;
    private String postingOwnerFullName;
    private String postingHeading;
    private String postingId;
    private String commentOwnerName;
    private String commentOwnerFullName;
    private String commentHeading;
    private String commentId;
    private String complaintGroupId;

    public SheriffComplaintDecidedNotification() {
        super(NotificationType.SHERIFF_COMPLAINT_DECIDED);
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

    public String getComplaintGroupId() {
        return complaintGroupId;
    }

    public void setComplaintGroupId(String complaintGroupId) {
        this.complaintGroupId = complaintGroupId;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(remoteNodeName, "sheriff-complaint.remote-node-name.empty");
        ValidationUtil.maxSize(remoteNodeName, 63, "sheriff-complaint.remote-node-name.wrong-size");
        ValidationUtil.notBlank(remoteFeedName, "sheriff-complaint.remote-feed-name.empty");
        ValidationUtil.maxSize(remoteFeedName, 63, "sheriff-complaint.remote-feed-name.wrong-size");
        ValidationUtil.maxSize(postingOwnerName, 63, "sheriff-complaint.posting-owner-name.wrong-size");
        ValidationUtil.maxSize(postingOwnerFullName, 96, "sheriff-complaint.posting-owner-full-name.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "sheriff-complaint.posting-heading.wrong-size");
        ValidationUtil.maxSize(postingId, 40, "sheriff-complaint.posting-id.wrong-size");
        ValidationUtil.maxSize(commentOwnerName, 63, "sheriff-complaint.comment-owner-name.wrong-size");
        ValidationUtil.maxSize(commentOwnerFullName, 96, "sheriff-complaint.comment-owner-full-name.wrong-size");
        ValidationUtil.maxSize(commentHeading, 255, "sheriff-complaint.comment-heading.wrong-size");
        ValidationUtil.maxSize(commentId, 40, "sheriff-complaint.comment-id.wrong-size");
        ValidationUtil.notBlank(complaintGroupId, "sheriff-complaint.complaint-group-id.empty");
        ValidationUtil.maxSize(complaintGroupId, 40, "sheriff-complaint.complaint-group-id.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("remoteNodeName", LogUtil.format(remoteNodeName)));
        parameters.add(LogPair.of("remoteFeedName", LogUtil.format(remoteFeedName)));
        parameters.add(LogPair.of("postingOwnerName", LogUtil.format(postingOwnerName)));
        parameters.add(LogPair.of("postingHeading", LogUtil.format(postingHeading)));
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("commentOwnerName", LogUtil.format(commentOwnerName)));
        parameters.add(LogPair.of("commentHeading", LogUtil.format(commentHeading)));
        parameters.add(LogPair.of("commentId", LogUtil.format(commentId)));
        parameters.add(LogPair.of("complaintGroupId", LogUtil.format(complaintGroupId)));
    }

}
