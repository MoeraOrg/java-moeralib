package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentSourceText extends Structure implements Cloneable {

    private AvatarDescription ownerAvatar;
    private Body bodySrc;
    private SourceFormat bodySrcFormat;
    private List<MediaWithDigest> media;
    private AcceptedReactions acceptedReactions;
    private String repliedToId;
    private CommentOperations operations;
    private ReactionOperations reactionOperations;
    private CommentOperations seniorOperations;

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
     * Retrieves array of IDs and digests of private media to be attached to the comment.
     *
     * @return the value
     */
    public List<MediaWithDigest> getMedia() {
        return media;
    }

    /**
     * Sets array of IDs and digests of private media to be attached to the comment.
     *
     * @param media the value to be set
     */
    public void setMedia(List<MediaWithDigest> media) {
        this.media = media;
    }

    /**
     * Retrieves types of reactions that the comment accepts.
     *
     * @return the value
     */
    public AcceptedReactions getAcceptedReactions() {
        return acceptedReactions;
    }

    /**
     * Sets types of reactions that the comment accepts.
     *
     * @param acceptedReactions the value to be set
     */
    public void setAcceptedReactions(AcceptedReactions acceptedReactions) {
        this.acceptedReactions = acceptedReactions;
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
        ValidationUtil.notNull(bodySrc, "comment.body-src.blank");
        ValidationUtil.maxSize(bodySrc, 65535, "comment.body-src.wrong-size");
        if (acceptedReactions != null) {
            acceptedReactions.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code CommentSourceText} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CommentSourceText clone() {
        try {
            return (CommentSourceText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
