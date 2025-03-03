package org.moera.lib.node;

/**
 * Authentication type.
 */
public enum NodeAuth {

    /**
     * No authentication.
     */
    NONE,

    /**
     * Carte authentication.
     */
    PEER,

    /**
     * Admin token authentication.
     */
    ADMIN,

     /**
      * Root admin secret authentication.
      */
    ROOT_ADMIN

}
