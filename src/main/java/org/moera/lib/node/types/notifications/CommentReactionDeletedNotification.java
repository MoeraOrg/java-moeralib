package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Reaction deleted from a comment owned by the receiver.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentReactionDeletedNotification extends Notification {

    private String postingId;
    private String commentId;
    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private AvatarImage ownerAvatar;
    private boolean negative;

    public CommentReactionDeletedNotification() {
        super(NotificationType.COMMENT_REACTION_DELETED);
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
     * Retrieves name of the reaction owner.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets name of the reaction owner.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Retrieves full name of the reaction owner.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets full name of the reaction owner.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves gender of the reaction owner.
     *
     * @return the value
     */
    public String getOwnerGender() {
        return ownerGender;
    }

    /**
     * Sets gender of the reaction owner.
     *
     * @param ownerGender the value to be set
     */
    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    /**
     * Retrieves avatar of the reaction owner.
     *
     * @return the value
     */
    public AvatarImage getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets avatar of the reaction owner.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarImage ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    /**
     * Retrieves <code>true</code>, if the reaction is negative, <code>false</code>, if positive.
     *
     * @return the value
     */
    public boolean isNegative() {
        return negative;
    }

    /**
     * Sets <code>true</code>, if the reaction is negative, <code>false</code>, if positive.
     *
     * @param negative the value to be set
     */
    public void setNegative(boolean negative) {
        this.negative = negative;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "reaction.posting-id.wrong-size");
        ValidationUtil.maxSize(commentId, 40, "reaction.comment-id.wrong-size");
        ValidationUtil.maxSize(ownerName, 63, "reaction.owner-name.wrong-size");
        ValidationUtil.maxSize(ownerFullName, 96, "reaction.owner-full-name.wrong-size");
        ValidationUtil.maxSize(ownerGender, 31, "reaction.owner-gender.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("commentId", LogUtil.format(commentId)));
        parameters.add(LogPair.of("ownerName", LogUtil.format(ownerName)));
        parameters.add(LogPair.of("negative", LogUtil.format(negative)));
    }

}
