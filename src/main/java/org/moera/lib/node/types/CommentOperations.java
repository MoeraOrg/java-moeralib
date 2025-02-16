package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentOperations implements Cloneable {

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
    private Principal overrideReaction;

    public Principal getView() {
        return view;
    }

    public Principal getView(Principal defaultValue) {
        return view != null ? view : defaultValue;
    }

    public static Principal getView(CommentOperations operations, Principal defaultValue) {
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

    public static Principal getEdit(CommentOperations operations, Principal defaultValue) {
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

    public static Principal getDelete(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getDelete(defaultValue) : defaultValue;
    }

    public void setDelete(Principal delete) {
        this.delete = delete;
    }

    public void setDelete(Principal delete, Principal defaultValue) {
        this.delete = Objects.equals(delete, defaultValue) ? null : delete;
    }

    public Principal getViewReactions() {
        return viewReactions;
    }

    public Principal getViewReactions(Principal defaultValue) {
        return viewReactions != null ? viewReactions : defaultValue;
    }

    public static Principal getViewReactions(CommentOperations operations, Principal defaultValue) {
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

    public static Principal getViewNegativeReactions(CommentOperations operations, Principal defaultValue) {
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

    public static Principal getViewReactionTotals(CommentOperations operations, Principal defaultValue) {
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

    public static Principal getViewNegativeReactionTotals(CommentOperations operations, Principal defaultValue) {
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

    public static Principal getViewReactionRatios(CommentOperations operations, Principal defaultValue) {
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

    public static Principal getViewNegativeReactionRatios(CommentOperations operations, Principal defaultValue) {
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

    public static Principal getAddReaction(CommentOperations operations, Principal defaultValue) {
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

    public static Principal getAddNegativeReaction(CommentOperations operations, Principal defaultValue) {
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

    public static Principal getOverrideReaction(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getOverrideReaction(defaultValue) : defaultValue;
    }

    public void setOverrideReaction(Principal overrideReaction) {
        this.overrideReaction = overrideReaction;
    }

    public void setOverrideReaction(Principal overrideReaction, Principal defaultValue) {
        this.overrideReaction = Objects.equals(overrideReaction, defaultValue) ? null : overrideReaction;
    }

    public boolean isEmpty() {
        return view == null
            && edit == null
            && delete == null
            && viewReactions == null
            && viewNegativeReactions == null
            && viewReactionTotals == null
            && viewNegativeReactionTotals == null
            && viewReactionRatios == null
            && viewNegativeReactionRatios == null
            && addReaction == null
            && addNegativeReaction == null
            && overrideReaction == null;
    }

    @Override
    public CommentOperations clone() {
        try {
            return (CommentOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
