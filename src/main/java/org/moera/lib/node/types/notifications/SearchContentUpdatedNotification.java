package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.SearchContentUpdateType;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Notification sent to a Moera search engine when some content on the node was updated and needs reindexing.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchContentUpdatedNotification extends SubscriberNotification {

    private SearchContentUpdateType updateType;

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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(updateType, "search.update-type.missing");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("updateType", LogUtil.format(updateType.toString())));
    }

}
