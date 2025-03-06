package org.moera.lib.node;

// This file is generated

import java.nio.file.Path;

import com.fasterxml.jackson.core.type.TypeReference;
import org.moera.lib.node.exception.MoeraNodeException;
import org.moera.lib.node.types.*;

public class MoeraNode extends NodeApiClient {

    /**
     * Constructs a new MoeraNode object.
     */
    public MoeraNode() {
    }

    /**
     * Constructs a new MoeraNode object with the specified node URL.
     *
     * @param nodeUrl node URL
     */
    public MoeraNode(String nodeUrl) {
        super(nodeUrl);
    }

    /**
     * Get the list of all reactions performed by the node, filtered by some criteria.
     *
     * @param filter filter
     * @return ActivityReactionInfo[]
     */
    public ActivityReactionInfo[] searchActivityReactions(ActivityReactionFilter filter) throws MoeraNodeException {
        var location = "/activity/reactions/search";
        var returnTypeRef = new TypeReference<ActivityReactionInfo[]>() {};
        return call(location, null, "POST", filter, returnTypeRef);
    }

    /**
     * Get the status of the asynchronous operation that performs verification of a remote posting signature.
     *
     * @param id asynchronous operation ID
     * @return RemotePostingVerificationInfo
     */
    public RemotePostingVerificationInfo getRemotePostingVerificationStatus(String id) throws MoeraNodeException {
        var location = "/async-operations/remote-posting-verification/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<RemotePostingVerificationInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get the status of the asynchronous operation that performs verification of the signature of a reaction to a
     * remote posting.
     *
     * @param id asynchronous operation ID
     * @return RemoteReactionVerificationInfo
     */
    public RemoteReactionVerificationInfo getRemoteReactionVerificationStatus(String id) throws MoeraNodeException {
        var location = "/async-operations/remote-reaction-verification/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<RemoteReactionVerificationInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get the list of avatars in the ascending order of their ordinals.
     *
     * @return AvatarInfo[]
     */
    public AvatarInfo[] getAvatars() throws MoeraNodeException {
        var location = "/avatars";
        var returnTypeRef = new TypeReference<AvatarInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Create a new avatar from a public media file that exists on the node. A new public media file is created for the
     * avatar. If the avatar's ordinal is not provided in the input, the avatar is assigned an ordinal that is greater
     * than ordinals of all existing avatars.
     *
     * @param avatar avatar
     * @return AvatarInfo
     */
    public AvatarInfo createAvatar(AvatarAttributes avatar) throws MoeraNodeException {
        var location = "/avatars";
        var returnTypeRef = new TypeReference<AvatarInfo>() {};
        return call(location, null, "POST", avatar, returnTypeRef);
    }

    /**
     * Get an individual avatar.
     *
     * @param id avatar ID
     * @return AvatarInfo
     */
    public AvatarInfo getAvatar(String id) throws MoeraNodeException {
        var location = "/avatars/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<AvatarInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Delete an avatar.
     *
     * @param id avatar ID
     * @return Result
     */
    public Result deleteAvatar(String id) throws MoeraNodeException {
        var location = "/avatars/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Reorder avatars. Every avatar mentioned in the input is assigned an ordinal in ascending order as they appear in
     * the input. Ordinals of avatars not mentioned in the input are not touched.
     *
     * @param order order
     * @return AvatarOrdinal[]
     */
    public AvatarOrdinal[] reorderAvatars(AvatarsOrdered order) throws MoeraNodeException {
        var location = "/avatars/reorder";
        var returnTypeRef = new TypeReference<AvatarOrdinal[]>() {};
        return call(location, null, "POST", order, returnTypeRef);
    }

    /**
     * Blocks creation of instants of the given story type, related to the given entry, optionally unblocking at the
     * given time in the future.
     *
     * @param instant instant
     * @return BlockedInstantInfo
     */
    public BlockedInstantInfo blockInstant(BlockedInstantAttributes instant) throws MoeraNodeException {
        var location = "/blocked-instants";
        var returnTypeRef = new TypeReference<BlockedInstantInfo>() {};
        return call(location, null, "POST", instant, returnTypeRef);
    }

    /**
     * Get details about the given blocked instant.
     *
     * @param id ID of the blocked instant
     * @return BlockedInstantInfo
     */
    public BlockedInstantInfo getBlockedInstant(String id) throws MoeraNodeException {
        var location = "/blocked-instants/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<BlockedInstantInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Unblock the given instant.
     *
     * @param id ID of the blocked instant
     * @return Result
     */
    public Result unblockInstant(String id) throws MoeraNodeException {
        var location = "/blocked-instants/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Search blocked instants by the given criteria.
     *
     * @param filter filter
     * @return BlockedInstantInfo[]
     */
    public BlockedInstantInfo[] searchBlockedInstants(BlockedInstantFilter filter) throws MoeraNodeException {
        var location = "/blocked-instants/search";
        var returnTypeRef = new TypeReference<BlockedInstantInfo[]>() {};
        return call(location, null, "POST", filter, returnTypeRef);
    }

    /**
     * Blocks the given node from performing the given operations, in a particular posting or globally, optionally
     * unblocking at the given time in the future.
     *
     * @param user user
     * @return BlockedUserInfo
     */
    public BlockedUserInfo blockUser(BlockedUserAttributes user) throws MoeraNodeException {
        var location = "/people/blocked-users";
        var returnTypeRef = new TypeReference<BlockedUserInfo>() {};
        return call(location, null, "POST", user, returnTypeRef);
    }

    /**
     * Get details about the given blocked user.
     *
     * @param id ID of the blocked user
     * @return BlockedUserInfo
     */
    public BlockedUserInfo getBlockedUser(String id) throws MoeraNodeException {
        var location = "/people/blocked-users/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<BlockedUserInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Unblock the given user.
     *
     * @param id ID of the blocked user
     * @return Result
     */
    public Result unblockUser(String id) throws MoeraNodeException {
        var location = "/people/blocked-users/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Search blocked users by the given criteria.
     *
     * @param filter filter
     * @return BlockedUserInfo[]
     */
    public BlockedUserInfo[] searchBlockedUsers(BlockedUserFilter filter) throws MoeraNodeException {
        var location = "/people/blocked-users/search";
        var returnTypeRef = new TypeReference<BlockedUserInfo[]>() {};
        return call(location, null, "POST", filter, returnTypeRef);
    }

    /**
     * Get checksums of the information about the blocked users. This request may be used to quickly detect the changes
     * in the blocked users list to update the cache on the client side.
     *
     * @return BlockedUsersChecksums
     */
    public BlockedUsersChecksums getBlockedUsersChecksums() throws MoeraNodeException {
        var location = "/people/blocked-users/checksums";
        var returnTypeRef = new TypeReference<BlockedUsersChecksums>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get details about the given node that blocked this node.
     *
     * @param id ID of the blocked-by user
     * @return BlockedByUserInfo
     */
    public BlockedByUserInfo getBlockedByUser(String id) throws MoeraNodeException {
        var location = "/people/blocked-by-users/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<BlockedByUserInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Search nodes that blocked this node, by the given criteria.
     *
     * @param filter filter
     * @return BlockedByUserInfo[]
     */
    public BlockedByUserInfo[] searchBlockedByUsers(BlockedByUserFilter filter) throws MoeraNodeException {
        var location = "/people/blocked-by-users/search";
        var returnTypeRef = new TypeReference<BlockedByUserInfo[]>() {};
        return call(location, null, "POST", filter, returnTypeRef);
    }

    /**
     * Create a set of cartes with the given attributes. Cartes in the sequence correspond to successive periods of
     * time.
     *
     * @param attributes attributes
     * @return CarteSet
     */
    public CarteSet createCartes(CarteAttributes attributes) throws MoeraNodeException {
        var location = "/cartes";
        var returnTypeRef = new TypeReference<CarteSet>() {};
        return call(location, null, "POST", attributes, returnTypeRef);
    }

    /**
     * Verify if the given carte may be used for authentication on this node. Additionally, if <code>clientName</code>
     * is provided, it is compared to the carte owner's name.
     *
     * @param clientCarte clientCarte
     * @return CarteVerificationInfo
     */
    public CarteVerificationInfo verifyCarte(ClientCarte clientCarte) throws MoeraNodeException {
        var location = "/cartes/verify";
        var returnTypeRef = new TypeReference<CarteVerificationInfo>() {};
        return call(location, null, "POST", clientCarte, returnTypeRef);
    }

    /**
     * Get a slice of the list of comments, delimited by <code>before</code> or <code>after</code> moments (but not
     * both) and the given <code>limit</code>. If neither <code>before</code> nor <code>after</code> are provided, the
     * latest comments are returned. The node may decide to return fewer comments than the given <code>limit</code>.
     * The stories are always sorted by moment, ascending.
     *
     * @param postingId ID of the posting
     * @param after filter comments posted strongly after this moment
     * @param before filter comments posted at or before this moment
     * @param limit maximum number of comments returned
     * @return CommentsSliceInfo
     */
    public CommentsSliceInfo getCommentsSlice(
        String postingId, Long after, Long before, Integer limit
    ) throws MoeraNodeException {
        var location = "/postings/%s/comments".formatted(ue(postingId));
        var params = new QueryParam[] {
            QueryParam.of("after", after), 
            QueryParam.of("before", before), 
            QueryParam.of("limit", limit)
        };
        var returnTypeRef = new TypeReference<CommentsSliceInfo>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Create a comment from the given text and add it to the given posting. The comment owner must authenticate in
     * some way. If the comment is not signed, it will be kept for a limited period of time and then erased. If
     * authenticated as admin, the node signs the comment.
     *
     * @param postingId ID of the posting
     * @param comment comment
     * @return CommentCreated
     */
    public CommentCreated createComment(String postingId, CommentText comment) throws MoeraNodeException {
        var location = "/postings/%s/comments".formatted(ue(postingId));
        var returnTypeRef = new TypeReference<CommentCreated>() {};
        return call(location, null, "POST", comment, returnTypeRef);
    }

    /**
     * Get an individual comment.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @param withSource include source text of the comment
     * @return CommentInfo
     */
    public CommentInfo getComment(
        String postingId, String commentId, boolean withSource
    ) throws MoeraNodeException {
        var include = commaSeparatedFlags(QueryParam.of("source", withSource));
        var location = "/postings/%s/comments/%s".formatted(ue(postingId), ue(commentId));
        var params = new QueryParam[] {
            QueryParam.of("include", include)
        };
        var returnTypeRef = new TypeReference<CommentInfo>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Update operation overrides for all comments in the posting.
     *
     * @param postingId ID of the posting
     * @param attributes attributes
     * @return Result
     */
    public Result updateAllComments(String postingId, CommentMassAttributes attributes) throws MoeraNodeException {
        var location = "/postings/%s/comments".formatted(ue(postingId));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "PUT", attributes, returnTypeRef);
    }

    /**
     * Update the comment, creating a new revision of it. The text is processed just like in the <code>POST</code>
     * request.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @param comment comment
     * @return CommentInfo
     */
    public CommentInfo updateComment(
        String postingId, String commentId, CommentText comment
    ) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s".formatted(ue(postingId), ue(commentId));
        var returnTypeRef = new TypeReference<CommentInfo>() {};
        return call(location, null, "PUT", comment, returnTypeRef);
    }

    /**
     * Delete the comment. The comment may not be purged from the database immediately, but preserved for some period
     * of time to give a chance to restore it.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @return CommentTotalInfo
     */
    public CommentTotalInfo deleteComment(String postingId, String commentId) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s".formatted(ue(postingId), ue(commentId));
        var returnTypeRef = new TypeReference<CommentTotalInfo>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Get all postings linked to media attached to the given comment.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @return PostingInfo[]
     */
    public PostingInfo[] getPostingsAttachedToComment(
        String postingId, String commentId
    ) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s/attached".formatted(ue(postingId), ue(commentId));
        var returnTypeRef = new TypeReference<PostingInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get all revisions of the comment.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @return CommentRevisionInfo[]
     */
    public CommentRevisionInfo[] getCommentRevisions(String postingId, String commentId) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s/revisions".formatted(ue(postingId), ue(commentId));
        var returnTypeRef = new TypeReference<CommentRevisionInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get an individual revision of the comment.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @param id ID of the revision
     * @return CommentRevisionInfo
     */
    public CommentRevisionInfo getCommentRevision(
        String postingId, String commentId, String id
    ) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s/revisions/%s".formatted(ue(postingId), ue(commentId), ue(id));
        var returnTypeRef = new TypeReference<CommentRevisionInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Add a reaction to the given comment. The reaction owner must authenticate in some way. Only one reaction is
     * allowed from each owner to a particular comment. If a reaction from the same owner to this comment already
     * exists, it is overwritten. If the reaction is not signed, the reaction will be kept for a limited period of time
     * and then erased (the previous reaction of the same owner will be restored, if any).
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @param reaction reaction
     * @return ReactionCreated
     */
    public ReactionCreated createCommentReaction(
        String postingId, String commentId, ReactionDescription reaction
    ) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s/reactions".formatted(ue(postingId), ue(commentId));
        var returnTypeRef = new TypeReference<ReactionCreated>() {};
        return call(location, null, "POST", reaction, returnTypeRef);
    }

    /**
     * Update the reaction's operations or set operations' overrides.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @param ownerName reaction owner node name
     * @param reaction reaction
     * @return ReactionInfo
     */
    public ReactionInfo updateCommentReaction(
        String postingId, String commentId, String ownerName, ReactionOverride reaction
    ) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s/reactions/%s".formatted(ue(postingId), ue(commentId), ue(ownerName));
        var returnTypeRef = new TypeReference<ReactionInfo>() {};
        return call(location, null, "PUT", reaction, returnTypeRef);
    }

    /**
     * Get a slice of the list of reactions to the given comment, optionally filtered by reaction type, delimited by
     * <code>before</code> moment and the given <code>limit</code>. If <code>before</code> is not provided, the latest
     * reactions are returned. The node may decide to return fewer reactions than the given <code>limit</code>. The
     * reactions are always sorted by moment, descending.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @param negative <code>true</code>, to filter negative reactions, <code>false</code>, to filter positive ones
     * @param emoji filter by reaction code, usually interpreted by clients as emoji code point
     * @param before filter reactions created at or before this moment
     * @param limit maximum number of reactions returned
     * @return ReactionsSliceInfo
     */
    public ReactionsSliceInfo getCommentReactionsSlice(
        String postingId, String commentId, Boolean negative, Integer emoji, Long before, Integer limit
    ) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s/reactions".formatted(ue(postingId), ue(commentId));
        var params = new QueryParam[] {
            QueryParam.of("negative", negative), 
            QueryParam.of("emoji", emoji), 
            QueryParam.of("before", before), 
            QueryParam.of("limit", limit)
        };
        var returnTypeRef = new TypeReference<ReactionsSliceInfo>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Get the detailed information about the reaction of the given owner to the given comment. If no reaction with
     * such an owner exists, an empty structure with just <code>commentId</code> is returned.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @param ownerName reaction owner node name
     * @return ReactionInfo
     */
    public ReactionInfo getCommentReaction(
        String postingId, String commentId, String ownerName
    ) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s/reactions/%s".formatted(ue(postingId), ue(commentId), ue(ownerName));
        var returnTypeRef = new TypeReference<ReactionInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Delete all reactions to the given comment.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @return Result
     */
    public Result deleteAllCommentReactions(String postingId, String commentId) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s/reactions".formatted(ue(postingId), ue(commentId));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Delete the reaction of the given owner to the given comment.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @param ownerName reaction owner node name
     * @return ReactionTotalsInfo
     */
    public ReactionTotalsInfo deleteCommentReaction(
        String postingId, String commentId, String ownerName
    ) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s/reactions/%s".formatted(ue(postingId), ue(commentId), ue(ownerName));
        var returnTypeRef = new TypeReference<ReactionTotalsInfo>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Get a summary of reactions to the comment given.
     *
     * @param postingId ID of the posting
     * @param commentId ID of the comment
     * @return ReactionTotalsInfo
     */
    public ReactionTotalsInfo getCommentReactionTotals(
        String postingId, String commentId
    ) throws MoeraNodeException {
        var location = "/postings/%s/comments/%s/reaction-totals".formatted(ue(postingId), ue(commentId));
        var returnTypeRef = new TypeReference<ReactionTotalsInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Search for contacts matching the search <code>query</code>. Every space-delimited word in the query must match
     * case-insensitively a beginning of the contact's node name or a beginning of any space-delimited word in the
     * contact's full name. The order of words is not significant. <br><br> The node may decide to return fewer
     * contacts than the given <code>limit</code>. <br><br> The contacts are sorted by their <i>closeness</i> to the
     * node, which is calculated from the number of reactions and comments and their age.
     *
     * @param query the search query
     * @param limit maximum number of contacts returned
     * @return ContactInfo[]
     */
    public ContactInfo[] getContacts(String query, Integer limit) throws MoeraNodeException {
        var location = "/people/contacts";
        var params = new QueryParam[] {
            QueryParam.of("query", query), 
            QueryParam.of("limit", limit)
        };
        var returnTypeRef = new TypeReference<ContactInfo[]>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Check whether the credentials are initialized already.
     *
     * @return CredentialsCreated
     */
    public CredentialsCreated checkCredentials() throws MoeraNodeException {
        var location = "/credentials";
        var returnTypeRef = new TypeReference<CredentialsCreated>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Initialize credentials if they are not set yet. Note that this operation can be executed without authentication,
     * so this should be done as soon as possible after the node installation. Sign in is not allowed until the
     * credentials are set.
     *
     * @param credentials credentials
     * @return Result
     */
    public Result createCredentials(Credentials credentials) throws MoeraNodeException {
        var location = "/credentials";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "POST", credentials, returnTypeRef);
    }

    /**
     * Update credentials. Either old password or credentials reset token should be set in the input for the operation
     * to succeed. Credentials reset token is not related to the authentication token and usually is sent to the user
     * by E-mail.
     *
     * @param credentials credentials
     * @return Result
     */
    public Result updateCredentials(CredentialsChange credentials) throws MoeraNodeException {
        var location = "/credentials";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "PUT", credentials, returnTypeRef);
    }

    /**
     * Delete credentials.
     *
     * @return Result
     */
    public Result deleteCredentials() throws MoeraNodeException {
        var location = "/credentials";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * The node generates credentials reset token that is sent to the node admin by E-mail or using any other way that
     * is defined for recovery of credentials. This token then may be used to change the credentials without knowing
     * the password.
     *
     * @return EmailHint
     */
    public EmailHint resetCredentials() throws MoeraNodeException {
        var location = "/credentials/reset";
        var returnTypeRef = new TypeReference<EmailHint>() {};
        return call(location, null, "POST", null, returnTypeRef);
    }

    /**
     * Get the list of deleted postings, page by page. The node may decide to use a smaller page size than the given
     * <code>limit</code>. The postings are always sorted by the deletion timestamp, descending.
     *
     * @param page page number, 0 by default
     * @param limit page size (maximum number of postings returned), the default is defined by the node
     * @return PostingInfo[]
     */
    public PostingInfo[] getDeletedPostings(Integer page, Integer limit) throws MoeraNodeException {
        var location = "/deleted-postings";
        var params = new QueryParam[] {
            QueryParam.of("page", page), 
            QueryParam.of("limit", limit)
        };
        var returnTypeRef = new TypeReference<PostingInfo[]>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Get an individual deleted posting.
     *
     * @param id ID of the posting
     * @return PostingInfo
     */
    public PostingInfo getDeletedPosting(String id) throws MoeraNodeException {
        var location = "/deleted-postings/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<PostingInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Restore a posting. A new revision is created with the same content as in the latest revision.
     *
     * @param id ID of the posting
     * @return PostingInfo
     */
    public PostingInfo restoreDeletedPosting(String id) throws MoeraNodeException {
        var location = "/deleted-postings/%s/restore".formatted(ue(id));
        var returnTypeRef = new TypeReference<PostingInfo>() {};
        return call(location, null, "POST", null, returnTypeRef);
    }

    /**
     * Get all revisions of the deleted posting, but not more than <code>limit</code>. The node may decide to return
     * fewer revisions than the given <code>limit</code>.
     *
     * @param postingId ID of the posting
     * @param limit maximum number of revisions returned
     * @return PostingRevisionInfo[]
     */
    public PostingRevisionInfo[] getDeletePostingRevisions(
        String postingId, Integer limit
    ) throws MoeraNodeException {
        var location = "/deleted-postings/%s/revisions".formatted(ue(postingId));
        var params = new QueryParam[] {
            QueryParam.of("limit", limit)
        };
        var returnTypeRef = new TypeReference<PostingRevisionInfo[]>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Get an individual revision of the deleted posting.
     *
     * @param postingId ID of the posting
     * @param id ID of the revision
     * @return PostingRevisionInfo
     */
    public PostingRevisionInfo getDeletedPostingRevision(String postingId, String id) throws MoeraNodeException {
        var location = "/deleted-postings/%s/revisions/%s".formatted(ue(postingId), ue(id));
        var returnTypeRef = new TypeReference<PostingRevisionInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Restore a posting at a particular revision. A new revision is created with the same content as in the given
     * revision.
     *
     * @param postingId ID of the posting
     * @param id ID of the revision
     * @return PostingRevisionInfo
     */
    public PostingRevisionInfo restoreDeletedPostingRevision(
        String postingId, String id
    ) throws MoeraNodeException {
        var location = "/postings/%s/revisions/%s/restore".formatted(ue(postingId), ue(id));
        var returnTypeRef = new TypeReference<PostingRevisionInfo>() {};
        return call(location, null, "POST", null, returnTypeRef);
    }

    /**
     * Get the list of registered domains.
     *
     * @return DomainInfo[]
     */
    public DomainInfo[] getDomains() throws MoeraNodeException {
        var location = "/domains";
        var returnTypeRef = new TypeReference<DomainInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get information about the domain with the given hostname. If domain registration for this server is public, this
     * request does not require authentication.
     *
     * @param name domain name
     * @return DomainInfo
     */
    public DomainInfo getDomain(String name) throws MoeraNodeException {
        var location = "/domains/%s".formatted(ue(name));
        var returnTypeRef = new TypeReference<DomainInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Create a new domain with the given hostname. If <code>nodeId</code> is not passed, it is generated
     * automatically. If domain registration for this server is public, this request does not require authentication.
     *
     * @param domain domain
     * @return DomainInfo
     */
    public DomainInfo createDomain(DomainAttributes domain) throws MoeraNodeException {
        var location = "/domains";
        var returnTypeRef = new TypeReference<DomainInfo>() {};
        return call(location, null, "POST", domain, returnTypeRef);
    }

    /**
     * Update the domain with the given hostname. If the new hostname is not passed, the old hostname is preserved.
     * (Note that you cannot pass a new name for the default hostname, because it cannot be renamed and
     * <code>_default_</code> is not a valid hostname. Skip this field if you want to update the default hostname.) If
     * <code>nodeId</code> is not passed, it is generated automatically.
     *
     * @param name domain's hostname
     * @param domain domain
     * @return DomainInfo
     */
    public DomainInfo updateDomain(String name, DomainAttributes domain) throws MoeraNodeException {
        var location = "/domains/%s".formatted(ue(name));
        var returnTypeRef = new TypeReference<DomainInfo>() {};
        return call(location, null, "PUT", domain, returnTypeRef);
    }

    /**
     * Delete the domain with the given hostname. This operation deletes the domain record only, the user's data
     * related to the domain is preserved.
     *
     * @param name domain name
     * @return Result
     */
    public Result deleteDomain(String name) throws MoeraNodeException {
        var location = "/domains/%s".formatted(ue(name));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Get an available domain name recommended for the given node name. The domain name is usually chosen to be close
     * to the node name in English transcription. If domain registration for this server is not public, this request is
     * not accessible.
     *
     * @param nodeName node name
     * @return DomainAvailable
     */
    public DomainAvailable isDomainAvailable(String nodeName) throws MoeraNodeException {
        var location = "/domains/available";
        var params = new QueryParam[] {
            QueryParam.of("nodeName", nodeName)
        };
        var returnTypeRef = new TypeReference<DomainAvailable>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Get the list of drafts, page by page, filtered by the given criteria. The node may decide to use a smaller page
     * size than the given <code>limit</code>. The drafts are always sorted by the creation timestamp, descending.
     *
     * @param draftType type of the drafts
     * @param nodeName name of the node the drafts are related to
     * @param postingId ID of the posting, mandatory for all types, except <code>new-posting</code>
     * @param commentId ID of the comment, mandatory for <code>comment-update</code> type
     * @param page page number, 0 by default
     * @param limit page size (maximum number of postings returned), the default is defined by the node
     * @return DraftInfo[]
     */
    public DraftInfo[] getDrafts(
        DraftType draftType, String nodeName, String postingId, String commentId, Integer page, Integer limit
    ) throws MoeraNodeException {
        var location = "/drafts";
        var params = new QueryParam[] {
            QueryParam.of("draftType", draftType), 
            QueryParam.of("nodeName", nodeName), 
            QueryParam.of("postingId", postingId), 
            QueryParam.of("commentId", commentId), 
            QueryParam.of("page", page), 
            QueryParam.of("limit", limit)
        };
        var returnTypeRef = new TypeReference<DraftInfo[]>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Create a new draft from the text given.
     *
     * @param draft draft
     * @return DraftInfo
     */
    public DraftInfo createDraft(DraftText draft) throws MoeraNodeException {
        var location = "/drafts";
        var returnTypeRef = new TypeReference<DraftInfo>() {};
        return call(location, null, "POST", draft, returnTypeRef);
    }

    /**
     * Get an individual draft.
     *
     * @param id ID of the draft
     * @return DraftInfo
     */
    public DraftInfo getDraft(String id) throws MoeraNodeException {
        var location = "/drafts/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<DraftInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Update the draft.
     *
     * @param id ID of the draft
     * @param draft draft
     * @return DraftInfo
     */
    public DraftInfo updateDraft(String id, DraftText draft) throws MoeraNodeException {
        var location = "/drafts/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<DraftInfo>() {};
        return call(location, null, "PUT", draft, returnTypeRef);
    }

    /**
     * Delete the draft.
     *
     * @param id ID of the draft
     * @return Result
     */
    public Result deleteDraft(String id) throws MoeraNodeException {
        var location = "/drafts/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Get information about features supported by the node.
     *
     * @return Features
     */
    public Features getFeatures() throws MoeraNodeException {
        var location = "/features";
        var returnTypeRef = new TypeReference<Features>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get general information about all feeds accessible by client.
     *
     * @return FeedInfo[]
     */
    public FeedInfo[] getFeeds() throws MoeraNodeException {
        var location = "/feeds";
        var returnTypeRef = new TypeReference<FeedInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get general information about the feed.
     *
     * @param feedName name of the feed
     * @return FeedInfo
     */
    public FeedInfo getFeedGeneral(String feedName) throws MoeraNodeException {
        var location = "/feeds/%s".formatted(ue(feedName));
        var returnTypeRef = new TypeReference<FeedInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get information about the total number and number of non-read and non-viewed stories in the feed.
     *
     * @param feedName name of the feed
     * @return FeedStatus
     */
    public FeedStatus getFeedStatus(String feedName) throws MoeraNodeException {
        var location = "/feeds/%s/status".formatted(ue(feedName));
        var returnTypeRef = new TypeReference<FeedStatus>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Update information about non-read and non-viewed stories in the feed.
     *
     * @param feedName name of the feed
     * @param change change
     * @return FeedStatus
     */
    public FeedStatus updateFeedStatus(String feedName, FeedStatusChange change) throws MoeraNodeException {
        var location = "/feeds/%s/status".formatted(ue(feedName));
        var returnTypeRef = new TypeReference<FeedStatus>() {};
        return call(location, null, "PUT", change, returnTypeRef);
    }

    /**
     * Get a slice of the feed, delimited by <code>before</code> or <code>after</code> moments (but not both) and the
     * given <code>limit</code>. If neither <code>before</code> nor <code>after</code> are provided, the latest stories
     * are returned. The node may decide to return fewer stories than the given <code>limit</code>. The stories are
     * always sorted by moment, descending.
     *
     * @param feedName name of the feed
     * @param after filter stories posted strongly after this moment
     * @param before filter stories posted at or before this moment
     * @param limit maximum number of stories returned
     * @return FeedSliceInfo
     */
    public FeedSliceInfo getFeedSlice(
        String feedName, Long after, Long before, Integer limit
    ) throws MoeraNodeException {
        var location = "/feeds/%s/stories".formatted(ue(feedName));
        var params = new QueryParam[] {
            QueryParam.of("after", after), 
            QueryParam.of("before", before), 
            QueryParam.of("limit", limit)
        };
        var returnTypeRef = new TypeReference<FeedSliceInfo>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Get the list of all groups of friends that exist on the node.
     *
     * @return FriendGroupInfo[]
     */
    public FriendGroupInfo[] getFriendGroups() throws MoeraNodeException {
        var location = "/people/friends/groups";
        var returnTypeRef = new TypeReference<FriendGroupInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get the information about the group of friends.
     *
     * @param id ID of the group of friends
     * @return FriendGroupInfo
     */
    public FriendGroupInfo getFriendGroup(String id) throws MoeraNodeException {
        var location = "/people/friends/groups/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<FriendGroupInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Create a group of friends.
     *
     * @param friendGroup friendGroup
     * @return FriendGroupInfo
     */
    public FriendGroupInfo createFriendGroup(FriendGroupDescription friendGroup) throws MoeraNodeException {
        var location = "/people/friends/groups";
        var returnTypeRef = new TypeReference<FriendGroupInfo>() {};
        return call(location, null, "POST", friendGroup, returnTypeRef);
    }

    /**
     * Update the details of the group of friends.
     *
     * @param id ID of the group of friends
     * @param friendGroup friendGroup
     * @return FriendGroupInfo
     */
    public FriendGroupInfo updateFriendGroup(
        String id, FriendGroupDescription friendGroup
    ) throws MoeraNodeException {
        var location = "/people/friends/groups/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<FriendGroupInfo>() {};
        return call(location, null, "PUT", friendGroup, returnTypeRef);
    }

    /**
     * Delete the group of friends.
     *
     * @param id ID of the group of friends
     * @return Result
     */
    public Result deleteFriendGroup(String id) throws MoeraNodeException {
        var location = "/people/friends/groups/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Get the list of all friends of the node or friends belonging to a particular group.
     *
     * @param groupId ID of a group of friends
     * @return FriendInfo[]
     */
    public FriendInfo[] getFriends(String groupId) throws MoeraNodeException {
        var location = "/people/friends";
        var params = new QueryParam[] {
            QueryParam.of("groupId", groupId)
        };
        var returnTypeRef = new TypeReference<FriendInfo[]>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Get the friendship information for the node given.
     *
     * @param name name of the node
     * @return FriendInfo
     */
    public FriendInfo getFriend(String name) throws MoeraNodeException {
        var location = "/people/friends/%s".formatted(ue(name));
        var returnTypeRef = new TypeReference<FriendInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Update the friendship status of the nodes passed in the input. If some node passed in the input is not a member
     * of some of the groups of friends listed for it, the node is added to them. If it is a member of some groups of
     * friends that are not listed for it, the node is removed from them.
     *
     * @param friends friends
     * @return FriendInfo[]
     */
    public FriendInfo[] updateFriends(FriendDescription[] friends) throws MoeraNodeException {
        var location = "/people/friends";
        var returnTypeRef = new TypeReference<FriendInfo[]>() {};
        return call(location, null, "PUT", friends, returnTypeRef);
    }

    /**
     * Get the list of all nodes that added this node to their friends.
     *
     * @return FriendOfInfo[]
     */
    public FriendOfInfo[] getFriendOfs() throws MoeraNodeException {
        var location = "/people/friend-ofs";
        var returnTypeRef = new TypeReference<FriendOfInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get the information for the node given, whether it has added this node to its friends.
     *
     * @param name name of the node
     * @return FriendOfInfo
     */
    public FriendOfInfo getFriendOf(String name) throws MoeraNodeException {
        var location = "/people/friend-ofs/%s".formatted(ue(name));
        var returnTypeRef = new TypeReference<FriendOfInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get the list of all nodes having administrative permissions on this node.
     *
     * @return GrantInfo[]
     */
    public GrantInfo[] getAllGrants() throws MoeraNodeException {
        var location = "/grants";
        var returnTypeRef = new TypeReference<GrantInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get information about the administrative permissions granted to the node.
     *
     * @param nodeName name of the node
     * @return GrantInfo
     */
    public GrantInfo getGrant(String nodeName) throws MoeraNodeException {
        var location = "/grants/%s".formatted(ue(nodeName));
        var returnTypeRef = new TypeReference<GrantInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Grant a set of administrative permissions to the node or revoke them.
     *
     * @param nodeName name of the node
     * @param change change
     * @return GrantInfo
     */
    public GrantInfo grantOrRevoke(String nodeName, GrantChange change) throws MoeraNodeException {
        var location = "/grants/%s".formatted(ue(nodeName));
        var returnTypeRef = new TypeReference<GrantInfo>() {};
        return call(location, null, "PUT", change, returnTypeRef);
    }

    /**
     * Revoke all administrative permissions granted to the node.
     *
     * @param nodeName name of the node
     * @return Result
     */
    public Result revokeAll(String nodeName) throws MoeraNodeException {
        var location = "/grants/%s".formatted(ue(nodeName));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Upload a new media file owned by the node admin. The content of the file is passed in the request body.
     *
     * @param body body
     * @param contentType content-type of ``body``
     * @return PrivateMediaFileInfo
     */
    public PrivateMediaFileInfo uploadAdminMedia(Path body, String contentType) throws MoeraNodeException {
        var location = "/media/private";
        var returnTypeRef = new TypeReference<PrivateMediaFileInfo>() {};
        return call(location, null, "POST", body, contentType, returnTypeRef);
    }

    /**
     * Upload a new media file owned by the given node. The content of the file is passed in the request body.
     *
     * @param clientName name of the node owning the media file
     * @param body body
     * @param contentType content-type of ``body``
     * @return PrivateMediaFileInfo
     */
    public PrivateMediaFileInfo uploadPrivateMedia(
        String clientName, Path body, String contentType
    ) throws MoeraNodeException {
        var location = "/media/private/%s".formatted(ue(clientName));
        var returnTypeRef = new TypeReference<PrivateMediaFileInfo>() {};
        return call(location, null, "POST", body, contentType, returnTypeRef);
    }

    /**
     * Get media file content (returned in the response body).
     *
     * @param id media file ID
     * @param width preferred width of the media in pixels; if present, the node will try to return the smallest in
     * size, but the best in quality variant of the media, according to the width provided
     * @param download if <code>true</code>, the node will add <code>Content-Disposition: attachment</code> header to
     * the output
     * @param responseConsumer consumer of the data received
     */
    public void getPrivateMedia(
        String id, Integer width, Boolean download, ResponseConsumer responseConsumer
    ) throws MoeraNodeException {
        var location = "/media/private/%s/data".formatted(ue(id));
        var params = new QueryParam[] {
            QueryParam.of("width", width), 
            QueryParam.of("download", download)
        };
        call(location, params, "GET", null, responseConsumer);
    }

    /**
     * Get media file details.
     *
     * @param id media file ID
     * @return PrivateMediaFileInfo
     */
    public PrivateMediaFileInfo getPrivateMediaInfo(String id) throws MoeraNodeException {
        var location = "/media/private/%s/info".formatted(ue(id));
        var returnTypeRef = new TypeReference<PrivateMediaFileInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get the list of all postings and comments the media file is attached to.
     *
     * @param id media file ID
     * @return EntryInfo[]
     */
    public EntryInfo[] getPrivateMediaParentEntry(String id) throws MoeraNodeException {
        var location = "/media/private/%s/parent".formatted(ue(id));
        var returnTypeRef = new TypeReference<EntryInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Upload a new media file. The content of the file is passed in the request body
     *
     * @param body body
     * @param contentType content-type of ``body``
     * @return PublicMediaFileInfo
     */
    public PublicMediaFileInfo uploadPublicMedia(Path body, String contentType) throws MoeraNodeException {
        var location = "/media/public";
        var returnTypeRef = new TypeReference<PublicMediaFileInfo>() {};
        return call(location, null, "POST", body, contentType, returnTypeRef);
    }

    /**
     * Get media file content (returned in the response body).
     *
     * @param id media file ID
     * @param width preferred width of the media in pixels; if present, the node will try to return the smallest in
     * size, but the best in quality variant of the media, according to the width provided
     * @param download if <code>true</code>, the node will add <code>Content-Disposition: attachment</code> header to
     * the output
     * @param responseConsumer consumer of the data received
     */
    public void getPublicMedia(
        String id, Integer width, Boolean download, ResponseConsumer responseConsumer
    ) throws MoeraNodeException {
        var location = "/media/public/%s/data".formatted(ue(id));
        var params = new QueryParam[] {
            QueryParam.of("width", width), 
            QueryParam.of("download", download)
        };
        call(location, params, "GET", null, responseConsumer);
    }

    /**
     * Get media file details.
     *
     * @param id media file ID
     * @return PublicMediaFileInfo
     */
    public PublicMediaFileInfo getPublicMediaInfo(String id) throws MoeraNodeException {
        var location = "/media/public/%s/info".formatted(ue(id));
        var returnTypeRef = new TypeReference<PublicMediaFileInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get the name of the node. Admin user receives the current status of the latest operation with the node name.
     *
     * @return NodeNameInfo
     */
    public NodeNameInfo getNodeName() throws MoeraNodeException {
        var location = "/node-name";
        var returnTypeRef = new TypeReference<NodeNameInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Register a new name for the node. The corresponding signing key is generated automatically and stored at the
     * node. The updating key is generated and returned in the encoded form and in the form of mnemonic (a sequence of
     * English words). The words need to be written down and stored securely to be able to perform further operations
     * with the name.
     *
     * @param nameToRegister nameToRegister
     * @return RegisteredNameSecret
     */
    public RegisteredNameSecret createNodeName(NameToRegister nameToRegister) throws MoeraNodeException {
        var location = "/node-name";
        var returnTypeRef = new TypeReference<RegisteredNameSecret>() {};
        return call(location, null, "POST", nameToRegister, returnTypeRef);
    }

    /**
     * Update the name of the node. May be used to assign an already-registered name to the node (the corresponding
     * signing key is generated automatically and stored at the node), or to prolong the name. The secret or mnemonic
     * of the updating key must be provided for this operation.
     *
     * @param secret secret
     * @return Result
     */
    public Result updateNodeName(RegisteredNameSecret secret) throws MoeraNodeException {
        var location = "/node-name";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "PUT", secret, returnTypeRef);
    }

    /**
     * Delete all the information related to the node name (including the signing key) from the node. The name record
     * on the naming server is not touched.
     *
     * @return Result
     */
    public Result deleteNodeName() throws MoeraNodeException {
        var location = "/node-name";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Get the updating key mnemonic stored on the node.
     *
     * @return KeyMnemonic
     */
    public KeyMnemonic getStoredMnemonic() throws MoeraNodeException {
        var location = "/node-name/mnemonic";
        var returnTypeRef = new TypeReference<KeyMnemonic>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Store the updating key mnemonic on the node.
     *
     * @param mnemonic mnemonic
     * @return Result
     */
    public Result storeMnemonic(KeyMnemonic mnemonic) throws MoeraNodeException {
        var location = "/node-name/mnemonic";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "POST", mnemonic, returnTypeRef);
    }

    /**
     * Delete the updating key mnemonic stored on the node.
     *
     * @return Result
     */
    public Result deleteStoredMnemonic() throws MoeraNodeException {
        var location = "/node-name/mnemonic";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Accept a notification packet from another node. Notification packets older than 10 minutes are ignored. The
     * sending node should update the packet timestamp and the signature and send the packet again. This mechanism
     * prevents attackers from recording and resending old signed packets.
     *
     * @param packet packet
     * @return Result
     */
    public Result sendNotification(NotificationPacket packet) throws MoeraNodeException {
        var location = "/notifications";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "POST", packet, returnTypeRef);
    }

    /**
     * Get general information about other nodes.
     *
     * @return PeopleGeneralInfo
     */
    public PeopleGeneralInfo getPeopleGeneral() throws MoeraNodeException {
        var location = "/people";
        var returnTypeRef = new TypeReference<PeopleGeneralInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Register the plugin. If the plugin authenticates as root admin, the plugin is registered at the server level. If
     * the plugin authenticates as node admin, the plugin is registered at the node level.
     *
     * @param plugin plugin
     * @return PluginInfo
     */
    public PluginInfo registerPlugin(PluginDescription plugin) throws MoeraNodeException {
        var location = "/plugins";
        var returnTypeRef = new TypeReference<PluginInfo>() {};
        return call(location, null, "POST", plugin, returnTypeRef);
    }

    /**
     * Get information about all plugins registered for the node and server.
     *
     * @return PluginInfo[]
     */
    public PluginInfo[] getPlugins() throws MoeraNodeException {
        var location = "/plugins";
        var returnTypeRef = new TypeReference<PluginInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get information about the plugin.
     *
     * @param pluginName name of the plugin
     * @return PluginInfo
     */
    public PluginInfo getPlugin(String pluginName) throws MoeraNodeException {
        var location = "/plugins/%s".formatted(ue(pluginName));
        var returnTypeRef = new TypeReference<PluginInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Unregister the plugin.
     *
     * @param pluginName name of the plugin
     * @return Result
     */
    public Result unregisterPlugin(String pluginName) throws MoeraNodeException {
        var location = "/plugins/%s".formatted(ue(pluginName));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Create a new posting from the text given and publish it in the given feeds (if any). The heading and the preview
     * of the posting are created automatically, if needed. The posting owner must authenticate in some way. If the
     * posting is not signed, it will be kept for a limited period of time and then erased. If authenticated as admin,
     * the node signs the posting.
     *
     * @param posting posting
     * @return PostingInfo
     */
    public PostingInfo createPosting(PostingText posting) throws MoeraNodeException {
        var location = "/postings";
        var returnTypeRef = new TypeReference<PostingInfo>() {};
        return call(location, null, "POST", posting, returnTypeRef);
    }

    /**
     * Update the posting, creating a new revision of it. The text is processed just like in the <code>POST</code>
     * request.
     *
     * @param id ID of the posting
     * @param posting posting
     * @return PostingInfo
     */
    public PostingInfo updatePosting(String id, PostingText posting) throws MoeraNodeException {
        var location = "/postings/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<PostingInfo>() {};
        return call(location, null, "PUT", posting, returnTypeRef);
    }

    /**
     * Get an individual posting.
     *
     * @param id ID of the posting
     * @param withSource include source text of the posting
     * @return PostingInfo
     */
    public PostingInfo getPosting(String id, boolean withSource) throws MoeraNodeException {
        var include = commaSeparatedFlags(QueryParam.of("source", withSource));
        var location = "/postings/%s".formatted(ue(id));
        var params = new QueryParam[] {
            QueryParam.of("include", include)
        };
        var returnTypeRef = new TypeReference<PostingInfo>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Delete the posting. The posting may not be purged from the database immediately, but preserved for some period
     * of time to give a chance to restore it.
     *
     * @param id ID of the posting
     * @return Result
     */
    public Result deletePosting(String id) throws MoeraNodeException {
        var location = "/postings/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Get all postings linked to media attached to the given posting.
     *
     * @param id ID of the posting
     * @return PostingInfo[]
     */
    public PostingInfo[] getPostingsAttachedToPosting(String id) throws MoeraNodeException {
        var location = "/postings/%s/attached".formatted(ue(id));
        var returnTypeRef = new TypeReference<PostingInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get all revisions of the posting, but not more than <code>limit</code>. The node may decide to return fewer
     * revisions than the given <code>limit</code>.
     *
     * @param postingId ID of the posting
     * @param limit maximum number of revisions returned
     * @return PostingRevisionInfo[]
     */
    public PostingRevisionInfo[] getPostingRevisions(String postingId, Integer limit) throws MoeraNodeException {
        var location = "/postings/%s/revisions".formatted(ue(postingId));
        var params = new QueryParam[] {
            QueryParam.of("limit", limit)
        };
        var returnTypeRef = new TypeReference<PostingRevisionInfo[]>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Get an individual revision of the posting.
     *
     * @param postingId ID of the posting
     * @param id ID of the revision
     * @return PostingRevisionInfo
     */
    public PostingRevisionInfo getPostingRevision(String postingId, String id) throws MoeraNodeException {
        var location = "/postings/%s/revisions/%s".formatted(ue(postingId), ue(id));
        var returnTypeRef = new TypeReference<PostingRevisionInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Restore a revision of the posting. A new revision is created with the same content as in the given revision.
     *
     * @param postingId ID of the posting
     * @param id ID of the revision
     * @return PostingRevisionInfo
     */
    public PostingRevisionInfo restorePostingRevision(String postingId, String id) throws MoeraNodeException {
        var location = "/postings/%s/revisions/%s/restore".formatted(ue(postingId), ue(id));
        var returnTypeRef = new TypeReference<PostingRevisionInfo>() {};
        return call(location, null, "POST", null, returnTypeRef);
    }

    /**
     * Add a reaction to the given posting. The reaction owner must authenticate in some way. Only one reaction is
     * allowed from each owner to a particular posting. If a reaction from the same owner to this posting already
     * exists, it is overwritten. If the reaction is not signed, the reaction will be kept for a limited period of time
     * and then erased (the previous reaction of the same owner will be restored, if any).
     *
     * @param postingId ID of the posting
     * @param reaction reaction
     * @return ReactionCreated
     */
    public ReactionCreated createPostingReaction(
        String postingId, ReactionDescription reaction
    ) throws MoeraNodeException {
        var location = "/postings/%s/reactions".formatted(ue(postingId));
        var returnTypeRef = new TypeReference<ReactionCreated>() {};
        return call(location, null, "POST", reaction, returnTypeRef);
    }

    /**
     * Get a slice of the list of reactions to the given posting, optionally filtered by reaction type, delimited by
     * <code>before</code> moment and the given <code>limit</code>. If <code>before</code> is not provided, the latest
     * reactions are returned. The node may decide to return fewer reactions than the given <code>limit</code>. The
     * reactions are always sorted by moment, descending.
     *
     * @param postingId ID of the posting
     * @param negative <code>true</code>, to filter negative reactions, <code>false</code>, to filter positive ones
     * @param emoji filter by reaction code, usually interpreted by clients as emoji code point
     * @param before filter reactions created at or before this moment
     * @param limit maximum number of reactions returned
     * @return ReactionsSliceInfo
     */
    public ReactionsSliceInfo getPostingReactionsSlice(
        String postingId, Boolean negative, Integer emoji, Long before, Integer limit
    ) throws MoeraNodeException {
        var location = "/postings/%s/reactions".formatted(ue(postingId));
        var params = new QueryParam[] {
            QueryParam.of("negative", negative), 
            QueryParam.of("emoji", emoji), 
            QueryParam.of("before", before), 
            QueryParam.of("limit", limit)
        };
        var returnTypeRef = new TypeReference<ReactionsSliceInfo>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Update the reaction's operations or set operations' overrides.
     *
     * @param postingId ID of the posting
     * @param ownerName reaction owner node name
     * @param reaction reaction
     * @return ReactionInfo
     */
    public ReactionInfo updatePostingReaction(
        String postingId, String ownerName, ReactionOverride reaction
    ) throws MoeraNodeException {
        var location = "/postings/%s/reactions/%s".formatted(ue(postingId), ue(ownerName));
        var returnTypeRef = new TypeReference<ReactionInfo>() {};
        return call(location, null, "PUT", reaction, returnTypeRef);
    }

    /**
     * Get the detailed information about the reaction of the given owner to the given posting. If no reaction with
     * such an owner exists, an empty structure with just <code>postingId</code> is returned.
     *
     * @param postingId ID of the posting
     * @param ownerName reaction owner node name
     * @return ReactionInfo
     */
    public ReactionInfo getPostingReaction(String postingId, String ownerName) throws MoeraNodeException {
        var location = "/postings/%s/reactions/%s".formatted(ue(postingId), ue(ownerName));
        var returnTypeRef = new TypeReference<ReactionInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Delete all reactions to the given posting.
     *
     * @param postingId ID of the posting
     * @return Result
     */
    public Result deleteAllPostingReactions(String postingId) throws MoeraNodeException {
        var location = "/postings/%s/reactions".formatted(ue(postingId));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Delete the reaction of the given owner to the given posting.
     *
     * @param postingId ID of the posting
     * @param ownerName reaction owner node name
     * @return ReactionTotalsInfo
     */
    public ReactionTotalsInfo deletePostingReaction(String postingId, String ownerName) throws MoeraNodeException {
        var location = "/postings/%s/reactions/%s".formatted(ue(postingId), ue(ownerName));
        var returnTypeRef = new TypeReference<ReactionTotalsInfo>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Search reactions by criteria provided. Both reaction owner and at least one posting ID should be provided to
     * search, otherwise an empty list is returned.
     *
     * @param filter filter
     * @return ReactionInfo[]
     */
    public ReactionInfo[] searchPostingReactions(ReactionsFilter filter) throws MoeraNodeException {
        var location = "/postings/reactions/search";
        var returnTypeRef = new TypeReference<ReactionInfo[]>() {};
        return call(location, null, "POST", filter, returnTypeRef);
    }

    /**
     * Get a summary of reactions to the posting given.
     *
     * @param postingId ID of the posting
     * @return ReactionTotalsInfo
     */
    public ReactionTotalsInfo getPostingReactionTotals(String postingId) throws MoeraNodeException {
        var location = "/postings/%s/reaction-totals".formatted(ue(postingId));
        var returnTypeRef = new TypeReference<ReactionTotalsInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Search summaries of reactions by criteria provided. At least one posting ID should be provided to search,
     * otherwise an empty list is returned.
     *
     * @param filter filter
     * @return ReactionTotalsInfo[]
     */
    public ReactionTotalsInfo[] searchPostingReactionTotals(ReactionTotalsFilter filter) throws MoeraNodeException {
        var location = "/postings/reaction-totals/search";
        var returnTypeRef = new TypeReference<ReactionTotalsInfo[]>() {};
        return call(location, null, "POST", filter, returnTypeRef);
    }

    /**
     * Get the profile.
     *
     * @param withSource include source text of the bio
     * @return ProfileInfo
     */
    public ProfileInfo getProfile(boolean withSource) throws MoeraNodeException {
        var include = commaSeparatedFlags(QueryParam.of("source", withSource));
        var location = "/profile";
        var params = new QueryParam[] {
            QueryParam.of("include", include)
        };
        var returnTypeRef = new TypeReference<ProfileInfo>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Update the profile. Fields that are not set in the request body are left intact. Fields that are set to an empty
     * value are reset to their defaults.
     *
     * @param profile profile
     * @return ProfileInfo
     */
    public ProfileInfo updateProfile(ProfileAttributes profile) throws MoeraNodeException {
        var location = "/profile";
        var returnTypeRef = new TypeReference<ProfileInfo>() {};
        return call(location, null, "PUT", profile, returnTypeRef);
    }

    /**
     * Get the current status of the request to delete the node.
     *
     * @return DeleteNodeStatus
     */
    public DeleteNodeStatus getDeleteNodeRequestStatus() throws MoeraNodeException {
        var location = "/provider/delete-node";
        var returnTypeRef = new TypeReference<DeleteNodeStatus>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Send a request to the provider to delete the node.
     *
     * @param deleteNodeText deleteNodeText
     * @return DeleteNodeStatus
     */
    public DeleteNodeStatus sendDeleteNodeRequest(DeleteNodeText deleteNodeText) throws MoeraNodeException {
        var location = "/provider/delete-node";
        var returnTypeRef = new TypeReference<DeleteNodeStatus>() {};
        return call(location, null, "POST", deleteNodeText, returnTypeRef);
    }

    /**
     * Cancel the request to delete the node.
     *
     * @return DeleteNodeStatus
     */
    public DeleteNodeStatus cancelDeleteNodeRequest() throws MoeraNodeException {
        var location = "/provider/delete-node";
        var returnTypeRef = new TypeReference<DeleteNodeStatus>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Open the URL passed in the parameters and pass to the client the media file returned by the server.
     *
     * @param url url
     * @param responseConsumer consumer of the data received
     */
    public void proxyMedia(String url, ResponseConsumer responseConsumer) throws MoeraNodeException {
        var location = "/proxy/media";
        var params = new QueryParam[] {
            QueryParam.of("url", url)
        };
        call(location, params, "GET", null, responseConsumer);
    }

    /**
     * Parse the page located at the URL and return the title, the description and the picture that may be used to
     * build a preview of the page.
     *
     * @param url url
     * @return LinkPreviewInfo
     */
    public LinkPreviewInfo proxyLinkPreview(String url) throws MoeraNodeException {
        var location = "/proxy/link-preview";
        var params = new QueryParam[] {
            QueryParam.of("url", url)
        };
        var returnTypeRef = new TypeReference<LinkPreviewInfo>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Register a client at the push relay server to receive messages from this node. The operation is synchronous.
     *
     * @param attributes attributes
     * @return Result
     */
    public Result registerAtPushRelay(PushRelayClientAttributes attributes) throws MoeraNodeException {
        var location = "/push-relay";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "POST", attributes, returnTypeRef);
    }

    /**
     * Send a request to the remote node.
     *
     * @param nodeName name of the remote node
     * @param details details
     * @return Result
     */
    public Result askRemoteNode(String nodeName, AskDescription details) throws MoeraNodeException {
        var location = "/nodes/%s/ask".formatted(ue(nodeName));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "POST", details, returnTypeRef);
    }

    /**
     * Add a comment to the posting on the remote node and register it in the registry at the local node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @param comment comment
     * @return Result
     */
    public Result createRemoteComment(
        String nodeName, String postingId, CommentSourceText comment
    ) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/comments".formatted(ue(nodeName), ue(postingId));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "POST", comment, returnTypeRef);
    }

    /**
     * Update a comment to the posting on the remote node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @param commentId ID of the comment on the remote node
     * @param comment comment
     * @return Result
     */
    public Result updateRemoteComment(
        String nodeName, String postingId, String commentId, CommentSourceText comment
    ) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/comments/%s".formatted(ue(nodeName), ue(postingId), ue(commentId));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "PUT", comment, returnTypeRef);
    }

    /**
     * Delete a comment from the registry of all comments at the local node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @param commentId ID of the comment on the remote node
     * @return Result
     */
    public Result deleteRemoteComment(
        String nodeName, String postingId, String commentId
    ) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/comments/%s".formatted(ue(nodeName), ue(postingId), ue(commentId));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Verify the signature of the given comment to the posting on the remote node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @param commentId ID of the comment on the remote node
     * @return AsyncOperationCreated
     */
    public AsyncOperationCreated verifyRemoteComment(
        String nodeName, String postingId, String commentId
    ) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/comments/%s/verify".formatted(ue(nodeName), ue(postingId), ue(commentId));
        var returnTypeRef = new TypeReference<AsyncOperationCreated>() {};
        return call(location, null, "POST", null, returnTypeRef);
    }

    /**
     * Add a reaction to the comment on the remote node and register it in the registry at the local node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @param commentId ID of the comment on the remote node
     * @param reaction reaction
     * @return Result
     */
    public Result createRemoteCommentReaction(
        String nodeName, String postingId, String commentId, ReactionAttributes reaction
    ) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/comments/%s/reactions".formatted(
            ue(nodeName), ue(postingId), ue(commentId)
        );
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "POST", reaction, returnTypeRef);
    }

    /**
     * Delete a reaction from the registry of all reactions at the local node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @param commentId ID of the comment on the remote node
     * @return Result
     */
    public Result deleteRemoteCommentReaction(
        String nodeName, String postingId, String commentId
    ) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/comments/%s/reactions".formatted(
            ue(nodeName), ue(postingId), ue(commentId)
        );
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Verify the signature of the reaction of the given owner to the comment on the remote node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @param commentId ID of the comment on the remote node
     * @param ownerName reaction owner node name
     * @return AsyncOperationCreated
     */
    public AsyncOperationCreated verifyRemoteCommentReaction(
        String nodeName, String postingId, String commentId, String ownerName
    ) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/comments/%s/reactions/%s/verify".formatted(
            ue(nodeName), ue(postingId), ue(commentId), ue(ownerName)
        );
        var returnTypeRef = new TypeReference<AsyncOperationCreated>() {};
        return call(location, null, "POST", null, returnTypeRef);
    }

    /**
     * Add a posting to the remote node and register it in the registry at the local node.
     *
     * @param nodeName name of the remote node
     * @param posting posting
     * @return Result
     */
    public Result createRemotePosting(String nodeName, PostingSourceText posting) throws MoeraNodeException {
        var location = "/nodes/%s/postings".formatted(ue(nodeName));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "POST", posting, returnTypeRef);
    }

    /**
     * Update a posting on the remote node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @param posting posting
     * @return Result
     */
    public Result updateRemotePosting(
        String nodeName, String postingId, PostingSourceText posting
    ) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s".formatted(ue(nodeName), ue(postingId));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "PUT", posting, returnTypeRef);
    }

    /**
     * Delete a posting from the registry of all remote postings at the local node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @return Result
     */
    public Result deleteRemotePosting(String nodeName, String postingId) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s".formatted(ue(nodeName), ue(postingId));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Verify the signature of the given posting.
     *
     * @param nodeName name of the remote node
     * @param id ID of the posting on the remote node
     * @return AsyncOperationCreated
     */
    public AsyncOperationCreated verifyRemotePosting(String nodeName, String id) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/verify".formatted(ue(nodeName), ue(id));
        var returnTypeRef = new TypeReference<AsyncOperationCreated>() {};
        return call(location, null, "POST", null, returnTypeRef);
    }

    /**
     * Verify the signature of the given revision of a posting.
     *
     * @param nodeName name of the remote node
     * @param id ID of the posting on the remote node
     * @param revisionId ID of the posting revision
     * @return AsyncOperationCreated
     */
    public AsyncOperationCreated verifyRemotePostingRevision(
        String nodeName, String id, String revisionId
    ) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/revisions/%s/verify".formatted(ue(nodeName), ue(id), ue(revisionId));
        var returnTypeRef = new TypeReference<AsyncOperationCreated>() {};
        return call(location, null, "POST", null, returnTypeRef);
    }

    /**
     * Add a reaction to the posting on the remote node and register it in the registry at the local node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @param reaction reaction
     * @return Result
     */
    public Result createRemotePostingReaction(
        String nodeName, String postingId, ReactionAttributes reaction
    ) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/reactions".formatted(ue(nodeName), ue(postingId));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "POST", reaction, returnTypeRef);
    }

    /**
     * Delete a reaction from the registry of all reactions at the local node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @return Result
     */
    public Result deleteRemotePostingReaction(String nodeName, String postingId) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/reactions".formatted(ue(nodeName), ue(postingId));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Verify the signature of the reaction of the given owner to the posting on the remote node.
     *
     * @param nodeName name of the remote node
     * @param postingId ID of the posting on the remote node
     * @param ownerName reaction owner node name
     * @return AsyncOperationCreated
     */
    public AsyncOperationCreated verifyRemotePostingReaction(
        String nodeName, String postingId, String ownerName
    ) throws MoeraNodeException {
        var location = "/nodes/%s/postings/%s/reactions/%s/verify".formatted(
            ue(nodeName), ue(postingId), ue(ownerName)
        );
        var returnTypeRef = new TypeReference<AsyncOperationCreated>() {};
        return call(location, null, "POST", null, returnTypeRef);
    }

    /**
     * Sign and send the order to the remote node and store it in the registry at the local node.
     *
     * @param nodeName name of the remote node
     * @param sheriffOrder sheriffOrder
     * @return Result
     */
    public Result createRemoteSheriffOrder(
        String nodeName, SheriffOrderAttributes sheriffOrder
    ) throws MoeraNodeException {
        var location = "/nodes/%s/sheriff/orders".formatted(ue(nodeName));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "POST", sheriffOrder, returnTypeRef);
    }

    /**
     * Get the details of the given sheriff's order
     *
     * @param nodeName name of the remote node
     * @param id ID of the order
     * @return SheriffOrderInfo
     */
    public SheriffOrderInfo getRemoteSheriffOrder(String nodeName, String id) throws MoeraNodeException {
        var location = "/nodes/%s/sheriff/orders/%s".formatted(ue(nodeName), ue(id));
        var returnTypeRef = new TypeReference<SheriffOrderInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Update the given settings. If the input contains node settings, they are validated and the first validation
     * error is returned, if any. The update is always performed as a whole - if there is an error saving any one of
     * the settings in the input, none of them are updated. <br><br> If one of the settings to be updated is
     * privileged, <i>root secret</i> authentication is required. If one of the settings to be updated is
     * non-privileged, <i>admin</i> authentication is required.
     *
     * @param settings settings
     * @return Result
     */
    public Result updateSettings(SettingInfo[] settings) throws MoeraNodeException {
        var location = "/settings";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "PUT", settings, returnTypeRef);
    }

    /**
     * Get all client settings, sorted by name.
     *
     * @param prefix filter settings whose names start with the given prefix, case-sensitive (<code>client.</code>
     * prefix must be included)
     * @return SettingInfo[]
     */
    public SettingInfo[] getClientSettings(String prefix) throws MoeraNodeException {
        var location = "/settings/client";
        var params = new QueryParam[] {
            QueryParam.of("prefix", prefix)
        };
        var returnTypeRef = new TypeReference<SettingInfo[]>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Get all node settings, sorted by name. If a setting has not changed its value from the default, it is omitted.
     *
     * @param prefix filter settings whose names start with the given prefix, case-sensitive
     * @return SettingInfo[]
     */
    public SettingInfo[] getNodeSettings(String prefix) throws MoeraNodeException {
        var location = "/settings/node";
        var params = new QueryParam[] {
            QueryParam.of("prefix", prefix)
        };
        var returnTypeRef = new TypeReference<SettingInfo[]>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Get all node settings metadata, sorted by name.
     *
     * @param prefix filter settings whose names start with the given prefix, case-sensitive
     * @return SettingMetaInfo[]
     */
    public SettingMetaInfo[] getNodeSettingsMetadata(String prefix) throws MoeraNodeException {
        var location = "/settings/node/metadata";
        var params = new QueryParam[] {
            QueryParam.of("prefix", prefix)
        };
        var returnTypeRef = new TypeReference<SettingMetaInfo[]>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Update node settings metadata, overriding built-in defaults.
     *
     * @param metadata metadata
     * @return Result
     */
    public Result updateNodeSettingsMetadata(SettingMetaAttributes[] metadata) throws MoeraNodeException {
        var location = "/settings/node/metadata";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "PUT", metadata, returnTypeRef);
    }

    /**
     * Get a slice of the list of groups of complaints, optionally filtered by status, delimited by the
     * <code>before</code> or <code>after</code> moment and the given <code>limit</code>. If neither
     * <code>before</code> nor <code>after</code> are provided, the latest groups are returned. The node may decide to
     * return fewer groups than the given <code>limit</code>. The groups are always sorted by moment, descending.
     *
     * @param after filter groups created strongly after this moment
     * @param before filter groups created at or before this moment
     * @param limit maximum number of groups returned
     * @param status filter groups by status
     * @return SheriffComplaintGroupsSliceInfo
     */
    public SheriffComplaintGroupsSliceInfo getSheriffComplaintGroupsSlice(
        Long after, Long before, Integer limit, SheriffComplaintStatus status
    ) throws MoeraNodeException {
        var location = "/sheriff/complaints/groups";
        var params = new QueryParam[] {
            QueryParam.of("after", after), 
            QueryParam.of("before", before), 
            QueryParam.of("limit", limit), 
            QueryParam.of("status", status)
        };
        var returnTypeRef = new TypeReference<SheriffComplaintGroupsSliceInfo>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Get details of the given group of complaints.
     *
     * @param id ID of the group of complaints
     * @return SheriffComplaintGroupInfo
     */
    public SheriffComplaintGroupInfo getSheriffComplaintGroup(String id) throws MoeraNodeException {
        var location = "/sheriff/complaints/groups/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<SheriffComplaintGroupInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get complaints included in the given group of complaints.
     *
     * @param id ID of the group of complaints
     * @return SheriffComplaintInfo[]
     */
    public SheriffComplaintInfo[] getSheriffComplaintsByGroup(String id) throws MoeraNodeException {
        var location = "/sheriff/complaints/groups/%s/complaints".formatted(ue(id));
        var returnTypeRef = new TypeReference<SheriffComplaintInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Make a decision on the given group of complaints.
     *
     * @param id ID of the group of complaints
     * @param decision decision
     * @return SheriffComplaintGroupInfo
     */
    public SheriffComplaintGroupInfo updateSheriffComplaintGroup(
        String id, SheriffComplaintDecisionText decision
    ) throws MoeraNodeException {
        var location = "/sheriff/complaints/groups/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<SheriffComplaintGroupInfo>() {};
        return call(location, null, "PUT", decision, returnTypeRef);
    }

    /**
     * Send a complaint to the sheriff.
     *
     * @param complaint complaint
     * @return SheriffComplaintInfo
     */
    public SheriffComplaintInfo createSheriffComplaint(SheriffComplaintText complaint) throws MoeraNodeException {
        var location = "/sheriff/complaints";
        var returnTypeRef = new TypeReference<SheriffComplaintInfo>() {};
        return call(location, null, "POST", complaint, returnTypeRef);
    }

    /**
     * Receive and execute the sheriff's order.
     *
     * @param sheriffOrder sheriffOrder
     * @return Result
     */
    public Result createSheriffOrder(SheriffOrderDetails sheriffOrder) throws MoeraNodeException {
        var location = "/sheriff/orders";
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "POST", sheriffOrder, returnTypeRef);
    }

    /**
     * Get an individual story.
     *
     * @param id ID of the story
     * @return StoryInfo
     */
    public StoryInfo getStory(String id) throws MoeraNodeException {
        var location = "/stories/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<StoryInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Update the story.
     *
     * @param id ID of the story
     * @param story story
     * @return StoryInfo
     */
    public StoryInfo updateStory(String id, StoryAttributes story) throws MoeraNodeException {
        var location = "/stories/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<StoryInfo>() {};
        return call(location, null, "PUT", story, returnTypeRef);
    }

    /**
     * Delete the story.
     *
     * @param id ID of the story
     * @return Result
     */
    public Result deleteStory(String id) throws MoeraNodeException {
        var location = "/stories/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Get the list of all subscribers, optionally filtered by some criteria.
     *
     * @param nodeName filter by subscribed node name
     * @param type filter by subscription type
     * @param feedName filter by name of the feed subscribed to
     * @param entryId filter by ID of the entry subscribed to
     * @return SubscriberInfo[]
     */
    public SubscriberInfo[] getSubscribers(
        String nodeName, SubscriptionType type, String feedName, String entryId
    ) throws MoeraNodeException {
        var location = "/people/subscribers";
        var params = new QueryParam[] {
            QueryParam.of("nodeName", nodeName), 
            QueryParam.of("type", type), 
            QueryParam.of("feedName", feedName), 
            QueryParam.of("entryId", entryId)
        };
        var returnTypeRef = new TypeReference<SubscriberInfo[]>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Subscribe to a particular group of notifications.
     *
     * @param subscriber subscriber
     * @return SubscriberInfo
     */
    public SubscriberInfo createSubscriber(SubscriberDescription subscriber) throws MoeraNodeException {
        var location = "/people/subscribers";
        var returnTypeRef = new TypeReference<SubscriberInfo>() {};
        return call(location, null, "POST", subscriber, returnTypeRef);
    }

    /**
     * Get an individual subscriber.
     *
     * @param id ID of the subscriber
     * @return SubscriberInfo
     */
    public SubscriberInfo getSubscriber(String id) throws MoeraNodeException {
        var location = "/people/subscribers/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<SubscriberInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Update the subscriber's operations or set operations' overrides.
     *
     * @param id ID of the subscriber
     * @param subscriber subscriber
     * @return SubscriberInfo
     */
    public SubscriberInfo updateSubscriber(String id, SubscriberOverride subscriber) throws MoeraNodeException {
        var location = "/people/subscribers/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<SubscriberInfo>() {};
        return call(location, null, "PUT", subscriber, returnTypeRef);
    }

    /**
     * Delete the subscriber and return the updated information about the node that was subscribed.
     *
     * @param id ID of the subscriber
     * @return ContactInfo
     */
    public ContactInfo deleteSubscriber(String id) throws MoeraNodeException {
        var location = "/people/subscribers/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<ContactInfo>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Get the list of all subscriptions, optionally filtered by some criteria.
     *
     * @param nodeName filter by node name
     * @param type filter by subscription type
     * @return SubscriptionInfo[]
     */
    public SubscriptionInfo[] getSubscriptions(String nodeName, SubscriptionType type) throws MoeraNodeException {
        var location = "/people/subscriptions";
        var params = new QueryParam[] {
            QueryParam.of("nodeName", nodeName), 
            QueryParam.of("type", type)
        };
        var returnTypeRef = new TypeReference<SubscriptionInfo[]>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Register a subscription to notifications from a particular node.
     *
     * @param subscription subscription
     * @return SubscriptionInfo
     */
    public SubscriptionInfo createSubscription(SubscriptionDescription subscription) throws MoeraNodeException {
        var location = "/people/subscriptions";
        var returnTypeRef = new TypeReference<SubscriptionInfo>() {};
        return call(location, null, "POST", subscription, returnTypeRef);
    }

    /**
     * Update the subscription's operations or set operations' overrides.
     *
     * @param id ID of the subscription
     * @param subscription subscription
     * @return SubscriptionInfo
     */
    public SubscriptionInfo updateSubscription(
        String id, SubscriptionOverride subscription
    ) throws MoeraNodeException {
        var location = "/people/subscriptions/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<SubscriptionInfo>() {};
        return call(location, null, "PUT", subscription, returnTypeRef);
    }

    /**
     * Delete the subscription and return the updated information about the node that was subscribed to.
     *
     * @param id ID of the subscription
     * @return ContactInfo
     */
    public ContactInfo deleteSubscription(String id) throws MoeraNodeException {
        var location = "/people/subscriptions/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<ContactInfo>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Search for subscriptions by the given criteria.
     *
     * @param filter filter
     * @return SubscriptionInfo[]
     */
    public SubscriptionInfo[] searchSubscriptions(SubscriptionFilter filter) throws MoeraNodeException {
        var location = "/people/subscriptions/search";
        var returnTypeRef = new TypeReference<SubscriptionInfo[]>() {};
        return call(location, null, "POST", filter, returnTypeRef);
    }

    /**
     * Get the list of all existing tokens.
     *
     * @return TokenInfo[]
     */
    public TokenInfo[] getTokens() throws MoeraNodeException {
        var location = "/tokens";
        var returnTypeRef = new TypeReference<TokenInfo[]>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Sign in and create a token.
     *
     * @param token token
     * @return TokenInfo
     */
    public TokenInfo createToken(TokenAttributes token) throws MoeraNodeException {
        var location = "/tokens";
        var returnTypeRef = new TypeReference<TokenInfo>() {};
        return call(location, null, "POST", token, returnTypeRef);
    }

    /**
     * Get information about the token.
     *
     * @param id ID of the token
     * @return TokenInfo
     */
    public TokenInfo getTokenInfo(String id) throws MoeraNodeException {
        var location = "/tokens/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<TokenInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Update the name or permissions of the token. It is not possible to grant token additional permissions with this
     * request, but the granted permissions can be revoked.
     *
     * @param id ID of the token
     * @param update update
     * @return TokenInfo
     */
    public TokenInfo updateToken(String id, TokenUpdate update) throws MoeraNodeException {
        var location = "/tokens/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<TokenInfo>() {};
        return call(location, null, "PUT", update, returnTypeRef);
    }

    /**
     * Delete the token.
     *
     * @param id ID of the token
     * @return Result
     */
    public Result deleteToken(String id) throws MoeraNodeException {
        var location = "/tokens/%s".formatted(ue(id));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Get the general information about the user list given.
     *
     * @param name the name of the list
     * @return UserListInfo
     */
    public UserListInfo getUserListGeneral(String name) throws MoeraNodeException {
        var location = "/user-lists/%s".formatted(ue(name));
        var returnTypeRef = new TypeReference<UserListInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Get a slice of the user list, delimited by the <code>before</code> or <code>after</code> moment and the given
     * <code>limit</code>. If neither <code>before</code> nor <code>after</code> are provided, the latest items are
     * returned. The node may decide to return fewer items than the given <code>limit</code>. The items are always
     * sorted by moment, descending.
     *
     * @param name the name of the list
     * @param after filter items created strongly after this moment
     * @param before filter items created at or before this moment
     * @param limit maximum number of items returned
     * @return UserListSliceInfo
     */
    public UserListSliceInfo getUserListSlice(
        String name, Long after, Long before, Integer limit
    ) throws MoeraNodeException {
        var location = "/user-lists/%s/items".formatted(ue(name));
        var params = new QueryParam[] {
            QueryParam.of("after", after), 
            QueryParam.of("before", before), 
            QueryParam.of("limit", limit)
        };
        var returnTypeRef = new TypeReference<UserListSliceInfo>() {};
        return call(location, params, "GET", null, returnTypeRef);
    }

    /**
     * Get the information from the user list about the node given.
     *
     * @param name the name of the list
     * @param nodeName the node name to get information about
     * @return UserListItemInfo
     */
    public UserListItemInfo getUserListItem(String name, String nodeName) throws MoeraNodeException {
        var location = "/user-lists/%s/items/%s".formatted(ue(name), ue(nodeName));
        var returnTypeRef = new TypeReference<UserListItemInfo>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

    /**
     * Add a node to the user list.
     *
     * @param name the name of the list
     * @param item item
     * @return UserListItemInfo
     */
    public UserListItemInfo createUserListItem(String name, UserListItemAttributes item) throws MoeraNodeException {
        var location = "/user-lists/%s/items".formatted(ue(name));
        var returnTypeRef = new TypeReference<UserListItemInfo>() {};
        return call(location, null, "POST", item, returnTypeRef);
    }

    /**
     * Delete a node from the user list
     *
     * @param name the name of the list
     * @param nodeName the node name to delete
     * @return Result
     */
    public Result deleteUserListItem(String name, String nodeName) throws MoeraNodeException {
        var location = "/user-lists/%s/items/%s".formatted(ue(name), ue(nodeName));
        var returnTypeRef = new TypeReference<Result>() {};
        return call(location, null, "DELETE", null, returnTypeRef);
    }

    /**
     * Get brief information about the node.
     *
     * @return WhoAmI
     */
    public WhoAmI whoAmI() throws MoeraNodeException {
        var location = "/whoami";
        var returnTypeRef = new TypeReference<WhoAmI>() {};
        return call(location, null, "GET", null, returnTypeRef);
    }

}
