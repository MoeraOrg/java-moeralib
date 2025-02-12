package org.moera.lib.node.types;

// This file is generated

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenInfo {

    private String id;
    private String token;
    private String name;
    private List<String> permissions;
    private String pluginName;
    private Timestamp createdAt;
    private Timestamp deadline;
    private Timestamp lastUsedAt;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public Timestamp getLastUsedAt() {
        return lastUsedAt;
    }

    public void setLastUsedAt(Timestamp lastUsedAt) {
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

}
