package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivityReactionInfo extends Structure implements Cloneable {

    private String remoteNodeName;
    private String remoteFullName;
    private AvatarImage remoteAvatar;
    private String remotePostingId;
    private boolean negative;
    private int emoji;
    private long createdAt;

    /**
     * Retrieves name of the remote node.
     *
     * @return the value
     */
    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    /**
     * Sets name of the remote node.
     *
     * @param remoteNodeName the value to be set
     */
    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    /**
     * Retrieves full name of the remote node.
     *
     * @return the value
     */
    public String getRemoteFullName() {
        return remoteFullName;
    }

    /**
     * Sets full name of the remote node.
     *
     * @param remoteFullName the value to be set
     */
    public void setRemoteFullName(String remoteFullName) {
        this.remoteFullName = remoteFullName;
    }

    /**
     * Retrieves avatar of the remote node.
     *
     * @return the value
     */
    public AvatarImage getRemoteAvatar() {
        return remoteAvatar;
    }

    /**
     * Sets avatar of the remote node.
     *
     * @param remoteAvatar the value to be set
     */
    public void setRemoteAvatar(AvatarImage remoteAvatar) {
        this.remoteAvatar = remoteAvatar;
    }

    /**
     * Retrieves ID of the posting on the remote node.
     *
     * @return the value
     */
    public String getRemotePostingId() {
        return remotePostingId;
    }

    /**
     * Sets ID of the posting on the remote node.
     *
     * @param remotePostingId the value to be set
     */
    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
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
     * Retrieves reaction creation timestamp - the real time when the reaction was created.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets reaction creation timestamp - the real time when the reaction was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Creates and returns a copy of this {@code ActivityReactionInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ActivityReactionInfo clone() {
        try {
            return (ActivityReactionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
