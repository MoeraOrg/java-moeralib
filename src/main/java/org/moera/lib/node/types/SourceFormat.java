package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceFormat {

    /**
     * Plain text with newlines and paragraphs delimited by empty line.
     */
    PLAIN_TEXT,
    /**
     * HTML-formatted text, the node may allow only limited set of tags.
     */
    HTML,
    /**
     * Text in Markdown format.
     */
    MARKDOWN,
    /**
     * HTML-formatted text, WYSIWYG editor.
     */
    HTML__VISUAL,
    /**
     * Application-specific format.
     */
    APPLICATION;

    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace("__", "/").replace('_', '-');
    }

    public static String toValue(SourceFormat type) {
        return type != null ? type.getValue() : null;
    }

    public static SourceFormat forValue(String value) {
        try {
            return parse(value);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return getValue();
    }

    @JsonCreator
    public static SourceFormat parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_').replace("/", "__"));
    }

}
