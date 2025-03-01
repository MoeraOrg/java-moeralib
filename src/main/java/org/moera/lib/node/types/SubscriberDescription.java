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

    public SubscriptionType getType() {
        return type;
    }

    public void setType(SubscriptionType type) {
        this.type = type;
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public Long getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public SubscriberOperations getOperations() {
        return operations;
    }

    public void setOperations(SubscriberOperations operations) {
        this.operations = operations;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(type, "subscriber.type.missing");
        ValidationUtil.maxSize(feedName, 63, "subscriber.feed-name.wrong-size");
    }

    @Override
    public SubscriberDescription clone() {
        try {
            return (SubscriberDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
