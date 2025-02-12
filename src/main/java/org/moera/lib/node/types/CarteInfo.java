package org.moera.lib.node.types;

// This file is generated

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarteInfo {

    private String carte;
    private Timestamp beginning;
    private Timestamp deadline;
    private String nodeName;
    private List<String> clientScope;
    private List<String> adminScope;

    public String getCarte() {
        return carte;
    }

    public void setCarte(String carte) {
        this.carte = carte;
    }

    public Timestamp getBeginning() {
        return beginning;
    }

    public void setBeginning(Timestamp beginning) {
        this.beginning = beginning;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
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

}
