package org.moera.lib.node.types.principal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * This class makes possible to describe subsets of principals.
 * Its primary use is validation of principals that are assigned to various protected objects.
 */
public class PrincipalFlag {

    /**
     * The principal of type "none".
     */
    public static final int NONE = 0x0001;

    /**
     * The principal of type "admin".
     */
    public static final int ADMIN = 0x0002;

    /**
     * The principal of type "signed".
     */
    public static final int SIGNED = 0x0004;

    /**
     * The principal of type "private".
     */
    public static final int PRIVATE = 0x0008;

    /**
     * The principal of type "owner".
     */
    public static final int OWNER = 0x0010;

    /**
     * The principal of type "public".
     */
    public static final int PUBLIC = 0x0020;

    /**
     * The principal of type "node".
     */
    public static final int NODE = 0x0040;

    /**
     * The principal of type "only".
     */
    public static final int ONLY = 0x0080;

    /**
     * The principal of type "unset".
     */
    public static final int UNSET = 0x0100;

    /**
     * The principal of type "secret".
     */
    public static final int SECRET = 0x0200;

    /**
     * The principal of type "senior".
     */
    public static final int SENIOR = 0x0400;

    /**
     * The principal of type "enigma".
     */
    public static final int ENIGMA = 0x0800;

    /**
     * The principal of type "major".
     */
    public static final int MAJOR = 0x1000;

    /**
     * The principal of type "friends".
     */
    public static final int FRIENDS = 0x2000;

    /**
     * The principal of type "subscribed".
     */
    public static final int SUBSCRIBED = 0x4000;

    public static final Map<String, Integer> NAMES = new HashMap<>();

    static {
        NAMES.put("none", NONE);
        NAMES.put("admin", ADMIN);
        NAMES.put("signed", SIGNED);
        NAMES.put("private", PRIVATE);
        NAMES.put("owner", OWNER);
        NAMES.put("public", PUBLIC);
        NAMES.put("node", NODE);
        NAMES.put("only", ONLY);
        NAMES.put("unset", UNSET);
        NAMES.put("secret", SECRET);
        NAMES.put("senior", SENIOR);
        NAMES.put("enigma", ENIGMA);
        NAMES.put("major", MAJOR);
        NAMES.put("friends", FRIENDS);
        NAMES.put("subscribed", SUBSCRIBED);
    }

    /**
     * Returns the integer flag associated with the specified principal name.
     *
     * @param name the name of the principal whose flag is to be retrieved
     * @return the integer flag associated with the given principal name
     * @throws IllegalArgumentException if the specified name does not correspond to a known principal flag
     */
    public static int fromName(String name) {
        Integer flag = NAMES.get(name);
        if (flag == null) {
            throw new IllegalArgumentException("Unknown principal flag name");
        }
        return flag;
    }

    /**
     * Converts a collection of principal names into a combined mask.
     * Each principal name in the collection is mapped to its corresponding integer flag,
     * and the results are combined using a bitwise OR operation.
     *
     * @param names the collection of principal names to be converted into flags
     * @return the combined mask representing all the principal names in the collection
     * @throws IllegalArgumentException if any of the specified names does not correspond to a known principal flag
     */
    public static int fromNames(Collection<String> names) {
        int flags = 0;
        for (String name : names) {
            flags |= fromName(name);
        }
        return flags;
    }

}
