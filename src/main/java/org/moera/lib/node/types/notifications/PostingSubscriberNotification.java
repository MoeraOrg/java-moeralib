package org.moera.lib.node.types.notifications;

/**
 * Represents a notification related to a posting that the receiver is subscribed to.
 */
public interface PostingSubscriberNotification {

    /**
     * Retrieves the name of the node that sent the notification.
     *
     * @return the name of the sender node
     */
    String getSenderNodeName();

    /**
     * Retrieves the identifier of the subscriber associated with this notification.
     *
     * @return the subscriber's unique identifier
     */
    String getSubscriberId();

    /**
     * Retrieves the identifier of the posting associated with this notification.
     *
     * @return the posting identifier
     */
    String getPostingId();

}
