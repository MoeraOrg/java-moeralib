package org.moera.lib.node.types.notifications;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Represents a notification sent to a subscriber, providing
 * details relevant to the corresponding subscription.
 */
public abstract class SubscriberNotification extends Notification {

    private String subscriberId;

    @JsonIgnore
    private Timestamp subscriptionCreatedAt;

    /**
     * Constructs a {@code SubscriberNotification} with the specified notification type.
     *
     * @param type the type of the notification
     */
    protected SubscriberNotification(NotificationType type) {
        super(type);
    }

    /**
     * Retrieves the subscriber's unique identifier.
     *
     * @return the unique identifier of the subscriber
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the identifier of the subscriber associated with the notification.
     *
     * @param subscriberId the identifier of the subscriber to be set
     */
    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    /**
     * Retrieves the timestamp indicating when the subscription was created.
     *
     * @return the subscription creation timestamp
     */
    public Timestamp getSubscriptionCreatedAt() {
        return subscriptionCreatedAt;
    }

    /**
     * Sets the timestamp representing when the subscription was created.
     *
     * @param subscriptionCreatedAt the timestamp indicating the creation time of the subscription
     */
    public void setSubscriptionCreatedAt(Timestamp subscriptionCreatedAt) {
        this.subscriptionCreatedAt = subscriptionCreatedAt;
    }

    public void validate() {
        ValidationUtil.maxSize(subscriberId, 40, "subscriber.subscriber-id.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("subscriberId", LogUtil.format(subscriberId)));
    }

}
