package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * The sheriff made a decision on the receiver's complaint.
 */
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

    /**
     * Retrieves name of the node the complaint is related to.
     *
     * @return the value
     */
    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    /**
     * Sets name of the node the complaint is related to.
     *
     * @param remoteNodeName the value to be set
     */
    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    /**
     * Retrieves name of the feed the complaint is related to.
     *
     * @return the value
     */
    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    /**
     * Sets name of the feed the complaint is related to.
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
     * Retrieves ID of the group of complaints the complaint was included into.
     *
     * @return the value
     */
    public String getComplaintGroupId() {
        return complaintGroupId;
    }

    /**
     * Sets ID of the group of complaints the complaint was included into.
     *
     * @param complaintGroupId the value to be set
     */
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
