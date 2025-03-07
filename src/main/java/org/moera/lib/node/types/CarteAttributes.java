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

    public List<String> getClientScope() {
        return clientScope;
    }

    public void setClientScope(List<String> clientScope) {
        this.clientScope = clientScope;
    }

    public List<String> getAdminScope() {
        return adminScope;
    }

    public void setAdminScope(List<String> adminScope) {
        this.adminScope = adminScope;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public CarteAttributes clone() {
        try {
            return (CarteAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
