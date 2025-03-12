package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Comments have been updated at the posting the receiver is subscribed to.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingCommentsUpdatedNotification extends SubscriberNotification implements PostingSubscriberNotification {

    private String postingId;
    private int total;

    public PostingCommentsUpdatedNotification() {
        super(NotificationType.POSTING_COMMENTS_UPDATED);
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
     * Retrieves updated total number of comments to the posting.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets updated total number of comments to the posting.
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

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
    }

}
