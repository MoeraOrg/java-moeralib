package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserListItemDeletedNotification extends SubscriberNotification {

    private String listName;
    private String nodeName;

    public UserListItemDeletedNotification() {
        super(NotificationType.USER_LIST_ITEM_DELETED);
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getNodeName() {
        return nodeName;
    }

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
