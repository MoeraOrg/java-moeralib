package org.moera.lib.node.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EmojiList {

    private static final Pattern PATTERN = Pattern.compile(
        "^\\s*(?:\\+?(?:\\d+|0x\\p{XDigit}+|\\*)(?:\\s*,\\s*\\+?(?:\\d+|0x\\p{XDigit}+|\\*))*)?\\s*$"
    );

    private Set<Integer> accepted = Collections.emptySet();
    private boolean other;

    public EmojiList() {
    }

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

    public boolean isAccepted(int emoji) {
        return other || accepted.contains(emoji);
    }

    public static boolean isValid(String s) {
        return PATTERN.matcher(s).matches();
    }

}
