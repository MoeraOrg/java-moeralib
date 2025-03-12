package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingInfo extends Structure implements Cloneable, MediaInfo {

    private String id;
    private String revisionId;
    private String receiverRevisionId;
    private int totalRevisions;
    private String receiverName;
    private String receiverFullName;
    private String receiverGender;
    private AvatarImage receiverAvatar;
    private String receiverPostingId;
    private String parentMediaId;
    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private AvatarImage ownerAvatar;
    private Body bodyPreview;
    private Body bodySrc;
    private byte[] bodySrcHash;
    private SourceFormat bodySrcFormat;
    private Body body;
    private BodyFormat bodyFormat;
    private List<MediaAttachment> media;
    private String heading;
    private UpdateInfo updateInfo;
    private long createdAt;
    private Long editedAt;
    private Long deletedAt;
    private Long receiverCreatedAt;
    private Long receiverEditedAt;
    private Long receiverDeletedAt;
    private long revisionCreatedAt;
    private Long receiverRevisionCreatedAt;
    private Long deadline;
    private byte[] digest;
    private byte[] signature;
    private Short signatureVersion;
    private List<FeedReference> feedReferences;
    private List<BlockedPostingInstantInfo> blockedInstants;
    private PostingOperations operations;
    private PostingOperations receiverOperations;
    private CommentOperations commentOperations;
    private ReactionOperations reactionOperations;
    private ReactionOperations commentReactionOperations;
    private List<String> blockedOperations;
    private List<String> blockedCommentOperations;
    private List<String> sheriffs;
    private List<SheriffMark> sheriffMarks;
    private AcceptedReactions acceptedReactions;
    private ClientReactionInfo clientReaction;
    private ReactionTotalsInfo reactions;
    private List<PostingSourceInfo> sources;
    private Integer totalComments;

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
     * Retrieves ID of the current revision of the posting.
     *
     * @return the value
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * Sets ID of the current revision of the posting.
     *
     * @param revisionId the value to be set
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * Retrieves ID of the current revision of the original posting (for cached copies of remote postings only).
     *
     * @return the value
     */
    public String getReceiverRevisionId() {
        return receiverRevisionId;
    }

    /**
     * Sets ID of the current revision of the original posting (for cached copies of remote postings only).
     *
     * @param receiverRevisionId the value to be set
     */
    public void setReceiverRevisionId(String receiverRevisionId) {
        this.receiverRevisionId = receiverRevisionId;
    }

    /**
     * Retrieves total number of revisions the posting has.
     *
     * @return the value
     */
    public int getTotalRevisions() {
        return totalRevisions;
    }

    /**
     * Sets total number of revisions the posting has.
     *
     * @param totalRevisions the value to be set
     */
    public void setTotalRevisions(int totalRevisions) {
        this.totalRevisions = totalRevisions;
    }

    /**
     * Retrieves name of the node where the posting was published (for cached copies of remote postings only).
     *
     * @return the value
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets name of the node where the posting was published (for cached copies of remote postings only).
     *
     * @param receiverName the value to be set
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * Retrieves full name of the node where the posting was published (for cached copies of remote postings only).
     *
     * @return the value
     */
    public String getReceiverFullName() {
        return receiverFullName;
    }

    /**
     * Sets full name of the node where the posting was published (for cached copies of remote postings only).
     *
     * @param receiverFullName the value to be set
     */
    public void setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
    }

    /**
     * Retrieves gender of the node where the posting was published (for cached copies of remote postings only).
     *
     * @return the value
     */
    public String getReceiverGender() {
        return receiverGender;
    }

    /**
     * Sets gender of the node where the posting was published (for cached copies of remote postings only).
     *
     * @param receiverGender the value to be set
     */
    public void setReceiverGender(String receiverGender) {
        this.receiverGender = receiverGender;
    }

    /**
     * Retrieves avatar of the node where the posting was published (for cached copies of remote postings only).
     *
     * @return the value
     */
    public AvatarImage getReceiverAvatar() {
        return receiverAvatar;
    }

    /**
     * Sets avatar of the node where the posting was published (for cached copies of remote postings only).
     *
     * @param receiverAvatar the value to be set
     */
    public void setReceiverAvatar(AvatarImage receiverAvatar) {
        this.receiverAvatar = receiverAvatar;
    }

    /**
     * Retrieves ID of the original posting (for cached copies of remote postings only).
     *
     * @return the value
     */
    public String getReceiverPostingId() {
        return receiverPostingId;
    }

    /**
     * Sets ID of the original posting (for cached copies of remote postings only).
     *
     * @param receiverPostingId the value to be set
     */
    public void setReceiverPostingId(String receiverPostingId) {
        this.receiverPostingId = receiverPostingId;
    }

    /**
     * Retrieves ID of the media the posting is linked to, if any.
     *
     * @return the value
     */
    public String getParentMediaId() {
        return parentMediaId;
    }

    /**
     * Sets ID of the media the posting is linked to, if any.
     *
     * @param parentMediaId the value to be set
     */
    public void setParentMediaId(String parentMediaId) {
        this.parentMediaId = parentMediaId;
    }

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
    public AvatarImage getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets avatar of the posting's owner.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarImage ownerAvatar) {
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
     * Retrieves the source text of the posting, a string representation of a JSON structure, may be absent if not
     * requested
     * .
     *
     * @return the value
     */
    public Body getBodySrc() {
        return bodySrc;
    }

    /**
     * Sets the source text of the posting, a string representation of a JSON structure, may be absent if not requested
     * .
     *
     * @param bodySrc the value to be set
     */
    public void setBodySrc(Body bodySrc) {
        this.bodySrc = bodySrc;
    }

    /**
     * Retrieves hash of the source text of the posting.
     *
     * @return the value
     */
    public byte[] getBodySrcHash() {
        return bodySrcHash;
    }

    /**
     * Sets hash of the source text of the posting.
     *
     * @param bodySrcHash the value to be set
     */
    public void setBodySrcHash(byte[] bodySrcHash) {
        this.bodySrcHash = bodySrcHash;
    }

    /**
     * Retrieves format of the source text of the posting, the list of available formats is returned in <code><a
     * href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @return the value
     */
    public SourceFormat getBodySrcFormat() {
        return bodySrcFormat;
    }

    /**
     * Sets format of the source text of the posting, the list of available formats is returned in <code><a
     * href="#PostingFeatures">PostingFeatures</a></code>
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
     * Retrieves list of the media attached to the posting.
     *
     * @return the value
     */
    public List<MediaAttachment> getMedia() {
        return media;
    }

    /**
     * Sets list of the media attached to the posting.
     *
     * @param media the value to be set
     */
    public void setMedia(List<MediaAttachment> media) {
        this.media = media;
    }

    /**
     * Retrieves heading of the posting.
     *
     * @return the value
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets heading of the posting.
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
     * Retrieves posting creation timestamp - the real time when the posting was created.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets posting creation timestamp - the real time when the posting was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves posting editing timestamp - the last time the posting was updated.
     *
     * @return the value
     */
    public Long getEditedAt() {
        return editedAt;
    }

    /**
     * Sets posting editing timestamp - the last time the posting was updated.
     *
     * @param editedAt the value to be set
     */
    public void setEditedAt(Long editedAt) {
        this.editedAt = editedAt;
    }

    /**
     * Retrieves posting deletion timestamp - the time when the posting was deleted.
     *
     * @return the value
     */
    public Long getDeletedAt() {
        return deletedAt;
    }

    /**
     * Sets posting deletion timestamp - the time when the posting was deleted.
     *
     * @param deletedAt the value to be set
     */
    public void setDeletedAt(Long deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * Retrieves original posting creation timestamp (for cached copies of remote postings only).
     *
     * @return the value
     */
    public Long getReceiverCreatedAt() {
        return receiverCreatedAt;
    }

    /**
     * Sets original posting creation timestamp (for cached copies of remote postings only).
     *
     * @param receiverCreatedAt the value to be set
     */
    public void setReceiverCreatedAt(Long receiverCreatedAt) {
        this.receiverCreatedAt = receiverCreatedAt;
    }

    /**
     * Retrieves original posting editing timestamp (for cached copies of remote postings only).
     *
     * @return the value
     */
    public Long getReceiverEditedAt() {
        return receiverEditedAt;
    }

    /**
     * Sets original posting editing timestamp (for cached copies of remote postings only).
     *
     * @param receiverEditedAt the value to be set
     */
    public void setReceiverEditedAt(Long receiverEditedAt) {
        this.receiverEditedAt = receiverEditedAt;
    }

    /**
     * Retrieves original posting deletion timestamp (for cached copies of remote postings only).
     *
     * @return the value
     */
    public Long getReceiverDeletedAt() {
        return receiverDeletedAt;
    }

    /**
     * Sets original posting deletion timestamp (for cached copies of remote postings only).
     *
     * @param receiverDeletedAt the value to be set
     */
    public void setReceiverDeletedAt(Long receiverDeletedAt) {
        this.receiverDeletedAt = receiverDeletedAt;
    }

    /**
     * Retrieves creation timestamp of the current revision of the posting.
     *
     * @return the value
     */
    public long getRevisionCreatedAt() {
        return revisionCreatedAt;
    }

    /**
     * Sets creation timestamp of the current revision of the posting.
     *
     * @param revisionCreatedAt the value to be set
     */
    public void setRevisionCreatedAt(long revisionCreatedAt) {
        this.revisionCreatedAt = revisionCreatedAt;
    }

    /**
     * Retrieves creation timestamp of the current revision of the original posting (for cached copies of remote
     * postings only)
     * .
     *
     * @return the value
     */
    public Long getReceiverRevisionCreatedAt() {
        return receiverRevisionCreatedAt;
    }

    /**
     * Sets creation timestamp of the current revision of the original posting (for cached copies of remote postings
     * only)
     * .
     *
     * @param receiverRevisionCreatedAt the value to be set
     */
    public void setReceiverRevisionCreatedAt(Long receiverRevisionCreatedAt) {
        this.receiverRevisionCreatedAt = receiverRevisionCreatedAt;
    }

    /**
     * Retrieves posting purging timestamp - the time when the deleted posting will be purged from the database
     * .
     *
     * @return the value
     */
    public Long getDeadline() {
        return deadline;
    }

    /**
     * Sets posting purging timestamp - the time when the deleted posting will be purged from the database
     * .
     *
     * @param deadline the value to be set
     */
    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    /**
     * Retrieves cryptographic digest of the posting (use <code><a href="fingerprints.html#Posting">Posting</a></code>
     * fingerprint)
     * .
     *
     * @return the value
     */
    public byte[] getDigest() {
        return digest;
    }

    /**
     * Sets cryptographic digest of the posting (use <code><a href="fingerprints.html#Posting">Posting</a></code>
     * fingerprint)
     * .
     *
     * @param digest the value to be set
     */
    public void setDigest(byte[] digest) {
        this.digest = digest;
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
     * Retrieves array of references to the posting from stories in feeds.
     *
     * @return the value
     */
    public List<FeedReference> getFeedReferences() {
        return feedReferences;
    }

    /**
     * Sets array of references to the posting from stories in feeds.
     *
     * @param feedReferences the value to be set
     */
    public void setFeedReferences(List<FeedReference> feedReferences) {
        this.feedReferences = feedReferences;
    }

    /**
     * Retrieves instants related to the posting that are blocked (for admin only).
     *
     * @return the value
     */
    public List<BlockedPostingInstantInfo> getBlockedInstants() {
        return blockedInstants;
    }

    /**
     * Sets instants related to the posting that are blocked (for admin only).
     *
     * @param blockedInstants the value to be set
     */
    public void setBlockedInstants(List<BlockedPostingInstantInfo> blockedInstants) {
        this.blockedInstants = blockedInstants;
    }

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public PostingOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(PostingOperations operations) {
        this.operations = operations;
    }

    /**
     * Retrieves the supported operations for the original posting and the corresponding principals (for cached copies
     * of remote postings only)
     * .
     *
     * @return the value
     */
    public PostingOperations getReceiverOperations() {
        return receiverOperations;
    }

    /**
     * Sets the supported operations for the original posting and the corresponding principals (for cached copies of
     * remote postings only)
     * .
     *
     * @param receiverOperations the value to be set
     */
    public void setReceiverOperations(PostingOperations receiverOperations) {
        this.receiverOperations = receiverOperations;
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
     * Retrieves operations on the posting that are blocked for the client.
     *
     * @return the value
     */
    public List<String> getBlockedOperations() {
        return blockedOperations;
    }

    /**
     * Sets operations on the posting that are blocked for the client.
     *
     * @param blockedOperations the value to be set
     */
    public void setBlockedOperations(List<String> blockedOperations) {
        this.blockedOperations = blockedOperations;
    }

    /**
     * Retrieves operations on the posting's comments that are blocked for the client.
     *
     * @return the value
     */
    public List<String> getBlockedCommentOperations() {
        return blockedCommentOperations;
    }

    /**
     * Sets operations on the posting's comments that are blocked for the client.
     *
     * @param blockedCommentOperations the value to be set
     */
    public void setBlockedCommentOperations(List<String> blockedCommentOperations) {
        this.blockedCommentOperations = blockedCommentOperations;
    }

    /**
     * Retrieves list of sheriffs supervising the posting.
     *
     * @return the value
     */
    public List<String> getSheriffs() {
        return sheriffs;
    }

    /**
     * Sets list of sheriffs supervising the posting.
     *
     * @param sheriffs the value to be set
     */
    public void setSheriffs(List<String> sheriffs) {
        this.sheriffs = sheriffs;
    }

    /**
     * Retrieves list of sheriff marks on the posting.
     *
     * @return the value
     */
    public List<SheriffMark> getSheriffMarks() {
        return sheriffMarks;
    }

    /**
     * Sets list of sheriff marks on the posting.
     *
     * @param sheriffMarks the value to be set
     */
    public void setSheriffMarks(List<SheriffMark> sheriffMarks) {
        this.sheriffMarks = sheriffMarks;
    }

    /**
     * Retrieves types of reactions that the posting accepts.
     *
     * @return the value
     */
    public AcceptedReactions getAcceptedReactions() {
        return acceptedReactions;
    }

    /**
     * Sets types of reactions that the posting accepts.
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
     * Retrieves reactions summary of the posting.
     *
     * @return the value
     */
    public ReactionTotalsInfo getReactions() {
        return reactions;
    }

    /**
     * Sets reactions summary of the posting.
     *
     * @param reactions the value to be set
     */
    public void setReactions(ReactionTotalsInfo reactions) {
        this.reactions = reactions;
    }

    /**
     * Retrieves details of the sources the posting was received from (for cached copies of remote postings only).
     *
     * @return the value
     */
    public List<PostingSourceInfo> getSources() {
        return sources;
    }

    /**
     * Sets details of the sources the posting was received from (for cached copies of remote postings only).
     *
     * @param sources the value to be set
     */
    public void setSources(List<PostingSourceInfo> sources) {
        this.sources = sources;
    }

    /**
     * Retrieves total number of comments to the posting.
     *
     * @return the value
     */
    public Integer getTotalComments() {
        return totalComments;
    }

    /**
     * Sets total number of comments to the posting.
     *
     * @param totalComments the value to be set
     */
    public void setTotalComments(Integer totalComments) {
        this.totalComments = totalComments;
    }

    @Override
    public void validate() {
        super.validate();
        if (updateInfo != null) {
            updateInfo.validate();
        }
        if (acceptedReactions != null) {
            acceptedReactions.validate();
        }
    }

    /**
     * Creates and returns a copy of this {@code PostingInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PostingInfo clone() {
        try {
            return (PostingInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
