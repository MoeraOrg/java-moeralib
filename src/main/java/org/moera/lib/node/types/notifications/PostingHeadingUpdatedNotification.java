package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Heading of a posting the receiver is subscribed to has been updated.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingHeadingUpdatedNotification extends SubscriberNotification implements PostingSubscriberNotification {

    private String postingId;
    private String revisionId;
    private String heading;
    private String description;

    public PostingHeadingUpdatedNotification() {
        super(NotificationType.POSTING_HEADING_UPDATED);
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
     * Retrieves ID of the posting revision on the sending node.
     *
     * @return the value
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * Sets ID of the posting revision on the sending node.
     *
     * @param revisionId the value to be set
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * Retrieves heading of the posting.
     *
     * @return the value
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets heading of the posting.
     *
     * @param heading the value to be set
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * Retrieves description of the posting.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description of the posting.
     *
     * @param description the value to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "posting.posting-id.wrong-size");
        ValidationUtil.maxSize(revisionId, 40, "posting.revision-id.wrong-size");
        ValidationUtil.maxSize(heading, 255, "posting.heading.wrong-size");
        ValidationUtil.maxSize(description, 255, "posting.description.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("revisionId", LogUtil.format(revisionId)));
        parameters.add(LogPair.of("heading", LogUtil.format(heading)));
        parameters.add(LogPair.of("description", LogUtil.format(description)));
    }

}
