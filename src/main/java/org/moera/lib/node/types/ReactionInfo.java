package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionInfo extends Structure implements Cloneable {

    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private AvatarImage ownerAvatar;
    private String postingId;
    private String postingRevisionId;
    private String commentId;
    private String commentRevisionId;
    private Boolean negative;
    private Integer emoji;
    private Long moment;
    private Long createdAt;
    private Long deadline;
    private byte[] signature;
    private Short signatureVersion;
    private ReactionOperations operations;
    private ReactionOperations ownerOperations;
    private ReactionOperations seniorOperations;
    private ReactionOperations majorOperations;

    /**
     * Retrieves reaction owner's node name.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets reaction owner's node name.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Retrieves reaction owner's full name.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets reaction owner's full name.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves reaction owner's gender.
     *
     * @return the value
     */
    public String getOwnerGender() {
        return ownerGender;
    }

    /**
     * Sets reaction owner's gender.
     *
     * @param ownerGender the value to be set
     */
    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    /**
     * Retrieves reaction owner's avatar.
     *
     * @return the value
     */
    public AvatarImage getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets reaction owner's avatar.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarImage ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    /**
     * Retrieves ID of the posting.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the posting revision, if relevant.
     *
     * @return the value
     */
    public String getPostingRevisionId() {
        return postingRevisionId;
    }

    /**
     * Sets ID of the posting revision, if relevant.
     *
     * @param postingRevisionId the value to be set
     */
    public void setPostingRevisionId(String postingRevisionId) {
        this.postingRevisionId = postingRevisionId;
    }

    /**
     * Retrieves ID of the comment, if relevant.
     *
     * @return the value
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets ID of the comment, if relevant.
     *
     * @param commentId the value to be set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * Retrieves ID of the comment revision, if relevant.
     *
     * @return the value
     */
    public String getCommentRevisionId() {
        return commentRevisionId;
    }

    /**
     * Sets ID of the comment revision, if relevant.
     *
     * @param commentRevisionId the value to be set
     */
    public void setCommentRevisionId(String commentRevisionId) {
        this.commentRevisionId = commentRevisionId;
    }

    /**
     * Retrieves <code>true</code>, if the reaction is negative, <code>false</code>, if positive.
     *
     * @return the value
     */
    public Boolean getNegative() {
        return negative;
    }

    /**
     * Sets <code>true</code>, if the reaction is negative, <code>false</code>, if positive.
     *
     * @param negative the value to be set
     */
    public void setNegative(Boolean negative) {
        this.negative = negative;
    }

    /**
     * Retrieves reaction code, usually interpreted by clients as emoji code point.
     *
     * @return the value
     */
    public Integer getEmoji() {
        return emoji;
    }

    /**
     * Sets reaction code, usually interpreted by clients as emoji code point.
     *
     * @param emoji the value to be set
     */
    public void setEmoji(Integer emoji) {
        this.emoji = emoji;
    }

    /**
     * Retrieves .
     *
     * @return the value
     */
    public Long getMoment() {
        return moment;
    }

    /**
     * Sets .
     *
     * @param moment the value to be set
     */
    public void setMoment(Long moment) {
        this.moment = moment;
    }

    /**
     * Retrieves reaction creation timestamp - the real time when the reaction was created.
     *
     * @return the value
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets reaction creation timestamp - the real time when the reaction was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves if present, the reaction will be erased at this time.
     *
     * @return the value
     */
    public Long getDeadline() {
        return deadline;
    }

    /**
     * Sets if present, the reaction will be erased at this time.
     *
     * @param deadline the value to be set
     */
    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    /**
     * Retrieves the reaction owner signature (use <code><a href="fingerprints.html#Reaction">Reaction</a></code>
     * fingerprint)
     * .
     *
     * @return the value
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the reaction owner signature (use <code><a href="fingerprints.html#Reaction">Reaction</a></code>
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
    public ReactionOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(ReactionOperations operations) {
        this.operations = operations;
    }

    /**
     * Retrieves the supported operations and the corresponding principals as defined by the reaction's owner.
     *
     * @return the value
     */
    public ReactionOperations getOwnerOperations() {
        return ownerOperations;
    }

    /**
     * Sets the supported operations and the corresponding principals as defined by the reaction's owner.
     *
     * @param ownerOperations the value to be set
     */
    public void setOwnerOperations(ReactionOperations ownerOperations) {
        this.ownerOperations = ownerOperations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden by the reaction's "senior": the
     * posting's owner in the case of reaction to a posting or the comment's owner in the case of reaction to a comment
     * .
     *
     * @return the value
     */
    public ReactionOperations getSeniorOperations() {
        return seniorOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden by the reaction's "senior": the
     * posting's owner in the case of reaction to a posting or the comment's owner in the case of reaction to a comment
     * .
     *
     * @param seniorOperations the value to be set
     */
    public void setSeniorOperations(ReactionOperations seniorOperations) {
        this.seniorOperations = seniorOperations;
    }

    /**
     * Retrieves the operations and the corresponding principals that are overridden by the posting's owner ("major")
     * in the case of reaction to a comment; not set in the case of reaction to a posting
     * .
     *
     * @return the value
     */
    public ReactionOperations getMajorOperations() {
        return majorOperations;
    }

    /**
     * Sets the operations and the corresponding principals that are overridden by the posting's owner ("major") in the
     * case of reaction to a comment; not set in the case of reaction to a posting
     * .
     *
     * @param majorOperations the value to be set
     */
    public void setMajorOperations(ReactionOperations majorOperations) {
        this.majorOperations = majorOperations;
    }

    /**
     * Creates and returns a copy of this {@code ReactionInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ReactionInfo clone() {
        try {
            return (ReactionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
