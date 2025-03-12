package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarteSet extends Structure implements Cloneable {

    private String cartesIp;
    private List<CarteInfo> cartes;
    private long createdAt;

    /**
     * Retrieves the client IP address the cartes are bound to.
     *
     * @return the value
     */
    public String getCartesIp() {
        return cartesIp;
    }

    /**
     * Sets the client IP address the cartes are bound to.
     *
     * @param cartesIp the value to be set
     */
    public void setCartesIp(String cartesIp) {
        this.cartesIp = cartesIp;
    }

    /**
     * Retrieves the cartes.
     *
     * @return the value
     */
    public List<CarteInfo> getCartes() {
        return cartes;
    }

    /**
     * Sets the cartes.
     *
     * @param cartes the value to be set
     */
    public void setCartes(List<CarteInfo> cartes) {
        this.cartes = cartes;
    }

    /**
     * Retrieves cartes creation timestamp.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets cartes creation timestamp.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Creates and returns a copy of this {@code CarteSet} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CarteSet clone() {
        try {
            return (CarteSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
