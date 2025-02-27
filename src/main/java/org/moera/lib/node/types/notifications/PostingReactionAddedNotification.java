package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;

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

}
