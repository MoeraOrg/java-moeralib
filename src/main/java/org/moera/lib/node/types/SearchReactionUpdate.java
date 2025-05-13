package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchReactionUpdate extends Structure implements Cloneable {

    private String postingId;
    private String commentId;
    private String ownerName;

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
     * Retrieves reaction owner's name.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets reaction owner's name.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "search.posting-id.wrong-size");
        ValidationUtil.maxSize(commentId, 40, "search.comment-id.wrong-size");
        ValidationUtil.maxSize(ownerName, 63, "search.owner-name.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code SearchReactionUpdate} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchReactionUpdate clone() {
        try {
            return (SearchReactionUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
