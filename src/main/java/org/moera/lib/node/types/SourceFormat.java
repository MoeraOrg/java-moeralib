package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceFormat {

    /**
     * Plain text with newlines and paragraphs delimited by empty line.
     */
    PLAIN_TEXT, // 0
    /**
     * HTML-formatted text, the node may allow only limited set of tags.
     */
    HTML, // 1
    /**
     * Text in Markdown format.
     */
    MARKDOWN, // 2
    /**
     * Application-specific format.
     */
    APPLICATION, // 3
    /**
     * HTML-formatted text, WYSIWYG editor.
     */
    HTML__VISUAL; // 4

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
