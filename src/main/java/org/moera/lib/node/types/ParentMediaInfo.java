package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParentMediaInfo extends Structure implements Cloneable {

    private String nodeName;
    private String mediaId;
    private String postingId;
    private String commentId;

    /**
     * Retrieves name of the node containing the media the posting is linked to; if <code>null</code>, the media is
     * located on the same node as the posting
     * .
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node containing the media the posting is linked to; if <code>null</code>, the media is located
     * on the same node as the posting
     * .
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves ID of the media the posting is linked to; the media is located on the <code>nodeName</code> node
     * .
     *
     * @return the value
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets ID of the media the posting is linked to; the media is located on the <code>nodeName</code> node
     * .
     *
     * @param mediaId the value to be set
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * Retrieves ID of the posting that owns the attachment the posting is linked to; the posting is located at the
     * same node as the posting
     * .
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting that owns the attachment the posting is linked to; the posting is located at the same
     * node as the posting
     * .
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the comment that owns the attachment the posting is linked to; if set, <code>postingId</code>
     * contains ID of the parent posting of the comment; the comment is located at the same node as the posting
     * .
     *
     * @return the value
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets ID of the comment that owns the attachment the posting is linked to; if set, <code>postingId</code>
     * contains ID of the parent posting of the comment; the comment is located at the same node as the posting
     * .
     *
     * @param commentId the value to be set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * Creates and returns a copy of this {@code ParentMediaInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ParentMediaInfo clone() {
        try {
            return (ParentMediaInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
