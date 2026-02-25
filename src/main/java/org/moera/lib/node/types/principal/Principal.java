package org.moera.lib.node.types.principal;

import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

import tools.jackson.databind.annotation.JsonDeserialize;
import tools.jackson.databind.annotation.JsonSerialize;
import tools.jackson.databind.util.StdConverter;

/**
 * Represents a principal entity in Moera that encapsulates various predefined types and
 * behaviors for node access control.
 * <p>
 * A principal represents an entity with a specific relationship with the current node and the protected object,
 * such as "admin", "private", etc.
 * Additionally, parametrized principals can be created based on nodes or friend groups.
 */
@JsonSerialize(converter = Principal.ToStringConverter.class)
@JsonDeserialize(converter = Principal.FromStringConverter.class)
public class Principal implements Cloneable, PrincipalFilter {

    /*
     *   admin   object
     *     +       +      private and wider
     *     +       +      secret
     *     +       -      senior
     *     +       +      enigma
     *     +       -      major
     *     -       +      owner
     *     +       -      admin
     *
     *   admin   post   object
     *     +      +       +      private and wider
     *     +      -       +      secret
     *     +      +       -      senior
     *     +      -       +      enigma
     *     +      -       -      major
     *     -      -       +      owner
     *     +      -       -      admin
     *
     *   admin   post   comment   object
     *     +      +        +        +      private and wider
     *     +      +        -        +      secret
     *     +      +        +        -      senior
     *     +      -        -        +      enigma
     *     +      +        -        -      major
     *     -      -        -        +      owner
     *     +      -        -        -      admin
     */

    /**
     * Nobody.
     */
    public static final Principal NONE = new Principal("none");

    /**
     * Node administrator.
     */
    public static final Principal ADMIN = new Principal("admin");

    /**
     * Any authenticated Moera node.
     */
    public static final Principal SIGNED = new Principal("signed");

    /**
     * Any Moera node this node is subscribed to.
     * For access control purposes, only subscription to the node's "timeline" feed is taken into account.
     */
    public static final Principal SUBSCRIBED = new Principal("subscribed");

    /**
     * Refer <a href="https://moera.org/development/node-api/access-controls.html">Access controls documentation</a>
     * for the exact definition.
     */
    public static final Principal PRIVATE = new Principal("private");

    /**
     * Refer <a href="https://moera.org/development/node-api/access-controls.html">Access controls documentation</a>
     * for the exact definition.
     */
    public static final Principal SECRET = new Principal("secret");

    /**
     * Refer <a href="https://moera.org/development/node-api/access-controls.html">Access controls documentation</a>
     * for the exact definition.
     */
    public static final Principal SENIOR = new Principal("senior");

    /**
     * Refer <a href="https://moera.org/development/node-api/access-controls.html">Access controls documentation</a>
     * for the exact definition.
     */
    public static final Principal ENIGMA = new Principal("enigma");

    /**
     * Refer <a href="https://moera.org/development/node-api/access-controls.html">Access controls documentation</a>
     * for the exact definition.
     */
    public static final Principal MAJOR = new Principal("major");

    /**
     * The protected object's owner.
     */
    public static final Principal OWNER = new Principal("owner");

    /**
     * Any client, authenticated or not.
     */
    public static final Principal PUBLIC = new Principal("public");

    /**
     * Undefined.
     * This is a special value used in overrides.
     * It means that the higher-level object does not override the permission,
     * so the object’s own permission takes effect.
     */
    public static final Principal UNSET = new Principal("unset");

    private static final Map<Principal, Integer> PRINCIPAL_MASKS = Map.of(
        Principal.PRIVATE, 0xf,
        Principal.SECRET, 0xd,
        Principal.SENIOR, 0xe,
        Principal.ENIGMA, 0x9,
        Principal.MAJOR, 0xc,
        Principal.OWNER, 0x1,
        Principal.ADMIN, 0x8,
        Principal.NONE, 0x0
    );

    private final String value;

    /**
     * Constructs a {@code Principal} object with the specified value.
     *
     * @param value the value representing the principal; must not be {@code null}
     * @throws IllegalArgumentException if the provided value is {@code null}
     */
    public Principal(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Principal cannot be null");
        }

