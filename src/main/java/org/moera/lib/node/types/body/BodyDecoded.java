package org.moera.lib.node.types.body;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents the decoded body content.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class BodyDecoded {

    private String subject;
    private String text;
    private List<LinkPreview> linkPreviews;

    /**
     * Retrieves the subject of the content.
     *
     * @return the subject as a string, or {@code null} if no subject is set
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject for the content.
     *
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Retrieves the textual content.
     *
     * @return the text content as a string, or {@code null} if the text is not set
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the textual content of the body.
     *
     * @param text the new text content to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Retrieves the list of link previews associated with the body content.
     *
     * @return a list of {@link LinkPreview} objects
     */
    public List<LinkPreview> getLinkPreviews() {
        return linkPreviews;
    }

    /**
     * Sets the list of link previews associated with the body content.
     *
     * @param linkPreviews the list of {@link LinkPreview} objects to be set
     */
    public void setLinkPreviews(List<LinkPreview> linkPreviews) {
        this.linkPreviews = linkPreviews;
    }

}
