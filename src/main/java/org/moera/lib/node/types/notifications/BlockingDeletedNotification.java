package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.BlockedOperation;
import org.moera.lib.node.types.validate.ValidationUtil;

/**
 * A remote node has unblocked this node.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockingDeletedNotification extends Notification {

    private BlockedOperation blockedOperation;
    private String postingId;
    private String postingHeading;

    public BlockingDeletedNotification() {
        super(NotificationType.BLOCKING_DELETED);
    }

    /**
     * Retrieves operation that is unblocked.
     *
     * @return the value
     */
    public BlockedOperation getBlockedOperation() {
        return blockedOperation;
    }

    /**
     * Sets operation that is unblocked.
     *
     * @param blockedOperation the value to be set
     */
    public void setBlockedOperation(BlockedOperation blockedOperation) {
        this.blockedOperation = blockedOperation;
    }

    /**
     * Retrieves ID of the posting, where the node was blocked; <code>null</code> or absent, if the node was blocked
     * globally
     * .
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting, where the node was blocked; <code>null</code> or absent, if the node was blocked
     * globally
     * .
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves heading of the posting, where the node was blocked; may be absent.
     *
     * @return the value
     */
    public String getPostingHeading() {
        return postingHeading;
    }

    /**
     * Sets heading of the posting, where the node was blocked; may be absent.
     *
     * @param postingHeading the value to be set
     */
    public void setPostingHeading(String postingHeading) {
        this.postingHeading = postingHeading;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "blocking.posting-id.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "blocking.posting-heading.wrong-size");
    }

}
