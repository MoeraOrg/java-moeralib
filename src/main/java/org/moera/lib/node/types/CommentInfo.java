package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentInfo extends Structure implements Cloneable, MediaInfo {

    private String id;
    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private AvatarImage ownerAvatar;
    private String postingId;
    private String postingRevisionId;
    private String revisionId;
    private int totalRevisions;
    private Body bodyPreview;
    private Body bodySrc;
    private byte[] bodySrcHash;
    private SourceFormat bodySrcFormat;
    private Body body;
    private BodyFormat bodyFormat;
    private List<MediaAttachment> media;
    private String heading;
    private RepliedTo repliedTo;
    private long moment;
    private long createdAt;
    private Long editedAt;
    private Long deletedAt;
    private long revisionCreatedAt;
    private Long deadline;
    private byte[] digest;
    private byte[] signature;
    private Short signatureVersion;
    private CommentOperations operations;
    private ReactionOperations reactionOperations;
    private CommentOperations ownerOperations;
    private CommentOperations seniorOperations;
    private List<String> blockedOperations;
    private List<SheriffMark> sheriffMarks;
    private AcceptedReactions acceptedReactions;
    private ClientReactionInfo clientReaction;
    private ClientReactionInfo seniorReaction;
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
    public AvatarImage getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets avatar of the comment's owner.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarImage ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    /**
     * Retrieves ID of the parent posting of the comment.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the parent posting of the comment.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the revision of parent posting that was current when the comment was created.
     *
     * @return the value
     */
    public String getPostingRevisionId() {
        return postingRevisionId;
    }

    /**
     * Sets ID of the revision of parent posting that was current when the comment was created.
     *
     * @param postingRevisionId the value to be set
     */
    public void setPostingRevisionId(String postingRevisionId) {
        this.postingRevisionId = postingRevisionId;
    }

    /**
     * Retrieves ID of the current revision of the comment.
     *
     * @return the value
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * Sets ID of the current revision of the comment.
     *
     * @param revisionId the value to be set
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * Retrieves total number of revisions the comment has.
     *
     * @return the value
     */
    public int getTotalRevisions() {
        return totalRevisions;
    }

    /**
     * Sets total number of revisions the comment has.
     *
     * @param totalRevisions the value to be set
     */
    public void setTotalRevisions(int totalRevisions) {
        this.totalRevisions = totalRevisions;
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
     * Retrieves the source text of the comment, a string representation of a JSON structure, may be absent if not
     * requested
     * .
     *
     * @return the value
     */
    public Body getBodySrc() {
        return bodySrc;
    }

    /**
     * Sets the source text of the comment, a string representation of a JSON structure, may be absent if not requested
     * .
     *
     * @param bodySrc the value to be set
     */
    public void setBodySrc(Body bodySrc) {
        this.bodySrc = bodySrc;
    }

    /**
     * Retrieves hash of the source text of the comment.
     *
     * @return the value
     */
    public byte[] getBodySrcHash() {
        return bodySrcHash;
    }

    /**
     * Sets hash of the source text of the comment.
     *
     * @param bodySrcHash the value to be set
     */
    public void setBodySrcHash(byte[] bodySrcHash) {
        this.bodySrcHash = bodySrcHash;
    }

    /**
     * Retrieves format of the source text of the comment, the list of available formats is returned in <code><a
     * href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @return the value
     */
    public SourceFormat getBodySrcFormat() {
        return bodySrcFormat;
    }

    /**
     * Sets format of the source text of the comment, the list of available formats is returned in <code><a
     * href="#PostingFeatures">PostingFeatures</a></code>
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
     * Retrieves list of the media attached to the comment.
     *
     * @return the value
     */
    public List<MediaAttachment> getMedia() {
        return media;
    }

    /**
     * Sets list of the media attached to the comment.
     *
     * @param media the value to be set
     */
    public void setMedia(List<MediaAttachment> media) {
        this.media = media;
    }

    /**
     * Retrieves heading of the comment.
     *
     * @return the value
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets heading of the comment.
     *
     * @param heading the value to be set
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * Retrieves information about the comment this comment is replying to.
     *
     * @return the value
     */
    public RepliedTo getRepliedTo() {
        return repliedTo;
    }

    /**
     * Sets information about the comment this comment is replying to.
     *
     * @param repliedTo the value to be set
     */
    public void setRepliedTo(RepliedTo repliedTo) {
        this.repliedTo = repliedTo;
    }

    /**
     * Retrieves .
     *
     * @return the value
     */
    public long getMoment() {
        return moment;
    }

    /**
     * Sets .
     *
     * @param moment the value to be set
     */
    public void setMoment(long moment) {
        this.moment = moment;
    }

    /**
     * Retrieves comment creation timestamp - the real time when the comment was created.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets comment creation timestamp - the real time when the comment was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves comment editing timestamp - the last time the comment was updated.
     *
     * @return the value
     */
    public Long getEditedAt() {
        return editedAt;
    }

    /**
     * Sets comment editing timestamp - the last time the comment was updated.
     *
     * @param editedAt the value to be set
     */
    public void setEditedAt(Long editedAt) {
        this.editedAt = editedAt;
    }

    /**
     * Retrieves comment deletion timestamp - the time when the comment was deleted.
     *
     * @return the value
     */
    public Long getDeletedAt() {
        return deletedAt;
    }

    /**
     * Sets comment deletion timestamp - the time when the comment was deleted.
     *
     * @param deletedAt the value to be set
     */
    public void setDeletedAt(Long deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * Retrieves creation timestamp of the current revision of the comment.
     *
     * @return the value
     */
    public long getRevisionCreatedAt() {
        return revisionCreatedAt;
    }

    /**
     * Sets creation timestamp of the current revision of the comment.
     *
     * @param revisionCreatedAt the value to be set
     */
    public void setRevisionCreatedAt(long revisionCreatedAt) {
        this.revisionCreatedAt = revisionCreatedAt;
    }

    /**
     * Retrieves comment purging timestamp - the time when the deleted comment will be purged from the database.
     *
     * @return the value
     */
    public Long getDeadline() {
        return deadline;
    }

    /**
     * Sets comment purging timestamp - the time when the deleted comment will be purged from the database.
     *
     * @param deadline the value to be set
     */
    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    /**
     * Retrieves cryptographic digest of the comment (use <code><a href="fingerprints.html#Comment">Comment</a></code>
     * fingerprint)
     * .
     *
     * @return the value
     */
    public byte[] getDigest() {
        return digest;
    }

    /**
     * Sets cryptographic digest of the comment (use <code><a href="fingerprints.html#Comment">Comment</a></code>
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
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public CommentOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
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
     * Retrieves the supported operations and the corresponding principals as defined by the comment's owner.
     *
     * @return the value
     */
    public CommentOperations getOwnerOperations() {
        return ownerOperations;
    }

    /**
     * Sets the supported operations and the corresponding principals as defined by the comment's owner.
     *
     * @param ownerOperations the value to be set
     */
    public void setOwnerOperations(CommentOperations ownerOperations) {
        this.ownerOperations = ownerOperations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden by the posting's owner ("senior")
     * .
     *
     * @return the value
     */
    public CommentOperations getSeniorOperations() {
        return seniorOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden by the posting's owner ("senior")
     * .
     *
     * @param seniorOperations the value to be set
     */
    public void setSeniorOperations(CommentOperations seniorOperations) {
        this.seniorOperations = seniorOperations;
    }

    /**
     * Retrieves operations on the comment that are blocked for the client.
     *
     * @return the value
     */
    public List<String> getBlockedOperations() {
        return blockedOperations;
    }

    /**
     * Sets operations on the comment that are blocked for the client.
     *
     * @param blockedOperations the value to be set
     */
    public void setBlockedOperations(List<String> blockedOperations) {
        this.blockedOperations = blockedOperations;
    }

    /**
     * Retrieves list of sheriff marks on the comment.
     *
     * @return the value
     */
    public List<SheriffMark> getSheriffMarks() {
        return sheriffMarks;
    }

    /**
     * Sets list of sheriff marks on the comment.
     *
     * @param sheriffMarks the value to be set
     */
    public void setSheriffMarks(List<SheriffMark> sheriffMarks) {
        this.sheriffMarks = sheriffMarks;
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
     * Retrieves details of the existing reaction (if any) of the posting's owner ("senior") to the comment.
     *
     * @return the value
     */
    public ClientReactionInfo getSeniorReaction() {
        return seniorReaction;
    }

    /**
     * Sets details of the existing reaction (if any) of the posting's owner ("senior") to the comment.
     *
     * @param seniorReaction the value to be set
     */
    public void setSeniorReaction(ClientReactionInfo seniorReaction) {
        this.seniorReaction = seniorReaction;
    }

    /**
     * Retrieves summary of reactions to the comment.
     *
     * @return the value
     */
    public ReactionTotalsInfo getReactions() {
        return reactions;
    }

    /**
     * Sets summary of reactions to the comment.
     *
     * @param reactions the value to be set
     */
    public void setReactions(ReactionTotalsInfo reactions) {
        this.reactions = reactions;
    }

    @Override
    public void validate() {
        super.validate();
        if (acceptedReactions != null) {
            acceptedReactions.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code CommentInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CommentInfo clone() {
        try {
            return (CommentInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
