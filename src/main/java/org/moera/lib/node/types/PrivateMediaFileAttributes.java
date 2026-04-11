package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrivateMediaFileAttributes extends Structure implements Cloneable {

    private String title;

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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(title, 255, "media.title.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code PrivateMediaFileAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PrivateMediaFileAttributes clone() {
        try {
            return (PrivateMediaFileAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
