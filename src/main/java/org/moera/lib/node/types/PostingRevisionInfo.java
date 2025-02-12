package org.moera.lib.node.types;

// This file is generated

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingRevisionInfo {

    private String id;
    private String receiverId;
    private Body bodyPreview;
    private byte[] bodySrcHash;
    private SourceFormat bodySrcFormat;
    private Body body;
    private BodyFormat bodyFormat;
    private List<MediaAttachment> media;
    private String heading;
    private UpdateInfo updateInfo;
    private Timestamp createdAt;
    private Timestamp deletedAt;
    private Timestamp receiverCreatedAt;
    private Timestamp receiverDeletedAt;
    private byte[] digest;
    private byte[] signature;
    private Integer signatureVersion;
    private ClientReactionInfo clientReaction;
    private ReactionTotalsInfo reactions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public Body getBodyPreview() {
        return bodyPreview;
    }

    public void setBodyPreview(Body bodyPreview) {
        this.bodyPreview = bodyPreview;
    }

    public byte[] getBodySrcHash() {
        return bodySrcHash;
    }

    public void setBodySrcHash(byte[] bodySrcHash) {
        this.bodySrcHash = bodySrcHash;
    }

    public SourceFormat getBodySrcFormat() {
        return bodySrcFormat;
    }

    public void setBodySrcFormat(SourceFormat bodySrcFormat) {
        this.bodySrcFormat = bodySrcFormat;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public BodyFormat getBodyFormat() {
        return bodyFormat;
    }

    public void setBodyFormat(BodyFormat bodyFormat) {
        this.bodyFormat = bodyFormat;
    }

    public List<MediaAttachment> getMedia() {
        return media;
    }

    public void setMedia(List<MediaAttachment> media) {
        this.media = media;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public UpdateInfo getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(UpdateInfo updateInfo) {
        this.updateInfo = updateInfo;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Timestamp getReceiverCreatedAt() {
        return receiverCreatedAt;
    }

    public void setReceiverCreatedAt(Timestamp receiverCreatedAt) {
        this.receiverCreatedAt = receiverCreatedAt;
    }

    public Timestamp getReceiverDeletedAt() {
        return receiverDeletedAt;
    }

    public void setReceiverDeletedAt(Timestamp receiverDeletedAt) {
        this.receiverDeletedAt = receiverDeletedAt;
    }

    public byte[] getDigest() {
        return digest;
    }

    public void setDigest(byte[] digest) {
        this.digest = digest;
    }

    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    public Integer getSignatureVersion() {
        return signatureVersion;
    }

    public void setSignatureVersion(Integer signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    public ClientReactionInfo getClientReaction() {
        return clientReaction;
    }

    public void setClientReaction(ClientReactionInfo clientReaction) {
        this.clientReaction = clientReaction;
    }

    public ReactionTotalsInfo getReactions() {
        return reactions;
    }

    public void setReactions(ReactionTotalsInfo reactions) {
        this.reactions = reactions;
    }

}
