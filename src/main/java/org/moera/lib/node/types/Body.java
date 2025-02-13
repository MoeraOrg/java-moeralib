package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Body implements Cloneable {

    private String subject;
    private String text;
    private List<LinkPreview> linkPreviews;

    @JsonIgnore
    private Object extra;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<LinkPreview> getLinkPreviews() {
        return linkPreviews;
    }

    public void setLinkPreviews(List<LinkPreview> linkPreviews) {
        this.linkPreviews = linkPreviews;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public Body clone() {
        try {
            return (Body) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
