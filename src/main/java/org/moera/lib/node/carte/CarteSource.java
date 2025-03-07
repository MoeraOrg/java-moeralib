package org.moera.lib.node.carte;

/**
 * A source of valid cartes that can be used for authentication.
 */
public interface CarteSource {

    /**
     * Retrieves a valid carte for authentication purposes.
     *
     * @return a valid carte as a string
     */
    String getCarte();

}
