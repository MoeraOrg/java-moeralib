package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.SheriffMark;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

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

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public String getOwnerGender() {
        return ownerGender;
    }

    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    public AvatarImage getOwnerAvatar() {
        return ownerAvatar;
    }

    public void setOwnerAvatar(AvatarImage ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public List<String> getSheriffs() {
        return sheriffs;
    }

    public void setSheriffs(List<String> sheriffs) {
        this.sheriffs = sheriffs;
    }

    public List<SheriffMark> getSheriffMarks() {
        return sheriffMarks;
    }

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
