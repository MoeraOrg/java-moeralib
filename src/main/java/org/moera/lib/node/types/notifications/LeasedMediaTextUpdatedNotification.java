package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Text content of a media file leased by the receiver has been updated.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeasedMediaTextUpdatedNotification extends LeaseNotification {

    private String mediaId;
    private String textContent;

    public LeasedMediaTextUpdatedNotification() {
        super(NotificationType.LEASED_MEDIA_TEXT_UPDATED);
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
        ValidationUtil.maxSize(mediaId, 40, "media.media-id.wrong-size");
        ValidationUtil.maxSize(textContent, 16384, "media.text-content.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("mediaId", LogUtil.format(mediaId)));
        parameters.add(LogPair.of("textContent", LogUtil.format(textContent)));
    }

}
