package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PluginContext extends Structure implements Cloneable {

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

    /**
     * Retrieves <code>true</code>, if the client has authenticated as root admin, <code>false</code> otherwise.
     *
     * @return the value
     */
    public boolean isRootAdmin() {
        return rootAdmin;
    }

    /**
     * Sets <code>true</code>, if the client has authenticated as root admin, <code>false</code> otherwise.
     *
     * @param rootAdmin the value to be set
     */
    public void setRootAdmin(boolean rootAdmin) {
        this.rootAdmin = rootAdmin;
    }

    /**
     * Retrieves <code>true</code>, if the client has authenticated as node admin, <code>false</code> otherwise.
     *
     * @return the value
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Sets <code>true</code>, if the client has authenticated as node admin, <code>false</code> otherwise.
     *
     * @param admin the value to be set
     */
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    /**
     * Retrieves the list of permissions granted to the client, if it has authenticated as node admin; see <code><a
     * href="#TokenInfo">TokenInfo</a>.permissions</code> for the list of possible values
     * .
     *
     * @return the value
     */
    public List<String> getAuthCategories() {
        return authCategories;
    }

    /**
     * Sets the list of permissions granted to the client, if it has authenticated as node admin; see <code><a
     * href="#TokenInfo">TokenInfo</a>.permissions</code> for the list of possible values
     * .
     *
     * @param authCategories the value to be set
     */
    public void setAuthCategories(List<String> authCategories) {
        this.authCategories = authCategories;
    }

    /**
     * Retrieves node name of the client.
     *
     * @return the value
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets node name of the client.
     *
     * @param clientName the value to be set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Retrieves IP address of the client.
     *
     * @return the value
     */
    public String getRemoteAddress() {
        return remoteAddress;
    }

    /**
     * Sets IP address of the client.
     *
     * @param remoteAddress the value to be set
     */
    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    /**
     * Retrieves user agent (browser) used by the client.
     *
     * @return the value
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets user agent (browser) used by the client.
     *
     * @param userAgent the value to be set
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * Retrieves operating system used by the client.
     *
     * @return the value
     */
    public String getUserAgentOs() {
        return userAgentOs;
    }

    /**
     * Sets operating system used by the client.
     *
     * @param userAgentOs the value to be set
     */
    public void setUserAgentOs(String userAgentOs) {
        this.userAgentOs = userAgentOs;
    }

    /**
     * Retrieves ID of the current node.
     *
     * @return the value
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Sets ID of the current node.
     *
     * @param nodeId the value to be set
     */
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Retrieves node name of the current node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets node name of the current node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves domain name of the current node.
     *
     * @return the value
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets domain name of the current node.
     *
     * @param domainName the value to be set
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Retrieves full URL of the request.
     *
     * @return the value
     */
    public String getOriginUrl() {
        return originUrl;
    }

    /**
     * Sets full URL of the request.
     *
     * @param originUrl the value to be set
     */
    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }

    /**
     * Creates and returns a copy of this {@code PluginContext} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PluginContext clone() {
        try {
            return (PluginContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
