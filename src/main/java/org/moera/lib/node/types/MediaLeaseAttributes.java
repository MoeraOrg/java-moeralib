package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaLeaseAttributes extends Structure implements Cloneable {

    private String nodeName;
    private String mediaId;
    private String postingId;
    private String commentId;

    /**
     * Retrieves name of the node that receives the lease.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node that receives the lease.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves ID of the media file.
     *
     * @return the value
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets ID of the media file.
     *
     * @param mediaId the value to be set
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * Retrieves ID of the posting used to verify access to the media file.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting used to verify access to the media file.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the comment used to verify access to the media file.
     *
     * @return the value
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets ID of the comment used to verify access to the media file.
     *
     * @param commentId the value to be set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(nodeName, "media-lease.node-name.blank");
        ValidationUtil.maxSize(nodeName, 135, "media-lease.node-name.wrong-size");
        ValidationUtil.notBlank(mediaId, "media-lease.media-id.blank");
    }

    /**
     * Creates and returns a copy of this {@code MediaLeaseAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public MediaLeaseAttributes clone() {
        try {
            return (MediaLeaseAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
