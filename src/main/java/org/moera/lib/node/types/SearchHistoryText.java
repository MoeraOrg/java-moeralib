package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchHistoryText extends Structure implements Cloneable {

    private String query;

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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(query, "search-history.query.blank");
        ValidationUtil.maxSize(query, 1024, "search-history.query.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code SearchHistoryText} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchHistoryText clone() {
        try {
            return (SearchHistoryText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