        this.value = value;
    }

    /**
     * Constructs a principal that includes the node’s administrator and all nodes in the list.
     *
     * @param nodeNames the nodes to be included
     * @return the principal
     */
    public static Principal ofNode(String... nodeNames) {
        return new Principal("node:" + joinNotNull(",", nodeNames));
    }

    /**
     * Constructs a principal that includes the nodes in the list and only them.
     *
     * @param nodeNames the nodes to be included
     * @return the principal
     */
    public static Principal ofOnly(String... nodeNames) {
        return new Principal("only:" + joinNotNull(",", nodeNames));
    }

    /**
     * Constructs a principal that includes the node’s administrator and the members of a particular group of friends.
     *
     * @param friendGroupName name of the group of friends
     * @return the principal
     */
    public static Principal ofFriendGroup(String friendGroupName) {
        return new Principal("f:" + friendGroupName);
    }

    private static String joinNotNull(String delimiter, String[] names) {
        StringBuilder result = new StringBuilder();
        for (String name : names) {
            if (name != null) {
                if (!result.isEmpty()) {
                    result.append(delimiter);
                }
                result.append(name);
            }
        }
        return result.toString();
    }

    /**
     * Retrieves the principal in the string form.
     *
     * @return the principal in the string form
     */
    public String getValue() {
        return value;
    }

    /**
     * Checks if the current principal is "none".
     *
     * @return {@code true} if the principal is "none", otherwise {@code false}.
     */
    public boolean isNone() {
        return value.equals(NONE.value);
    }

    /**
     * Checks if the current principal is "admin".
     *
     * @return {@code true} if the principal is "admin", otherwise {@code false}.
     */
    public boolean isAdmin() {
        return value.equals(ADMIN.value);
    }

    /**
     * Checks if the current principal is "signed".
     *
     * @return {@code true} if the principal is "signed", otherwise {@code false}.
     */
    public boolean isSigned() {
        return value.equals(SIGNED.value);
    }

    /**
     * Checks if the current principal is "subscribed".
     *
     * @return {@code true} if the principal is "subscribed", otherwise {@code false}.
     */
    public boolean isSubscribed() {
        return value.equals(SUBSCRIBED.value);
    }

    /**
     * Checks if the current principal is "private".
     *
     * @return {@code true} if the principal is "private", otherwise {@code false}.
     */
    public boolean isPrivate() {
        return value.equals(PRIVATE.value);
    }

    /**
     * Checks if the current principal is "secret".
     *
     * @return {@code true} if the principal is "secret", otherwise {@code false}.
     */
    public boolean isSecret() {
        return value.equals(SECRET.value);
    }

    /**
     * Checks if the current principal is "senior".
     *
     * @return {@code true} if the principal is "senior", otherwise {@code false}.
     */
    public boolean isSenior() {
        return value.equals(SENIOR.value);
    }

    /**
     * Checks if the current principal is "enigma".
     *
     * @return {@code true} if the principal is "enigma", otherwise {@code false}.
     */
    public boolean isEnigma() {
        return value.equals(ENIGMA.value);
    }

    /**
     * Checks if the current principal is "major".
     *
     * @return {@code true} if the principal is "major", otherwise {@code false}.
     */
    public boolean isMajor() {
        return value.equals(MAJOR.value);
    }

    /**
     * Checks if the current principal is "owner".
     *
     * @return {@code true} if the principal is "owner", otherwise {@code false}.
     */
    public boolean isOwner() {
        return value.equals(OWNER.value);
    }

    /**
     * Checks if the current principal is "public".
     *
     * @return {@code true} if the principal is "public", otherwise {@code false}.
     */
    public boolean isPublic() {
        return value.equals(PUBLIC.value);
    }

    /**
     * Checks if the current principal is "unset".
     *
     * @return {@code true} if the principal is "unset", otherwise {@code false}.
     */
    public boolean isUnset() {
        return value.equals(UNSET.value);
    }

    /**
     * Checks if the current principal is a "node" principal with a list of nodes.
     *
     * @return {@code true} if the principal is a "node" principal, otherwise {@code false}.
     */
    public boolean isNode() {
        return value.startsWith("node:");
    }

    /**
     * Checks if the current principal is an "only" principal with a list of nodes.
     *
     * @return {@code true} if the principal is an "only" principal, otherwise {@code false}.
     */
    public boolean isOnly() {
        return value.startsWith("only:");
    }

    /**
     * Checks if the current principal is a "friends" principal for some group of friends.
     *
     * @return {@code true} if the principal is a "friends" principal, otherwise {@code false}.
     */
    public boolean isFriends() {
        return value.startsWith("f:");
    }

    /**
     * Retrieves the names of the nodes if the current principal represents a "node" or "only" type.
     *
     * @return an array of node names if the principal is a "node" or "only" type, otherwise an empty array.
     */
    public String[] getNodeNames() {
        return isNode() || isOnly() ? value.substring(5).split(",") : new String[0];
    }

    /**
     * Retrieves the identifier of the friend group associated with the principal.
     * If the current principal represents a "friends" principal, the identifier is
     * extracted and returned. Otherwise, {@code null} is returned.
     *
     * @return the friend group identifier if the principal is a "friends" principal,
     *         otherwise {@code null}.
     */
    public String getFriendGroupId() {
        return isFriends() ? value.substring(2) : null;
    }

    /**
     * Converts a relative principal to an absolute one.
     * Some principals, like "owner" or "private" cannot be verified without knowing the owner of the protected object.
     * This method receives the owner's name as a parameter and converts the current principal to an absolute one, like
     * "node", "only" or "admin" that can be verified without any additional knowledge.
     * <p>
     * For example, {@code "private"} principal with {@code ownerName == "usopp"}
     * is converted to {@code "node:usopp"} principal.
     *
     * @param ownerName the owner's name
     * @return the absolute principal
     */
    public Principal withOwner(String ownerName) {
        if (isOwner()) {
            return Principal.ofOnly(ownerName);
        }
        if (isPrivate() | isSecret() | isEnigma()) {
            return Principal.ofNode(ownerName);
        }
        if (isSenior() | isMajor()) {
            return Principal.ADMIN;
        }
        return this;
    }

    /**
     * Converts a relative principal to an absolute one.
     * Some principals, like "senior" or "private" cannot be verified without knowing the owner of the protected object
     * and its senior.
     * This method receives the owner's name and senior's name as parameters and converts the current principal to an
     * absolute one, like "node", "only" or "admin" that can be verified without any additional knowledge.
     * <p>
     * For example, {@code "private"} principal with {@code ownerName == "usopp"} and {@code seniorName == "nami"}
     * is converted to {@code "node:usopp,nami"} principal.
     *
     * @param ownerName the owner's name
     * @param seniorName the senior's name
     * @return the absolute principal
     */
    public Principal withOwner(String ownerName, String seniorName) {
        if (isOwner()) {
            return Principal.ofOnly(ownerName);
        }
        if (isPrivate()) {
            return Principal.ofNode(ownerName, seniorName);
        }
        if (isSecret() | isEnigma()) {
            return Principal.ofNode(ownerName);
        }
        if (isSenior()) {
            return Principal.ofNode(seniorName);
        }
        if (isMajor()) {
            return Principal.ADMIN;
        }
        return this;
    }

    /**
     * Converts a relative principal to an absolute one.
     * Some principals, like "secret" or "private" cannot be verified without knowing the owner of the protected object
     * and its senior and major.
     * This method receives the owner's name, senior's name and major's name as parameters and converts the current
     * principal to an absolute one, like "node", "only" or "admin" that can be verified without any additional
     * knowledge.
     * <p>
     * For example, {@code "private"} principal with {@code ownerName == "usopp"}, {@code seniorName == "nami"} and
     * {@code seniorName == "arlong"} is converted to {@code "node:usopp,nami,arlong"} principal.
     *
     * @param ownerName the owner's name
     * @param seniorName the senior's name
     * @param majorName the major's name
     * @return the absolute principal
     */
    public Principal withOwner(String ownerName, String seniorName, String majorName) {
        if (isOwner()) {
            return Principal.ofOnly(ownerName);
        }
        if (isPrivate()) {
            return Principal.ofNode(ownerName, seniorName, majorName);
        }
        if (isSecret()) {
            return Principal.ofNode(ownerName, majorName);
        }
        if (isSenior()) {
            return Principal.ofNode(seniorName, majorName);
        }
        if (isEnigma()) {
            return Principal.ofNode(ownerName);
        }
        if (isMajor()) {
            return Principal.ofNode(majorName);
        }
        return this;
    }

    /**
     * Returns the given principal if the current principal is unset; otherwise, returns the current principal.
     *
     * @param principal the subordinate principal to be returned if the current principal is unset
     * @return the provided subordinate principal if the current principal is unset; otherwise, the current principal
     */
    public Principal withSubordinate(Principal principal) {
        return isUnset() ? principal : this;
    }

    /**
     * Compares this {@code Principal} instance with another object to determine equality.
     *
     * @param peer the object to be compared with this instance for equality
     * @return {@code true} if the specified object is equivalent to this instance, otherwise {@code false}
     */
    @Override
    public boolean equals(Object peer) {
        if (this == peer) {
            return true;
        }
        if (peer == null || getClass() != peer.getClass()) {
            return false;
        }

        Principal principal = (Principal) peer;
        return value.equals(principal.value);
    }

    /**
     * Computes the hash code for the current instance of the {@code Principal} class.
     *
     * @return the hash code of this {@code Principal} instance based on its value.
     */
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    /**
     * Returns the string representation of this principal.
     *
     * @return the string representation of the principal's value
     */
    @Override
    public String toString() {
        return value;
    }

    /**
     * Creates and returns a copy of this {@code Principal} object.
     *
     * @return a new {@code Principal} object with the same value as the current instance
     */
    @Override
    protected Principal clone() {
        return new Principal(value);
    }

    /**
     * Determines whether a client with the given privileges is included in the principal.
     *
     * @param admin         indicates whether the client has administrative privileges
     * @param nodeName      the name of the client's node
     * @param subscribed    indicates whether the current node is subscribed to the client's node
     * @param friendGroups  an array of the friend groups the client's node is a member of
     * @return {@code true} if the client satisfies the inclusion criteria, {@code false} otherwise
     * @throws UnresolvedPrincipalException if the principal cannot be checked without additional knowledge
     */
    @Override
    public boolean includes(boolean admin, String nodeName, boolean subscribed, String[] friendGroups) {
        if (isPublic()) {
            return true;
        }
        if (isNone()) {
            return false;
        }
        if (isOnly()) {
            return includes(getNodeNames(), nodeName);
        }
        if (admin) {
            return true;
        }
        if (isAdmin()) {
            return false;
        }
        if (isSigned()) {
            return nodeName != null;
        }
        if (isSubscribed()) {
            return subscribed;
        }
        if (isNode()) {
            return includes(getNodeNames(), nodeName);
        }
        if (isFriends()) {
            return friendGroups != null && includes(friendGroups, getFriendGroupId());
        }
        throw new UnresolvedPrincipalException(this);
    }

    /**
     * Determines whether a client with the given privileges is included in the principal.
     *
     * @param admin         indicates whether the client has administrative privileges
     * @param nodeName      the name of the client's node
     * @param subscribed    supplier providing the subscription status of the client
     * @param friendGroups  supplier providing the client's friend groups
     * @return {@code true} if the client satisfies the inclusion criteria, {@code false} otherwise
     * @throws UnresolvedPrincipalException if the principal cannot be checked without additional knowledge
     */
    public boolean includes(
        boolean admin, String nodeName, Supplier<Boolean> subscribed, Supplier<String[]> friendGroups
    ) {
        return includes(
            admin, nodeName, isSubscribed() ? subscribed.get() : false, isFriends() ? friendGroups.get() : null
        );
    }

    private static boolean includes(String[] names, String name) {
        if (names == null || names.length == 0 || name == null) {
            return false;
        }
        for (String s : names) {
            if (Objects.equals(s, name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the current principal matches any of the specified flags.
     *
     * @param flags a combination of {@link PrincipalFlag} flags.
     * @return {@code true} if the current principal matches one of the specified flags;
     *         {@code false} otherwise
     * @see PrincipalFlag
     */
    public boolean isOneOf(int flags) {
        if (isNone()) {
            return (flags & PrincipalFlag.NONE) != 0;
        }
        if (isAdmin()) {
            return (flags & PrincipalFlag.ADMIN) != 0;
        }
        if (isSigned()) {
            return (flags & PrincipalFlag.SIGNED) != 0;
        }
        if (isPrivate()) {
            return (flags & PrincipalFlag.PRIVATE) != 0;
        }
        if (isSecret()) {
            return (flags & PrincipalFlag.SECRET) != 0;
        }
        if (isSenior()) {
            return (flags & PrincipalFlag.SENIOR) != 0;
        }
        if (isEnigma()) {
            return (flags & PrincipalFlag.ENIGMA) != 0;
        }
        if (isMajor()) {
            return (flags & PrincipalFlag.MAJOR) != 0;
        }
        if (isOwner()) {
            return (flags & PrincipalFlag.OWNER) != 0;
        }
        if (isPublic()) {
            return (flags & PrincipalFlag.PUBLIC) != 0;
        }
        if (isUnset()) {
            return (flags & PrincipalFlag.UNSET) != 0;
        }
        if (isNode()) {
            return (flags & PrincipalFlag.NODE) != 0;
        }
        if (isOnly()) {
            return (flags & PrincipalFlag.ONLY) != 0;
        }
        if (isFriends()) {
            return (flags & PrincipalFlag.FRIENDS) != 0;
        }
        if (isSubscribed()) {
            return (flags & PrincipalFlag.SUBSCRIBED) != 0;
        }
        return false;
    }

    /**
     * Creates a principal that includes any client that is included by the current principal <b>or</b> the principal
     * passed as a parameter.
     * <p>
     * Note:
     * It is not always possible to find a principal that exactly fits the criteria (for example, a union of two
     * unrelated groups of friends). In this case, the method returns the narrowest principal that fits (in the case of
     * two unrelated groups of friends, it is "signed").
     *
     * @param principal the principal to create a union with
     * @return the union principal
     */
    public Principal union(Principal principal) {
        if (isUnset()) {
            return principal;
        }
        if (isPublic() || principal.isPublic()) {
            return Principal.PUBLIC;
        }
        if (isSigned() || principal.isSigned()) {
            return Principal.SIGNED;
        }
        if (isSubscribed() || principal.isSubscribed()) {
            return Principal.SUBSCRIBED;
        }
        if (isFriends() && principal.isFriends()) {
            return Principal.SIGNED; // FIXME too wide. Not so critical, because will almost never happen
        }
        if (isFriends()) {
            return this;
        }
        if (principal.isFriends()) {
            return principal;
        }

        Integer mask = PRINCIPAL_MASKS.get(this);
        Integer principalMask = PRINCIPAL_MASKS.get(principal);
        return mask != null && principalMask != null ? closeToMask(mask | principalMask) : Principal.NONE;
    }

    /**
     * Creates a principal that includes any client that is included by <b>both</b> the current principal and
     * the principal passed as a parameter.
     * <p>
     * Note:
     * It is not always possible to find a principal that exactly fits the criteria (for example, an intersection of two
     * unrelated groups of friends). In this case, the method returns the narrowest principal that fits (in the case of
     * two unrelated groups of friends, it is one of these groups).
     *
     * @param principal the principal to create an intersection with
     * @return the intersection principal
     */
    public Principal intersect(Principal principal) {
        if (isUnset()) {
            return principal;
        }
        if (isPublic()) {
            return principal;
        }
        if (principal.isPublic()) {
            return this;
        }
        if (isSigned()) {
            return principal;
        }
        if (principal.isSigned()) {
            return this;
        }
        if (isSubscribed()) {
            return principal;
        }
        if (principal.isSubscribed()) {
            return this;
        }
        if (isFriends()) {
            return principal; // FIXME too wide, if principal.isFriends(). But - see above
        }
        if (principal.isFriends()) {
            return this;
        }

        Integer mask = PRINCIPAL_MASKS.get(this);
        Integer principalMask = PRINCIPAL_MASKS.get(principal);
        return mask != null && principalMask != null ? closeToMask(mask & principalMask) : Principal.NONE;
    }

    private Principal closeToMask(int mask) {
        Principal closest = null;
        int closeness = 256;
        for (var entry : PRINCIPAL_MASKS.entrySet()) {
            int c = Integer.bitCount(entry.getValue() ^ mask);
            if (c < closeness) {
                closest = entry.getKey();
                closeness = c;
            }
        }
        return closest;
    }

    /**
     * Creates a {@link PrincipalExpression} from this principal.
     *
     * @return the expression
     */
    @Override
    public PrincipalExpression a() {
        return PrincipalExpression.by(this);
    }

    /**
     * Creates a {@link PrincipalExpression} that represents the logical NOT of this principal.
     *
     * @return the expression representing the negated principal
     */
    public PrincipalExpression not() {
        return PrincipalExpression.byNot(this);
    }

    /**
     * Converts a {@code Principal} object to its string representation.
     * This class extends {@code StdConverter} to provide a Jackson-compatible
     * mechanism for serialization of {@code Principal} instances.
     *
     * @see Principal
     * @see StdConverter
     */
    public static class ToStringConverter extends StdConverter<Principal, String> {

        /**
         * Converts a {@code Principal} object to its string representation.
         *
         * @param principal the {@code Principal} object to be converted
         * @return the string representation of the {@code Principal} object's value
         */
        @Override
        public String convert(Principal principal) {
            return principal.getValue();
        }

    }

    /**
     * Converts a {@code String} into a {@code Principal} instance.
     * This class extends {@code StdConverter} to provide a Jackson-compatible
     * mechanism for deserialization of {@code Principal} instances from their
     * string representation.
     *
     * @see Principal
     * @see StdConverter
     */
    public static class FromStringConverter extends StdConverter<String, Principal> {

        /**
         * Converts a given string into a {@code Principal} instance.
         *
         * @param s the string to be converted into a {@code Principal}
         * @return a {@code Principal} instance created from the provided string
         */
        @Override
        public Principal convert(String s) {
            return new Principal(s);
        }

    }

}
