package org.moera.lib.node.types;

// This file is generated

import java.util.List;
import java.util.function.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarteSet implements Cloneable {

    private String cartesIp;
    private List<CarteInfo> cartes;
    private long createdAt;

    @JsonIgnore
    private Object extra;

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

    public Object getExtra() {
        return extra;
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrCreateExtra(Supplier<T> creator) {
        if (extra == null) {
            extra = creator.get();
        }
        return (T) extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
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
