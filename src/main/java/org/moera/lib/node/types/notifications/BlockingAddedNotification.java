package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.BlockedOperation;
import org.moera.lib.node.types.validate.ValidationUtil;

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

    public BlockedOperation getBlockedOperation() {
        return blockedOperation;
    }

    public void setBlockedOperation(BlockedOperation blockedOperation) {
        this.blockedOperation = blockedOperation;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public String getPostingHeading() {
        return postingHeading;
    }

    public void setPostingHeading(String postingHeading) {
        this.postingHeading = postingHeading;
    }

    public long getDeadline() {
        return deadline;
    }

    public void setDeadline(long deadline) {
        this.deadline = deadline;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void validate() {
        ValidationUtil.maxSize(postingId, 40, "blocking.posting-id.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "blocking.posting-heading.wrong-size");
        ValidationUtil.maxSize(reason, 1024, "blocking-added.posting-heading.wrong-size");
    }

}
