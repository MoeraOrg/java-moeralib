package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.ReactionTotalsInfo;

/**
 * Reactions have been updated at the posting the receiver is subscribed to.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingReactionsUpdatedNotification extends SubscriberNotification implements PostingSubscriberNotification {

    private String postingId;
    private ReactionTotalsInfo totals;

    public PostingReactionsUpdatedNotification() {
        super(NotificationType.POSTING_REACTIONS_UPDATED);
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
     * Retrieves updated reaction totals of the posting.
     *
     * @return the value
     */
    public ReactionTotalsInfo getTotals() {
        return totals;
    }

    /**
     * Sets updated reaction totals of the posting.
     *
     * @param totals the value to be set
     */
    public void setTotals(ReactionTotalsInfo totals) {
        this.totals = totals;
    }

}
