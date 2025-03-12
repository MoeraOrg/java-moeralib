package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.SheriffMark;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * A mention of the receiver in a posting on the sending node added.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MentionPostingAddedNotification extends Notification {

    private String postingId;
    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private AvatarImage ownerAvatar;
    private String heading;
    private List<String> sheriffs;
    private List<SheriffMark> sheriffMarks;

    public MentionPostingAddedNotification() {
        super(NotificationType.MENTION_POSTING_ADDED);
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
     * Retrieves name of the posting's owner.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets name of the posting's owner.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Retrieves full name of the posting's owner.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets full name of the posting's owner.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves gender of the posting's owner.
     *
     * @return the value
     */
    public String getOwnerGender() {
        return ownerGender;
    }

    /**
     * Sets gender of the posting's owner.
     *
     * @param ownerGender the value to be set
     */
    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    /**
     * Retrieves avatar of the posting's owner.
     *
     * @return the value
     */
    public AvatarImage getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets avatar of the posting's owner.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarImage ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
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
     * Retrieves list of sheriffs supervising the posting.
     *
     * @return the value
     */
    public List<String> getSheriffs() {
        return sheriffs;
    }

    /**
     * Sets list of sheriffs supervising the posting.
     *
     * @param sheriffs the value to be set
     */
    public void setSheriffs(List<String> sheriffs) {
        this.sheriffs = sheriffs;
    }

    /**
     * Retrieves list of sheriff marks on the posting.
     *
     * @return the value
     */
    public List<SheriffMark> getSheriffMarks() {
        return sheriffMarks;
    }

    /**
     * Sets list of sheriff marks on the posting.
     *
     * @param sheriffMarks the value to be set
     */
    public void setSheriffMarks(List<SheriffMark> sheriffMarks) {
        this.sheriffMarks = sheriffMarks;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "mention.posting-id.wrong-size");
        ValidationUtil.maxSize(ownerName, 63, "mention.owner-name.wrong-size");
        ValidationUtil.maxSize(ownerFullName, 96, "mention.owner-full-name.wrong-size");
        ValidationUtil.maxSize(ownerGender, 31, "mention.owner-gender.wrong-size");
        ValidationUtil.maxSize(heading, 255, "mention.heading.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("ownerName", LogUtil.format(ownerName)));
        parameters.add(LogPair.of("heading", LogUtil.format(heading)));
    }

}
