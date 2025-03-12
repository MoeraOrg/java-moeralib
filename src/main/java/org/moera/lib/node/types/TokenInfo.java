package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenInfo extends Structure implements Cloneable {

    private String id;
    private String token;
    private String name;
    private List<String> permissions;
    private String pluginName;
    private long createdAt;
    private Long deadline;
    private Long lastUsedAt;
    private String lastUsedBrowser;
    private String lastUsedIp;

    /**
     * Retrieves token ID (this is not the token, just an ID).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets token ID (this is not the token, just an ID).
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves the token.
     *
     * @return the value
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the token.
     *
     * @param token the value to be set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Retrieves a user-readable name of the token.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a user-readable name of the token.
     *
     * @param name the value to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the list of permissions granted to the token.
     *
     * @return the value
     */
    public List<String> getPermissions() {
        return permissions;
    }

    /**
     * Sets the list of permissions granted to the token.
     *
     * @param permissions the value to be set
     */
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    /**
     * Retrieves a plugin the token belongs to; if set, only this plugin may use the token.
     *
     * @return the value
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * Sets a plugin the token belongs to; if set, only this plugin may use the token.
     *
     * @param pluginName the value to be set
     */
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    /**
     * Retrieves token creation timestamp.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets token creation timestamp.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves timestamp of the end of the token's life.
     *
     * @return the value
     */
    public Long getDeadline() {
        return deadline;
    }

    /**
     * Sets timestamp of the end of the token's life.
     *
     * @param deadline the value to be set
     */
    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    /**
     * Retrieves timestamp of the last time the token was used.
     *
     * @return the value
     */
    public Long getLastUsedAt() {
        return lastUsedAt;
    }

    /**
     * Sets timestamp of the last time the token was used.
     *
     * @param lastUsedAt the value to be set
     */
    public void setLastUsedAt(Long lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    /**
     * Retrieves name of the browser used by the latest user of the token.
     *
     * @return the value
     */
    public String getLastUsedBrowser() {
        return lastUsedBrowser;
    }

    /**
     * Sets name of the browser used by the latest user of the token.
     *
     * @param lastUsedBrowser the value to be set
     */
    public void setLastUsedBrowser(String lastUsedBrowser) {
        this.lastUsedBrowser = lastUsedBrowser;
    }

    /**
     * Retrieves IP address of the latest user of the token.
     *
     * @return the value
     */
    public String getLastUsedIp() {
        return lastUsedIp;
    }

    /**
     * Sets IP address of the latest user of the token.
     *
     * @param lastUsedIp the value to be set
     */
    public void setLastUsedIp(String lastUsedIp) {
        this.lastUsedIp = lastUsedIp;
    }

    /**
     * Creates and returns a copy of this {@code TokenInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public TokenInfo clone() {
        try {
            return (TokenInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
