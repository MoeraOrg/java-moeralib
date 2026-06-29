package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Title of a media file leased by the receiver has been updated.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeasedMediaTitleUpdatedNotification extends LeaseNotification {

    private String mediaId;
    private String title;

    public LeasedMediaTitleUpdatedNotification() {
        super(NotificationType.LEASED_MEDIA_TITLE_UPDATED);
    }

    /**
     * Retrieves ID of the media on the sending node.
     *
     * @return the value
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets ID of the media on the sending node.
     *
     * @param mediaId the value to be set
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(mediaId, 40, "media.media-id.wrong-size");
        ValidationUtil.maxSize(title, 255, "media.title.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("mediaId", LogUtil.format(mediaId)));
    }

}
