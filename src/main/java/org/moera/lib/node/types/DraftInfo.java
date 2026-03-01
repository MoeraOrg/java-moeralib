package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DraftInfo extends Structure implements Cloneable {

    private String id;
    private DraftType draftType;
    private String receiverName;
    private String receiverPostingId;
    private String receiverCommentId;
    private String repliedToId;
    private long createdAt;
    private Long editedAt;
    private Long deadline;
    private String ownerFullName;
    private AvatarImage ownerAvatar;
    private RejectedReactions rejectedReactions;
    private RejectedReactions commentRejectedReactions;
    private Body bodySrc;
    private SourceFormat bodySrcFormat;
    private Body body;
    private BodyFormat bodyFormat;
    private List<MediaAttachment> media;
    private String heading;
    private Long publishAt;
    private UpdateInfo updateInfo;
    private PostingOperations operations;
    private CommentOperations commentOperations;
    private Boolean allowAnonymousComments;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets .
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

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
     * Retrieves ID of the posting, set for all types, except <code>new-posting</code>.
     *
     * @return the value
     */
    public String getReceiverPostingId() {
        return receiverPostingId;
    }

    /**
     * Sets ID of the posting, set for all types, except <code>new-posting</code>.
     *
     * @param receiverPostingId the value to be set
     */
    public void setReceiverPostingId(String receiverPostingId) {
        this.receiverPostingId = receiverPostingId;
    }

    /**
     * Retrieves ID of the comment, set for <code>comment-update</code> type.
     *
     * @return the value
     */
    public String getReceiverCommentId() {
        return receiverCommentId;
    }

    /**
     * Sets ID of the comment, set for <code>comment-update</code> type.
     *
     * @param receiverCommentId the value to be set
     */
    public void setReceiverCommentId(String receiverCommentId) {
        this.receiverCommentId = receiverCommentId;
    }

    /**
     * Retrieves ID of the comment replied to, set for comment drafts, if needed.
     *
     * @return the value
     */
    public String getRepliedToId() {
        return repliedToId;
    }

    /**
     * Sets ID of the comment replied to, set for comment drafts, if needed.
     *
     * @param repliedToId the value to be set
     */
    public void setRepliedToId(String repliedToId) {
        this.repliedToId = repliedToId;
    }

    /**
     * Retrieves draft creation timestamp - the real time when the draft was created.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets draft creation timestamp - the real time when the draft was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves draft editing timestamp - the last time the draft was updated.
     *
     * @return the value
     */
    public Long getEditedAt() {
        return editedAt;
    }

    /**
     * Sets draft editing timestamp - the last time the draft was updated.
     *
     * @param editedAt the value to be set
     */
    public void setEditedAt(Long editedAt) {
        this.editedAt = editedAt;
    }

    /**
     * Retrieves draft purging timestamp - the time when the draft will be purged from the database, if not updated.
     *
     * @return the value
     */
    public Long getDeadline() {
        return deadline;
    }

    /**
     * Sets draft purging timestamp - the time when the draft will be purged from the database, if not updated.
     *
     * @param deadline the value to be set
     */
    public void setDeadline(Long deadline) {
        this.deadline = deadline;
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
    public AvatarImage getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets avatar of the posting's/comment's owner.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarImage ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    /**
     * Retrieves types of reactions that the posting rejects.
     *
     * @return the value
     */
    public RejectedReactions getRejectedReactions() {
        return rejectedReactions;
    }

    /**
     * Sets types of reactions that the posting rejects.
     *
     * @param rejectedReactions the value to be set
     */
    public void setRejectedReactions(RejectedReactions rejectedReactions) {
        this.rejectedReactions = rejectedReactions;
    }

    /**
     * Retrieves types of reactions that the comment should reject, set for posting drafts, if needed.
     *
     * @return the value
     */
    public RejectedReactions getCommentRejectedReactions() {
        return commentRejectedReactions;
    }

    /**
     * Sets types of reactions that the comment should reject, set for posting drafts, if needed.
     *
     * @param commentRejectedReactions the value to be set
     */
    public void setCommentRejectedReactions(RejectedReactions commentRejectedReactions) {
        this.commentRejectedReactions = commentRejectedReactions;
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
     * Retrieves body of the draft, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getBody() {
        return body;
    }

    /**
     * Sets body of the draft, a string representation of a JSON structure.
     *
     * @param body the value to be set
     */
    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * Retrieves format of the body of the draft.
     *
     * @return the value
     */
    public BodyFormat getBodyFormat() {
        return bodyFormat;
    }

    /**
     * Sets format of the body of the draft.
     *
     * @param bodyFormat the value to be set
     */
    public void setBodyFormat(BodyFormat bodyFormat) {
        this.bodyFormat = bodyFormat;
    }

    /**
     * Retrieves list of the media attached to the draft.
     *
     * @return the value
     */
    public List<MediaAttachment> getMedia() {
        return media;
    }

    /**
     * Sets list of the media attached to the draft.
     *
     * @param media the value to be set
     */
    public void setMedia(List<MediaAttachment> media) {
        this.media = media;
    }

    /**
     * Retrieves heading of the draft.
     *
     * @return the value
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets heading of the draft.
     *
     * @param heading the value to be set
     */
    public void setHeading(String heading) {
        this.heading = heading;
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
     * comments, set for posting drafts, if needed
     * .
     *
     * @return the value
     */
    public CommentOperations getCommentOperations() {
        return commentOperations;
    }

    /**
     * Sets draft of the list of operations and the corresponding principals that are overridden in the posting's
     * comments, set for posting drafts, if needed
     * .
     *
     * @param commentOperations the value to be set
     */
    public void setCommentOperations(CommentOperations commentOperations) {
        this.commentOperations = commentOperations;
    }

    /**
     * Retrieves <code>true</code>, if it is allowed to add anonymous comments to the post, <code>false</code>
     * (default) otherwise
     * .
     *
     * @return the value
     */
    public Boolean getAllowAnonymousComments() {
        return allowAnonymousComments;
    }

    /**
     * Sets <code>true</code>, if it is allowed to add anonymous comments to the post, <code>false</code> (default)
     * otherwise
     * .
     *
     * @param allowAnonymousComments the value to be set
     */
    public void setAllowAnonymousComments(Boolean allowAnonymousComments) {
        this.allowAnonymousComments = allowAnonymousComments;
    }

    @Override
    public void validate() {
        super.validate();
        if (rejectedReactions != null) {
            rejectedReactions.validate();
        }
        if (commentRejectedReactions != null) {
            commentRejectedReactions.validate();
        }
        if (updateInfo != null) {
            updateInfo.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code DraftInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public DraftInfo clone() {
        try {
            return (DraftInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
