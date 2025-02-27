package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingReactionAddedNotification extends Notification {

    private String parentPostingId;
    private String parentCommentId;
    private String parentMediaId;
    private String postingId;
    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private AvatarImage ownerAvatar;
    private boolean negative;
    private int emoji;
    private String parentPostingNodeName;
    private String parentPostingFullName;
    private String parentPostingGender;
    private AvatarImage parentPostingAvatar;
    private String parentHeading;
    private String postingHeading;

    public PostingReactionAddedNotification() {
        super(NotificationType.POSTING_REACTION_ADDED);
    }

    public String getParentPostingId() {
        return parentPostingId;
    }

    public void setParentPostingId(String parentPostingId) {
        this.parentPostingId = parentPostingId;
    }

    public String getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(String parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getParentMediaId() {
        return parentMediaId;
    }

    public void setParentMediaId(String parentMediaId) {
        this.parentMediaId = parentMediaId;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
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

    public String getParentPostingNodeName() {
        return parentPostingNodeName;
    }

    public void setParentPostingNodeName(String parentPostingNodeName) {
        this.parentPostingNodeName = parentPostingNodeName;
    }

    public String getParentPostingFullName() {
        return parentPostingFullName;
    }

    public void setParentPostingFullName(String parentPostingFullName) {
        this.parentPostingFullName = parentPostingFullName;
    }

    public String getParentPostingGender() {
        return parentPostingGender;
    }

    public void setParentPostingGender(String parentPostingGender) {
        this.parentPostingGender = parentPostingGender;
    }

    public AvatarImage getParentPostingAvatar() {
        return parentPostingAvatar;
    }

    public void setParentPostingAvatar(AvatarImage parentPostingAvatar) {
        this.parentPostingAvatar = parentPostingAvatar;
    }

    public String getParentHeading() {
        return parentHeading;
    }

    public void setParentHeading(String parentHeading) {
        this.parentHeading = parentHeading;
    }

    public String getPostingHeading() {
        return postingHeading;
    }

    public void setPostingHeading(String postingHeading) {
        this.postingHeading = postingHeading;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(parentPostingId, 40, "reaction.parent-posting-id.wrong-size");
        ValidationUtil.maxSize(parentCommentId, 40, "reaction.parent-comment-id.wrong-size");
        ValidationUtil.maxSize(parentMediaId, 40, "reaction.parent-media-id.wrong-size");
        ValidationUtil.maxSize(postingId, 40, "reaction.posting-id.wrong-size");
        ValidationUtil.maxSize(ownerName, 63, "reaction.owner-name.wrong-size");
        ValidationUtil.maxSize(ownerFullName, 96, "reaction.owner-full-name.wrong-size");
        ValidationUtil.maxSize(ownerGender, 31, "reaction.owner-gender.wrong-size");
        ValidationUtil.maxSize(parentPostingNodeName, 63, "reaction.parent-posting-node-name.wrong-size");
        ValidationUtil.maxSize(parentPostingFullName, 96, "reaction.parent-posting-full-name.wrong-size");
        ValidationUtil.maxSize(parentPostingGender, 31, "reaction.parent-posting-gender.wrong-size");
        ValidationUtil.maxSize(parentHeading, 255, "reaction.parent-heading.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "reaction.posting-heading.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("parentPostingId", LogUtil.format(parentPostingId)));
        parameters.add(LogPair.of("parentCommentId", LogUtil.format(parentCommentId)));
        parameters.add(LogPair.of("parentMediaId", LogUtil.format(parentMediaId)));
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("ownerName", LogUtil.format(ownerName)));
        parameters.add(LogPair.of("parentPostingNodeName", LogUtil.format(parentPostingNodeName)));
        parameters.add(LogPair.of("parentHeading", LogUtil.format(parentHeading)));
        parameters.add(LogPair.of("postingHeading", LogUtil.format(postingHeading)));
    }

}
