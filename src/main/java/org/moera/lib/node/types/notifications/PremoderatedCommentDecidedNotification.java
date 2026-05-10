package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.SheriffMark;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * The comment authored by the receiver has been accepted or rejected after premoderation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PremoderatedCommentDecidedNotification extends Notification {

    private String postingId;
    private String commentId;
    private String postingOwnerName;
    private String postingOwnerFullName;
    private String postingOwnerGender;
    private AvatarImage postingOwnerAvatar;
    private String postingHeading;
    private List<String> postingSheriffs;
    private List<SheriffMark> postingSheriffMarks;
    private String commentHeading;
    private boolean accepted;

    public PremoderatedCommentDecidedNotification() {
        super(NotificationType.PREMODERATED_COMMENT_DECIDED);
    }

    /**
     * Retrieves ID of the posting on the sending node.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting on the sending node.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the comment on the sending node.
     *
     * @return the value
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets ID of the comment on the sending node.
     *
     * @param commentId the value to be set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * Retrieves name of the posting's owner.
     *
     * @return the value
     */
    public String getPostingOwnerName() {
        return postingOwnerName;
    }

    /**
     * Sets name of the posting's owner.
     *
     * @param postingOwnerName the value to be set
     */
    public void setPostingOwnerName(String postingOwnerName) {
        this.postingOwnerName = postingOwnerName;
    }

    /**
     * Retrieves full name of the posting's owner.
     *
     * @return the value
     */
    public String getPostingOwnerFullName() {
        return postingOwnerFullName;
    }

    /**
     * Sets full name of the posting's owner.
     *
     * @param postingOwnerFullName the value to be set
     */
    public void setPostingOwnerFullName(String postingOwnerFullName) {
        this.postingOwnerFullName = postingOwnerFullName;
    }

    /**
     * Retrieves gender of the posting's owner.
     *
     * @return the value
     */
    public String getPostingOwnerGender() {
        return postingOwnerGender;
    }

    /**
     * Sets gender of the posting's owner.
     *
     * @param postingOwnerGender the value to be set
     */
    public void setPostingOwnerGender(String postingOwnerGender) {
        this.postingOwnerGender = postingOwnerGender;
    }

    /**
     * Retrieves avatar of the posting's owner.
     *
     * @return the value
     */
    public AvatarImage getPostingOwnerAvatar() {
        return postingOwnerAvatar;
    }

    /**
     * Sets avatar of the posting's owner.
     *
     * @param postingOwnerAvatar the value to be set
     */
    public void setPostingOwnerAvatar(AvatarImage postingOwnerAvatar) {
        this.postingOwnerAvatar = postingOwnerAvatar;
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
     * Retrieves list of sheriffs supervising the posting.
     *
     * @return the value
     */
    public List<String> getPostingSheriffs() {
        return postingSheriffs;
    }

    /**
     * Sets list of sheriffs supervising the posting.
     *
     * @param postingSheriffs the value to be set
     */
    public void setPostingSheriffs(List<String> postingSheriffs) {
        this.postingSheriffs = postingSheriffs;
    }

    /**
     * Retrieves list of sheriff marks on the posting.
     *
     * @return the value
     */
    public List<SheriffMark> getPostingSheriffMarks() {
        return postingSheriffMarks;
    }

    /**
     * Sets list of sheriff marks on the posting.
     *
     * @param postingSheriffMarks the value to be set
     */
    public void setPostingSheriffMarks(List<SheriffMark> postingSheriffMarks) {
        this.postingSheriffMarks = postingSheriffMarks;
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
     * Retrieves <code>true</code>, if the comment was accepted and published, <code>false</code> otherwise.
     *
     * @return the value
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets <code>true</code>, if the comment was accepted and published, <code>false</code> otherwise.
     *
     * @param accepted the value to be set
     */
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "comment.posting-id.wrong-size");
        ValidationUtil.maxSize(commentId, 40, "comment.comment-id.wrong-size");
        ValidationUtil.maxSize(postingOwnerName, 135, "comment.posting-owner-name.wrong-size");
        ValidationUtil.maxSize(postingOwnerFullName, 96, "comment.posting-owner-full-name.wrong-size");
        ValidationUtil.maxSize(postingOwnerGender, 31, "comment.posting-owner-gender.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "comment.posting-heading.wrong-size");
        ValidationUtil.maxSize(commentHeading, 255, "comment.comment-heading.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("commentId", LogUtil.format(commentId)));
        parameters.add(LogPair.of("postingOwnerName", LogUtil.format(postingOwnerName)));
        parameters.add(LogPair.of("postingHeading", LogUtil.format(postingHeading)));
        parameters.add(LogPair.of("commentHeading", LogUtil.format(commentHeading)));
    }

}
