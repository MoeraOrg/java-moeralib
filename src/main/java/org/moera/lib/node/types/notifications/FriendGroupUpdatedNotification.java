package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.FriendGroupInfo;
import org.moera.lib.util.LogUtil;

/**
 * A group of friends that includes the receiver has been updated on the sending node.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupUpdatedNotification extends Notification {

    private FriendGroupInfo friendGroup;

    public FriendGroupUpdatedNotification() {
        super(NotificationType.FRIEND_GROUP_UPDATED);
    }

    /**
     * Retrieves the updated information about the group of friends.
     *
     * @return the value
     */
    public FriendGroupInfo getFriendGroup() {
        return friendGroup;
    }

    /**
     * Sets the updated information about the group of friends.
     *
     * @param friendGroup the value to be set
     */
    public void setFriendGroup(FriendGroupInfo friendGroup) {
        this.friendGroup = friendGroup;
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("friendGroup", LogUtil.format(friendGroup.getId())));
    }

}
