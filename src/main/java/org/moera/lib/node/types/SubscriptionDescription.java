package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionDescription extends Structure implements Cloneable {

    private SubscriptionType type;
    private String feedName;
    private String remoteNodeName;
    private String remoteFeedName;
    private String remotePostingId;
    private SubscriptionReason reason;
    private SubscriptionOperations operations;

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

    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
    }

    public String getRemotePostingId() {
        return remotePostingId;
    }

    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
    }

    public SubscriptionReason getReason() {
        return reason;
    }

    public void setReason(SubscriptionReason reason) {
        this.reason = reason;
    }

    public SubscriptionOperations getOperations() {
        return operations;
    }

    public void setOperations(SubscriptionOperations operations) {
        this.operations = operations;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(type, "subscription.type.missing");
        ValidationUtil.maxSize(feedName, 63, "subscription.feed-name.wrong-size");
        ValidationUtil.notBlank(remoteNodeName, "subscription.remote-node-name.blank");
        ValidationUtil.maxSize(remoteNodeName, 63, "subscription.remote-node-name.wrong-size");
        ValidationUtil.maxSize(remoteFeedName, 63, "subscription.remote-feed-name.wrong-size");
        ValidationUtil.maxSize(remotePostingId, 40, "subscription.remote-posting-id.wrong-size");
        ValidationUtil.notNull(reason, "subscription.reason.missing");
    }

    @Override
    public SubscriptionDescription clone() {
        try {
            return (SubscriptionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
