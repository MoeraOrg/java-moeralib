package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.StoryType;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoryAddedNotification extends SubscriberNotification {

    private String storyId;
    private String feedName;
    private StoryType storyType;
    private String postingId;

    public StoryAddedNotification() {
        super(NotificationType.STORY_ADDED);
    }

    public String getStoryId() {
        return storyId;
    }

    public void setStoryId(String storyId) {
        this.storyId = storyId;
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public StoryType getStoryType() {
        return storyType;
    }

    public void setStoryType(StoryType storyType) {
        this.storyType = storyType;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(storyId, 40, "story.story-id.wrong-size");
        ValidationUtil.maxSize(feedName, 63, "story.feed-name.wrong-size");
        ValidationUtil.maxSize(postingId, 40, "story.posting-id.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("storyId", LogUtil.format(storyId)));
        parameters.add(LogPair.of("feedName", LogUtil.format(feedName)));
        parameters.add(LogPair.of("storyType", LogUtil.format(storyType.toString())));
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
    }

}
