package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrivateMediaFileInfo implements Cloneable {

    private String id;
    private String hash;
    private String path;
    private String directPath;
    private String mimeType;
    private Integer width;
    private Integer height;
    private Integer orientation;
    private int size;
    private String postingId;
    private List<MediaFilePreviewInfo> previews;
    private PrivateMediaFileOperations operations;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDirectPath() {
        return directPath;
    }

    public void setDirectPath(String directPath) {
        this.directPath = directPath;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getOrientation() {
        return orientation;
    }

    public void setOrientation(Integer orientation) {
        this.orientation = orientation;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public List<MediaFilePreviewInfo> getPreviews() {
        return previews;
    }

    public void setPreviews(List<MediaFilePreviewInfo> previews) {
        this.previews = previews;
    }

    public PrivateMediaFileOperations getOperations() {
        return operations;
    }

    public void setOperations(PrivateMediaFileOperations operations) {
        this.operations = operations;
    }

    @Override
    public PrivateMediaFileInfo clone() {
        try {
            return (PrivateMediaFileInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
