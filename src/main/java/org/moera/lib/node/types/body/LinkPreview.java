package org.moera.lib.node.types.body;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents a preview of a link with various attributes such as site name, URL, title,
 * description, and image hash.
 * <p>
 * The {@code LinkPreview} object maintains a reference to its parent {@code Body}
 * and invokes updates to the parent whenever any of its properties are modified.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LinkPreview {

    @JsonIgnore
    private Body parent;

    private String siteName;
    private String url;
    private String title;
    private String description;
    private String imageHash;

    /**
     * Sets the parent {@code Body} instance for the current {@code LinkPreview}.
     * This allows the {@code LinkPreview} to reference and notify its parent
     * about modifications when its properties are updated.
     *
     * @param parent the {@code Body} instance to set as the parent
     */
    public void setParent(Body parent) {
        this.parent = parent;
    }

    /**
     * Retrieves the name of the site associated with the link preview.
     *
     * @return the site name, or {@code null} if the site name is not set
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the name of the site associated with the link preview.
     *
     * @param siteName the name of the site to set
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
        modified();
    }

    /**
     * Retrieves the URL associated with the link preview.
     *
     * @return the URL, or {@code null} if the URL is not set
     */
    public String getUrl() {
        return url;
    }

    /**
     * Updates the URL associated with the link preview.
     *
     * @param url the new URL to be set as the link preview's URL
     */
    public void setUrl(String url) {
        this.url = url;
        modified();
    }

    /**
     * Retrieves the title of the link preview.
     *
     * @return the title, or {@code null} if the title is not set
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the link preview.
     *
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
        modified();
    }

    /**
     * Retrieves the description associated with the link preview.
     *
     * @return the description as a string, or {@code null} if no description is set
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the link preview.
     *
     * @param description the description to be set
     */
    public void setDescription(String description) {
        this.description = description;
        modified();
    }

    /**
     * Retrieves the hash of the associated image.
     *
     * @return the image hash
     */
    public String getImageHash() {
        return imageHash;
    }

    /**
     * Sets the hash of the image associated with the link preview.
     *
     * @param imageHash the hash of the image to set
     */
    public void setImageHash(String imageHash) {
        this.imageHash = imageHash;
        modified();
    }

    private void modified() {
        if (parent != null) {
            parent.modified();
        }
    }

}
