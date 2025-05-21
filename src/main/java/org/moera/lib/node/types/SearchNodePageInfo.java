package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchNodePageInfo extends Structure implements Cloneable {

    private int page;
    private int total;
    private List<SearchNodeInfo> nodes;

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
     * Retrieves total number of nodes found (this number may be approximate).
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of nodes found (this number may be approximate).
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Retrieves the nodes.
     *
     * @return the value
     */
    public List<SearchNodeInfo> getNodes() {
        return nodes;
    }

    /**
     * Sets the nodes.
     *
     * @param nodes the value to be set
     */
    public void setNodes(List<SearchNodeInfo> nodes) {
        this.nodes = nodes;
    }

    /**
     * Creates and returns a copy of this {@code SearchNodePageInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchNodePageInfo clone() {
        try {
            return (SearchNodePageInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
