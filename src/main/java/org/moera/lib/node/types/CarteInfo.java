package org.moera.lib.node.types;

// This file is generated

import java.util.List;
import java.util.function.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarteInfo implements Cloneable {

    private String carte;
    private long beginning;
    private long deadline;
    private String nodeName;
    private List<String> clientScope;
    private List<String> adminScope;

    @JsonIgnore
    private Object extra;

    public String getCarte() {
        return carte;
    }

    public void setCarte(String carte) {
        this.carte = carte;
    }

    public long getBeginning() {
        return beginning;
    }

    public void setBeginning(long beginning) {
        this.beginning = beginning;
    }

    public long getDeadline() {
        return deadline;
    }

    public void setDeadline(long deadline) {
        this.deadline = deadline;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

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

    public Object getExtra() {
        return extra;
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrCreateExtra(Supplier<T> creator) {
        if (extra == null) {
            extra = creator.get();
        }
        return (T) extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public CarteInfo clone() {
        try {
            return (CarteInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
