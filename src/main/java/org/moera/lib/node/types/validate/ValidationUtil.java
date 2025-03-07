package org.moera.lib.node.types.validate;

import java.util.regex.Pattern;

import org.moera.lib.node.types.EmojiList;
import org.moera.lib.node.types.body.Body;

public class ValidationUtil {

    private static final Pattern DOMAIN_NAME_PATTERN =
        Pattern.compile("^[a-z][a-z0-9-]*[a-z0-9](\\.[a-z][a-z0-9-]*[a-z0-9])*$", Pattern.CASE_INSENSITIVE);
    private static final Pattern EMAIL_PATTERN =
        Pattern.compile("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,}$", Pattern.CASE_INSENSITIVE);

    public static void assertion(boolean condition, String errorCode) {
        if (!condition) {
            throw new ValidationFailure(errorCode);
        }
    }

    public static void notNull(Object value, String errorCode) {
        assertion(value != null, errorCode);
    }

    public static void notBlank(String value, String errorCode) {
        assertion(value != null && !value.isEmpty(), errorCode);
    }

    public static void maxSize(String value, int maxSize, String errorCode) {
        assertion(value == null || value.length() <= maxSize, errorCode);
    }

    public static void maxSize(Body value, int maxSize, String errorCode) {
        maxSize(value != null ? value.getEncoded() : null, maxSize, errorCode);
    }

    public static void minValue(Integer value, int min, String errorCode) {
        assertion(value == null || value >= min, errorCode);
    }

    public static void minValue(Long value, long min, String errorCode) {
        assertion(value == null || value >= min, errorCode);
    }

    public static void maxValue(Integer value, int max, String errorCode) {
        assertion(value == null || value <= max, errorCode);
    }

    public static void maxValue(Long value, long max, String errorCode) {
        assertion(value == null || value <= max, errorCode);
    }

    public static void domainName(String value, String errorCode) {
        assertion(value == null || value.isEmpty() || DOMAIN_NAME_PATTERN.matcher(value).matches(), errorCode);
    }

    public static void email(String value, String errorCode) {
        assertion(value == null || value.isEmpty() || EMAIL_PATTERN.matcher(value).matches(), errorCode);
    }

    public static void emojiList(String value, String errorCode) {
        assertion(value == null || value.isEmpty() || EmojiList.isValid(value), errorCode);
    }

}
