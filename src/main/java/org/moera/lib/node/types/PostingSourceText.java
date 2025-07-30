package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingSourceText extends Structure implements Cloneable {

    private AvatarDescription ownerAvatar;
    private Body bodySrc;
    private SourceFormat bodySrcFormat;
    private List<MediaWithDigest> media;
    private RejectedReactions rejectedReactions;
    private RejectedReactions commentRejectedReactions;
    private PostingOperations operations;
    private CommentOperations commentOperations;
    private ReactionOperations reactionOperations;
    private ReactionOperations commentReactionOperations;

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
     * Retrieves array of IDs and digests of private media to be attached to the posting.
     *
     * @return the value
     */
    public List<MediaWithDigest> getMedia() {
        return media;
    }

    /**
     * Sets array of IDs and digests of private media to be attached to the posting.
     *
     * @param media the value to be set
     */
    public void setMedia(List<MediaWithDigest> media) {
        this.media = media;
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
     * Retrieves types of reactions that the posting's comments should rejects.
     *
     * @return the value
     */
    public RejectedReactions getCommentRejectedReactions() {
        return commentRejectedReactions;
    }

    /**
     * Sets types of reactions that the posting's comments should rejects.
     *
     * @param commentRejectedReactions the value to be set
     */
    public void setCommentRejectedReactions(RejectedReactions commentRejectedReactions) {
        this.commentRejectedReactions = commentRejectedReactions;
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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(bodySrc, "posting.body-src.blank");
        ValidationUtil.maxSize(bodySrc, 65535, "posting.body-src.wrong-size");
        if (rejectedReactions != null) {
            rejectedReactions.validate();
        }
        if (commentRejectedReactions != null) {
            commentRejectedReactions.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code PostingSourceText} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PostingSourceText clone() {
        try {
            return (PostingSourceText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
