package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriberDescription extends Structure implements Cloneable {

    private SubscriptionType type;
    private String feedName;
    private String postingId;
    private Long lastUpdatedAt;
    private SubscriberOperations operations;

    /**
     * Retrieves subscription type.
     *
     * @return the value
     */
    public SubscriptionType getType() {
        return type;
    }

    /**
     * Sets subscription type.
     *
     * @param type the value to be set
     */
    public void setType(SubscriptionType type) {
        this.type = type;
    }

    /**
     * Retrieves feed name, if the subscription type requires one.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets feed name, if the subscription type requires one.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves posting ID, if the subscription type requires one.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets posting ID, if the subscription type requires one.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves timestamp of the latest known state of the object.
     *
     * @return the value
     */
    public Long getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * Sets timestamp of the latest known state of the object.
     *
     * @param lastUpdatedAt the value to be set
     */
    public void setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * Retrieves the operations and the corresponding principals.
     *
     * @return the value
     */
    public SubscriberOperations getOperations() {
        return operations;
    }

    /**
     * Sets the operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(SubscriberOperations operations) {
        this.operations = operations;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(type, "subscriber.type.missing");
        ValidationUtil.maxSize(feedName, 63, "subscriber.feed-name.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code SubscriberDescription} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SubscriberDescription clone() {
        try {
            return (SubscriberDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
