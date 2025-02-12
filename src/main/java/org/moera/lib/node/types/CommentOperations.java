package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentOperations {

    private Principal view;
    private Principal edit;
    private Principal delete;
    private Principal viewReactions;
    private Principal viewNegativeReactions;
    private Principal viewReactionTotals;
    private Principal viewNegativeReactionTotals;
    private Principal viewReactionRatios;
    private Principal viewNegativeReactionRatios;
    private Principal addReaction;
    private Principal addNegativeReaction;

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

}
