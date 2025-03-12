package org.moera.lib.pushrelay;

/**
 * The {@code PushRelayError} class defines a set of constants that represent error codes
 * related to the Push Relay API operations.
 */
public class PushRelayError {

    /**
     * Error code indicating that the client ID is empty.
     */
    public static final int CLIENT_ID_EMPTY = 1;

    /**
     * Error code indicating that the client ID provided is too long.
     */
    public static final int CLIENT_ID_TOO_LONG = 2;

    /**
     * Error code indicating that the node name provided is empty.
     */
    public static final int NODE_NAME_EMPTY = 3;

    /**
     * Error code indicating that the specified node name is not recognized.
     */
    public static final int NODE_NAME_UNKNOWN = 4;

    /**
     * Error code indicating that the provided language code exceeds the allowable length.
     */
    public static final int LANG_TOO_LONG = 5;

    /**
     * Error code indicating that the node has no clients (the node should stop sending messages for them).
     */
    public static final int NO_CLIENTS = 6;

    /**
     * Error code indicating that the story content is empty.
     */
    public static final int STORY_EMPTY = 7;

    /**
     * Error code indicating that the provided story is invalid.
     */
    public static final int STORY_INVALID = 8;

    /**
     * Error code indicating that the story type is unknown.
     */
    public static final int STORY_TYPE_UNKNOWN = 9;

    /**
     * Error code indicating that the story ID is missing or empty.
     */
    public static final int STORY_ID_EMPTY = 10;

    /**
     * Error code indicating that the signature timestamp field is empty in the request.
     */
    public static final int SIGNED_AT_EMPTY = 11;

    /**
     * Error code indicating that the provided signature timestamp is too old.
     */
    public static final int SIGNED_AT_TOO_OLD = 12;

    /**
     * Error code indicating that the provided signature is empty.
     */
    public static final int SIGNATURE_EMPTY = 13;

    /**
     * Error code indicating that the provided signature is incorrect.
     */
    public static final int SIGNATURE_INCORRECT = 14;

}
