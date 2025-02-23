package org.moera.lib.node.types;

// This file is generated

import java.util.List;
import java.util.function.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Features implements Cloneable {

    private PostingFeatures posting;
    private List<String> plugins;
    private int feedWidth;
    private FriendGroupsFeatures friendGroups;
    private List<AskSubject> ask;
    private Boolean subscribed;

    @JsonIgnore
    private Object extra;

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

    public Object getExtra() {
        return extra;
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrCreateExtra(Supplier<T> creator) {
        if (extra == null) {
            extra = creator.get();
        }
        return (T) extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public Features clone() {
        try {
            return (Features) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
