package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.SheriffMark;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingCommentAddedNotification extends Notification {

    private String subscriberId;
    private String postingId;
    private String postingOwnerName;
    private String postingOwnerFullName;
    private String postingOwnerGender;
    private AvatarImage postingOwnerAvatar;
    private String postingHeading;
    private List<String> postingSheriffs;
    private List<SheriffMark> postingSheriffMarks;
    private String commentId;
    private String commentOwnerName;
    private String commentOwnerFullName;
    private String commentOwnerGender;
    private AvatarImage commentOwnerAvatar;
    private String commentHeading;
    private List<SheriffMark> commentSheriffMarks;
    private String commentRepliedTo;

    public PostingCommentAddedNotification() {
        super(NotificationType.POSTING_COMMENT_ADDED);
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

    public String getPostingOwnerGender() {
        return postingOwnerGender;
    }

    public void setPostingOwnerGender(String postingOwnerGender) {
        this.postingOwnerGender = postingOwnerGender;
    }

    public AvatarImage getPostingOwnerAvatar() {
        return postingOwnerAvatar;
    }

    public void setPostingOwnerAvatar(AvatarImage postingOwnerAvatar) {
        this.postingOwnerAvatar = postingOwnerAvatar;
    }

    public String getPostingHeading() {
        return postingHeading;
    }

    public void setPostingHeading(String postingHeading) {
        this.postingHeading = postingHeading;
    }

    public List<String> getPostingSheriffs() {
        return postingSheriffs;
    }

    public void setPostingSheriffs(List<String> postingSheriffs) {
        this.postingSheriffs = postingSheriffs;
    }

    public List<SheriffMark> getPostingSheriffMarks() {
        return postingSheriffMarks;
    }

    public void setPostingSheriffMarks(List<SheriffMark> postingSheriffMarks) {
        this.postingSheriffMarks = postingSheriffMarks;
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

    public String getCommentHeading() {
        return commentHeading;
    }

    public void setCommentHeading(String commentHeading) {
        this.commentHeading = commentHeading;
    }

    public List<SheriffMark> getCommentSheriffMarks() {
        return commentSheriffMarks;
    }

    public void setCommentSheriffMarks(List<SheriffMark> commentSheriffMarks) {
        this.commentSheriffMarks = commentSheriffMarks;
    }

    public String getCommentRepliedTo() {
        return commentRepliedTo;
    }

    public void setCommentRepliedTo(String commentRepliedTo) {
        this.commentRepliedTo = commentRepliedTo;
    }

}
