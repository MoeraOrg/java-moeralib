package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchNodeFilter extends Structure implements Cloneable {

    private String query;
    private String sheriffName;
    private Integer page;
    private Integer limit;

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
     * Retrieves filter out nodes prohibited by the given sheriff.
     *
     * @return the value
     */
    public String getSheriffName() {
        return sheriffName;
    }

    /**
     * Sets filter out nodes prohibited by the given sheriff.
     *
     * @param sheriffName the value to be set
     */
    public void setSheriffName(String sheriffName) {
        this.sheriffName = sheriffName;
    }

    /**
     * Retrieves page number, 0 by default.
     *
     * @return the value
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets page number, 0 by default.
     *
     * @param page the value to be set
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Retrieves page size (maximum number of entries returned), the default is set by the search engine.
     *
     * @return the value
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets page size (maximum number of entries returned), the default is set by the search engine.
     *
     * @param limit the value to be set
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.minValue(page, 0, "page.invalid");
        ValidationUtil.minValue(limit, 0, "limit.invalid");
    }

    /**
     * Creates and returns a copy of this {@code SearchNodeFilter} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchNodeFilter clone() {
        try {
            return (SearchNodeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
