package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Sender's profile the receiver is subscribed to has been updated.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileUpdatedNotification extends SubscriberNotification {

    public ProfileUpdatedNotification() {
        super(NotificationType.PROFILE_UPDATED);
    }

}
