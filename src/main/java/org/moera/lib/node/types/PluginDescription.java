package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PluginDescription implements Cloneable {

    private String name;
    private String title;
    private String description;
    private String location;
    private List<String> acceptedEvents;
    private List<SettingDescriptor> options;

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

    public List<SettingDescriptor> getOptions() {
        return options;
    }

    public void setOptions(List<SettingDescriptor> options) {
        this.options = options;
    }

    @Override
    public PluginDescription clone() {
        try {
            return (PluginDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
