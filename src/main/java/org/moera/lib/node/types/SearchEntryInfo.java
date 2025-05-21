package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchEntryInfo extends Structure implements Cloneable {

    private String nodeName;
    private String postingId;
    private String commentId;
    private String ownerName;
    private String ownerFullName;
    private AvatarImage ownerAvatar;
    private Body bodyPreview;
    private BodyFormat bodyFormat;
    private String heading;
    private Integer imageCount;
    private Boolean videoPresent;
    private SearchRepliedTo repliedTo;
    private long createdAt;
    private SearchEntryOperations operations;
    private long moment;

    /**
     * Retrieves source node of the entry.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets source node of the entry.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves for posting, ID of the posting; for comment, ID of the posting the comment belongs to.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets for posting, ID of the posting; for comment, ID of the posting the comment belongs to.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the comment.
     *
     * @return the value
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets ID of the comment.
     *
     * @param commentId the value to be set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * Retrieves node name of the entry's owner.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets node name of the entry's owner.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Retrieves full name of the entry's owner.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets full name of the entry's owner.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves avatar of the entry's owner.
     *
     * @return the value
     */
    public AvatarImage getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets avatar of the entry's owner.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarImage ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    /**
     * Retrieves preview of the entry's body, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getBodyPreview() {
        return bodyPreview;
    }

    /**
     * Sets preview of the entry's body, a string representation of a JSON structure.
     *
     * @param bodyPreview the value to be set
     */
    public void setBodyPreview(Body bodyPreview) {
        this.bodyPreview = bodyPreview;
    }

    /**
     * Retrieves format of the entry's body, may have any value meaningful for the client.
     *
     * @return the value
     */
    public BodyFormat getBodyFormat() {
        return bodyFormat;
    }

    /**
     * Sets format of the entry's body, may have any value meaningful for the client.
     *
     * @param bodyFormat the value to be set
     */
    public void setBodyFormat(BodyFormat bodyFormat) {
        this.bodyFormat = bodyFormat;
    }

    /**
     * Retrieves heading of the entry.
     *
     * @return the value
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets heading of the entry.
     *
     * @param heading the value to be set
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * Retrieves number of images the entry contains.
     *
     * @return the value
     */
    public Integer getImageCount() {
        return imageCount;
    }

    /**
     * Sets number of images the entry contains.
     *
     * @param imageCount the value to be set
     */
    public void setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
    }

    /**
     * Retrieves if <code>true</code>, the entry contains a video.
     *
     * @return the value
     */
    public Boolean getVideoPresent() {
        return videoPresent;
    }

    /**
     * Sets if <code>true</code>, the entry contains a video.
     *
     * @param videoPresent the value to be set
     */
    public void setVideoPresent(Boolean videoPresent) {
        this.videoPresent = videoPresent;
    }

    /**
     * Retrieves information about the comment this comment is replying to.
     *
     * @return the value
     */
    public SearchRepliedTo getRepliedTo() {
        return repliedTo;
    }

    /**
     * Sets information about the comment this comment is replying to.
     *
     * @param repliedTo the value to be set
     */
    public void setRepliedTo(SearchRepliedTo repliedTo) {
        this.repliedTo = repliedTo;
    }

    /**
     * Retrieves entry creation timestamp - the real time when the entry was created.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets entry creation timestamp - the real time when the entry was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public SearchEntryOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(SearchEntryOperations operations) {
        this.operations = operations;
    }

    /**
     * Retrieves moment of the entry.
     *
     * @return the value
     */
    public long getMoment() {
        return moment;
    }

    /**
     * Sets moment of the entry.
     *
     * @param moment the value to be set
     */
    public void setMoment(long moment) {
        this.moment = moment;
    }

    /**
     * Creates and returns a copy of this {@code SearchEntryInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchEntryInfo clone() {
        try {
            return (SearchEntryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
