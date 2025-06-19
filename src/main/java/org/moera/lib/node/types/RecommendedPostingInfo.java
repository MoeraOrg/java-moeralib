package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecommendedPostingInfo extends Structure implements Cloneable {

    private String nodeName;
    private String postingId;
    private String ownerName;
    private String ownerFullName;
    private AvatarImage ownerAvatar;
    private String heading;
    private int totalPositiveReactions;
    private int lastDayPositiveReactions;
    private int totalComments;
    private int lastDayComments;

    /**
     * Retrieves name of the node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves ID of the posting on the node.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting on the node.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
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
     * Retrieves total number of positive reactions to the posting.
     *
     * @return the value
     */
    public int getTotalPositiveReactions() {
        return totalPositiveReactions;
    }

    /**
     * Sets total number of positive reactions to the posting.
     *
     * @param totalPositiveReactions the value to be set
     */
    public void setTotalPositiveReactions(int totalPositiveReactions) {
        this.totalPositiveReactions = totalPositiveReactions;
    }

    /**
     * Retrieves number of positive reactions added to the posting in the previous 24 hours.
     *
     * @return the value
     */
    public int getLastDayPositiveReactions() {
        return lastDayPositiveReactions;
    }

    /**
     * Sets number of positive reactions added to the posting in the previous 24 hours.
     *
     * @param lastDayPositiveReactions the value to be set
     */
    public void setLastDayPositiveReactions(int lastDayPositiveReactions) {
        this.lastDayPositiveReactions = lastDayPositiveReactions;
    }

    /**
     * Retrieves total number of comments to the posting.
     *
     * @return the value
     */
    public int getTotalComments() {
        return totalComments;
    }

    /**
     * Sets total number of comments to the posting.
     *
     * @param totalComments the value to be set
     */
    public void setTotalComments(int totalComments) {
        this.totalComments = totalComments;
    }

    /**
     * Retrieves number of comments added to the posting in the previous 24 hours.
     *
     * @return the value
     */
    public int getLastDayComments() {
        return lastDayComments;
    }

    /**
     * Sets number of comments added to the posting in the previous 24 hours.
     *
     * @param lastDayComments the value to be set
     */
    public void setLastDayComments(int lastDayComments) {
        this.lastDayComments = lastDayComments;
    }

    /**
     * Creates and returns a copy of this {@code RecommendedPostingInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public RecommendedPostingInfo clone() {
        try {
            return (RecommendedPostingInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
