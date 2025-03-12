package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.BlockedOperation;
import org.moera.lib.node.types.validate.ValidationUtil;

/**
 * A remote node has blocked this node.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockingAddedNotification extends Notification {

    private BlockedOperation blockedOperation;
    private String postingId;
    private String postingHeading;
    private long deadline;
    private String reason;

    public BlockingAddedNotification() {
        super(NotificationType.BLOCKING_ADDED);
    }

    /**
     * Retrieves operation that is blocked.
     *
     * @return the value
     */
    public BlockedOperation getBlockedOperation() {
        return blockedOperation;
    }

    /**
     * Sets operation that is blocked.
     *
     * @param blockedOperation the value to be set
     */
    public void setBlockedOperation(BlockedOperation blockedOperation) {
        this.blockedOperation = blockedOperation;
    }

    /**
     * Retrieves ID of the posting, where the node is blocked; <code>null</code> or absent, if the node is blocked
     * globally
     * .
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting, where the node is blocked; <code>null</code> or absent, if the node is blocked globally
     * .
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves heading of the posting, where the node is blocked; may be absent.
     *
     * @return the value
     */
    public String getPostingHeading() {
        return postingHeading;
    }

    /**
     * Sets heading of the posting, where the node is blocked; may be absent.
     *
     * @param postingHeading the value to be set
     */
    public void setPostingHeading(String postingHeading) {
        this.postingHeading = postingHeading;
    }

    /**
     * Retrieves unblocking timestamp - the real time when the node will be unblocked; <code>null</code> or absent, if
     * the node is blocked permanently
     * .
     *
     * @return the value
     */
    public long getDeadline() {
        return deadline;
    }

    /**
     * Sets unblocking timestamp - the real time when the node will be unblocked; <code>null</code> or absent, if the
     * node is blocked permanently
     * .
     *
     * @param deadline the value to be set
     */
    public void setDeadline(long deadline) {
        this.deadline = deadline;
    }

    /**
     * Retrieves reason of blocking, may be absent.
     *
     * @return the value
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason of blocking, may be absent.
     *
     * @param reason the value to be set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "blocking.posting-id.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "blocking.posting-heading.wrong-size");
        ValidationUtil.maxSize(reason, 1024, "blocking-added.posting-heading.wrong-size");
    }

}
