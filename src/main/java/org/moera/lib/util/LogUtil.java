package org.moera.lib.util;

import java.sql.Timestamp;
import java.util.UUID;

import org.moera.lib.node.types.body.Body;

/**
 * Utility class for formatting various data types into string representations.
 * This class is designed to provide consistent formatting for logging purposes,
 * ensuring proper representation and escaping of values.
 */
public class LogUtil {

    /**
     * Formats a given string value for logging purposes by escaping certain characters
     * and surrounding the value in single quotes. If the value is {@code null}, the string {@code "null"} is returned.
     *
     * @param value the string value to be formatted; may be {@code null}
     * @return the formatted string, or {@code "null"} if the input is {@code null}
     */
    public static String format(String value) {
        return value != null ? "'%s'".formatted(escape(value)) : "null";
    }

    /**
     * Formats an {@code Integer} value into its string representation.
     * If the value is {@code null}, the string {@code "null"} is returned.
     *
     * @param value the {@code Integer} value to be formatted; may be {@code null}
     * @return the string representation of the integer, or {@code "null"} if the input is {@code null}
     */
    public static String format(Integer value) {
        return value != null ? Integer.toString(value) : "null";
    }

    /**
     * Formats a {@code Long} value into its string representation.
     * If the value is {@code null}, the string {@code "null"} is returned.
     *
     * @param value the {@code Long} value to be formatted; may be {@code null}
     * @return the string representation of the long value, or {@code "null"} if the input is {@code null}
     */
    public static String format(Long value) {
        return value != null ? Long.toString(value) : "null";
    }

    /**
     * Formats a {@code Boolean} value into its string representation.
     * If the value is {@code null}, the string {@code "null"} is returned.
     *
     * @param value the {@code Boolean} value to be formatted; may be {@code null}
     * @return the string representation of the boolean value, or {@code "null"} if the input is {@code null}
     */
    public static String format(Boolean value) {
        return value != null ? Boolean.toString(value) : "null";
    }

    private static String escape(String value) {
        return value
            .replace("\n", "\\n")
            .replace("\r", "\\r");
    }

    /**
     * Formats a given string value for logging purposes by truncating it to a maximum length,
     * escaping certain characters, and appending ellipsis if the truncation occurs.
     * If the value is {@code null}, the string {@code "null"} is returned.
     *
     * @param value the string value to be formatted; may be {@code null}
     * @param maxLength the maximum allowed length for the formatted string
     * @return the formatted string
     */
    public static String format(String value, int maxLength) {
        if (value == null || value.length() <= maxLength) {
            return format(value);
        } else {
            return format(value.substring(0, maxLength) + "...");
        }
    }

    /**
     * Formats a {@code Body} object for logging purposes by encoding its content
     * and truncating it to a specified maximum length.
     * If the {@code Body} is {@code null}, the string {@code "null"} is returned.
     *
     * @param value the {@code Body} object to be formatted; may be {@code null}
     * @param maxLength the maximum allowed length for the formatted string
     * @return the formatted string, or {@code "null"} if the input is {@code null}
     */
    public static String format(Body value, int maxLength) {
        return value != null ? format(value.getEncoded(), maxLength) : "null";
    }

    /**
     * Formats a {@link UUID} value into its string representation enclosed in single quotes.
     * If the value is {@code null}, the string {@code "null"} is returned.
     *
     * @param value the {@code UUID} value to be formatted; may be {@code null}
     * @return the formatted string, or {@code "null"} if the input is {@code null}
     */
    public static String format(UUID value) {
        return value != null ? "'%s'".formatted(value) : "null";
    }

    /**
     * Formats a byte array into a human-readable string representation.
     * If the byte array is {@code null}, the string {@code "null"} is returned.
     * The formatting is handled by the {@link Util#dumpShort} method.
     *
     * @param value the byte array to format; may be {@code null}
     * @return the formatted string representation of the byte array, or {@code "null"} if the input is {@code null}
     */
    public static String format(byte[] value) {
        return value != null ? Util.dumpShort(value) : "null";
    }

    /**
     * Formats a {@link Timestamp} value into its ISO 8601 string representation.
     * If the value is {@code null}, the string {@code "null"} is returned.
     *
     * @param value the {@code Timestamp} value to be formatted; may be {@code null}
     * @return the formatted string representation of the timestamp, or {@code "null"} if the input is {@code null}
     */
    public static String format(Timestamp value) {
        return formatTimestamp(Util.toEpochSecond(value));
    }

    /**
     * Formats a {@code Long} value representing a timestamp into its ISO 8601 string representation.
     * If the value is {@code null}, the string {@code "null"} is returned.
     *
     * @param value the {@code Long} value representing the timestamp to be formatted; may be {@code null}
     * @return the formatted string representation of the timestamp, or {@code "null"} if the input is {@code null}
     */
    public static String formatTimestamp(Long value) {
        return value != null ? Util.formatTimestamp(value) : "null";
    }

}
