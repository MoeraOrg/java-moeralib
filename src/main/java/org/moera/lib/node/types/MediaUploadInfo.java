package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaUploadInfo extends Structure implements Cloneable {

    private String id;
    private String mimeType;
    private String title;
    private int fileSize;
    private int chunkSize;
    private List<Integer> uploadedChunks;
    private long deadline;
    private Long completedAt;

    /**
     * Retrieves upload ID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets upload ID.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves MIME type of the media source file.
     *
     * @return the value
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets MIME type of the media source file.
     *
     * @param mimeType the value to be set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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
     * Retrieves full file size in bytes.
     *
     * @return the value
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * Sets full file size in bytes.
     *
     * @param fileSize the value to be set
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * Retrieves chunk size in bytes.
     *
     * @return the value
     */
    public int getChunkSize() {
        return chunkSize;
    }

    /**
     * Sets chunk size in bytes.
     *
     * @param chunkSize the value to be set
     */
    public void setChunkSize(int chunkSize) {
        this.chunkSize = chunkSize;
    }

    /**
     * Retrieves zero-based numbers of uploaded chunks, sorted in natural order.
     *
     * @return the value
     */
    public List<Integer> getUploadedChunks() {
        return uploadedChunks;
    }

    /**
     * Sets zero-based numbers of uploaded chunks, sorted in natural order.
     *
     * @param uploadedChunks the value to be set
     */
    public void setUploadedChunks(List<Integer> uploadedChunks) {
        this.uploadedChunks = uploadedChunks;
    }

    /**
     * Retrieves upload expiration timestamp - the real time when the upload may be deleted.
     *
     * @return the value
     */
    public long getDeadline() {
        return deadline;
    }

    /**
     * Sets upload expiration timestamp - the real time when the upload may be deleted.
     *
     * @param deadline the value to be set
     */
    public void setDeadline(long deadline) {
        this.deadline = deadline;
    }

    /**
     * Retrieves upload completion timestamp - the real time when all chunks were uploaded.
     *
     * @return the value
     */
    public Long getCompletedAt() {
        return completedAt;
    }

    /**
     * Sets upload completion timestamp - the real time when all chunks were uploaded.
     *
     * @param completedAt the value to be set
     */
    public void setCompletedAt(Long completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * Creates and returns a copy of this {@code MediaUploadInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public MediaUploadInfo clone() {
        try {
            return (MediaUploadInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
