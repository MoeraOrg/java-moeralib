package org.moera.lib.pushrelay;

import org.moera.lib.node.types.StoryInfo;

/**
 * The {@code PushRelayApi} interface provides prototypes of Moera Push Relay API calls.
 */
public interface PushRelayApi {

    /**
     * Register a client to receive messages from the specified node.
     * The client will be unregistered automatically if the relay gets an error from the push service indicating that
     * the client cannot receive messages anymore.
     *
     * @param clientId ID/token of the target client to receive messages
     * @param nodeName name of the node that will send messages
     * @param lang language of the messages (use standard language codes, like "en_US" or "uk")
     * @param signedAt timestamp of the signature, the signature will be valid 2 minutes after the time specified
     * @param signature the signature (use {@link org.moera.lib.node.Fingerprints#pushRelayRegister} fingerprint)
     */
    void register(String clientId, String nodeName, String lang, long signedAt, byte[] signature);

    /**
     * Send a message to node's clients about number of new stories in a feed.
     *
     * @param feedName name of the feed
     * @param notViewed number of stories that have not been viewed yet
     * @param notViewedMoment moment of the oldest non-viewed story
     * @param nodeName name of the node that is sending the message
     * @param signedAt timestamp of the signature, the signature will be valid 2 minutes after the time specified
     * @param signature the signature (use {@link org.moera.lib.node.Fingerprints#pushRelayMessage} fingerprint)
     */
    void feedStatus(
        String feedName,
        int notViewed,
        long notViewedMoment,
        String nodeName,
        long signedAt,
        byte[] signature
    );

    /**
     * Send a message to node's clients about a new story.
     *
     * @param story the story
     * @param nodeName name of the node that is sending the message
     * @param signedAt timestamp of the signature, the signature will be valid 2 minutes after the time specified
     * @param signature the signature (use {@link org.moera.lib.node.Fingerprints#pushRelayMessage} fingerprint)
     */
    void storyAdded(StoryInfo story, String nodeName, long signedAt, byte[] signature);

    /**
     * Send a message to node's clients about deleting a story.
     *
     * @param storyId ID of the story
     * @param nodeName name of the node that is sending the message
     * @param signedAt timestamp of the signature, the signature will be valid 2 minutes after the time specified
     * @param signature the signature (use {@link org.moera.lib.node.Fingerprints#pushRelayMessage} fingerprint)
     */
    void storyDeleted(String storyId, String nodeName, long signedAt, byte[] signature);

}
