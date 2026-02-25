package org.moera.lib.node.types.body;

import java.util.Collections;
import java.util.List;

import org.moera.lib.util.Util;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.annotation.JsonDeserialize;
import tools.jackson.databind.annotation.JsonSerialize;
import tools.jackson.databind.util.StdConverter;

/**
 * Represents the body of a posting or comment in its decoded and encoded forms.
 */
@JsonSerialize(converter = Body.ToStringConverter.class)
@JsonDeserialize(converter = Body.FromStringConverter.class)
public class Body implements Cloneable {

    /**
     * A constant representing an empty JSON object as a string.
     */
    public static final String EMPTY = "{}";

    private String encoded;
    private BodyDecoded decoded = new BodyDecoded();

    /**
     * Default constructor for the {@code Body} class.
     */
    public Body() {
    }

    /**
     * Constructs a new {@code Body} instance with the provided encoded string.
     * The encoded string is used to initialize the {@code Body} object, and the
     * decoding process is triggered to populate its internal state.
     *
     * @param encoded the encoded string representing the body content
     */
    public Body(String encoded) {
        setEncoded(encoded);
    }

    private void decode() {
        if (encoded == null) {
            return;
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
            decoded = mapper.readValue(encoded, BodyDecoded.class);
        } catch (JacksonException e) {
            throw new BodyMappingException(e);
        }
        getLinkPreviews().forEach(lp -> lp.setParent(this));
    }

    private void encode() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            encoded = mapper.writeValueAsString(decoded);
        } catch (JacksonException e) {
            throw new BodyMappingException(e);
        }
    }

    /**
     * Returns the encoded representation of the {@code Body} instance.
     * If the encoded value is not already computed, it triggers the encoding process
     * to generate it.
     *
     * @return the encoded string representation of the body
     */
    public String getEncoded() {
        if (encoded == null) {
            encode();
        }
        return encoded;
    }

    /**
     * Updates the encoded string representation of the body content and triggers
     * the decoding process to update the internal state of the object.
     *
     * @param encoded the new encoded string representing the body content
     */
    public void setEncoded(String encoded) {
        this.encoded = encoded;
        decode();
    }

    /**
     * Retrieves the subject of the body content.
     *
     * @return the subject as a string, or {@code null} if the subject is not set
     */
    public String getSubject() {
        return decoded.getSubject();
    }

    /**
     * Sets the subject of the body content.
     *
     * @param subject the new subject to set for the body content
     */
    public void setSubject(String subject) {
        decoded.setSubject(subject);
        modified();
    }

    /**
     * Retrieves the textual content of the body.
     *
     * @return the text content as a string, or {@code null} if the text is not set
     */
    public String getText() {
        return decoded.getText();
    }

    /**
     * Sets the textual content of the body.
     *
     * @param text the new text content to set
     */
    public void setText(String text) {
        decoded.setText(text);
        modified();
    }

    /**
     * Retrieves a list of link previews associated with the body content.
     * The returned list is immutable and will be empty if no link previews are available.
     *
     * @return an unmodifiable list of {@link LinkPreview} instances, or an empty list if no link previews exist
     */
    public List<LinkPreview> getLinkPreviews() {
        return decoded.getLinkPreviews() != null
                ? Collections.unmodifiableList(decoded.getLinkPreviews())
                : Collections.emptyList();
    }

    /**
     * Sets the list of link previews associated with the body content.
     * Each link preview in the provided list is updated to reference the current {@code Body} instance as its parent.
     *
     * @param linkPreviews the list of {@link LinkPreview} instances to associate with the body content
     */
    public void setLinkPreviews(List<LinkPreview> linkPreviews) {
        linkPreviews.forEach(lp -> lp.setParent(this));
        decoded.setLinkPreviews(linkPreviews);
        modified();
    }

    void modified() {
        encoded = null;
    }

    /**
     * Aggregates and returns the combined textual content of the body and its associated
     * link previews. This includes the text content of the body, as well as the titles
     * and descriptions of all associated link previews, concatenated with a space separator.
     * If the body text or link preview fields are empty or null, they are omitted.
     *
     * @return the textual content, or an empty string if no content is available
     */
    public String getAllText() {
        StringBuilder buf = new StringBuilder();
        if (!Util.isEmpty(getText())) {
            buf.append(getText());
        }
        for (LinkPreview linkPreview : getLinkPreviews()) {
            if (!Util.isEmpty(linkPreview.getTitle())) {
                if (!buf.isEmpty()) {
                    buf.append(' ');
                }
                buf.append(linkPreview.getTitle());
            }
            if (!Util.isEmpty(linkPreview.getDescription())) {
                if (!buf.isEmpty()) {
                    buf.append(' ');
                }
                buf.append(linkPreview.getDescription());
            }
        }
        return buf.toString();
    }

    /**
     * Creates and returns a deep copy of the current {@code Body} instance.
     * The cloned instance will have the same encoded representation as the original.
     *
     * @return a new {@code Body} instance
     */
    @Override
    public Body clone() {
        return new Body(getEncoded());
    }

    /**
     * Converts a {@code Body} object to its encoded string representation.
     * This class extends {@code StdConverter} to provide a Jackson-compatible
     * mechanism for serialization of {@code Body} instances.
     *
     * @see Body
     * @see StdConverter
     */
    public static class ToStringConverter extends StdConverter<Body, String> {

        /**
         * Converts the given {@code Body} object to its encoded string representation.
         *
         * @param body the {@code Body} object to be converted
         * @return the encoded string representation of the {@code Body} object
         */
        @Override
        public String convert(Body body) {
            return body.getEncoded();
        }

    }

    /**
     * Converts a {@code String} into a {@code Body} instance.
     * This class extends {@code StdConverter} to provide a Jackson-compatible
     * mechanism for deserialization of {@code Body} instances from their encoded
     * string representation.
     *
     * @see Body
     * @see StdConverter
     */
    public static class FromStringConverter extends StdConverter<String, Body> {

        /**
         * Converts a string into a {@code Body} instance.
         *
         * @param s the encoded string representation
         * @return a {@code Body} instance
         */
        @Override
        public Body convert(String s) {
            return new Body(s);
        }

    }

}
