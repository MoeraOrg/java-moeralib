package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffOrdersSliceInfo extends Structure implements Cloneable {

    private long before;
    private long after;
    private List<SheriffOrderInfo> orders;
    private int total;
    private int totalInPast;
    private int totalInFuture;

    /**
     * Retrieves the slice contains all orders before this moment, inclusive. May be the far future.
     *
     * @return the value
     */
    public long getBefore() {
        return before;
    }

    /**
     * Sets the slice contains all orders before this moment, inclusive. May be the far future.
     *
     * @param before the value to be set
     */
    public void setBefore(long before) {
        this.before = before;
    }

    /**
     * Retrieves the slice contains all orders after this moment, exclusive. May be the far past.
     *
     * @return the value
     */
    public long getAfter() {
        return after;
    }

    /**
     * Sets the slice contains all orders after this moment, exclusive. May be the far past.
     *
     * @param after the value to be set
     */
    public void setAfter(long after) {
        this.after = after;
    }

    /**
     * Retrieves the orders.
     *
     * @return the value
     */
    public List<SheriffOrderInfo> getOrders() {
        return orders;
    }

    /**
     * Sets the orders.
     *
     * @param orders the value to be set
     */
    public void setOrders(List<SheriffOrderInfo> orders) {
        this.orders = orders;
    }

    /**
     * Retrieves total number of orders.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of orders.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Retrieves number of orders before this slice till the far past.
     *
     * @return the value
     */
    public int getTotalInPast() {
        return totalInPast;
    }

    /**
     * Sets number of orders before this slice till the far past.
     *
     * @param totalInPast the value to be set
     */
    public void setTotalInPast(int totalInPast) {
        this.totalInPast = totalInPast;
    }

    /**
     * Retrieves number of orders after this slice till the far future.
     *
     * @return the value
     */
    public int getTotalInFuture() {
        return totalInFuture;
    }

    /**
     * Sets number of orders after this slice till the far future.
     *
     * @param totalInFuture the value to be set
     */
    public void setTotalInFuture(int totalInFuture) {
        this.totalInFuture = totalInFuture;
    }

    /**
     * Creates and returns a copy of this {@code SheriffOrdersSliceInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SheriffOrdersSliceInfo clone() {
        try {
            return (SheriffOrdersSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
