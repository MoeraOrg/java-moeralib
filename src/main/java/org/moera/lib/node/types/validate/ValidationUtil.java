package org.moera.lib.node.types.validate;

import java.util.Collection;
import java.util.regex.Pattern;

import org.moera.lib.node.types.EmojiList;
import org.moera.lib.node.types.body.Body;

/**
 * Utility class for common validation checks.
 */
public class ValidationUtil {

    private static final Pattern DOMAIN_NAME_PATTERN =
        Pattern.compile("^[a-z][a-z0-9-]*[a-z0-9](\\.[a-z][a-z0-9-]*[a-z0-9])*$", Pattern.CASE_INSENSITIVE);
    private static final Pattern EMAIL_PATTERN =
        Pattern.compile("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,}$", Pattern.CASE_INSENSITIVE);

    /**
     * Asserts that the given condition is {@code true}. If the condition is {@code false}, a {@code ValidationFailure}
     * is thrown with the specified error code.
     *
     * @param condition the boolean condition to be validated
     * @param errorCode the error code to be used in the exception if the condition is {@code false}
     * @throws ValidationFailure if the condition is {@code false}
     */
    public static void assertion(boolean condition, String errorCode) {
        if (!condition) {
            throw new ValidationFailure(errorCode);
        }
    }

    /**
     * Ensures that the provided value is not {@code null}. If the value is {@code null},
     * a {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the object to be validated for nullity
     * @param errorCode the error code to be used in the exception if the value is {@code null}
     * @throws ValidationFailure if the value is {@code null}
     */
    public static void notNull(Object value, String errorCode) {
        assertion(value != null, errorCode);
    }

    /**
     * Validates that the provided string is neither {@code null} nor empty.
     * If the string is {@code null} or empty, a {@code ValidationFailure} is thrown
     * with the specified error code.
     *
     * @param value the string to validate for non-blank content
     * @param errorCode the error code to be used in the exception if the string is {@code null} or empty
     * @throws ValidationFailure if the string is {@code null} or empty
     */
    public static void notBlank(String value, String errorCode) {
        assertion(value != null && !value.isEmpty(), errorCode);
    }

    /**
     * Validates that the provided string does not exceed the specified maximum size.
     * If the string is not {@code null} and its length exceeds the maximum size, a
     * {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the string to validate
     * @param maxSize the maximum allowed size for the string
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the string length exceeds the specified maximum size
     */
    public static void maxSize(String value, int maxSize, String errorCode) {
        assertion(value == null || value.length() <= maxSize, errorCode);
    }

    /**
     * Validates that the encoded representation of the provided {@code Body} object does not exceed
     * the specified maximum size. If the {@code Body} object is not {@code null}, its encoded
     * string representation is validated. If the length of the encoded string exceeds the maximum
     * allowed size, a {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the {@code Body} object whose encoded representation is to be validated
     * @param maxSize the maximum allowed size for the encoded string representation
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the encoded string representation of {@code value}
     *                           exceeds the specified maximum size
     */
    public static void maxSize(Body value, int maxSize, String errorCode) {
        maxSize(value != null ? value.getEncoded() : null, maxSize, errorCode);
    }

    /**
     * Validates that the provided integer value is either {@code null} or greater than or equal to the specified
     * minimum value. If the validation fails, a {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the integer value to validate
     * @param min the minimum allowed value for the integer
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the integer value is not {@code null} and less than the specified minimum
     */
    public static void minValue(Integer value, int min, String errorCode) {
        assertion(value == null || value >= min, errorCode);
    }

    /**
     * Validates that the provided long value is either {@code null} or greater than or equal to the specified
     * minimum value. If the validation fails, a {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the long value to validate
     * @param min the minimum allowed value for the long
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the long value is not {@code null} and less than the specified minimum
     */
    public static void minValue(Long value, long min, String errorCode) {
        assertion(value == null || value >= min, errorCode);
    }

    /**
     * Validates that the provided float value is either {@code null} or greater than or equal to the specified
     * minimum value. If the validation fails, a {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the float value to validate
     * @param min the minimum allowed value for the float
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the float value is not {@code null} and less than the specified minimum
     */
    public static void minValue(Float value, float min, String errorCode) {
        assertion(value == null || value >= min, errorCode);
    }

