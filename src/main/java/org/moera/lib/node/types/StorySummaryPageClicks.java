package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorySummaryPageClicks extends Structure implements Cloneable {

    private String heading;
    private String href;
    private int clicks;

    /**
     * Retrieves page heading, <code>null</code> for the blog itself.
     *
     * @return the value
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets page heading, <code>null</code> for the blog itself.
     *
     * @param heading the value to be set
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * Retrieves page URL.
     *
     * @return the value
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets page URL.
     *
     * @param href the value to be set
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Retrieves number of clicks on the page.
     *
     * @return the value
     */
    public int getClicks() {
        return clicks;
    }

    /**
     * Sets number of clicks on the page.
     *
     * @param clicks the value to be set
     */
    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    /**
     * Creates and returns a copy of this {@code StorySummaryPageClicks} object.
     *
     * @return a clone of this instance
     */
    @Override
    public StorySummaryPageClicks clone() {
        try {
            return (StorySummaryPageClicks) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
