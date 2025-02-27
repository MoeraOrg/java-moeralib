package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.SearchEngine;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchEngineClickedNotification extends Notification {

    private SearchEngine searchEngine;
    private String postingId;
    private String commentId;
    private String mediaId;
    private String heading;
    private long clickedAt;

    public SearchEngineClickedNotification() {
        super(NotificationType.SEARCH_ENGINE_CLICKED);
    }

    public SearchEngine getSearchEngine() {
        return searchEngine;
    }

    public void setSearchEngine(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public long getClickedAt() {
        return clickedAt;
    }

    public void setClickedAt(long clickedAt) {
        this.clickedAt = clickedAt;
    }

}
