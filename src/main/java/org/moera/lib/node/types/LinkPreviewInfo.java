package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkPreviewInfo extends Structure implements Cloneable {

    private String siteName;
    private String url;
    private String title;
    private String description;
    private String imageUrl;

    /**
     * Retrieves name of the site.
     *
     * @return the value
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets name of the site.
     *
     * @param siteName the value to be set
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * Retrieves canonical URL of the page.
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets canonical URL of the page.
     *
     * @param url the value to be set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Retrieves title of the page.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title of the page.
     *
     * @param title the value to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves description of the page.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description of the page.
     *
     * @param description the value to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves URL of the image presenting the page.
     *
     * @return the value
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets URL of the image presenting the page.
     *
     * @param imageUrl the value to be set
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Creates and returns a copy of this {@code LinkPreviewInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public LinkPreviewInfo clone() {
        try {
            return (LinkPreviewInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
