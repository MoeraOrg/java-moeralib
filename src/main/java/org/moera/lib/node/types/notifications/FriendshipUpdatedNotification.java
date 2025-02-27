package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.FriendGroupDetails;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendshipUpdatedNotification extends Notification {

    private List<FriendGroupDetails> friendGroups;

    public FriendshipUpdatedNotification() {
        super(NotificationType.FRIENDSHIP_UPDATED);
    }

    public List<FriendGroupDetails> getFriendGroups() {
        return friendGroups;
    }

    public void setFriendGroups(List<FriendGroupDetails> friendGroups) {
        this.friendGroups = friendGroups;
    }

}
