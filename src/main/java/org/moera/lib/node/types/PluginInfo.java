package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PluginInfo extends Structure implements Cloneable {

    private String nodeId;
    private boolean local;
    private String name;
    private String title;
    private String description;
    private String location;
    private List<String> acceptedEvents;
    private List<SettingMetaInfo> settings;
    private String tokenId;

    /**
     * Retrieves ID of the node this plugin is connected to.
     *
     * @return the value
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Sets ID of the node this plugin is connected to.
     *
     * @param nodeId the value to be set
     */
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Retrieves <code>true</code> if the plugin is enabled for a particular node only, <code>false</code>, if it is
     * enabled for the whole server
     * .
     *
     * @return the value
     */
    public boolean isLocal() {
        return local;
    }

    /**
     * Sets <code>true</code> if the plugin is enabled for a particular node only, <code>false</code>, if it is enabled
     * for the whole server
     * .
     *
     * @param local the value to be set
     */
    public void setLocal(boolean local) {
        this.local = local;
    }

    /**
     * Retrieves a unique plugin name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a unique plugin name.
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
     * Retrieves plugin settings to be added to the list of node settings.
     *
     * @return the value
     */
    public List<SettingMetaInfo> getSettings() {
        return settings;
    }

    /**
     * Sets plugin settings to be added to the list of node settings.
     *
     * @param settings the value to be set
     */
    public void setSettings(List<SettingMetaInfo> settings) {
        this.settings = settings;
    }

    /**
     * Retrieves ID of the token used to authenticate the plugin.
     *
     * @return the value
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * Sets ID of the token used to authenticate the plugin.
     *
     * @param tokenId the value to be set
     */
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * Creates and returns a copy of this {@code PluginInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PluginInfo clone() {
        try {
            return (PluginInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