    /**
     * Validates that the provided integer value is either {@code null} or less than or equal to the specified
     * maximum value. If the validation fails, a {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the integer value to validate
     * @param max the maximum allowed value for the integer
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the integer value is not {@code null} and exceeds the specified maximum
     */
    public static void maxValue(Integer value, int max, String errorCode) {
        assertion(value == null || value <= max, errorCode);
    }

    /**
     * Validates that the provided long value is either {@code null} or less than or equal to the specified
     * maximum value. If the validation fails, a {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the long value to validate
     * @param max the maximum allowed value for the long
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the long value is not {@code null} and exceeds the specified maximum
     */
    public static void maxValue(Long value, long max, String errorCode) {
        assertion(value == null || value <= max, errorCode);
    }

    /**
     * Validates that the provided float value is either {@code null} or less than or equal to the specified
     * maximum value. If the validation fails, a {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the float value to validate
     * @param max the maximum allowed value for the float
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the float value is not {@code null} and exceeds the specified maximum
     */
    public static void maxValue(Float value, float max, String errorCode) {
        assertion(value == null || value <= max, errorCode);
    }

    /**
     * Validates that the given array is either {@code null} or contains at least the specified
     * minimum number of items. If the validation fails, a {@code ValidationFailure} is thrown
     * with the specified error code.
     *
     * @param array the array to validate
     * @param minItems the minimum number of items required in the array
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the array is not {@code null} and contains fewer than
     *                           the specified minimum number of items
     */
    public static void minItems(Object[] array, int minItems, String errorCode) {
        assertion(array == null || array.length >= minItems, errorCode);
    }

    /**
     * Validates that a given collection has at least a specified minimum number of items.
     *
     * @param collection the collection to be checked; can be {@code null}
     * @param minItems the minimum number of items the collection should contain
     * @param errorCode the error code to be used if the collection does not meet the minimum size requirement
     */
    public static void minItems(Collection<?> collection, int minItems, String errorCode) {
        assertion(collection == null || collection.size() >= minItems, errorCode);
    }

    /**
     * Validates that the given array is either {@code null} or contains at most the specified
     * maximum number of items. If the validation fails, a {@code ValidationFailure} is thrown
     * with the specified error code.
     *
     * @param array the array to validate
     * @param maxItems the maximum number of items allowed in the array
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the array is not {@code null} and contains more than
     *                           the specified maximum number of items
     */
    public static void maxItems(Object[] array, int maxItems, String errorCode) {
        assertion(array == null || array.length <= maxItems, errorCode);
    }

    /**
     * Validates that a given collection has at most a specified minimum number of items.
     *
     * @param collection the collection to be checked; can be {@code null}
     * @param maxItems the maximum number of items the collection should contain
     * @param errorCode the error code to be used if the collection does not meet the maximum size requirement
     */
    public static void maxItems(Collection<?> collection, int maxItems, String errorCode) {
        assertion(collection == null || collection.size() <= maxItems, errorCode);
    }

    /**
     * Validates that the given string follows the domain name format. If the string is neither {@code null}
     * nor empty, it is checked against the defined domain name pattern. If validation fails, a
     * {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the string to validate as a domain name
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the string is not {@code null}, not empty, and does not match
     *         the domain name pattern
     */
    public static void domainName(String value, String errorCode) {
        assertion(value == null || value.isEmpty() || DOMAIN_NAME_PATTERN.matcher(value).matches(), errorCode);
    }

    /**
     * Validates that the provided string is either {@code null}, empty, or matches the email pattern.
     * If the string does not meet these criteria, a {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the string to validate as an email address
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the string is not {@code null}, not empty, and does not match the email pattern
     */
    public static void email(String value, String errorCode) {
        assertion(value == null || value.isEmpty() || EMAIL_PATTERN.matcher(value).matches(), errorCode);
    }

    /**
     * Validates that the provided string is either {@code null}, empty, or is a valid emoji list.
     * If the string does not meet these criteria, a {@code ValidationFailure} is thrown with the specified error code.
     *
     * @param value the string to validate as a list of emojis
     * @param errorCode the error code to be used in the exception if the validation fails
     * @throws ValidationFailure if the string is not {@code null}, not empty, and not a valid emoji list.
     */
    public static void emojiList(String value, String errorCode) {
        assertion(value == null || value.isEmpty() || EmojiList.isValid(value), errorCode);
    }

}
