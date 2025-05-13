package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchHashtagSliceInfo extends Structure implements Cloneable {

    private long before;
    private long after;
    private List<SearchEntryInfo> entries;

    /**
     * Retrieves the slice contains all entries before this moment, inclusive. May be the far future.
     *
     * @return the value
     */
    public long getBefore() {
        return before;
    }

    /**
     * Sets the slice contains all entries before this moment, inclusive. May be the far future.
     *
     * @param before the value to be set
     */
    public void setBefore(long before) {
        this.before = before;
    }

    /**
     * Retrieves the slice contains all entries after this moment, exclusive. May be the far past.
     *
     * @return the value
     */
    public long getAfter() {
        return after;
    }

    /**
     * Sets the slice contains all entries after this moment, exclusive. May be the far past.
     *
     * @param after the value to be set
     */
    public void setAfter(long after) {
        this.after = after;
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
     * Creates and returns a copy of this {@code SearchHashtagSliceInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchHashtagSliceInfo clone() {
        try {
            return (SearchHashtagSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
