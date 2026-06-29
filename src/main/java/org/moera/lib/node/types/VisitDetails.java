package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VisitDetails extends Structure implements Cloneable {

    private String postingId;
    private String commentId;
    private String mediaId;
    private String referrer;

    /**
     * Retrieves ID of the visited posting.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the visited posting.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the visited comment.
     *
     * @return the value
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets ID of the visited comment.
     *
     * @param commentId the value to be set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * Retrieves ID of the visited media.
     *
     * @return the value
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets ID of the visited media.
     *
     * @param mediaId the value to be set
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * Retrieves page referrer.
     *
     * @return the value
     */
    public String getReferrer() {
        return referrer;
    }

    /**
     * Sets page referrer.
     *
     * @param referrer the value to be set
     */
    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(postingId, "visit.posting-id.blank");
        ValidationUtil.maxSize(postingId, 40, "visit.posting-id.wrong-size");
        ValidationUtil.maxSize(commentId, 40, "visit.comment-id.wrong-size");
        ValidationUtil.maxSize(mediaId, 40, "visit.media-id.wrong-size");
        ValidationUtil.maxSize(referrer, 1024, "visit.referrer.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code VisitDetails} object.
     *
     * @return a clone of this instance
     */
    @Override
    public VisitDetails clone() {
        try {
            return (VisitDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
