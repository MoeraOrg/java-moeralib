package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingCommentDeletedNotification extends Notification {

    private String subscriberId;
    private String postingId;
    private String commentId;
    private String commentOwnerName;
    private String commentOwnerFullName;
    private String commentOwnerGender;
    private AvatarImage commentOwnerAvatar;

    public PostingCommentDeletedNotification() {
        super(NotificationType.POSTING_COMMENT_DELETED);
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
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

    public String getCommentOwnerGender() {
        return commentOwnerGender;
    }

    public void setCommentOwnerGender(String commentOwnerGender) {
        this.commentOwnerGender = commentOwnerGender;
    }

    public AvatarImage getCommentOwnerAvatar() {
        return commentOwnerAvatar;
    }

    public void setCommentOwnerAvatar(AvatarImage commentOwnerAvatar) {
        this.commentOwnerAvatar = commentOwnerAvatar;
    }

}
