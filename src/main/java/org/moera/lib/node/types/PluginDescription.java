package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PluginDescription extends Structure implements Cloneable {

    private String name;
    private String title;
    private String description;
    private String location;
    private List<String> acceptedEvents;
    private List<SettingDescriptor> options;

    /**
     * Retrieves a unique plugin name; can contain only small latin letters, digits or hyphen.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a unique plugin name; can contain only small latin letters, digits or hyphen.
     *
     * @param name the value to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves user-readable title of the plugin.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets user-readable title of the plugin.
     *
     * @param title the value to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves user-readable description of the purpose of the plugin.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets user-readable description of the purpose of the plugin.
     *
     * @param description the value to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves URL of the plugin; used by the node to call the plugin API.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets URL of the plugin; used by the node to call the plugin API.
     *
     * @param location the value to be set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Retrieves list of types of internal events the plugin wants to receive; <a href="#internal-events">Read more
     * about internal events.</a>
     * .
     *
     * @return the value
     */
    public List<String> getAcceptedEvents() {
        return acceptedEvents;
    }

    /**
     * Sets list of types of internal events the plugin wants to receive; <a href="#internal-events">Read more about
     * internal events.</a>
     * .
     *
     * @param acceptedEvents the value to be set
     */
    public void setAcceptedEvents(List<String> acceptedEvents) {
        this.acceptedEvents = acceptedEvents;
    }

    /**
     * Retrieves plugin settings to be added to the list of node settings, the settings appear in the list with a
     * prefix <code>plugin.&lt;plugin name>.</code>
     * .
     *
     * @return the value
     */
    public List<SettingDescriptor> getOptions() {
        return options;
    }

    /**
     * Sets plugin settings to be added to the list of node settings, the settings appear in the list with a prefix
     * <code>plugin.&lt;plugin name>.</code>
     * .
     *
     * @param options the value to be set
     */
    public void setOptions(List<SettingDescriptor> options) {
        this.options = options;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(name, "plugin.name.blank");
        ValidationUtil.maxSize(name, 48, "plugin.name.wrong-size");
        ValidationUtil.maxSize(title, 80, "plugin.title.wrong-size");
        ValidationUtil.maxSize(description, 256, "plugin.description.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code PluginDescription} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PluginDescription clone() {
        try {
            return (PluginDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
