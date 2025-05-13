package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * The sending node got a cancellation of a sheriff's order related to all postings in the receiver's feed.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffOrderForFeedDeletedNotification extends Notification {

    private String remoteNodeName;
    private String remoteFeedName;
    private String orderId;

    public SheriffOrderForFeedDeletedNotification() {
        super(NotificationType.SHERIFF_ORDER_FOR_FEED_DELETED);
    }

    /**
     * Retrieves name of the node the order was sent to.
     *
     * @return the value
     */
    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    /**
     * Sets name of the node the order was sent to.
     *
     * @param remoteNodeName the value to be set
     */
    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    /**
     * Retrieves name of the feed the order is related to.
     *
     * @return the value
     */
    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    /**
     * Sets name of the feed the order is related to.
     *
     * @param remoteFeedName the value to be set
     */
    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
    }

    /**
     * Retrieves ID of the order.
     *
     * @return the value
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets ID of the order.
     *
     * @param orderId the value to be set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(remoteNodeName, "sheriff-order.remote-node-name.empty");
        ValidationUtil.maxSize(remoteNodeName, 63, "sheriff-order.remote-node-name.wrong-size");
        ValidationUtil.notBlank(remoteFeedName, "sheriff-order.remote-feed-name.empty");
        ValidationUtil.maxSize(remoteFeedName, 63, "sheriff-order.remote-feed-name.wrong-size");
        ValidationUtil.notBlank(orderId, "sheriff-order.order-id.empty");
        ValidationUtil.maxSize(orderId, 40, "sheriff-order.order-id.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("remoteNodeName", LogUtil.format(remoteNodeName)));
        parameters.add(LogPair.of("remoteFeedName", LogUtil.format(remoteFeedName)));
        parameters.add(LogPair.of("orderId", LogUtil.format(orderId)));
    }

}
