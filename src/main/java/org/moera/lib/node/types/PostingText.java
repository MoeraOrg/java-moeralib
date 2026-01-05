package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingText extends Structure implements Cloneable {

    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private AvatarDescription ownerAvatar;
    private Body bodyPreview;
    private Body bodySrc;
    private SourceFormat bodySrcFormat;
    private Body body;
    private BodyFormat bodyFormat;
    private List<String> media;
    private Long createdAt;
    private RejectedReactions rejectedReactions;
    private RejectedReactions commentRejectedReactions;
    private List<StoryAttributes> publications;
    private UpdateInfo updateInfo;
    private byte[] signature;
    private Short signatureVersion;
    private PostingOperations operations;
    private CommentOperations commentOperations;
    private ReactionOperations reactionOperations;
    private ReactionOperations commentReactionOperations;
    private String externalSourceUri;

    /**
     * Retrieves node name of the posting's owner.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets node name of the posting's owner.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Retrieves full name of the posting's owner.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets full name of the posting's owner.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves gender of the posting's owner.
     *
     * @return the value
     */
    public String getOwnerGender() {
        return ownerGender;
    }

    /**
     * Sets gender of the posting's owner.
     *
     * @param ownerGender the value to be set
     */
    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    /**
     * Retrieves avatar of the posting's owner.
     *
     * @return the value
     */
    public AvatarDescription getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets avatar of the posting's owner.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarDescription ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    /**
     * Retrieves preview of the posting's body, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getBodyPreview() {
        return bodyPreview;
    }

    /**
     * Sets preview of the posting's body, a string representation of a JSON structure.
     *
     * @param bodyPreview the value to be set
     */
    public void setBodyPreview(Body bodyPreview) {
        this.bodyPreview = bodyPreview;
    }

    /**
     * Retrieves the source text of the posting, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getBodySrc() {
        return bodySrc;
    }

    /**
     * Sets the source text of the posting, a string representation of a JSON structure.
     *
     * @param bodySrc the value to be set
     */
    public void setBodySrc(Body bodySrc) {
        this.bodySrc = bodySrc;
    }

    /**
     * Retrieves format of the source text of the posting, <code>plain-text</code> by default; the list of available
     * formats is returned in <code><a href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @return the value
     */
    public SourceFormat getBodySrcFormat() {
        return bodySrcFormat;
    }

    /**
     * Sets format of the source text of the posting, <code>plain-text</code> by default; the list of available formats
     * is returned in <code><a href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @param bodySrcFormat the value to be set
     */
    public void setBodySrcFormat(SourceFormat bodySrcFormat) {
        this.bodySrcFormat = bodySrcFormat;
    }

    /**
     * Retrieves body of the posting, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getBody() {
        return body;
    }

    /**
     * Sets body of the posting, a string representation of a JSON structure.
     *
     * @param body the value to be set
     */
    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * Retrieves format of the body of the posting, may have any value meaningful for the client.
     *
     * @return the value
     */
    public BodyFormat getBodyFormat() {
        return bodyFormat;
    }

    /**
     * Sets format of the body of the posting, may have any value meaningful for the client.
     *
     * @param bodyFormat the value to be set
     */
    public void setBodyFormat(BodyFormat bodyFormat) {
        this.bodyFormat = bodyFormat;
    }

    /**
     * Retrieves array of IDs of private media to be attached to the posting.
     *
     * @return the value
     */
    public List<String> getMedia() {
        return media;
    }

    /**
     * Sets array of IDs of private media to be attached to the posting.
     *
     * @param media the value to be set
     */
    public void setMedia(List<String> media) {
        this.media = media;
    }

    /**
     * Retrieves posting creation timestamp - the real time when the posting was created.
     *
     * @return the value
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets posting creation timestamp - the real time when the posting was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
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
     * Retrieves types of reactions that the posting's comments should reject.
     *
     * @return the value
     */
    public RejectedReactions getCommentRejectedReactions() {
        return commentRejectedReactions;
    }

    /**
     * Sets types of reactions that the posting's comments should reject.
     *
     * @param commentRejectedReactions the value to be set
     */
    public void setCommentRejectedReactions(RejectedReactions commentRejectedReactions) {
        this.commentRejectedReactions = commentRejectedReactions;
    }

    /**
     * Retrieves list of publications in feeds that must be made after creating the posting (for new postings only).
     *
     * @return the value
     */
    public List<StoryAttributes> getPublications() {
        return publications;
    }

    /**
     * Sets list of publications in feeds that must be made after creating the posting (for new postings only).
     *
     * @param publications the value to be set
     */
    public void setPublications(List<StoryAttributes> publications) {
        this.publications = publications;
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
     * Retrieves the posting's owner signature (use <code><a href="fingerprints.html#Posting">Posting</a></code>
     * fingerprint)
     * .
     *
     * @return the value
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the posting's owner signature (use <code><a href="fingerprints.html#Posting">Posting</a></code>
     * fingerprint)
     * .
     *
     * @param signature the value to be set
     */
    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    /**
     * Retrieves signature version (i.e. fingerprint version).
     *
     * @return the value
     */
    public Short getSignatureVersion() {
        return signatureVersion;
    }

    /**
     * Sets signature version (i.e. fingerprint version).
     *
     * @param signatureVersion the value to be set
     */
    public void setSignatureVersion(Short signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    /**
     * Retrieves the operations and the corresponding principals.
     *
     * @return the value
     */
    public PostingOperations getOperations() {
        return operations;
    }

    /**
     * Sets the operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(PostingOperations operations) {
        this.operations = operations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden in the posting's comments.
     *
     * @return the value
     */
    public CommentOperations getCommentOperations() {
        return commentOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden in the posting's comments.
     *
     * @param commentOperations the value to be set
     */
    public void setCommentOperations(CommentOperations commentOperations) {
        this.commentOperations = commentOperations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden in reactions to the posting.
     *
     * @return the value
     */
    public ReactionOperations getReactionOperations() {
        return reactionOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden in reactions to the posting.
     *
     * @param reactionOperations the value to be set
     */
    public void setReactionOperations(ReactionOperations reactionOperations) {
        this.reactionOperations = reactionOperations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden in reactions to the posting's
     * comments
     * .
     *
     * @return the value
     */
    public ReactionOperations getCommentReactionOperations() {
        return commentReactionOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden in reactions to the posting's comments
     * .
     *
     * @param commentReactionOperations the value to be set
     */
    public void setCommentReactionOperations(ReactionOperations commentReactionOperations) {
        this.commentReactionOperations = commentReactionOperations;
    }

    /**
     * Retrieves URI of the external source the posting was received from; used by software that automatically forwards
     * postings from other social networks (for admin only)
     * .
     *
     * @return the value
     */
    public String getExternalSourceUri() {
        return externalSourceUri;
    }

    /**
     * Sets URI of the external source the posting was received from; used by software that automatically forwards
     * postings from other social networks (for admin only)
     * .
     *
     * @param externalSourceUri the value to be set
     */
    public void setExternalSourceUri(String externalSourceUri) {
        this.externalSourceUri = externalSourceUri;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(ownerName, 63, "posting.owner-name.wrong-size");
        ValidationUtil.maxSize(ownerFullName, 96, "posting.owner-full-name.wrong-size");
        ValidationUtil.maxSize(ownerGender, 31, "posting.owner-gender.wrong-size");
        if (rejectedReactions != null) {
            rejectedReactions.validate();
        }
        if (commentRejectedReactions != null) {
            commentRejectedReactions.validate();
        }
        if (updateInfo != null) {
            updateInfo.validate();
        }
        ValidationUtil.maxSize(externalSourceUri, 1024, "posting.external-source-uri.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code PostingText} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PostingText clone() {
        try {
            return (PostingText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
