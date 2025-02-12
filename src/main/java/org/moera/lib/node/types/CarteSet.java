package org.moera.lib.node.types;

// This file is generated

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarteSet {

    private String cartesIp;
    private List<CarteInfo> cartes;
    private Timestamp createdAt;

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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

}
