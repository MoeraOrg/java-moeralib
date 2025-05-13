package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchTextPageInfo extends Structure implements Cloneable {

    private int page;
    private int total;
    private List<SearchEntryInfo> entries;

    /**
     * Retrieves number of the page.
     *
     * @return the value
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets number of the page.
     *
     * @param page the value to be set
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * Retrieves total number of pages.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of pages.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Retrieves the entries.
     *
     * @return the value
     */
    public List<SearchEntryInfo> getEntries() {
        return entries;
    }

    /**
     * Sets the entries.
     *
     * @param entries the value to be set
     */
    public void setEntries(List<SearchEntryInfo> entries) {
        this.entries = entries;
    }

    /**
     * Creates and returns a copy of this {@code SearchTextPageInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchTextPageInfo clone() {
        try {
            return (SearchTextPageInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
