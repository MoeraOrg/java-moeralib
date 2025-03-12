package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarteInfo extends Structure implements Cloneable {

    private String carte;
    private long beginning;
    private long deadline;
    private String nodeName;
    private List<String> clientScope;
    private List<String> adminScope;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getCarte() {
        return carte;
    }

    /**
     * Sets .
     *
     * @param carte the value to be set
     */
    public void setCarte(String carte) {
        this.carte = carte;
    }

    /**
     * Retrieves timestamp of the beginning of the carte's life.
     *
     * @return the value
     */
    public long getBeginning() {
        return beginning;
    }

    /**
     * Sets timestamp of the beginning of the carte's life.
     *
     * @param beginning the value to be set
     */
    public void setBeginning(long beginning) {
        this.beginning = beginning;
    }

    /**
     * Retrieves timestamp of the end of the carte's life.
     *
     * @return the value
     */
    public long getDeadline() {
        return deadline;
    }

    /**
     * Sets timestamp of the end of the carte's life.
     *
     * @param deadline the value to be set
     */
    public void setDeadline(long deadline) {
        this.deadline = deadline;
    }

    /**
     * Retrieves if set, the carte is valid for authentication on the specified node only.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets if set, the carte is valid for authentication on the specified node only.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves the list of permissions granted to the carte.
     *
     * @return the value
     */
    public List<String> getClientScope() {
        return clientScope;
    }

    /**
     * Sets the list of permissions granted to the carte.
     *
     * @param clientScope the value to be set
     */
    public void setClientScope(List<String> clientScope) {
        this.clientScope = clientScope;
    }

    /**
     * Retrieves the list of additional administrative permissions (of those granted to the carte's owner by the target
     * node) granted to the carte
     * .
     *
     * @return the value
     */
    public List<String> getAdminScope() {
        return adminScope;
    }

    /**
     * Sets the list of additional administrative permissions (of those granted to the carte's owner by the target
     * node) granted to the carte
     * .
     *
     * @param adminScope the value to be set
     */
    public void setAdminScope(List<String> adminScope) {
        this.adminScope = adminScope;
    }

    /**
     * Creates and returns a copy of this {@code CarteInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CarteInfo clone() {
        try {
            return (CarteInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
