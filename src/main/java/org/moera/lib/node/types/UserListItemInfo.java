package org.moera.lib.node.types;

// This file is generated

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserListItemInfo {

    private String nodeName;
    private Timestamp createdAt;
    private int moment;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public int getMoment() {
        return moment;
    }

    public void setMoment(int moment) {
        this.moment = moment;
    }

}
