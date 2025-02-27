package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.SearchEngine;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

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

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(searchEngine, "search.search-engine.missing");
        ValidationUtil.maxSize(postingId, 40, "search.posting-id.wrong-size");
        ValidationUtil.maxSize(commentId, 40, "search.comment-id.wrong-size");
        ValidationUtil.maxSize(mediaId, 40, "search.media-id.wrong-size");
        ValidationUtil.notBlank(heading, "search.heading.empty");
        ValidationUtil.maxSize(heading, 255, "search.heading.wrong-size");
        ValidationUtil.notNull(clickedAt, "search.clicked-at.missing");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("searchEngine", LogUtil.format(searchEngine.toString())));
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("commentId", LogUtil.format(commentId)));
        parameters.add(LogPair.of("mediaId", LogUtil.format(mediaId)));
        parameters.add(LogPair.of("heading", LogUtil.format(heading)));
    }

}
