package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * A group of friends that includes the receiver has been deleted on the sending node.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupDeletedNotification extends Notification {

    private String friendGroupId;

    public FriendGroupDeletedNotification() {
        super(NotificationType.FRIEND_GROUP_DELETED);
    }

    /**
     * Retrieves ID of the group of friends on the sending node.
     *
     * @return the value
     */
    public String getFriendGroupId() {
        return friendGroupId;
    }

    /**
     * Sets ID of the group of friends on the sending node.
     *
     * @param friendGroupId the value to be set
     */
    public void setFriendGroupId(String friendGroupId) {
        this.friendGroupId = friendGroupId;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(friendGroupId, 40, "friend-group.friend-group-id.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("friendGroupId", LogUtil.format(friendGroupId)));
    }

}
