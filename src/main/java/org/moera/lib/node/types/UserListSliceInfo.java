package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserListSliceInfo extends Structure implements Cloneable {

    private String listName;
    private long before;
    private long after;
    private List<UserListItemInfo> items;
    private int total;
    private int totalInPast;
    private int totalInFuture;

    /**
     * Retrieves the name of the list.
     *
     * @return the value
     */
    public String getListName() {
        return listName;
    }

    /**
     * Sets the name of the list.
     *
     * @param listName the value to be set
     */
    public void setListName(String listName) {
        this.listName = listName;
    }

    /**
     * Retrieves the slice contains all items before this moment, inclusive. May be the far future.
     *
     * @return the value
     */
    public long getBefore() {
        return before;
    }

    /**
     * Sets the slice contains all items before this moment, inclusive. May be the far future.
     *
     * @param before the value to be set
     */
    public void setBefore(long before) {
        this.before = before;
    }

    /**
     * Retrieves the slice contains all items after this moment, exclusive. May be the far past.
     *
     * @return the value
     */
    public long getAfter() {
        return after;
    }

    /**
     * Sets the slice contains all items after this moment, exclusive. May be the far past.
     *
     * @param after the value to be set
     */
    public void setAfter(long after) {
        this.after = after;
    }

    /**
     * Retrieves the items.
     *
     * @return the value
     */
    public List<UserListItemInfo> getItems() {
        return items;
    }

    /**
     * Sets the items.
     *
     * @param items the value to be set
     */
    public void setItems(List<UserListItemInfo> items) {
        this.items = items;
    }

    /**
     * Retrieves total number of items.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of items.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Retrieves number of items before this slice till the far past.
     *
     * @return the value
     */
    public int getTotalInPast() {
        return totalInPast;
    }

    /**
     * Sets number of items before this slice till the far past.
     *
     * @param totalInPast the value to be set
     */
    public void setTotalInPast(int totalInPast) {
        this.totalInPast = totalInPast;
    }

    /**
     * Retrieves number of items after this slice till the far future.
     *
     * @return the value
     */
    public int getTotalInFuture() {
        return totalInFuture;
    }

    /**
     * Sets number of items after this slice till the far future.
     *
     * @param totalInFuture the value to be set
     */
    public void setTotalInFuture(int totalInFuture) {
        this.totalInFuture = totalInFuture;
    }

    /**
     * Creates and returns a copy of this {@code UserListSliceInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public UserListSliceInfo clone() {
        try {
            return (UserListSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
