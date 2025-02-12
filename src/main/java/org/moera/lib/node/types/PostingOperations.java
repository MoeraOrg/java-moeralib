package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingOperations {

    private Principal view;
    private Principal edit;
    private Principal delete;
    private Principal viewComments;
    private Principal addComment;
    private Principal overrideComment;
    private Principal viewReactions;
    private Principal viewNegativeReactions;
    private Principal viewReactionTotals;
    private Principal viewNegativeReactionTotals;
    private Principal viewReactionRatios;
    private Principal viewNegativeReactionRatios;
    private Principal addReaction;
    private Principal addNegativeReaction;
    private Principal overrideReaction;
    private Principal overrideCommentReaction;

    public Principal getView() {
        return view;
    }

    public void setView(Principal view) {
        this.view = view;
    }

    public Principal getEdit() {
        return edit;
    }

    public void setEdit(Principal edit) {
        this.edit = edit;
    }

    public Principal getDelete() {
        return delete;
    }

    public void setDelete(Principal delete) {
        this.delete = delete;
    }

    public Principal getViewComments() {
        return viewComments;
    }

    public void setViewComments(Principal viewComments) {
        this.viewComments = viewComments;
    }

    public Principal getAddComment() {
        return addComment;
    }

    public void setAddComment(Principal addComment) {
        this.addComment = addComment;
    }

    public Principal getOverrideComment() {
        return overrideComment;
    }

    public void setOverrideComment(Principal overrideComment) {
        this.overrideComment = overrideComment;
    }

    public Principal getViewReactions() {
        return viewReactions;
    }

    public void setViewReactions(Principal viewReactions) {
        this.viewReactions = viewReactions;
    }

    public Principal getViewNegativeReactions() {
        return viewNegativeReactions;
    }

    public void setViewNegativeReactions(Principal viewNegativeReactions) {
        this.viewNegativeReactions = viewNegativeReactions;
    }

    public Principal getViewReactionTotals() {
        return viewReactionTotals;
    }

    public void setViewReactionTotals(Principal viewReactionTotals) {
        this.viewReactionTotals = viewReactionTotals;
    }

    public Principal getViewNegativeReactionTotals() {
        return viewNegativeReactionTotals;
    }

    public void setViewNegativeReactionTotals(Principal viewNegativeReactionTotals) {
        this.viewNegativeReactionTotals = viewNegativeReactionTotals;
    }

    public Principal getViewReactionRatios() {
        return viewReactionRatios;
    }

    public void setViewReactionRatios(Principal viewReactionRatios) {
        this.viewReactionRatios = viewReactionRatios;
    }

    public Principal getViewNegativeReactionRatios() {
        return viewNegativeReactionRatios;
    }

    public void setViewNegativeReactionRatios(Principal viewNegativeReactionRatios) {
        this.viewNegativeReactionRatios = viewNegativeReactionRatios;
    }

    public Principal getAddReaction() {
        return addReaction;
    }

    public void setAddReaction(Principal addReaction) {
        this.addReaction = addReaction;
    }

    public Principal getAddNegativeReaction() {
        return addNegativeReaction;
    }

    public void setAddNegativeReaction(Principal addNegativeReaction) {
        this.addNegativeReaction = addNegativeReaction;
    }

    public Principal getOverrideReaction() {
        return overrideReaction;
    }

    public void setOverrideReaction(Principal overrideReaction) {
        this.overrideReaction = overrideReaction;
    }

    public Principal getOverrideCommentReaction() {
        return overrideCommentReaction;
    }

    public void setOverrideCommentReaction(Principal overrideCommentReaction) {
        this.overrideCommentReaction = overrideCommentReaction;
    }

}
