package org.moera.lib.node.types.validate;

import java.util.regex.Pattern;

public class ValidationUtil {

    private static final Pattern DOMAIN_NAME_PATTERN =
        Pattern.compile("^[a-z][a-z0-9-]*[a-z0-9](\\.[a-z][a-z0-9-]*[a-z0-9])*$", Pattern.CASE_INSENSITIVE);

    public static void assertion(boolean condition, String errorCode) {
        if (!condition) {
            throw new ValidationException(errorCode);
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

}
