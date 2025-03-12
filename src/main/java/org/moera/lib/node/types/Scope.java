package org.moera.lib.node.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Scope {

    //CHECKSTYLE:OFF

    /**
     * no permissions
     */
    NONE                    (0x00000000, false),

    /**
     * allow identifying under the corresponding node name
     */
    IDENTIFY                (0x00000000, false),

    /**
     * other permissions
     */
    OTHER                   (0x00000001, true),

    /**
     * view any media file
     */
    VIEW_MEDIA              (0x00000002, true),

    /**
     * view any content (posts, comments, reactions), except media files
     */
    VIEW_CONTENT            (0x00000004, true),

    /**
     * create posts owned by the node
     */
    ADD_POST                (0x00000008, true),

    /**
     * modify posts owned by the node
     */
    UPDATE_POST             (0x00000010, true),

    /**
     * create comments owned by the node
     */
    ADD_COMMENT             (0x00000020, true),

    /**
     * modify comments owned by the node
     */
    UPDATE_COMMENT          (0x00000040, true),

    /**
     * create and delete reactions owned by the node
     */
    REACT                   (0x00000080, true),

    /**
     * delete any content owned by the node
     */
    DELETE_OWN_CONTENT      (0x00000100, true),

    /**
     * delete any content not owned by the node, but stored on it
     */
    DELETE_OTHERS_CONTENT   (0x00000200, true),

    /**
     * view all contacts of the node
     */
    VIEW_PEOPLE             (0x00000400, true),

    /**
     * block and unblock people
     */
    BLOCK                   (0x00000800, true),

    /**
     * add and remove friends and friend groups
     */
    FRIEND                  (0x00001000, true),

    /**
     * create cartes for authentication on other nodes
     */
    REMOTE_IDENTIFY         (0x00002000, true),

    /**
     * use drafts
     */
    DRAFTS                  (0x00004000, true),

    /**
     * view all feeds and status of stories in them
     */
    VIEW_FEEDS              (0x00008000, true),

    /**
     * modify status of stories in feeds
     */
    UPDATE_FEEDS            (0x00010000, true),

    /**
     * update the name of the node
     */
    NAME                    (0x00020000, true),

    /**
     * administrate plugins
     */
    PLUGINS                 (0x00040000, true),

    /**
     * view all fields of the profile
     */
    VIEW_PROFILE            (0x00080000, true),

    /**
     * change the profile
     */
    UPDATE_PROFILE          (0x00100000, true),

    /**
     * use sheriff's powers
     */
    SHERIFF                 (0x00200000, true),

    /**
     * view the node settings
     */
    VIEW_SETTINGS           (0x00400000, true),

    /**
     * modify the node settings
     */
    UPDATE_SETTINGS         (0x00800000, true),

    /**
     * subscribe and unsubscribe to the feeds
     */
    SUBSCRIBE               (0x01000000, true),

    /**
     * manage authentication tokens
     */
    TOKENS                  (0x02000000, true),

    /**
     * modify lists of users
     */
    USER_LISTS              (0x04000000, true),

    /**
     * grant administrative permission on this node to other nodes
     */
    GRANT                   (0x08000000, true),

    /**
     * upload a public media file
     */
    UPLOAD_PUBLIC_MEDIA     (0x10000000, true),

    /**
     * upload a private media file
     */
    UPLOAD_PRIVATE_MEDIA    (0x20000000, true),

    /**
     * create posts owned by the node on remote nodes (combined scope)
     */
    REMOTE_ADD_POST         (0x00002008, false),

    /**
     * modify posts owned by the node on remote nodes (combined scope)
     */
    REMOTE_UPDATE_POST      (0x00002010, false),

    /**
     * create comments owned by the node on remote nodes (combined scope)
     */
    REMOTE_ADD_COMMENT      (0x00002020, false),

    /**
     * modify comments owned by the node on remote nodes (combined scope)
     */
    REMOTE_UPDATE_COMMENT   (0x00002040, false),

    /**
     * create and delete reactions owned by the node on remote nodes (combined scope)
     */
    REMOTE_REACT            (0x00002080, false),

    /**
     * delete any content owned by the node on remote nodes (combined scope)
     */
    REMOTE_DELETE_CONTENT   (0x00002100, false),

    // These are admin operations allowed when authenticated by carte

    /**
     * all view-only permissions (combined scope)
     */
    VIEW_ALL                (0x00088406, false),

    /**
     * all permissions (combined scope)
     */
    ALL                     (0x3fffffff, false);
    //CHECKSTYLE:ON

    private final long mask;
    private final boolean basic;

    Scope(long mask, boolean basic) {
        this.mask = mask;
        this.basic = basic;
    }

    /**
     * Retrieves the scope mask value.
     *
     * @return the mask
     */
    public long getMask() {
        return mask;
    }

    /**
     * Determines whether the current instance represents a simple scope, not a combination of several other scopes.
     *
     * @return {@code true} if the instance is considered basic, {@code false} otherwise.
     */
    public boolean isBasic() {
        return basic;
    }

    /**
     * Checks if the mask provided as an argument includes the current object's mask.
     *
     * @param mask the mask to be checked
     * @return {@code true} if the provided mask includes the current object's mask; {@code false} otherwise
     */
    public boolean included(long mask) {
        return (mask & getMask()) == getMask();
    }

    /**
     * Checks if the current scope is included in the scope provided as an argument.
     *
     * @param scope the scope to be checked
     * @return {@code true} if the current scope is included, {@code false} otherwise
     */
    public boolean included(Scope scope) {
        return included(scope.getMask());
    }

    /**
     * Combines the masks of the provided scopes into a single long value.
     *
     * @param scopes an array of {@code Scope} instances whose masks will be combined
     * @return the combined mask
     */
    public static long of(Scope... scopes) {
        long mask = 0;
        for (Scope scope : scopes) {
            mask |= scope.getMask();
        }
        return mask;
    }

    /**
     * Retrieves the value of the enum in a string format.
     *
     * @return the string representation of the enum value
     */
    @JsonValue
    public String getValue() {
        return name().toLowerCase().replace('_', '-');
    }

    /**
     * Converts the given {@code Scope} object to its corresponding string representation.
     *
     * @param scope the {@code Scope} object to convert; may be {@code null}
     * @return the string representation of the {@code Scope} object if it is not {@code null},
     *         or {@code null} if the input is {@code null}
     */
    public static String toValue(Scope scope) {
        return scope != null ? scope.getValue() : null;
    }

    /**
     * Converts a string value to a corresponding {@code Scope} instance.
     * If the conversion fails, returns {@code null}.
     *
     * @param value the string value to be parsed as a {@code Scope}
     * @return the corresponding {@code Scope} instance, or {@code null} if the value cannot be parsed
     */
    public static Scope forValue(String value) {
        try {
            return parse(value);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /**
     * Parses the given string value into a {@code Scope} instance.
     *
     * @param value the string representation of the scope to be parsed
     * @return the corresponding {@code Scope} instance
     */
    @JsonCreator
    public static Scope parse(String value) {
        return valueOf(value.toUpperCase().replace('-', '_'));
    }

    /**
     * Converts a given mask to a list of string values corresponding to the basic scopes
     * that match the mask.
     *
     * @param mask the input mask
     * @return a list of string values corresponding to the matching basic scopes
     */
    public static List<String> toValues(long mask) {
        List<String> values = new ArrayList<>();
        for (Scope scope : values()) {
            if (scope.isBasic() && (scope.getMask() & mask) != 0) {
                values.add(scope.getValue());
            }
        }
        return values;
    }

    /**
     * Calculates a scope mask based on the provided collection of string values.
     * The values that do not correspond to a known scope are ignored.
     * Any scope is allowed, basic or non-basic.
     *
     * @param values a collection of string values, possibly representing scopes; if {@code null}, the result is 0
     * @return the combined mask of scopes represented by the provided values
     */
    public static long forValues(Collection<String> values) {
        if (values == null) {
            return 0;
        }

        long mask = 0;
        for (String value : values) {
            Scope scope = forValue(value);
            if (scope == null) {
                continue;
            }
            mask |= scope.getMask();
        }
        return mask;
    }

}
