package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.BlockedOperation;
import org.moera.lib.node.types.SearchContentUpdateType;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Notification sent to a Moera search engine when some content on the node was updated and needs reindexing.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchContentUpdatedNotification extends SubscriberNotification {

    private SearchContentUpdateType updateType;
    private String nodeName;
    private String feedName;
    private BlockedOperation blockedOperation;

    public SearchContentUpdatedNotification() {
        super(NotificationType.SEARCH_CONTENT_UPDATED);
    }

    /**
     * Retrieves type of the content that was updated.
     *
     * @return the value
     */
    public SearchContentUpdateType getUpdateType() {
        return updateType;
    }

    /**
     * Sets type of the content that was updated.
     *
     * @param updateType the value to be set
     */
    public void setUpdateType(SearchContentUpdateType updateType) {
        this.updateType = updateType;
    }

    /**
     * Retrieves name of the node; the concrete meaning depends on the update type.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node; the concrete meaning depends on the update type.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves name of the feed; used by subscription/unsubscription updates.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets name of the feed; used by subscription/unsubscription updates.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves the operation being blocked/unblocked; used by updates about blocking/unblocking.
     *
     * @return the value
     */
    public BlockedOperation getBlockedOperation() {
        return blockedOperation;
    }

    /**
     * Sets the operation being blocked/unblocked; used by updates about blocking/unblocking.
     *
     * @param blockedOperation the value to be set
     */
    public void setBlockedOperation(BlockedOperation blockedOperation) {
        this.blockedOperation = blockedOperation;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(updateType, "search.update-type.missing");
        ValidationUtil.maxSize(nodeName, 40, "search.node-name.wrong-size");
        ValidationUtil.maxSize(feedName, 63, "search.feed-name.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("updateType", LogUtil.format(updateType.toString())));
        parameters.add(LogPair.of("nodeName", LogUtil.format(nodeName)));
        parameters.add(LogPair.of("feedName", LogUtil.format(feedName)));
    }

}
