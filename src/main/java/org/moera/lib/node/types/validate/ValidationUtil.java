package org.moera.lib.node.types.validate;

public class ValidationUtil {

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

}
