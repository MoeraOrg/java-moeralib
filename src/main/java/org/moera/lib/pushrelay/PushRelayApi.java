package org.moera.lib.pushrelay;

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

    void storyAdded(Object story, String nodeName, long signedAt, byte[] signature);

    void storyDeleted(String storyId, String nodeName, long signedAt, byte[] signature);

}
