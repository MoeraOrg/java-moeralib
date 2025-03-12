package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.SheriffMark;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * A mention of the receiver in a comment on the sending node added.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MentionCommentAddedNotification extends Notification {

    private String postingId;
    private String commentId;
    private String postingOwnerName;
    private String postingOwnerFullName;
    private String postingOwnerGender;
    private AvatarImage postingOwnerAvatar;
    private String postingHeading;
    private List<String> postingSheriffs;
    private List<SheriffMark> postingSheriffMarks;
    private String commentOwnerName;
    private String commentOwnerFullName;
    private String commentOwnerGender;
    private AvatarImage commentOwnerAvatar;
    private String commentHeading;
    private List<SheriffMark> commentSheriffMarks;

    public MentionCommentAddedNotification() {
        super(NotificationType.MENTION_COMMENT_ADDED);
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
     * Retrieves name of the comment's owner.
     *
     * @return the value
     */
    public String getCommentOwnerName() {
        return commentOwnerName;
    }

    /**
     * Sets name of the comment's owner.
     *
     * @param commentOwnerName the value to be set
     */
    public void setCommentOwnerName(String commentOwnerName) {
        this.commentOwnerName = commentOwnerName;
    }

    /**
     * Retrieves full name of the comment's owner.
     *
     * @return the value
     */
    public String getCommentOwnerFullName() {
        return commentOwnerFullName;
    }

    /**
     * Sets full name of the comment's owner.
     *
     * @param commentOwnerFullName the value to be set
     */
    public void setCommentOwnerFullName(String commentOwnerFullName) {
        this.commentOwnerFullName = commentOwnerFullName;
    }

    /**
     * Retrieves gender of the comment's owner.
     *
     * @return the value
     */
    public String getCommentOwnerGender() {
        return commentOwnerGender;
    }

    /**
     * Sets gender of the comment's owner.
     *
     * @param commentOwnerGender the value to be set
     */
    public void setCommentOwnerGender(String commentOwnerGender) {
        this.commentOwnerGender = commentOwnerGender;
    }

    /**
     * Retrieves avatar of the comment's owner.
     *
     * @return the value
     */
    public AvatarImage getCommentOwnerAvatar() {
        return commentOwnerAvatar;
    }

    /**
     * Sets avatar of the comment's owner.
     *
     * @param commentOwnerAvatar the value to be set
     */
    public void setCommentOwnerAvatar(AvatarImage commentOwnerAvatar) {
        this.commentOwnerAvatar = commentOwnerAvatar;
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
     * Retrieves list of sheriff marks on the comment.
     *
     * @return the value
     */
    public List<SheriffMark> getCommentSheriffMarks() {
        return commentSheriffMarks;
    }

    /**
     * Sets list of sheriff marks on the comment.
     *
     * @param commentSheriffMarks the value to be set
     */
    public void setCommentSheriffMarks(List<SheriffMark> commentSheriffMarks) {
        this.commentSheriffMarks = commentSheriffMarks;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "mention.posting-id.wrong-size");
        ValidationUtil.maxSize(commentId, 40, "mention.comment-id.wrong-size");
        ValidationUtil.maxSize(postingOwnerName, 63, "mention.posting-owner-name.wrong-size");
        ValidationUtil.maxSize(postingOwnerFullName, 96, "mention.posting-owner-full-name.wrong-size");
        ValidationUtil.maxSize(postingOwnerGender, 31, "mention.posting-owner-gender.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "mention.posting-heading.wrong-size");
        ValidationUtil.maxSize(commentOwnerName, 63, "mention.comment-owner-name.wrong-size");
        ValidationUtil.maxSize(commentOwnerFullName, 96, "mention.comment-owner-full-name.wrong-size");
        ValidationUtil.maxSize(commentOwnerGender, 31, "mention.comment-owner-gender.wrong-size");
        ValidationUtil.maxSize(commentHeading, 255, "mention.comment-heading.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("commentId", LogUtil.format(commentId)));
        parameters.add(LogPair.of("postingOwnerName", LogUtil.format(postingOwnerName)));
        parameters.add(LogPair.of("postingHeading", LogUtil.format(postingHeading)));
        parameters.add(LogPair.of("commentOwnerName", LogUtil.format(commentOwnerName)));
        parameters.add(LogPair.of("commentHeading", LogUtil.format(commentHeading)));
    }

}
