package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.SheriffMark;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplyCommentAddedNotification extends Notification {

    private String postingId;
    private String commentId;
    private String repliedToId;
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
    private String repliedToHeading;

    public ReplyCommentAddedNotification() {
        super(NotificationType.REPLY_COMMENT_ADDED);
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

    public String getRepliedToId() {
        return repliedToId;
    }

    public void setRepliedToId(String repliedToId) {
        this.repliedToId = repliedToId;
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

    public String getRepliedToHeading() {
        return repliedToHeading;
    }

    public void setRepliedToHeading(String repliedToHeading) {
        this.repliedToHeading = repliedToHeading;
    }

}
