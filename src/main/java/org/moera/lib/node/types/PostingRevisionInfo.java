package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingRevisionInfo extends Structure implements Cloneable {

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
    private long createdAt;
    private Long deletedAt;
    private Long receiverCreatedAt;
    private Long receiverDeletedAt;
    private byte[] digest;
    private byte[] signature;
    private Short signatureVersion;
    private ClientReactionInfo clientReaction;
    private ReactionTotalsInfo reactions;

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
     * Retrieves ID of the original revision (for cached copies of remote postings only).
     *
     * @return the value
     */
    public String getReceiverId() {
        return receiverId;
    }

    /**
     * Sets ID of the original revision (for cached copies of remote postings only).
     *
     * @param receiverId the value to be set
     */
    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * Retrieves preview of the revision's body, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getBodyPreview() {
        return bodyPreview;
    }

    /**
     * Sets preview of the revision's body, a string representation of a JSON structure.
     *
     * @param bodyPreview the value to be set
     */
    public void setBodyPreview(Body bodyPreview) {
        this.bodyPreview = bodyPreview;
    }

    /**
     * Retrieves hash of the source text of the revision.
     *
     * @return the value
     */
    public byte[] getBodySrcHash() {
        return bodySrcHash;
    }

    /**
     * Sets hash of the source text of the revision.
     *
     * @param bodySrcHash the value to be set
     */
    public void setBodySrcHash(byte[] bodySrcHash) {
        this.bodySrcHash = bodySrcHash;
    }

    /**
     * Retrieves format of the source text of the revision, the list of available formats is returned in <code><a
     * href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @return the value
     */
    public SourceFormat getBodySrcFormat() {
        return bodySrcFormat;
    }

    /**
     * Sets format of the source text of the revision, the list of available formats is returned in <code><a
     * href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @param bodySrcFormat the value to be set
     */
    public void setBodySrcFormat(SourceFormat bodySrcFormat) {
        this.bodySrcFormat = bodySrcFormat;
    }

    /**
     * Retrieves body of the revision, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getBody() {
        return body;
    }

    /**
     * Sets body of the revision, a string representation of a JSON structure.
     *
     * @param body the value to be set
     */
    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * Retrieves format of the body of the revision.
     *
     * @return the value
     */
    public BodyFormat getBodyFormat() {
        return bodyFormat;
    }

    /**
     * Sets format of the body of the revision.
     *
     * @param bodyFormat the value to be set
     */
    public void setBodyFormat(BodyFormat bodyFormat) {
        this.bodyFormat = bodyFormat;
    }

    /**
     * Retrieves list of the media attached to the revision.
     *
     * @return the value
     */
    public List<MediaAttachment> getMedia() {
        return media;
    }

    /**
     * Sets list of the media attached to the revision.
     *
     * @param media the value to be set
     */
    public void setMedia(List<MediaAttachment> media) {
        this.media = media;
    }

    /**
     * Retrieves heading of the revision.
     *
     * @return the value
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets heading of the revision.
     *
     * @param heading the value to be set
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * Retrieves description of the latest update.
     *
     * @return the value
     */
    public UpdateInfo getUpdateInfo() {
        return updateInfo;
    }

    /**
     * Sets description of the latest update.
     *
     * @param updateInfo the value to be set
     */
    public void setUpdateInfo(UpdateInfo updateInfo) {
        this.updateInfo = updateInfo;
    }

    /**
     * Retrieves revision creation timestamp - the real time when the revision was created.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets revision creation timestamp - the real time when the revision was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves revision deletion timestamp - the time when the revision was deleted.
     *
     * @return the value
     */
    public Long getDeletedAt() {
        return deletedAt;
    }

    /**
     * Sets revision deletion timestamp - the time when the revision was deleted.
     *
     * @param deletedAt the value to be set
     */
    public void setDeletedAt(Long deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * Retrieves original revision creation timestamp (for cached copies of remote postings only).
     *
     * @return the value
     */
    public Long getReceiverCreatedAt() {
        return receiverCreatedAt;
    }

    /**
     * Sets original revision creation timestamp (for cached copies of remote postings only).
     *
     * @param receiverCreatedAt the value to be set
     */
    public void setReceiverCreatedAt(Long receiverCreatedAt) {
        this.receiverCreatedAt = receiverCreatedAt;
    }

    /**
     * Retrieves original revision deletion timestamp (for cached copies of remote postings only).
     *
     * @return the value
     */
    public Long getReceiverDeletedAt() {
        return receiverDeletedAt;
    }

    /**
     * Sets original revision deletion timestamp (for cached copies of remote postings only).
     *
     * @param receiverDeletedAt the value to be set
     */
    public void setReceiverDeletedAt(Long receiverDeletedAt) {
        this.receiverDeletedAt = receiverDeletedAt;
    }

    /**
     * Retrieves cryptographic digest of the revision (use <code><a href="fingerprints.html#Posting">Posting</a></code>
     * fingerprint)
     * .
     *
     * @return the value
     */
    public byte[] getDigest() {
        return digest;
    }

    /**
     * Sets cryptographic digest of the revision (use <code><a href="fingerprints.html#Posting">Posting</a></code>
     * fingerprint)
     * .
     *
     * @param digest the value to be set
     */
    public void setDigest(byte[] digest) {
        this.digest = digest;
    }

    /**
     * Retrieves the revision's owner signature (use <code><a href="fingerprints.html#Posting">Posting</a></code>
     * fingerprint)
     * .
     *
     * @return the value
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the revision's owner signature (use <code><a href="fingerprints.html#Posting">Posting</a></code>
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
     * Retrieves details of the existing reaction (if any) of the client's owner.
     *
     * @return the value
     */
    public ClientReactionInfo getClientReaction() {
        return clientReaction;
    }

    /**
     * Sets details of the existing reaction (if any) of the client's owner.
     *
     * @param clientReaction the value to be set
     */
    public void setClientReaction(ClientReactionInfo clientReaction) {
        this.clientReaction = clientReaction;
    }

    /**
     * Retrieves reactions summary of the posting revision.
     *
     * @return the value
     */
    public ReactionTotalsInfo getReactions() {
        return reactions;
    }

    /**
     * Sets reactions summary of the posting revision.
     *
     * @param reactions the value to be set
     */
    public void setReactions(ReactionTotalsInfo reactions) {
        this.reactions = reactions;
    }

    @Override
    public void validate() {
        super.validate();
        if (updateInfo != null) {
            updateInfo.validate();
        }
        if (reactions != null) {
            reactions.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code PostingRevisionInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PostingRevisionInfo clone() {
        try {
            return (PostingRevisionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
