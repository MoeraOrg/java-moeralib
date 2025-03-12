package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AskSubject;
import org.moera.lib.node.types.validate.ValidationUtil;

/**
 * A remote node asks this node for something.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AskedNotification extends Notification {

    private AskSubject subject;
    private String friendGroupId;
    private String message;

    public AskedNotification() {
        super(NotificationType.ASKED);
    }

    /**
     * Retrieves request subject.
     *
     * @return the value
     */
    public AskSubject getSubject() {
        return subject;
    }

    /**
     * Sets request subject.
     *
     * @param subject the value to be set
     */
    public void setSubject(AskSubject subject) {
        this.subject = subject;
    }

    /**
     * Retrieves if the request is to add this node to friends, this field contains ID of the corresponding group of
     * friends on the remote node
     * .
     *
     * @return the value
     */
    public String getFriendGroupId() {
        return friendGroupId;
    }

    /**
     * Sets if the request is to add this node to friends, this field contains ID of the corresponding group of friends
     * on the remote node
     * .
     *
     * @param friendGroupId the value to be set
     */
    public void setFriendGroupId(String friendGroupId) {
        this.friendGroupId = friendGroupId;
    }

    /**
     * Retrieves optional message to the node admin.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets optional message to the node admin.
     *
     * @param message the value to be set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(friendGroupId, 40, "ask.friend-group-id.wrong-size");
        ValidationUtil.maxSize(message, 70, "ask.message.wrong-size");
    }

}
