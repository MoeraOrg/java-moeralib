package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteMedia extends Structure implements Cloneable {

    private String nodeName;
    private String mediaId;
    private String hash;
    private String digest;
    private String mimeType;
    private Integer width;
    private Integer height;
    private long size;
    private String title;
    private Boolean attachment;
    private String leaseId;

    /**
     * Retrieves name of the node the media file is located on.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node the media file is located on.
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
     * Retrieves SHA-1 hash of the media file.
     *
     * @return the value
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets SHA-1 hash of the media file.
     *
     * @param hash the value to be set
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Retrieves cryptographic digest of the media file.
     *
     * @return the value
     */
    public String getDigest() {
        return digest;
    }

    /**
     * Sets cryptographic digest of the media file.
     *
     * @param digest the value to be set
     */
    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * Retrieves MIME type of the media.
     *
     * @return the value
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets MIME type of the media.
     *
     * @param mimeType the value to be set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * Retrieves width of the media in pixels (<code>null</code>, if the media file is not an image or video).
     *
     * @return the value
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets width of the media in pixels (<code>null</code>, if the media file is not an image or video).
     *
     * @param width the value to be set
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Retrieves height of the media in pixels (<code>null</code>, if the media file is not an image or video).
     *
     * @return the value
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets height of the media in pixels (<code>null</code>, if the media file is not an image or video).
     *
     * @param height the value to be set
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Retrieves size of the media file in bytes.
     *
     * @return the value
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets size of the media file in bytes.
     *
     * @param size the value to be set
     */
    public void setSize(long size) {
        this.size = size;
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
     * Retrieves <code>true</code> if the media cannot be displayed as an image or video and should be displayed as an
     * attachment instead, <code>false</code> (default) otherwise
     * .
     *
     * @return the value
     */
    public Boolean getAttachment() {
        return attachment;
    }

    /**
     * Sets <code>true</code> if the media cannot be displayed as an image or video and should be displayed as an
     * attachment instead, <code>false</code> (default) otherwise
     * .
     *
     * @param attachment the value to be set
     */
    public void setAttachment(Boolean attachment) {
        this.attachment = attachment;
    }

    /**
     * Retrieves ID of the lease.
     *
     * @return the value
     */
    public String getLeaseId() {
        return leaseId;
    }

    /**
     * Sets ID of the lease.
     *
     * @param leaseId the value to be set
     */
    public void setLeaseId(String leaseId) {
        this.leaseId = leaseId;
    }

    /**
     * Creates and returns a copy of this {@code RemoteMedia} object.
     *
     * @return a clone of this instance
     */
    @Override
    public RemoteMedia clone() {
        try {
            return (RemoteMedia) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
