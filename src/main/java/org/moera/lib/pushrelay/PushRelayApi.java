package org.moera.lib.pushrelay;

import org.moera.lib.node.types.StoryInfo;

public interface PushRelayApi {

    void register(String clientId, String nodeName, String lang, long signedAt, byte[] signature);

    void feedStatus(
        String feedName,
        int notViewed,
        long notViewedMoment,
        String nodeName,
        long signedAt,
        byte[] signature
    );

    void storyAdded(StoryInfo story, String nodeName, long signedAt, byte[] signature);

    void storyDeleted(String storyId, String nodeName, long signedAt, byte[] signature);

}
