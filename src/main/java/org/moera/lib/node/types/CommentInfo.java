package org.moera.lib.node.types;

// This file is generated

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentInfo {

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
    private int moment;
    private Timestamp createdAt;
    private Timestamp editedAt;
    private Timestamp deletedAt;
    private Timestamp revisionCreatedAt;
    private Timestamp deadline;
    private byte[] digest;
    private byte[] signature;
    private Integer signatureVersion;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public String getPostingRevisionId() {
        return postingRevisionId;
    }

    public void setPostingRevisionId(String postingRevisionId) {
        this.postingRevisionId = postingRevisionId;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public int getTotalRevisions() {
        return totalRevisions;
    }

    public void setTotalRevisions(int totalRevisions) {
        this.totalRevisions = totalRevisions;
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

    public RepliedTo getRepliedTo() {
        return repliedTo;
    }

    public void setRepliedTo(RepliedTo repliedTo) {
        this.repliedTo = repliedTo;
    }

    public int getMoment() {
        return moment;
    }

    public void setMoment(int moment) {
        this.moment = moment;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getEditedAt() {
        return editedAt;
    }

    public void setEditedAt(Timestamp editedAt) {
        this.editedAt = editedAt;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Timestamp getRevisionCreatedAt() {
        return revisionCreatedAt;
    }

    public void setRevisionCreatedAt(Timestamp revisionCreatedAt) {
        this.revisionCreatedAt = revisionCreatedAt;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
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

    public Integer getSignatureVersion() {
        return signatureVersion;
    }

    public void setSignatureVersion(Integer signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    public CommentOperations getOperations() {
        return operations;
    }

    public void setOperations(CommentOperations operations) {
        this.operations = operations;
    }

    public ReactionOperations getReactionOperations() {
        return reactionOperations;
    }

    public void setReactionOperations(ReactionOperations reactionOperations) {
        this.reactionOperations = reactionOperations;
    }

    public CommentOperations getOwnerOperations() {
        return ownerOperations;
    }

    public void setOwnerOperations(CommentOperations ownerOperations) {
        this.ownerOperations = ownerOperations;
    }

    public CommentOperations getSeniorOperations() {
        return seniorOperations;
    }

    public void setSeniorOperations(CommentOperations seniorOperations) {
        this.seniorOperations = seniorOperations;
    }

    public List<String> getBlockedOperations() {
        return blockedOperations;
    }

    public void setBlockedOperations(List<String> blockedOperations) {
        this.blockedOperations = blockedOperations;
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

    public ClientReactionInfo getSeniorReaction() {
        return seniorReaction;
    }

    public void setSeniorReaction(ClientReactionInfo seniorReaction) {
        this.seniorReaction = seniorReaction;
    }

    public ReactionTotalsInfo getReactions() {
        return reactions;
    }

    public void setReactions(ReactionTotalsInfo reactions) {
        this.reactions = reactions;
    }

}
