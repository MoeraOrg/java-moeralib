package org.moera.lib.node.types;

// This file is generated

import java.util.List;
import java.util.function.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PluginInfo implements Cloneable {

    private String nodeId;
    private boolean local;
    private String name;
    private String title;
    private String description;
    private String location;
    private List<String> acceptedEvents;
    private List<SettingMetaInfo> settings;
    private String tokenId;

    @JsonIgnore
    private Object extra;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getAcceptedEvents() {
        return acceptedEvents;
    }

    public void setAcceptedEvents(List<String> acceptedEvents) {
        this.acceptedEvents = acceptedEvents;
    }

    public List<SettingMetaInfo> getSettings() {
        return settings;
    }

    public void setSettings(List<SettingMetaInfo> settings) {
        this.settings = settings;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
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
    public PluginInfo clone() {
        try {
            return (PluginInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
