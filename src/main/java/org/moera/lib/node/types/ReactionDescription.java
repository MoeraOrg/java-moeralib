package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReactionDescription extends Structure implements Cloneable {

    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private AvatarDescription ownerAvatar;
    private boolean negative;
    private int emoji;
    private byte[] signature;
    private Short signatureVersion;
    private ReactionOperations operations;

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
    public AvatarDescription getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets reaction owner's avatar.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarDescription ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    /**
     * Retrieves <code>true</code>, if the reaction is negative, <code>false</code>, if positive.
     *
     * @return the value
     */
    public boolean isNegative() {
        return negative;
    }

    /**
     * Sets <code>true</code>, if the reaction is negative, <code>false</code>, if positive.
     *
     * @param negative the value to be set
     */
    public void setNegative(boolean negative) {
        this.negative = negative;
    }

    /**
     * Retrieves reaction code, usually interpreted by clients as emoji code point.
     *
     * @return the value
     */
    public int getEmoji() {
        return emoji;
    }

    /**
     * Sets reaction code, usually interpreted by clients as emoji code point.
     *
     * @param emoji the value to be set
     */
    public void setEmoji(int emoji) {
        this.emoji = emoji;
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
     * Retrieves the operations and the corresponding principals.
     *
     * @return the value
     */
    public ReactionOperations getOperations() {
        return operations;
    }

    /**
     * Sets the operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(ReactionOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code ReactionDescription} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ReactionDescription clone() {
        try {
            return (ReactionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
