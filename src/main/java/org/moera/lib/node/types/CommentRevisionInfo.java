package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentRevisionInfo extends Structure implements Cloneable {

    private String id;
    private String postingRevisionId;
    private Body bodyPreview;
    private byte[] bodySrcHash;
    private SourceFormat bodySrcFormat;
    private Body body;
    private BodyFormat bodyFormat;
    private String heading;
    private long createdAt;
    private Long deletedAt;
    private Long deadline;
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
     * Retrieves ID of the posting revision that was actual at the moment of creation of this comment revision.
     *
     * @return the value
     */
    public String getPostingRevisionId() {
        return postingRevisionId;
    }

    /**
     * Sets ID of the posting revision that was actual at the moment of creation of this comment revision.
     *
     * @param postingRevisionId the value to be set
     */
    public void setPostingRevisionId(String postingRevisionId) {
        this.postingRevisionId = postingRevisionId;
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
     * Retrieves format of the body of the revision, may have any value meaningful for the client.
     *
     * @return the value
     */
    public BodyFormat getBodyFormat() {
        return bodyFormat;
    }

    /**
     * Sets format of the body of the revision, may have any value meaningful for the client.
     *
     * @param bodyFormat the value to be set
     */
    public void setBodyFormat(BodyFormat bodyFormat) {
        this.bodyFormat = bodyFormat;
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
     * Retrieves revision deletion timestamp - the time when the revision will be deleted and the previous revision
     * will take its place
     * .
     *
     * @return the value
     */
    public Long getDeadline() {
        return deadline;
    }

    /**
     * Sets revision deletion timestamp - the time when the revision will be deleted and the previous revision will
     * take its place
     * .
     *
     * @param deadline the value to be set
     */
    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    /**
     * Retrieves cryptographic digest of the revision (use <code><a href="fingerprints.html#Comment">Comment</a></code>
     * fingerprint)
     * .
     *
     * @return the value
     */
    public byte[] getDigest() {
        return digest;
    }

    /**
     * Sets cryptographic digest of the revision (use <code><a href="fingerprints.html#Comment">Comment</a></code>
     * fingerprint)
     * .
     *
     * @param digest the value to be set
     */
    public void setDigest(byte[] digest) {
        this.digest = digest;
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
     * Retrieves summary of reactions to the revision.
     *
     * @return the value
     */
    public ReactionTotalsInfo getReactions() {
        return reactions;
    }

    /**
     * Sets summary of reactions to the revision.
     *
     * @param reactions the value to be set
     */
    public void setReactions(ReactionTotalsInfo reactions) {
        this.reactions = reactions;
    }

    /**
     * Creates and returns a copy of this {@code CommentRevisionInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CommentRevisionInfo clone() {
        try {
            return (CommentRevisionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
