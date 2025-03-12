package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * An important update was done to the posting the receiver is subscribed to (subscription to comments is enough).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingImportantUpdateNotification extends SubscriberNotification implements PostingSubscriberNotification {

    private String postingId;
    private String postingOwnerName;
    private String postingOwnerFullName;
    private String postingOwnerGender;
    private AvatarImage postingOwnerAvatar;
    private String postingHeading;
    private String description;

    public PostingImportantUpdateNotification() {
        super(NotificationType.POSTING_IMPORTANT_UPDATE);
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
     * Retrieves name of the posting owner.
     *
     * @return the value
     */
    public String getPostingOwnerName() {
        return postingOwnerName;
    }

    /**
     * Sets name of the posting owner.
     *
     * @param postingOwnerName the value to be set
     */
    public void setPostingOwnerName(String postingOwnerName) {
        this.postingOwnerName = postingOwnerName;
    }

    /**
     * Retrieves full name of the posting owner.
     *
     * @return the value
     */
    public String getPostingOwnerFullName() {
        return postingOwnerFullName;
    }

    /**
     * Sets full name of the posting owner.
     *
     * @param postingOwnerFullName the value to be set
     */
    public void setPostingOwnerFullName(String postingOwnerFullName) {
        this.postingOwnerFullName = postingOwnerFullName;
    }

    /**
     * Retrieves gender of the posting owner.
     *
     * @return the value
     */
    public String getPostingOwnerGender() {
        return postingOwnerGender;
    }

    /**
     * Sets gender of the posting owner.
     *
     * @param postingOwnerGender the value to be set
     */
    public void setPostingOwnerGender(String postingOwnerGender) {
        this.postingOwnerGender = postingOwnerGender;
    }

    /**
     * Retrieves avatar of the posting owner.
     *
     * @return the value
     */
    public AvatarImage getPostingOwnerAvatar() {
        return postingOwnerAvatar;
    }

    /**
     * Sets avatar of the posting owner.
     *
     * @param postingOwnerAvatar the value to be set
     */
    public void setPostingOwnerAvatar(AvatarImage postingOwnerAvatar) {
        this.postingOwnerAvatar = postingOwnerAvatar;
    }

    /**
     * Retrieves heading of the posting.
     *
     * @return the value
     */
    public String getPostingHeading() {
        return postingHeading;
    }

    /**
     * Sets heading of the posting.
     *
     * @param postingHeading the value to be set
     */
    public void setPostingHeading(String postingHeading) {
        this.postingHeading = postingHeading;
    }

    /**
     * Retrieves description of the update.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description of the update.
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
        ValidationUtil.maxSize(postingOwnerName, 63, "posting.posting-owner-name.wrong-size");
        ValidationUtil.maxSize(postingOwnerFullName, 96, "posting.posting-owner-full-name.wrong-size");
        ValidationUtil.maxSize(postingOwnerGender, 31, "posting.posting-owner-gender.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "posting.posting-heading.wrong-size");
        ValidationUtil.maxSize(description, 255, "posting.description.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("postingOwnerName", LogUtil.format(postingOwnerName)));
        parameters.add(LogPair.of("postingHeading", LogUtil.format(postingHeading)));
        parameters.add(LogPair.of("description", LogUtil.format(description)));
    }

}
