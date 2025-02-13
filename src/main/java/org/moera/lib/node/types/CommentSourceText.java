package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentSourceText implements Cloneable {

    private AvatarDescription ownerAvatar;
    private Body bodySrc;
    private SourceFormat bodySrcFormat;
    private List<MediaWithDigest> media;
    private AcceptedReactions acceptedReactions;
    private String repliedToId;
    private CommentOperations operations;
    private CommentOperations seniorOperations;

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

    public String getRepliedToId() {
        return repliedToId;
    }

    public void setRepliedToId(String repliedToId) {
        this.repliedToId = repliedToId;
    }

    public CommentOperations getOperations() {
        return operations;
    }

    public void setOperations(CommentOperations operations) {
        this.operations = operations;
    }

    public CommentOperations getSeniorOperations() {
        return seniorOperations;
    }

    public void setSeniorOperations(CommentOperations seniorOperations) {
        this.seniorOperations = seniorOperations;
    }

    @Override
    public CommentSourceText clone() {
        try {
            return (CommentSourceText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
