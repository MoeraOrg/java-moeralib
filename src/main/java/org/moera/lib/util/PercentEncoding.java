package org.moera.lib.util;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * Percent-encodes and decodes UTF-8 strings according to RFC 3986.
 */
public final class PercentEncoding {

    private static final char[] HEX = "0123456789ABCDEF".toCharArray();

    private PercentEncoding() {
    }

    /**
     * Percent-encodes a UTF-8 string, leaving RFC 3986 unreserved characters unchanged.
     *
     * @param value the string to encode
     * @return the encoded string
     */
    public static String encode(String value) {
        Objects.requireNonNull(value, "value");

        StringBuilder result = new StringBuilder();
        for (byte b : value.getBytes(StandardCharsets.UTF_8)) {
            int c = b & 0xff;
            if (isUnreserved(c)) {
                result.append((char) c);
            } else {
                result.append('%').append(HEX[c >> 4]).append(HEX[c & 0xf]);
            }
        }
        return result.toString();
    }

    /**
     * Decodes valid percent-encoded UTF-8 bytes. Malformed percent escapes are preserved literally, and malformed
     * UTF-8 byte sequences are replaced with the Unicode replacement character.
     *
     * @param value the string to decode
     * @return the decoded string
     */
    public static String decode(String value) {
        Objects.requireNonNull(value, "value");

        StringBuilder result = new StringBuilder();
        int position = 0;
        while (position < value.length()) {
            if (isEscape(value, position)) {
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                while (isEscape(value, position)) {
                    bytes.write(hexValue(value.charAt(position + 1)) * 16 + hexValue(value.charAt(position + 2)));
                    position += 3;
                }
                result.append(bytes.toString(StandardCharsets.UTF_8));
            } else {
                result.append(value.charAt(position++));
            }
        }
        return result.toString();
    }

    private static boolean isEscape(String value, int position) {
        return position + 2 < value.length()
            && value.charAt(position) == '%'
            && hexValue(value.charAt(position + 1)) >= 0
            && hexValue(value.charAt(position + 2)) >= 0;
    }

    private static int hexValue(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        }
        return -1;
    }

    private static boolean isUnreserved(int c) {
        return c >= 'A' && c <= 'Z'
            || c >= 'a' && c <= 'z'
            || c >= '0' && c <= '9'
            || c == '-' || c == '.' || c == '_' || c == '~';
    }

}
