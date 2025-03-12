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

    /**
     * Retrieves type of the draft.
     *
     * @return the value
     */
    public DraftType getDraftType() {
        return draftType;
    }

    /**
     * Sets type of the draft.
     *
     * @param draftType the value to be set
     */
    public void setDraftType(DraftType draftType) {
        this.draftType = draftType;
    }

    /**
     * Retrieves name of the node the draft is related to.
     *
     * @return the value
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets name of the node the draft is related to.
     *
     * @param receiverName the value to be set
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * Retrieves ID of the posting, mandatory for all types, except <code>new-posting</code>.
     *
     * @return the value
     */
    public String getReceiverPostingId() {
        return receiverPostingId;
    }

    /**
     * Sets ID of the posting, mandatory for all types, except <code>new-posting</code>.
     *
     * @param receiverPostingId the value to be set
     */
    public void setReceiverPostingId(String receiverPostingId) {
        this.receiverPostingId = receiverPostingId;
    }

    /**
     * Retrieves ID of the comment, mandatory for <code>comment-update</code> type.
     *
     * @return the value
     */
    public String getReceiverCommentId() {
        return receiverCommentId;
    }

    /**
     * Sets ID of the comment, mandatory for <code>comment-update</code> type.
     *
     * @param receiverCommentId the value to be set
     */
    public void setReceiverCommentId(String receiverCommentId) {
        this.receiverCommentId = receiverCommentId;
    }

    /**
     * Retrieves ID of the comment replied to.
     *
     * @return the value
     */
    public String getRepliedToId() {
        return repliedToId;
    }

    /**
     * Sets ID of the comment replied to.
     *
     * @param repliedToId the value to be set
     */
    public void setRepliedToId(String repliedToId) {
        this.repliedToId = repliedToId;
    }

    /**
     * Retrieves full name of the posting's/comment's owner.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets full name of the posting's/comment's owner.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves avatar of the posting's/comment's owner.
     *
     * @return the value
     */
    public AvatarDescription getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets avatar of the posting's/comment's owner.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarDescription ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    /**
     * Retrieves types of reactions that the posting accepts.
     *
     * @return the value
     */
    public AcceptedReactions getAcceptedReactions() {
        return acceptedReactions;
    }

    /**
     * Sets types of reactions that the posting accepts.
     *
     * @param acceptedReactions the value to be set
     */
    public void setAcceptedReactions(AcceptedReactions acceptedReactions) {
        this.acceptedReactions = acceptedReactions;
    }

    /**
     * Retrieves the source text of the draft, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getBodySrc() {
        return bodySrc;
    }

    /**
     * Sets the source text of the draft, a string representation of a JSON structure.
     *
     * @param bodySrc the value to be set
     */
    public void setBodySrc(Body bodySrc) {
        this.bodySrc = bodySrc;
    }

    /**
     * Retrieves format of the source text of the draft, <code>plain-text</code> by default; the list of available
     * formats is returned in <code><a href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @return the value
     */
    public SourceFormat getBodySrcFormat() {
        return bodySrcFormat;
    }

    /**
     * Sets format of the source text of the draft, <code>plain-text</code> by default; the list of available formats
     * is returned in <code><a href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @param bodySrcFormat the value to be set
     */
    public void setBodySrcFormat(SourceFormat bodySrcFormat) {
        this.bodySrcFormat = bodySrcFormat;
    }

    /**
     * Retrieves list of the media attached to the draft, the media may be located on another node.
     *
     * @return the value
     */
    public List<RemoteMedia> getMedia() {
        return media;
    }

    /**
     * Sets list of the media attached to the draft, the media may be located on another node.
     *
     * @param media the value to be set
     */
    public void setMedia(List<RemoteMedia> media) {
        this.media = media;
    }

    /**
     * Retrieves story publication timestamp - the time the story must be published under in the feed.
     *
     * @return the value
     */
    public Long getPublishAt() {
        return publishAt;
    }

    /**
     * Sets story publication timestamp - the time the story must be published under in the feed.
     *
     * @param publishAt the value to be set
     */
    public void setPublishAt(Long publishAt) {
        this.publishAt = publishAt;
    }

    /**
     * Retrieves description of the update.
     *
     * @return the value
     */
    public UpdateInfo getUpdateInfo() {
        return updateInfo;
    }

    /**
     * Sets description of the update.
     *
     * @param updateInfo the value to be set
     */
    public void setUpdateInfo(UpdateInfo updateInfo) {
        this.updateInfo = updateInfo;
    }

    /**
     * Retrieves draft of the list of operations and the corresponding principals.
     *
     * @return the value
     */
    public PostingOperations getOperations() {
        return operations;
    }

    /**
     * Sets draft of the list of operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(PostingOperations operations) {
        this.operations = operations;
    }

    /**
     * Retrieves draft of the list of operations and the corresponding principals that are overridden in the posting's
     * comments
     * .
     *
     * @return the value
     */
    public CommentOperations getCommentOperations() {
        return commentOperations;
    }

    /**
     * Sets draft of the list of operations and the corresponding principals that are overridden in the posting's
     * comments
     * .
     *
     * @param commentOperations the value to be set
     */
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

    /**
     * Creates and returns a copy of this {@code DraftText} object.
     *
     * @return a clone of this instance
     */
    @Override
    public DraftText clone() {
        try {
            return (DraftText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
