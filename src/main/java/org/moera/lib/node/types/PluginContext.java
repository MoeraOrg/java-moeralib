package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PluginContext {

    private boolean rootAdmin;
    private boolean admin;
    private List<String> authCategories;
    private String clientName;
    private String remoteAddress;
    private String userAgent;
    private String userAgentOs;
    private String nodeId;
    private String nodeName;
    private String domainName;
    private String originUrl;

    public boolean getRootAdmin() {
        return rootAdmin;
    }

    public void setRootAdmin(boolean rootAdmin) {
        this.rootAdmin = rootAdmin;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public List<String> getAuthCategories() {
        return authCategories;
    }

    public void setAuthCategories(List<String> authCategories) {
        this.authCategories = authCategories;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getUserAgentOs() {
        return userAgentOs;
    }

    public void setUserAgentOs(String userAgentOs) {
        this.userAgentOs = userAgentOs;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }

}
