package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingOperations implements Cloneable {

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

    public Principal getView(Principal defaultValue) {
        return view != null ? view : defaultValue;
    }

    public static Principal getView(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getView(defaultValue) : defaultValue;
    }

    public void setView(Principal view) {
        this.view = view;
    }

    public void setView(Principal view, Principal defaultValue) {
        this.view = Objects.equals(view, defaultValue) ? null : view;
    }

    public Principal getEdit() {
        return edit;
    }

    public Principal getEdit(Principal defaultValue) {
        return edit != null ? edit : defaultValue;
    }

    public static Principal getEdit(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getEdit(defaultValue) : defaultValue;
    }

    public void setEdit(Principal edit) {
        this.edit = edit;
    }

    public void setEdit(Principal edit, Principal defaultValue) {
        this.edit = Objects.equals(edit, defaultValue) ? null : edit;
    }

    public Principal getDelete() {
        return delete;
    }

    public Principal getDelete(Principal defaultValue) {
        return delete != null ? delete : defaultValue;
    }

    public static Principal getDelete(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getDelete(defaultValue) : defaultValue;
    }

    public void setDelete(Principal delete) {
        this.delete = delete;
    }

    public void setDelete(Principal delete, Principal defaultValue) {
        this.delete = Objects.equals(delete, defaultValue) ? null : delete;
    }

    public Principal getViewComments() {
        return viewComments;
    }

    public Principal getViewComments(Principal defaultValue) {
        return viewComments != null ? viewComments : defaultValue;
    }

    public static Principal getViewComments(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewComments(defaultValue) : defaultValue;
    }

    public void setViewComments(Principal viewComments) {
        this.viewComments = viewComments;
    }

    public void setViewComments(Principal viewComments, Principal defaultValue) {
        this.viewComments = Objects.equals(viewComments, defaultValue) ? null : viewComments;
    }

    public Principal getAddComment() {
        return addComment;
    }

    public Principal getAddComment(Principal defaultValue) {
        return addComment != null ? addComment : defaultValue;
    }

    public static Principal getAddComment(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getAddComment(defaultValue) : defaultValue;
    }

    public void setAddComment(Principal addComment) {
        this.addComment = addComment;
    }

    public void setAddComment(Principal addComment, Principal defaultValue) {
        this.addComment = Objects.equals(addComment, defaultValue) ? null : addComment;
    }

    public Principal getOverrideComment() {
        return overrideComment;
    }

    public Principal getOverrideComment(Principal defaultValue) {
        return overrideComment != null ? overrideComment : defaultValue;
    }

    public static Principal getOverrideComment(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getOverrideComment(defaultValue) : defaultValue;
    }

    public void setOverrideComment(Principal overrideComment) {
        this.overrideComment = overrideComment;
    }

    public void setOverrideComment(Principal overrideComment, Principal defaultValue) {
        this.overrideComment = Objects.equals(overrideComment, defaultValue) ? null : overrideComment;
    }

    public Principal getViewReactions() {
        return viewReactions;
    }

    public Principal getViewReactions(Principal defaultValue) {
        return viewReactions != null ? viewReactions : defaultValue;
    }

    public static Principal getViewReactions(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewReactions(defaultValue) : defaultValue;
    }

    public void setViewReactions(Principal viewReactions) {
        this.viewReactions = viewReactions;
    }

    public void setViewReactions(Principal viewReactions, Principal defaultValue) {
        this.viewReactions = Objects.equals(viewReactions, defaultValue) ? null : viewReactions;
    }

    public Principal getViewNegativeReactions() {
        return viewNegativeReactions;
    }

    public Principal getViewNegativeReactions(Principal defaultValue) {
        return viewNegativeReactions != null ? viewNegativeReactions : defaultValue;
    }

    public static Principal getViewNegativeReactions(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewNegativeReactions(defaultValue) : defaultValue;
    }

    public void setViewNegativeReactions(Principal viewNegativeReactions) {
        this.viewNegativeReactions = viewNegativeReactions;
    }

    public void setViewNegativeReactions(Principal viewNegativeReactions, Principal defaultValue) {
        this.viewNegativeReactions =
             Objects.equals(viewNegativeReactions, defaultValue) ? null : viewNegativeReactions;
    }

    public Principal getViewReactionTotals() {
        return viewReactionTotals;
    }

    public Principal getViewReactionTotals(Principal defaultValue) {
        return viewReactionTotals != null ? viewReactionTotals : defaultValue;
    }

    public static Principal getViewReactionTotals(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewReactionTotals(defaultValue) : defaultValue;
    }

    public void setViewReactionTotals(Principal viewReactionTotals) {
        this.viewReactionTotals = viewReactionTotals;
    }

    public void setViewReactionTotals(Principal viewReactionTotals, Principal defaultValue) {
        this.viewReactionTotals = Objects.equals(viewReactionTotals, defaultValue) ? null : viewReactionTotals;
    }

    public Principal getViewNegativeReactionTotals() {
        return viewNegativeReactionTotals;
    }

    public Principal getViewNegativeReactionTotals(Principal defaultValue) {
        return viewNegativeReactionTotals != null ? viewNegativeReactionTotals : defaultValue;
    }

    public static Principal getViewNegativeReactionTotals(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewNegativeReactionTotals(defaultValue) : defaultValue;
    }

    public void setViewNegativeReactionTotals(Principal viewNegativeReactionTotals) {
        this.viewNegativeReactionTotals = viewNegativeReactionTotals;
    }

    public void setViewNegativeReactionTotals(Principal viewNegativeReactionTotals, Principal defaultValue) {
        this.viewNegativeReactionTotals =
             Objects.equals(viewNegativeReactionTotals, defaultValue) ? null : viewNegativeReactionTotals;
    }

    public Principal getViewReactionRatios() {
        return viewReactionRatios;
    }

    public Principal getViewReactionRatios(Principal defaultValue) {
        return viewReactionRatios != null ? viewReactionRatios : defaultValue;
    }

    public static Principal getViewReactionRatios(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewReactionRatios(defaultValue) : defaultValue;
    }

    public void setViewReactionRatios(Principal viewReactionRatios) {
        this.viewReactionRatios = viewReactionRatios;
    }

    public void setViewReactionRatios(Principal viewReactionRatios, Principal defaultValue) {
        this.viewReactionRatios = Objects.equals(viewReactionRatios, defaultValue) ? null : viewReactionRatios;
    }

    public Principal getViewNegativeReactionRatios() {
        return viewNegativeReactionRatios;
    }

    public Principal getViewNegativeReactionRatios(Principal defaultValue) {
        return viewNegativeReactionRatios != null ? viewNegativeReactionRatios : defaultValue;
    }

    public static Principal getViewNegativeReactionRatios(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewNegativeReactionRatios(defaultValue) : defaultValue;
    }

    public void setViewNegativeReactionRatios(Principal viewNegativeReactionRatios) {
        this.viewNegativeReactionRatios = viewNegativeReactionRatios;
    }

    public void setViewNegativeReactionRatios(Principal viewNegativeReactionRatios, Principal defaultValue) {
        this.viewNegativeReactionRatios =
             Objects.equals(viewNegativeReactionRatios, defaultValue) ? null : viewNegativeReactionRatios;
    }

    public Principal getAddReaction() {
        return addReaction;
    }

    public Principal getAddReaction(Principal defaultValue) {
        return addReaction != null ? addReaction : defaultValue;
    }

    public static Principal getAddReaction(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getAddReaction(defaultValue) : defaultValue;
    }

    public void setAddReaction(Principal addReaction) {
        this.addReaction = addReaction;
    }

    public void setAddReaction(Principal addReaction, Principal defaultValue) {
        this.addReaction = Objects.equals(addReaction, defaultValue) ? null : addReaction;
    }

    public Principal getAddNegativeReaction() {
        return addNegativeReaction;
    }

    public Principal getAddNegativeReaction(Principal defaultValue) {
        return addNegativeReaction != null ? addNegativeReaction : defaultValue;
    }

    public static Principal getAddNegativeReaction(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getAddNegativeReaction(defaultValue) : defaultValue;
    }

    public void setAddNegativeReaction(Principal addNegativeReaction) {
        this.addNegativeReaction = addNegativeReaction;
    }

    public void setAddNegativeReaction(Principal addNegativeReaction, Principal defaultValue) {
        this.addNegativeReaction = Objects.equals(addNegativeReaction, defaultValue) ? null : addNegativeReaction;
    }

    public Principal getOverrideReaction() {
        return overrideReaction;
    }

    public Principal getOverrideReaction(Principal defaultValue) {
        return overrideReaction != null ? overrideReaction : defaultValue;
    }

    public static Principal getOverrideReaction(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getOverrideReaction(defaultValue) : defaultValue;
    }

    public void setOverrideReaction(Principal overrideReaction) {
        this.overrideReaction = overrideReaction;
    }

    public void setOverrideReaction(Principal overrideReaction, Principal defaultValue) {
        this.overrideReaction = Objects.equals(overrideReaction, defaultValue) ? null : overrideReaction;
    }

    public Principal getOverrideCommentReaction() {
        return overrideCommentReaction;
    }

    public Principal getOverrideCommentReaction(Principal defaultValue) {
        return overrideCommentReaction != null ? overrideCommentReaction : defaultValue;
    }

    public static Principal getOverrideCommentReaction(PostingOperations operations, Principal defaultValue) {
        return operations != null ? operations.getOverrideCommentReaction(defaultValue) : defaultValue;
    }

    public void setOverrideCommentReaction(Principal overrideCommentReaction) {
        this.overrideCommentReaction = overrideCommentReaction;
    }

    public void setOverrideCommentReaction(Principal overrideCommentReaction, Principal defaultValue) {
        this.overrideCommentReaction =
             Objects.equals(overrideCommentReaction, defaultValue) ? null : overrideCommentReaction;
    }

    @Override
    public PostingOperations clone() {
        try {
            return (PostingOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
