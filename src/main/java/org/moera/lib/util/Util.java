package org.moera.lib.util;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * A utility class that provides a collection of various helper methods.
 */
public class Util {

    /**
     * Returns the current timestamp based on the system's current time.
     *
     * @return a {@code Timestamp} object representing the current time
     */
    public static Timestamp now() {
        return Timestamp.from(Instant.now());
    }

    /**
     * Converts a {@link Timestamp} object to epoch seconds.
     *
     * @param timestamp the {@link Timestamp} to be converted; may be {@code null}
     * @return the number of seconds since the epoch, or {@code null} if the input is {@code null}
     */
    public static Long toEpochSecond(Timestamp timestamp) {
        return timestamp != null ? timestamp.getTime() / 1000 : null;
    }

    /**
     * Converts a given epoch second value into a {@link Timestamp}.
     * If the input is {@code null}, this method returns {@code null}.
     *
     * @param epochSecond the epoch second value to be converted; may be {@code null}
     * @return a {@link Timestamp} object representing the given epoch second, or {@code null}
     *         if the input is {@code null}
     */
    public static Timestamp toTimestamp(Long epochSecond) {
        return epochSecond != null ? Timestamp.from(Instant.ofEpochSecond(epochSecond)) : null;
    }

    /**
     * Formats a given timestamp (in epoch seconds) into a string representation
     * using the ISO-8601 date and time format.
     *
     * @param timestamp the timestamp in epoch seconds to format
     * @return a string representation of the given timestamp in ISO-8601 format
     */
    public static String formatTimestamp(long timestamp) {
        return DateTimeFormatter.ISO_DATE_TIME.format(
            LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp), ZoneOffset.UTC)
        );
    }

    /**
     * Encodes the given byte array into a Base64-encoded string.
     *
     * @param bytes the byte array to be encoded; must not be {@code null}
     * @return a Base64-encoded string representation of the input byte array
     */
    public static String base64encode(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    /**
     * Decodes a Base64-encoded string into its corresponding byte array.
     *
     * @param s the Base64-encoded string to be decoded; must not be {@code null}
     * @return the decoded byte array corresponding to the input string
     */
    public static byte[] base64decode(String s) {
        return Base64.getDecoder().decode(s);
    }

    /**
     * Encodes the given byte array into a Base64 URL-safe encoded string without padding.
     * If the input byte array is {@code null}, this method returns {@code null}.
     *
     * @param bytes the byte array to be encoded; may be {@code null}
     * @return a Base64 URL-safe encoded string representation of the input byte array,
     *         or {@code null} if the input is {@code null}
     */
    public static String base64urlencode(byte[] bytes) {
        return bytes != null ? Base64.getUrlEncoder().withoutPadding().encodeToString(bytes) : null;
    }

    /**
     * Converts a byte array into a space-separated string of hexadecimal values.
     * Each byte is formatted as a two-character hexadecimal string.
     *
     * @param bytes the byte array to be converted; must not be {@code null}
     * @return a string representation of the input byte array
     */
    public static String dump(byte[] bytes) {
        StringBuilder buf = new StringBuilder();
        for (byte b : bytes) {
            if (!buf.isEmpty()) {
                buf.append(' ');
            }
            buf.append(hexByte(b));
        }
        return buf.toString();
    }

    /**
     * Converts a byte array into a condensed string representation.
     * If the byte array length is 16 or less, the entire array is represented in hexadecimal format.
     * Otherwise, the first and last 8 bytes are represented in hexadecimal format, separated by {@code "..."}.
     *
     * @param bytes the byte array to be converted; must not be {@code null}
     * @return a condensed string representation of the input byte array
     */
    public static String dumpShort(byte[] bytes) {
        if (bytes.length <= 16) {
            return dump(bytes);
        }

        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (!buf.isEmpty()) {
                buf.append(' ');
            }
            buf.append(hexByte(bytes[i]));
        }
        buf.append(" ...");
        for (int i = bytes.length - 8; i < bytes.length; i++) {
            buf.append(' ');
            buf.append(hexByte(bytes[i]));
        }
        return buf.toString();
    }

    /**
     * Converts a single byte into a two-character uppercase hexadecimal string.
     * If the byte is negative, it is treated as an unsigned value.
     *
     * @param b the byte to be converted
     * @return a two-character hexadecimal string representation of the given byte
     */
    public static String hexByte(byte b) {
        return "%02X".formatted(b >= 0 ? b : 256 + (int) b);
    }

    /**
     * Checks whether a given string is either {@code null} or empty.
     *
     * @param s the string to be checked; may be {@code null}
     * @return {@code true} if the string is {@code null} or empty, {@code false} otherwise
     */
    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

}
