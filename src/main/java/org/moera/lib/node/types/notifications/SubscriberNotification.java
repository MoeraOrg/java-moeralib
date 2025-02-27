package org.moera.lib.node.types.notifications;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

public abstract class SubscriberNotification extends Notification {

    private String subscriberId;

    @JsonIgnore
    private Timestamp subscriptionCreatedAt;

    protected SubscriberNotification(NotificationType type) {
        super(type);
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public Timestamp getSubscriptionCreatedAt() {
        return subscriptionCreatedAt;
    }

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
