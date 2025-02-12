package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Features {

    private PostingFeatures posting;
    private List<String> plugins;
    private int feedWidth;
    private FriendGroupsFeatures friendGroups;
    private List<AskSubject> ask;
    private Boolean subscribed;

    public PostingFeatures getPosting() {
        return posting;
    }

    public void setPosting(PostingFeatures posting) {
        this.posting = posting;
    }

    public List<String> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<String> plugins) {
        this.plugins = plugins;
    }

    public int getFeedWidth() {
        return feedWidth;
    }

    public void setFeedWidth(int feedWidth) {
        this.feedWidth = feedWidth;
    }

    public FriendGroupsFeatures getFriendGroups() {
        return friendGroups;
    }

    public void setFriendGroups(FriendGroupsFeatures friendGroups) {
        this.friendGroups = friendGroups;
    }

    public List<AskSubject> getAsk() {
        return ask;
    }

    public void setAsk(List<AskSubject> ask) {
        this.ask = ask;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

}
