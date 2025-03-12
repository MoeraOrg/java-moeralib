package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.StoryType;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * A new story has been added to a feed the receiver is subscribed to.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoryAddedNotification extends SubscriberNotification {

    private String storyId;
    private String feedName;
    private StoryType storyType;
    private String postingId;

    public StoryAddedNotification() {
        super(NotificationType.STORY_ADDED);
    }

    /**
     * Retrieves ID of the story on the sending node.
     *
     * @return the value
     */
    public String getStoryId() {
        return storyId;
    }

    /**
     * Sets ID of the story on the sending node.
     *
     * @param storyId the value to be set
     */
    public void setStoryId(String storyId) {
        this.storyId = storyId;
    }

    /**
     * Retrieves name of the feed on the sending node.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets name of the feed on the sending node.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves type of the story.
     *
     * @return the value
     */
    public StoryType getStoryType() {
        return storyType;
    }

    /**
     * Sets type of the story.
     *
     * @param storyType the value to be set
     */
    public void setStoryType(StoryType storyType) {
        this.storyType = storyType;
    }

    /**
     * Retrieves ID of the posting on the sending node, if the story is related to a posting.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting on the sending node, if the story is related to a posting.
     *
     * @param postingId the value to be set
     */
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
