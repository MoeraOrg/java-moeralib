package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarteSet extends Structure implements Cloneable {

    private String cartesIp;
    private List<CarteInfo> cartes;
    private long createdAt;

    public String getCartesIp() {
        return cartesIp;
    }

    public void setCartesIp(String cartesIp) {
        this.cartesIp = cartesIp;
    }

    public List<CarteInfo> getCartes() {
        return cartes;
    }

    public void setCartes(List<CarteInfo> cartes) {
        this.cartes = cartes;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public CarteSet clone() {
        try {
            return (CarteSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
