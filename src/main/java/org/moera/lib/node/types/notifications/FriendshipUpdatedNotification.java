package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.FriendGroupDetails;

/**
 * The receiver was added to or removed from groups of friends on the sending node.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendshipUpdatedNotification extends Notification {

    private List<FriendGroupDetails> friendGroups;

    public FriendshipUpdatedNotification() {
        super(NotificationType.FRIENDSHIP_UPDATED);
    }

    /**
     * Retrieves the updated list of group of friends the receiver is member of.
     *
     * @return the value
     */
    public List<FriendGroupDetails> getFriendGroups() {
        return friendGroups;
    }

    /**
     * Sets the updated list of group of friends the receiver is member of.
     *
     * @param friendGroups the value to be set
     */
    public void setFriendGroups(List<FriendGroupDetails> friendGroups) {
        this.friendGroups = friendGroups;
    }

}
