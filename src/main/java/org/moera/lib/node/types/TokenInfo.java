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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getDeadline() {
        return deadline;
    }

    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    public Long getLastUsedAt() {
        return lastUsedAt;
    }

    public void setLastUsedAt(Long lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    public String getLastUsedBrowser() {
        return lastUsedBrowser;
    }

    public void setLastUsedBrowser(String lastUsedBrowser) {
        this.lastUsedBrowser = lastUsedBrowser;
    }

    public String getLastUsedIp() {
        return lastUsedIp;
    }

    public void setLastUsedIp(String lastUsedIp) {
        this.lastUsedIp = lastUsedIp;
    }

    @Override
    public TokenInfo clone() {
        try {
            return (TokenInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
