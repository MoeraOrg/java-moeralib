package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SharingInfo extends Structure implements Cloneable {

    private String id;
    private SharingType sharingType;
    private String remoteNodeName;
    private String remoteFullName;
    private String remoteSourceUri;
    private String remoteGender;
    private AvatarImage remoteAvatar;
    private String remoteFeedName;
    private String remoteStoryId;
    private Long remoteStoryMoment;
    private String remotePostingId;
    private String postingId;
    private String postingRevisionId;
    private long moment;
    private long createdAt;

    /**
     * Retrieves ID of the sharing.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of the sharing.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves type of sharing.
     *
     * @return the value
     */
    public SharingType getSharingType() {
        return sharingType;
    }

    /**
     * Sets type of sharing.
     *
     * @param sharingType the value to be set
     */
    public void setSharingType(SharingType sharingType) {
        this.sharingType = sharingType;
    }

    /**
     * Retrieves name of the node that shared the posting.
     *
     * @return the value
     */
    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    /**
     * Sets name of the node that shared the posting.
     *
     * @param remoteNodeName the value to be set
     */
    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    /**
     * Retrieves full name of the sharing node.
     *
     * @return the value
     */
    public String getRemoteFullName() {
        return remoteFullName;
    }

    /**
     * Sets full name of the sharing node.
     *
     * @param remoteFullName the value to be set
     */
    public void setRemoteFullName(String remoteFullName) {
        this.remoteFullName = remoteFullName;
    }

    /**
     * Retrieves source URI of the sharing node identity.
     *
     * @return the value
     */
    public String getRemoteSourceUri() {
        return remoteSourceUri;
    }

    /**
     * Sets source URI of the sharing node identity.
     *
     * @param remoteSourceUri the value to be set
     */
    public void setRemoteSourceUri(String remoteSourceUri) {
        this.remoteSourceUri = remoteSourceUri;
    }

    /**
     * Retrieves gender of the sharing node owner.
     *
     * @return the value
     */
    public String getRemoteGender() {
        return remoteGender;
    }

    /**
     * Sets gender of the sharing node owner.
     *
     * @param remoteGender the value to be set
     */
    public void setRemoteGender(String remoteGender) {
        this.remoteGender = remoteGender;
    }

    /**
     * Retrieves avatar of the sharing node.
     *
     * @return the value
     */
    public AvatarImage getRemoteAvatar() {
        return remoteAvatar;
    }

    /**
     * Sets avatar of the sharing node.
     *
     * @param remoteAvatar the value to be set
     */
    public void setRemoteAvatar(AvatarImage remoteAvatar) {
        this.remoteAvatar = remoteAvatar;
    }

    /**
     * Retrieves name of the feed containing the shared posting.
     *
     * @return the value
     */
    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    /**
     * Sets name of the feed containing the shared posting.
     *
     * @param remoteFeedName the value to be set
     */
    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
    }

    /**
     * Retrieves ID of the story containing the shared posting.
     *
     * @return the value
     */
    public String getRemoteStoryId() {
        return remoteStoryId;
    }

    /**
     * Sets ID of the story containing the shared posting.
     *
     * @param remoteStoryId the value to be set
     */
    public void setRemoteStoryId(String remoteStoryId) {
        this.remoteStoryId = remoteStoryId;
    }

    /**
     * Retrieves moment of the story containing the shared posting.
     *
     * @return the value
     */
    public Long getRemoteStoryMoment() {
        return remoteStoryMoment;
    }

    /**
     * Sets moment of the story containing the shared posting.
     *
     * @param remoteStoryMoment the value to be set
     */
    public void setRemoteStoryMoment(Long remoteStoryMoment) {
        this.remoteStoryMoment = remoteStoryMoment;
    }

    /**
     * Retrieves ID of the shared posting on the remote node.
     *
     * @return the value
     */
    public String getRemotePostingId() {
        return remotePostingId;
    }

    /**
     * Sets ID of the shared posting on the remote node.
     *
     * @param remotePostingId the value to be set
     */
    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
    }

    /**
     * Retrieves ID of the original posting.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the original posting.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the shared revision of the original posting.
     *
     * @return the value
     */
    public String getPostingRevisionId() {
        return postingRevisionId;
    }

    /**
     * Sets ID of the shared revision of the original posting.
     *
     * @param postingRevisionId the value to be set
     */
    public void setPostingRevisionId(String postingRevisionId) {
        this.postingRevisionId = postingRevisionId;
    }

    /**
     * Retrieves moment of the sharing, used for pagination.
     *
     * @return the value
     */
    public long getMoment() {
        return moment;
    }

    /**
     * Sets moment of the sharing, used for pagination.
     *
     * @param moment the value to be set
     */
    public void setMoment(long moment) {
        this.moment = moment;
    }

    /**
     * Retrieves creation timestamp of the sharing record.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets creation timestamp of the sharing record.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Creates and returns a copy of this {@code SharingInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SharingInfo clone() {
        try {
            return (SharingInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
