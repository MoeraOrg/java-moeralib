package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

/**
 * The number of sharings of a subscribed posting changed.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingSharingsUpdatedNotification extends SubscriberNotification implements PostingSubscriberNotification {

    private String postingId;
    private int total;

    public PostingSharingsUpdatedNotification() {
        super(NotificationType.POSTING_SHARINGS_UPDATED);
    }

    /**
     * Retrieves ID of the posting on the sending node.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting on the sending node.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves total number of sharings visible to the subscriber.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of sharings visible to the subscriber.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "posting.posting-id.wrong-size");
    }

}
