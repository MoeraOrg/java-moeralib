package org.moera.lib.node.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Represents a list of rejected emojis.
 */
public class EmojiList {

    /**
     * The set of standard emojis representing positive reactions.
     */
    public static final Set<Integer> STANDARD_POSITIVE = Set.of(
        0x1f4a1, // Hmm
        0x1f44d, // Like
        0x1f4af, // Super
        0x1f60d, // Love
        0x1f600, // Ha-ha
        0x1f926, // Facepalm
        0x1f62e, // Wow
        0x1f622, // Sad
        0x1f620, // Angry
        0x1f92e, // Disgust
        0x1f48e, // Brilliant
        0x1f37f, // Popcorn
        0x1f62b, // Damn
        0x1f49d, // Congrats
        0x1f62d, // Cry
        0x1f9f8, // Get well
        0x2708,  // Good trip
        0x1f379, // Enjoy
        0x1f64f, // Hope
        0x1f60c, // Keep calm
        0x1fac2, // Hug
        0x1f525, // Hot
        0x1f923, // LOL
        0x1f970, // Sweet
        0x1f971, // Tired
        0x1f631  // Horror
    );
    /**
     * The set of standard emojis representing negative reactions.
     */
    public static final Set<Integer> STANDARD_NEGATIVE = Set.of(
        0x1f4a4, // Boring
        0x1f44e, // Dislike
        0x1f4a9, // Dirt
        0x2694,  // Disagree
        0x23f3,  // Too long
        0x1f3a9, // Arrogant
        0x1f643, // Absurd
        0x1f61c, // Be-be
        0x1f494, // Hurt
        0x1f47f, // Hostile
        0x1f986, // Fake
        0x274c,  // Wrong
        0x1f984, // Naive
        0x1f9ef, // Chill out
        0x1f595  // Get lost
    );

    private static final Pattern PATTERN = Pattern.compile(
        "^\\s*(?:\\p{XDigit}+|\\*)?(?:\\s+(?:\\p{XDigit}+|\\*))*\\s*$"
    );

    private Set<Integer> rejected = Collections.emptySet();
    private boolean other;

    /**
     * Constructs an instance of EmojiList with no predefined rejected emojis.
     * By default, the list of rejected emojis will be empty, and no wildcard will be set.
     */
    public EmojiList() {
    }

    /**
     * Constructs an instance of EmojiList using the provided string representation.
     * The input can represent a space-separated list of values, where each value may
     * either be an individual emoji identifier (a hexadecimal representation) or a wildcard symbol "*".
     * The wildcard rejects all non-standard emojis.
     *
     * @param s the list of rejected emojis as a string
     */
    public EmojiList(String s) {
        String[] parts = s.split(" ");
        other = Arrays.stream(parts)
            .map(String::trim)
            .anyMatch(p -> p.equals("*"));
        if (!other) {
            rejected = Arrays.stream(parts)
                .map(String::trim)
                .filter(p -> !p.isEmpty())
                .filter(p -> !p.equals("*"))
                .map(p -> Integer.parseInt(p, 16))
                .collect(Collectors.toSet());
        }
    }

    /**
     * Checks if the given emoji is accepted based on the set of rejected emojis defined by the object.
     *
     * @param emoji the emoji to check for acceptance, represented as an integer code point
     * @param negative {@code false} to check against the list of positive emojis, {@code true} otherwise
     * @return {@code true} if the emoji is accepted; {@code false} otherwise
     */
    public boolean isAccepted(int emoji, boolean negative) {
        if (rejected.contains(emoji)) {
            return false;
        }
        if (!other) {
            return true;
        }
        return !negative ? STANDARD_POSITIVE.contains(emoji) : STANDARD_NEGATIVE.contains(emoji);
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

    /**
     * Combines two lists of emojis, rejecting any emoji that either of them rejects.

     * @param first the first list of emojis
     * @param second the second list of emojis
     * @return the combined list of emojis
     */
    public static String combine(String first, String second) {
        if (first == null || first.isBlank()) {
            return second;
        }
        if (second == null || second.isBlank()) {
            return first;
        }

        EmojiList firstList = new EmojiList(first);
        EmojiList secondList = new EmojiList(second);
        firstList.rejected.addAll(secondList.rejected);
        firstList.other = firstList.other || secondList.other;
        return firstList.toString();
    }

    public String toString() {
        String base = rejected.stream()
            .map(Integer::toHexString)
            .collect(Collectors.joining(" "));
        if (other) {
            return base.isEmpty() ? "*" : base + " *";
        }
        return base;
    }

}
