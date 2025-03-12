package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarteAttributes extends Structure implements Cloneable {

    private List<String> clientScope;
    private List<String> adminScope;
    private String nodeName;
    private Integer limit;

    /**
     * Retrieves permissions to be granted to the carte; if not set, all permissions of the carte's owner are granted
     * .
     *
     * @return the value
     */
    public List<String> getClientScope() {
        return clientScope;
    }

    /**
     * Sets permissions to be granted to the carte; if not set, all permissions of the carte's owner are granted
     * .
     *
     * @param clientScope the value to be set
     */
    public void setClientScope(List<String> clientScope) {
        this.clientScope = clientScope;
    }

    /**
     * Retrieves additional administrative permissions (of those granted to the carte's owner by the target node) to be
     * granted to the carte
     * .
     *
     * @return the value
     */
    public List<String> getAdminScope() {
        return adminScope;
    }

    /**
     * Sets additional administrative permissions (of those granted to the carte's owner by the target node) to be
     * granted to the carte
     * .
     *
     * @param adminScope the value to be set
     */
    public void setAdminScope(List<String> adminScope) {
        this.adminScope = adminScope;
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
     * Retrieves maximum number of sequential cartes to be returned; the node may decide to return fewer cartes than
     * the given limit.
     *
     * @return the value
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets maximum number of sequential cartes to be returned; the node may decide to return fewer cartes than the
     * given limit.
     *
     * @param limit the value to be set
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Creates and returns a copy of this {@code CarteAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CarteAttributes clone() {
        try {
            return (CarteAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
