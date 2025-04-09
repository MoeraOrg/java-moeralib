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
     * Retrieves the name of the feed on this node that receives notifications.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets the name of the feed on this node that receives notifications.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves the name of the node this node is subscribed to.
     *
     * @return the value
     */
    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    /**
     * Sets the name of the node this node is subscribed to.
     *
     * @param remoteNodeName the value to be set
     */
    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    /**
     * Retrieves the name of the feed on the remote node, if the subscription type requires one.
     *
     * @return the value
     */
    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    /**
     * Sets the name of the feed on the remote node, if the subscription type requires one.
     *
     * @param remoteFeedName the value to be set
     */
    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
    }

    /**
     * Retrieves posting ID on the remote node, if the subscription type requires one.
     *
     * @return the value
     */
    public String getRemotePostingId() {
        return remotePostingId;
    }

    /**
     * Sets posting ID on the remote node, if the subscription type requires one.
     *
     * @param remotePostingId the value to be set
     */
    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
    }

    /**
     * Retrieves subscription reason.
     *
     * @return the value
     */
    public SubscriptionReason getReason() {
        return reason;
    }

    /**
     * Sets subscription reason.
     *
     * @param reason the value to be set
     */
    public void setReason(SubscriptionReason reason) {
        this.reason = reason;
    }

    /**
     * Retrieves the operations and the corresponding principals.
     *
     * @return the value
     */
    public SubscriptionOperations getOperations() {
        return operations;
    }

    /**
     * Sets the operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
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
    }

    /**
     * Creates and returns a copy of this {@code SubscriptionDescription} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SubscriptionDescription clone() {
        try {
            return (SubscriptionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
