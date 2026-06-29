package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchPostingMediaUpdate extends Structure implements Cloneable {

    private String postingId;
    private String mediaId;
    private String remoteMediaNodeName;
    private String remoteMediaId;
    private String title;
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
     * Retrieves name of the node where the media is originated from.
     *
     * @return the value
     */
    public String getRemoteMediaNodeName() {
        return remoteMediaNodeName;
    }

    /**
     * Sets name of the node where the media is originated from.
     *
     * @param remoteMediaNodeName the value to be set
     */
    public void setRemoteMediaNodeName(String remoteMediaNodeName) {
        this.remoteMediaNodeName = remoteMediaNodeName;
    }

    /**
     * Retrieves ID of the media on the original node.
     *
     * @return the value
     */
    public String getRemoteMediaId() {
        return remoteMediaId;
    }

    /**
     * Sets ID of the media on the original node.
     *
     * @param remoteMediaId the value to be set
     */
    public void setRemoteMediaId(String remoteMediaId) {
        this.remoteMediaId = remoteMediaId;
    }

    /**
     * Retrieves title of the media file, may be used as an alternative to the file name.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title of the media file, may be used as an alternative to the file name.
     *
     * @param title the value to be set
     */
    public void setTitle(String title) {
        this.title = title;
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
        ValidationUtil.maxSize(remoteMediaNodeName, 135, "search.remote-media-node-name.wrong-size");
        ValidationUtil.maxSize(remoteMediaId, 40, "search.remote-media-id.wrong-size");
        ValidationUtil.maxSize(title, 255, "search.title.wrong-size");
        ValidationUtil.maxSize(textContent, 16384, "search.text-content.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code SearchPostingMediaUpdate} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchPostingMediaUpdate clone() {
        try {
            return (SearchPostingMediaUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
