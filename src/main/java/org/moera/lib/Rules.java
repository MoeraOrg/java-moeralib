package org.moera.lib;

import java.time.Duration;
import java.util.regex.Pattern;

/**
 * The Rules class provides constants and utility methods for validating specific constraints used within the library.
 * It defines limits, algorithms, and validation logic for various properties and ensures compliance with
 * predetermined rules.
 */
public class Rules {

    /**
     * Specifies the maximum length allowed for a node name.
     */
    public static final int NAME_MAX_LENGTH = 127;

    /**
     * A constant defining the set of punctuation characters that are allowed
     * in node names during validation.
     */
    public static final String NAME_PUNCTUATION_ALLOWED ="!*-.";

    /**
     * Represents the elliptic curve used for cryptographic operations.
     */
    public static final String EC_CURVE = "secp256k1";

    /**
     * Defines the length of a private key in bytes.
     */
    public static final int PRIVATE_KEY_LENGTH = 32;

    /**
     * Defines the length of a public key in bytes.
     */
    public static final int PUBLIC_KEY_LENGTH = 64;

    /**
     * Defines the maximum allowable length for a node URI.
     */
    public static final int NODE_URI_MAX_LENGTH = 255;

    /**
     * Defines the maximum age of a cryptographic signature that can be revoked by
     * changing the signing key with its retroactive activation.
     */
    public static final Duration VALID_FROM_IN_PAST = Duration.ofDays(7);

    /**
     * Specifies the cryptographic hash algorithm used for generating digests.
     */
    public static final String DIGEST_ALGORITHM = "SHA3-256";

    /**
     * Defines the standard length, in bytes, of a cryptographic digest
     * produced by the specified digest algorithm.
     */
    public static final int DIGEST_LENGTH = 32;

    /**
     * Specifies the signature algorithm used for cryptographic operations.
     */
    public static final String SIGNATURE_ALGORITHM = "SHA3-256withECDSA";

    /**
     * Defines the maximum length in bytes for digital signatures.
     */
    public static final int SIGNATURE_MAX_LENGTH = 72; // FIXME must be exact value

    /**
     * Defines the maximum number of items allowed in a single page for pagination or listing operations.
     * This constant helps enforce limits when retrieving or displaying data in chunks, ensuring consistent
     * and efficient handling of large datasets.
     */
    public static final int PAGE_MAX_SIZE = 100;

    private static final Pattern LATIN_CHARS = Pattern.compile("^[A-Za-z]+$");

    /**
     * Validates if the provided node name is valid based on specific rules. The name
     * must not be {@code null} or empty. It must also meet conditions such as a minimum
     * length and absence of prohibited characters.
     *
     * @param name the name to be validated
     * @return {@code true} if the name is valid, according to the rules;
     *         {@code false} otherwise
     */
    public static boolean isNameValid(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        if (name.length() <= 3 && LATIN_CHARS.matcher(name).matches()) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (!isNameCharacterValid(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Determines whether a given character is valid for use in a node name based on specific rules.
     * The validation allows only certain types of characters, including letters, numbers,
     * currency symbols, and a subset of punctuation (see {@link #NAME_PUNCTUATION_ALLOWED}).
     *
     * @param c the character to be validated
     * @return {@code true} if the character is valid for use in a name; {@code false} otherwise
     */
    public static boolean isNameCharacterValid(char c) {
        return switch (Character.getType(c)) {
            case Character.UPPERCASE_LETTER,
                    Character.LOWERCASE_LETTER,
                    Character.TITLECASE_LETTER,
                    Character.OTHER_LETTER,
                    Character.DECIMAL_DIGIT_NUMBER,
                    Character.LETTER_NUMBER,
                    Character.OTHER_NUMBER,
                    Character.CURRENCY_SYMBOL,
                    Character.OTHER_SYMBOL -> true;
            case Character.OTHER_PUNCTUATION,
                    Character.DASH_PUNCTUATION -> NAME_PUNCTUATION_ALLOWED.indexOf(c) >= 0;
            default -> false;
        };
    }

}
