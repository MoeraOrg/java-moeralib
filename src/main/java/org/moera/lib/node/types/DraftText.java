package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DraftText extends Structure implements Cloneable {

    private DraftType draftType;
    private String receiverName;
    private String receiverPostingId;
    private String receiverCommentId;
    private String repliedToId;
    private String ownerFullName;
    private AvatarDescription ownerAvatar;
    private AcceptedReactions acceptedReactions;
    private Body bodySrc;
    private SourceFormat bodySrcFormat;
    private List<RemoteMedia> media;
    private Long publishAt;
    private UpdateInfo updateInfo;
    private PostingOperations operations;
    private CommentOperations commentOperations;

    public DraftType getDraftType() {
        return draftType;
    }

    public void setDraftType(DraftType draftType) {
        this.draftType = draftType;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPostingId() {
        return receiverPostingId;
    }

    public void setReceiverPostingId(String receiverPostingId) {
        this.receiverPostingId = receiverPostingId;
    }

    public String getReceiverCommentId() {
        return receiverCommentId;
    }

    public void setReceiverCommentId(String receiverCommentId) {
        this.receiverCommentId = receiverCommentId;
    }

    public String getRepliedToId() {
        return repliedToId;
    }

    public void setRepliedToId(String repliedToId) {
        this.repliedToId = repliedToId;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public AvatarDescription getOwnerAvatar() {
        return ownerAvatar;
    }

    public void setOwnerAvatar(AvatarDescription ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    public AcceptedReactions getAcceptedReactions() {
        return acceptedReactions;
    }

    public void setAcceptedReactions(AcceptedReactions acceptedReactions) {
        this.acceptedReactions = acceptedReactions;
    }

    public Body getBodySrc() {
        return bodySrc;
    }

    public void setBodySrc(Body bodySrc) {
        this.bodySrc = bodySrc;
    }

    public SourceFormat getBodySrcFormat() {
        return bodySrcFormat;
    }

    public void setBodySrcFormat(SourceFormat bodySrcFormat) {
        this.bodySrcFormat = bodySrcFormat;
    }

    public List<RemoteMedia> getMedia() {
        return media;
    }

    public void setMedia(List<RemoteMedia> media) {
        this.media = media;
    }

    public Long getPublishAt() {
        return publishAt;
    }

    public void setPublishAt(Long publishAt) {
        this.publishAt = publishAt;
    }

    public UpdateInfo getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(UpdateInfo updateInfo) {
        this.updateInfo = updateInfo;
    }

    public PostingOperations getOperations() {
        return operations;
    }

    public void setOperations(PostingOperations operations) {
        this.operations = operations;
    }

    public CommentOperations getCommentOperations() {
        return commentOperations;
    }

    public void setCommentOperations(CommentOperations commentOperations) {
        this.commentOperations = commentOperations;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(receiverName, "draft.receiver-name.blank");
        ValidationUtil.maxSize(receiverName, 63, "draft.receiver-name.wrong-size");
        ValidationUtil.maxSize(receiverPostingId, 40, "draft.receiver-posting-id.wrong-size");
        ValidationUtil.maxSize(receiverCommentId, 40, "draft.receiver-comment-id.wrong-size");
        ValidationUtil.maxSize(repliedToId, 40, "draft.replied-to-id.wrong-size");
        ValidationUtil.maxSize(ownerFullName, 96, "draft.owner-full-name.wrong-size");
        if (acceptedReactions != null) {
            acceptedReactions.validate();
        }
        if (updateInfo != null) {
            updateInfo.validate();
        }
    }

    @Override
    public DraftText clone() {
        try {
            return (DraftText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
