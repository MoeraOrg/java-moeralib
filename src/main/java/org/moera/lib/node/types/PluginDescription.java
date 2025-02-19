package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PluginDescription implements Cloneable {

    private String name;
    private String title;
    private String description;
    private String location;
    private List<String> acceptedEvents;
    private List<SettingDescriptor> options;

    @JsonIgnore
    private Object extra;

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

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
        ValidationUtil.notBlank(name, "plugin.name.blank");
        ValidationUtil.maxSize(name, 48, "plugin.name.wrong-size");
        ValidationUtil.maxSize(title, 80, "plugin.title.wrong-size");
        ValidationUtil.maxSize(description, 256, "plugin.description.wrong-size");
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
