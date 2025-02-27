package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentReactionAddedNotification extends Notification {

    private String postingId;
    private String commentId;
    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private AvatarImage ownerAvatar;
    private boolean negative;
    private int emoji;
    private String postingNodeName;
    private String postingFullName;
    private String postingGender;
    private AvatarImage postingAvatar;
    private String postingHeading;
    private String commentHeading;

    public CommentReactionAddedNotification() {
        super(NotificationType.COMMENT_REACTION_ADDED);
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public String getOwnerGender() {
        return ownerGender;
    }

    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    public AvatarImage getOwnerAvatar() {
        return ownerAvatar;
    }

    public void setOwnerAvatar(AvatarImage ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    public boolean isNegative() {
        return negative;
    }

    public void setNegative(boolean negative) {
        this.negative = negative;
    }

    public int getEmoji() {
        return emoji;
    }

    public void setEmoji(int emoji) {
        this.emoji = emoji;
    }

    public String getPostingNodeName() {
        return postingNodeName;
    }

    public void setPostingNodeName(String postingNodeName) {
        this.postingNodeName = postingNodeName;
    }

    public String getPostingFullName() {
        return postingFullName;
    }

    public void setPostingFullName(String postingFullName) {
        this.postingFullName = postingFullName;
    }

    public String getPostingGender() {
        return postingGender;
    }

    public void setPostingGender(String postingGender) {
        this.postingGender = postingGender;
    }

    public AvatarImage getPostingAvatar() {
        return postingAvatar;
    }

    public void setPostingAvatar(AvatarImage postingAvatar) {
        this.postingAvatar = postingAvatar;
    }

    public String getPostingHeading() {
        return postingHeading;
    }

    public void setPostingHeading(String postingHeading) {
        this.postingHeading = postingHeading;
    }

    public String getCommentHeading() {
        return commentHeading;
    }

    public void setCommentHeading(String commentHeading) {
        this.commentHeading = commentHeading;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "reaction.posting-id.wrong-size");
        ValidationUtil.maxSize(commentId, 40, "reaction.comment-id.wrong-size");
        ValidationUtil.maxSize(ownerName, 63, "reaction.owner-name.wrong-size");
        ValidationUtil.maxSize(ownerFullName, 96, "reaction.owner-full-name.wrong-size");
        ValidationUtil.maxSize(ownerGender, 31, "reaction.owner-gender.wrong-size");
        ValidationUtil.maxSize(postingNodeName, 63, "reaction.posting-node-name.wrong-size");
        ValidationUtil.maxSize(postingFullName, 96, "reaction.posting-full-name.wrong-size");
        ValidationUtil.maxSize(postingGender, 31, "reaction.posting-gender.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "reaction.posting-heading.wrong-size");
        ValidationUtil.maxSize(commentHeading, 255, "reaction.comment-heading.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("commentId", LogUtil.format(commentId)));
        parameters.add(LogPair.of("ownerName", LogUtil.format(ownerName)));
        parameters.add(LogPair.of("negative", LogUtil.format(negative)));
        parameters.add(LogPair.of("emoji", LogUtil.format(emoji)));
        parameters.add(LogPair.of("postingNodeName", LogUtil.format(postingNodeName)));
    }

}
