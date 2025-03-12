package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.SearchEngine;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * The receiver's posting/comment/media has been visited on the sending node from a search engine.
 */
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

    /**
     * Retrieves the search engine.
     *
     * @return the value
     */
    public SearchEngine getSearchEngine() {
        return searchEngine;
    }

    /**
     * Sets the search engine.
     *
     * @param searchEngine the value to be set
     */
    public void setSearchEngine(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Retrieves ID of the posting on the sending node.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting on the sending node.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the comment on the sending node.
     *
     * @return the value
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets ID of the comment on the sending node.
     *
     * @param commentId the value to be set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * Retrieves ID of the media on the sending node.
     *
     * @return the value
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets ID of the media on the sending node.
     *
     * @param mediaId the value to be set
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * Retrieves heading of the posting/comment/media.
     *
     * @return the value
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets heading of the posting/comment/media.
     *
     * @param heading the value to be set
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * Retrieves the real time when the posting/comment/media was visited.
     *
     * @return the value
     */
    public long getClickedAt() {
        return clickedAt;
    }

    /**
     * Sets the real time when the posting/comment/media was visited.
     *
     * @param clickedAt the value to be set
     */
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
