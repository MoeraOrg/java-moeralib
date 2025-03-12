package org.moera.lib.node.types;

import java.util.List;

/**
 * Represents a general interface that defines methods to retrieve media attachments information,
 */
public interface MediaInfo {

    /**
     * Retrieves the unique identifier of the object.
     *
     * @return the unique identifier
     */
    String getId();

    /**
     * Retrieves a list of media attachments associated with the implementing object.
     *
     * @return a list of {@code MediaAttachment} objects representing the attached media
     */
    List<MediaAttachment> getMedia();

}
