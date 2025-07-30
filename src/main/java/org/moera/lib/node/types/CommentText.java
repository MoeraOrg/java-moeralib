package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentText extends Structure implements Cloneable {

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
    private RejectedReactions seniorRejectedReactions;
    private String repliedToId;
    private byte[] signature;
    private Short signatureVersion;
    private CommentOperations operations;
    private ReactionOperations reactionOperations;
    private CommentOperations seniorOperations;

    /**
     * Retrieves node name of the comment's owner.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets node name of the comment's owner.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Retrieves full name of the comment's owner.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets full name of the comment's owner.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves gender of the comment's owner.
     *
     * @return the value
     */
    public String getOwnerGender() {
        return ownerGender;
    }

    /**
     * Sets gender of the comment's owner.
     *
     * @param ownerGender the value to be set
     */
    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    /**
     * Retrieves avatar of the comment's owner.
     *
     * @return the value
     */
    public AvatarDescription getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets avatar of the comment's owner.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarDescription ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    /**
     * Retrieves preview of the comment's body, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getBodyPreview() {
        return bodyPreview;
    }

    /**
     * Sets preview of the comment's body, a string representation of a JSON structure.
     *
     * @param bodyPreview the value to be set
     */
    public void setBodyPreview(Body bodyPreview) {
        this.bodyPreview = bodyPreview;
    }

    /**
     * Retrieves the source text of the comment, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getBodySrc() {
        return bodySrc;
    }

    /**
     * Sets the source text of the comment, a string representation of a JSON structure.
     *
     * @param bodySrc the value to be set
     */
    public void setBodySrc(Body bodySrc) {
        this.bodySrc = bodySrc;
    }

    /**
     * Retrieves format of the source text of the comment, <code>plain-text</code> by default; the list of available
     * formats is returned in <code><a href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @return the value
     */
    public SourceFormat getBodySrcFormat() {
        return bodySrcFormat;
    }

    /**
     * Sets format of the source text of the comment, <code>plain-text</code> by default; the list of available formats
     * is returned in <code><a href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @param bodySrcFormat the value to be set
     */
    public void setBodySrcFormat(SourceFormat bodySrcFormat) {
        this.bodySrcFormat = bodySrcFormat;
    }

    /**
     * Retrieves body of the comment, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getBody() {
        return body;
    }

    /**
     * Sets body of the comment, a string representation of a JSON structure.
     *
     * @param body the value to be set
     */
    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * Retrieves format of the body of the comment, may have any value meaningful for the client.
     *
     * @return the value
     */
    public BodyFormat getBodyFormat() {
        return bodyFormat;
    }

    /**
     * Sets format of the body of the comment, may have any value meaningful for the client.
     *
     * @param bodyFormat the value to be set
     */
    public void setBodyFormat(BodyFormat bodyFormat) {
        this.bodyFormat = bodyFormat;
    }

    /**
     * Retrieves array of IDs of private media to be attached to the comment.
     *
     * @return the value
     */
    public List<String> getMedia() {
        return media;
    }

    /**
     * Sets array of IDs of private media to be attached to the comment.
     *
     * @param media the value to be set
     */
    public void setMedia(List<String> media) {
        this.media = media;
    }

    /**
     * Retrieves comment creation timestamp - the real time when the comment was created.
     *
     * @return the value
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets comment creation timestamp - the real time when the comment was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves types of reactions that the comment rejects.
     *
     * @return the value
     */
    public RejectedReactions getRejectedReactions() {
        return rejectedReactions;
    }

    /**
     * Sets types of reactions that the comment rejects.
     *
     * @param rejectedReactions the value to be set
     */
    public void setRejectedReactions(RejectedReactions rejectedReactions) {
        this.rejectedReactions = rejectedReactions;
    }

    /**
     * Retrieves types of reactions that the comment rejects, as defined by the posting's owner ("senior"); only the
     * senior may set this
     * .
     *
     * @return the value
     */
    public RejectedReactions getSeniorRejectedReactions() {
        return seniorRejectedReactions;
    }

    /**
     * Sets types of reactions that the comment rejects, as defined by the posting's owner ("senior"); only the senior
     * may set this
     * .
     *
     * @param seniorRejectedReactions the value to be set
     */
    public void setSeniorRejectedReactions(RejectedReactions seniorRejectedReactions) {
        this.seniorRejectedReactions = seniorRejectedReactions;
    }

    /**
     * Retrieves ID of the comment this comment is replying to.
     *
     * @return the value
     */
    public String getRepliedToId() {
        return repliedToId;
    }

    /**
     * Sets ID of the comment this comment is replying to.
     *
     * @param repliedToId the value to be set
     */
    public void setRepliedToId(String repliedToId) {
        this.repliedToId = repliedToId;
    }

    /**
     * Retrieves the comment's owner signature (use <code><a href="fingerprints.html#Comment">Comment</a></code>
     * fingerprint)
     * .
     *
     * @return the value
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the comment's owner signature (use <code><a href="fingerprints.html#Comment">Comment</a></code>
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
    public CommentOperations getOperations() {
        return operations;
    }

    /**
     * Sets the operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(CommentOperations operations) {
        this.operations = operations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden in reactions to the comment.
     *
     * @return the value
     */
    public ReactionOperations getReactionOperations() {
        return reactionOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden in reactions to the comment.
     *
     * @param reactionOperations the value to be set
     */
    public void setReactionOperations(ReactionOperations reactionOperations) {
        this.reactionOperations = reactionOperations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden by the posting's owner ("senior");
     * only the senior may set this
     * .
     *
     * @return the value
     */
    public CommentOperations getSeniorOperations() {
        return seniorOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden by the posting's owner ("senior"); only
     * the senior may set this
     * .
     *
     * @param seniorOperations the value to be set
     */
    public void setSeniorOperations(CommentOperations seniorOperations) {
        this.seniorOperations = seniorOperations;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(ownerName, 63, "comment.owner-name.wrong-size");
        ValidationUtil.maxSize(ownerFullName, 96, "comment.owner-full-name.wrong-size");
        ValidationUtil.maxSize(ownerGender, 31, "comment.owner-gender.wrong-size");
        if (rejectedReactions != null) {
            rejectedReactions.validate();
        }
        if (seniorRejectedReactions != null) {
            seniorRejectedReactions.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code CommentText} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CommentText clone() {
        try {
            return (CommentText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
