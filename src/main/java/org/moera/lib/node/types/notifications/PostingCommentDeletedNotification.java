package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * A comment deleted from the posting the receiver is subscribed to.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingCommentDeletedNotification extends SubscriberNotification implements PostingSubscriberNotification {

    private String postingId;
    private String commentId;
    private String commentOwnerName;
    private String commentOwnerFullName;
    private String commentOwnerGender;
    private AvatarImage commentOwnerAvatar;

    public PostingCommentDeletedNotification() {
        super(NotificationType.POSTING_COMMENT_DELETED);
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
     * Retrieves name of the comment owner.
     *
     * @return the value
     */
    public String getCommentOwnerName() {
        return commentOwnerName;
    }

    /**
     * Sets name of the comment owner.
     *
     * @param commentOwnerName the value to be set
     */
    public void setCommentOwnerName(String commentOwnerName) {
        this.commentOwnerName = commentOwnerName;
    }

    /**
     * Retrieves full name of the comment owner.
     *
     * @return the value
     */
    public String getCommentOwnerFullName() {
        return commentOwnerFullName;
    }

    /**
     * Sets full name of the comment owner.
     *
     * @param commentOwnerFullName the value to be set
     */
    public void setCommentOwnerFullName(String commentOwnerFullName) {
        this.commentOwnerFullName = commentOwnerFullName;
    }

    /**
     * Retrieves gender of the comment owner.
     *
     * @return the value
     */
    public String getCommentOwnerGender() {
        return commentOwnerGender;
    }

    /**
     * Sets gender of the comment owner.
     *
     * @param commentOwnerGender the value to be set
     */
    public void setCommentOwnerGender(String commentOwnerGender) {
        this.commentOwnerGender = commentOwnerGender;
    }

    /**
     * Retrieves avatar of the comment owner.
     *
     * @return the value
     */
    public AvatarImage getCommentOwnerAvatar() {
        return commentOwnerAvatar;
    }

    /**
     * Sets avatar of the comment owner.
     *
     * @param commentOwnerAvatar the value to be set
     */
    public void setCommentOwnerAvatar(AvatarImage commentOwnerAvatar) {
        this.commentOwnerAvatar = commentOwnerAvatar;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "comment.posting-id.wrong-size");
        ValidationUtil.maxSize(commentId, 40, "comment.comment-id.wrong-size");
        ValidationUtil.maxSize(commentOwnerName, 63, "comment.comment-owner-name.wrong-size");
        ValidationUtil.maxSize(commentOwnerFullName, 96, "comment.comment-owner-full-name.wrong-size");
        ValidationUtil.maxSize(commentOwnerGender, 31, "comment.comment-owner-gender.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("commentId", LogUtil.format(commentId)));
        parameters.add(LogPair.of("commentOwnerName", LogUtil.format(commentOwnerName)));
    }

}
