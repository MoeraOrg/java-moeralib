package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaDownloadAttributes extends Structure implements Cloneable {

    private String grant;

    /**
     * Retrieves media grant allowing access to the media.
     *
     * @return the value
     */
    public String getGrant() {
        return grant;
    }

    /**
     * Sets media grant allowing access to the media.
     *
     * @param grant the value to be set
     */
    public void setGrant(String grant) {
        this.grant = grant;
    }

    /**
     * Creates and returns a copy of this {@code MediaDownloadAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public MediaDownloadAttributes clone() {
        try {
            return (MediaDownloadAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
