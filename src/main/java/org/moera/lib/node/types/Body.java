package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Body implements Cloneable {

    private String subject;
    private String text;
    private List<LinkPreview> linkPreviews;

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

    @Override
    public Body clone() {
        try {
            return (Body) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
