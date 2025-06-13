package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchHistoryInfo extends Structure implements Cloneable {

    private String query;
    private long createdAt;

    /**
     * Retrieves the search query.
     *
     * @return the value
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the search query.
     *
     * @param query the value to be set
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Retrieves creation timestamp of the record in the search history.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets creation timestamp of the record in the search history.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Creates and returns a copy of this {@code SearchHistoryInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchHistoryInfo clone() {
        try {
            return (SearchHistoryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
