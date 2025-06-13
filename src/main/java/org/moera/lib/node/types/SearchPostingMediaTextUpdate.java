package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchPostingMediaTextUpdate extends Structure implements Cloneable {

    private String postingId;
    private String mediaId;
    private String textContent;

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
     * Retrieves ID of the media.
     *
     * @return the value
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets ID of the media.
     *
     * @param mediaId the value to be set
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * Retrieves text content of the media.
     *
     * @return the value
     */
    public String getTextContent() {
        return textContent;
    }

    /**
     * Sets text content of the media.
     *
     * @param textContent the value to be set
     */
    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "search.posting-id.wrong-size");
        ValidationUtil.maxSize(mediaId, 40, "search.media-id.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code SearchPostingMediaTextUpdate} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchPostingMediaTextUpdate clone() {
        try {
            return (SearchPostingMediaTextUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
