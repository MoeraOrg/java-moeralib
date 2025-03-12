package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * A node was added to a user list the receiver is subscribed to.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserListItemAddedNotification extends SubscriberNotification {

    private String listName;
    private String nodeName;

    public UserListItemAddedNotification() {
        super(NotificationType.USER_LIST_ITEM_ADDED);
    }

    /**
     * Retrieves name of the user list.
     *
     * @return the value
     */
    public String getListName() {
        return listName;
    }

    /**
     * Sets name of the user list.
     *
     * @param listName the value to be set
     */
    public void setListName(String listName) {
        this.listName = listName;
    }

    /**
     * Retrieves name of the node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(listName, 63, "user-list.list-name.wrong-size");
        ValidationUtil.maxSize(nodeName, 63, "user-list.node-name.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("listName", LogUtil.format(listName)));
        parameters.add(LogPair.of("nodeName", LogUtil.format(nodeName)));
    }

}
