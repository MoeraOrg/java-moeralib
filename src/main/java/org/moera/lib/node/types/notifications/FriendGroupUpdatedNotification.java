package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.FriendGroupInfo;
import org.moera.lib.util.LogUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupUpdatedNotification extends Notification {

    private FriendGroupInfo friendGroup;

    public FriendGroupUpdatedNotification() {
        super(NotificationType.FRIEND_GROUP_UPDATED);
    }

    public FriendGroupInfo getFriendGroup() {
        return friendGroup;
    }

    public void setFriendGroup(FriendGroupInfo friendGroup) {
        this.friendGroup = friendGroup;
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("friendGroup", LogUtil.format(friendGroup.getId())));
    }

}
