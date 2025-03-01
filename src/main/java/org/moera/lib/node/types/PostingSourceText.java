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
    private AcceptedReactions acceptedReactions;
    private PostingOperations operations;
    private CommentOperations commentOperations;
    private ReactionOperations reactionOperations;
    private ReactionOperations commentReactionOperations;

    public AvatarDescription getOwnerAvatar() {
        return ownerAvatar;
    }

    public void setOwnerAvatar(AvatarDescription ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
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

    public List<MediaWithDigest> getMedia() {
        return media;
    }

    public void setMedia(List<MediaWithDigest> media) {
        this.media = media;
    }

    public AcceptedReactions getAcceptedReactions() {
        return acceptedReactions;
    }

    public void setAcceptedReactions(AcceptedReactions acceptedReactions) {
        this.acceptedReactions = acceptedReactions;
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

    public ReactionOperations getReactionOperations() {
        return reactionOperations;
    }

    public void setReactionOperations(ReactionOperations reactionOperations) {
        this.reactionOperations = reactionOperations;
    }

    public ReactionOperations getCommentReactionOperations() {
        return commentReactionOperations;
    }

    public void setCommentReactionOperations(ReactionOperations commentReactionOperations) {
        this.commentReactionOperations = commentReactionOperations;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(bodySrc, "posting.body-src.blank");
        ValidationUtil.maxSize(bodySrc, 65535, "posting.body-src.wrong-size");
        if (acceptedReactions != null) {
            acceptedReactions.validate();
        }
    }

    @Override
    public PostingSourceText clone() {
        try {
            return (PostingSourceText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
