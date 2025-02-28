package org.moera.lib.node.types.notifications;

public interface PostingSubscriberNotification {

    String getSenderNodeName();

    String getSubscriberId();

    String getPostingId();

}
