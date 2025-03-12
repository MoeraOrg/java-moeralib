package org.moera.lib.node.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Represents a list of allowed emojis.
 */
public class EmojiList {

    private static final Pattern PATTERN = Pattern.compile(
        "^\\s*(?:\\+?(?:\\d+|0x\\p{XDigit}+|\\*)(?:\\s*,\\s*\\+?(?:\\d+|0x\\p{XDigit}+|\\*))*)?\\s*$"
    );

    private Set<Integer> accepted = Collections.emptySet();
    private boolean other;

    /**
     * Constructs an instance of EmojiList with no predefined accepted emojis.
     * By default, the list of accepted emojis will be empty, and no wildcard will be set.
     */
    public EmojiList() {
    }

    /**
     * Constructs an instance of EmojiList using the provided string representation.
     * The input can represent a comma-separated list of values, where each value may
     * either be an individual emoji identifier (a hexadecimal representation prefixed
     * with "0x"), or a wildcard symbol "*". The wildcard allows all emojis to be accepted.
     *
     * @param s the list of allowed emojis as a string
     */
    public EmojiList(String s) {
        String[] parts = s.split(",");
        other = Arrays.stream(parts)
            .map(String::trim)
            .anyMatch(p -> p.equals("*"));
        if (!other) {
            accepted = Arrays.stream(parts)
                .map(String::trim)
                .filter(p -> !p.isEmpty())
                .filter(p -> !p.equals("*"))
                .map(EmojiList::parseValue)
                .collect(Collectors.toSet());
        }
    }

    private static int parseValue(String s) {
        if (s.startsWith("+")) {
            s = s.substring(1);
        }
        if (s.startsWith("0x")) {
            return Integer.parseInt(s.substring(2), 16);
        } else {
            return Integer.parseInt(s);
        }
    }

    /**
     * Checks if the given emoji is accepted based on the set of allowed emojis defined by the object.
     *
     * @param emoji the emoji to check for acceptance, represented as an integer code point
     * @return {@code true} if the emoji is accepted; {@code false} otherwise
     */
    public boolean isAccepted(int emoji) {
        return other || accepted.contains(emoji);
    }

    /**
     * Checks that the input string represents a valid list of emojis.
     *
     * @param s the string to be validated
     * @return {@code true} if the string matches the emoji list format; {@code false} otherwise
     */
    public static boolean isValid(String s) {
        return PATTERN.matcher(s).matches();
    }

}
