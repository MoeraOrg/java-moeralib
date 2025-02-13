package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingInfo implements Cloneable {

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

    @JsonIgnore
    private Object extra;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public String getReceiverRevisionId() {
        return receiverRevisionId;
    }

    public void setReceiverRevisionId(String receiverRevisionId) {
        this.receiverRevisionId = receiverRevisionId;
    }

    public int getTotalRevisions() {
        return totalRevisions;
    }

    public void setTotalRevisions(int totalRevisions) {
        this.totalRevisions = totalRevisions;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverFullName() {
        return receiverFullName;
    }

    public void setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
    }

    public String getReceiverGender() {
        return receiverGender;
    }

    public void setReceiverGender(String receiverGender) {
        this.receiverGender = receiverGender;
    }

    public AvatarImage getReceiverAvatar() {
        return receiverAvatar;
    }

    public void setReceiverAvatar(AvatarImage receiverAvatar) {
        this.receiverAvatar = receiverAvatar;
    }

    public String getReceiverPostingId() {
        return receiverPostingId;
    }

    public void setReceiverPostingId(String receiverPostingId) {
        this.receiverPostingId = receiverPostingId;
    }

    public String getParentMediaId() {
        return parentMediaId;
    }

    public void setParentMediaId(String parentMediaId) {
        this.parentMediaId = parentMediaId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public String getOwnerGender() {
        return ownerGender;
    }

    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    public AvatarImage getOwnerAvatar() {
        return ownerAvatar;
    }

    public void setOwnerAvatar(AvatarImage ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    public Body getBodyPreview() {
        return bodyPreview;
    }

    public void setBodyPreview(Body bodyPreview) {
        this.bodyPreview = bodyPreview;
    }

    public Body getBodySrc() {
        return bodySrc;
    }

    public void setBodySrc(Body bodySrc) {
        this.bodySrc = bodySrc;
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

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getEditedAt() {
        return editedAt;
    }

    public void setEditedAt(Long editedAt) {
        this.editedAt = editedAt;
    }

    public Long getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Long deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Long getReceiverCreatedAt() {
        return receiverCreatedAt;
    }

    public void setReceiverCreatedAt(Long receiverCreatedAt) {
        this.receiverCreatedAt = receiverCreatedAt;
    }

    public Long getReceiverEditedAt() {
        return receiverEditedAt;
    }

    public void setReceiverEditedAt(Long receiverEditedAt) {
        this.receiverEditedAt = receiverEditedAt;
    }

    public Long getReceiverDeletedAt() {
        return receiverDeletedAt;
    }

    public void setReceiverDeletedAt(Long receiverDeletedAt) {
        this.receiverDeletedAt = receiverDeletedAt;
    }

    public long getRevisionCreatedAt() {
        return revisionCreatedAt;
    }

    public void setRevisionCreatedAt(long revisionCreatedAt) {
        this.revisionCreatedAt = revisionCreatedAt;
    }

    public Long getReceiverRevisionCreatedAt() {
        return receiverRevisionCreatedAt;
    }

    public void setReceiverRevisionCreatedAt(Long receiverRevisionCreatedAt) {
        this.receiverRevisionCreatedAt = receiverRevisionCreatedAt;
    }

    public Long getDeadline() {
        return deadline;
    }

    public void setDeadline(Long deadline) {
        this.deadline = deadline;
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

    public Short getSignatureVersion() {
        return signatureVersion;
    }

    public void setSignatureVersion(Short signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    public List<FeedReference> getFeedReferences() {
        return feedReferences;
    }

    public void setFeedReferences(List<FeedReference> feedReferences) {
        this.feedReferences = feedReferences;
    }

    public List<BlockedPostingInstantInfo> getBlockedInstants() {
        return blockedInstants;
    }

    public void setBlockedInstants(List<BlockedPostingInstantInfo> blockedInstants) {
        this.blockedInstants = blockedInstants;
    }

    public PostingOperations getOperations() {
        return operations;
    }

    public void setOperations(PostingOperations operations) {
        this.operations = operations;
    }

    public PostingOperations getReceiverOperations() {
        return receiverOperations;
    }

    public void setReceiverOperations(PostingOperations receiverOperations) {
        this.receiverOperations = receiverOperations;
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

    public List<String> getBlockedOperations() {
        return blockedOperations;
    }

    public void setBlockedOperations(List<String> blockedOperations) {
        this.blockedOperations = blockedOperations;
    }

    public List<String> getBlockedCommentOperations() {
        return blockedCommentOperations;
    }

    public void setBlockedCommentOperations(List<String> blockedCommentOperations) {
        this.blockedCommentOperations = blockedCommentOperations;
    }

    public List<String> getSheriffs() {
        return sheriffs;
    }

    public void setSheriffs(List<String> sheriffs) {
        this.sheriffs = sheriffs;
    }

    public List<SheriffMark> getSheriffMarks() {
        return sheriffMarks;
    }

    public void setSheriffMarks(List<SheriffMark> sheriffMarks) {
        this.sheriffMarks = sheriffMarks;
    }

    public AcceptedReactions getAcceptedReactions() {
        return acceptedReactions;
    }

    public void setAcceptedReactions(AcceptedReactions acceptedReactions) {
        this.acceptedReactions = acceptedReactions;
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

    public List<PostingSourceInfo> getSources() {
        return sources;
    }

    public void setSources(List<PostingSourceInfo> sources) {
        this.sources = sources;
    }

    public Integer getTotalComments() {
        return totalComments;
    }

    public void setTotalComments(Integer totalComments) {
        this.totalComments = totalComments;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public PostingInfo clone() {
        try {
            return (PostingInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
