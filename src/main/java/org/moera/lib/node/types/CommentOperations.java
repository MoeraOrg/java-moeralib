package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    /**
     * Retrieves the permission to view the comment.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getView() {
        return view;
    }

    /**
     * Retrieves the permission to view the comment,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getView(Principal defaultValue) {
        return view != null ? view : defaultValue;
    }

    /**
     * Retrieves the permission to view the comment,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getView(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getView(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the comment.
     * If set to {@code null}, the default permission should be used.
     *
     * @param view the permission to set, may be {@code null}
     */
    public void setView(Principal view) {
        this.view = view;
    }

    /**
     * Sets the permission to view the comment.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param view the permission to set
     * @param defaultValue the default permission
     */
    public void setView(Principal view, Principal defaultValue) {
        this.view = Objects.equals(view, defaultValue) ? null : view;
    }

    /**
     * Retrieves the permission to edit the comment.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getEdit() {
        return edit;
    }

    /**
     * Retrieves the permission to edit the comment,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getEdit(Principal defaultValue) {
        return edit != null ? edit : defaultValue;
    }

    /**
     * Retrieves the permission to edit the comment,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getEdit(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getEdit(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to edit the comment.
     * If set to {@code null}, the default permission should be used.
     *
     * @param edit the permission to set, may be {@code null}
     */
    public void setEdit(Principal edit) {
        this.edit = edit;
    }

    /**
     * Sets the permission to edit the comment.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param edit the permission to set
     * @param defaultValue the default permission
     */
    public void setEdit(Principal edit, Principal defaultValue) {
        this.edit = Objects.equals(edit, defaultValue) ? null : edit;
    }

    /**
     * Retrieves the permission to delete the comment.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getDelete() {
        return delete;
    }

    /**
     * Retrieves the permission to delete the comment,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getDelete(Principal defaultValue) {
        return delete != null ? delete : defaultValue;
    }

    /**
     * Retrieves the permission to delete the comment,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getDelete(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getDelete(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to delete the comment.
     * If set to {@code null}, the default permission should be used.
     *
     * @param delete the permission to set, may be {@code null}
     */
    public void setDelete(Principal delete) {
        this.delete = delete;
    }

    /**
     * Sets the permission to delete the comment.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param delete the permission to set
     * @param defaultValue the default permission
     */
    public void setDelete(Principal delete, Principal defaultValue) {
        this.delete = Objects.equals(delete, defaultValue) ? null : delete;
    }

    /**
     * Retrieves the permission to view the comment's reactions.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewReactions() {
        return viewReactions;
    }

    /**
     * Retrieves the permission to view the comment's reactions,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewReactions(Principal defaultValue) {
        return viewReactions != null ? viewReactions : defaultValue;
    }

    /**
     * Retrieves the permission to view the comment's reactions,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewReactions(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewReactions(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the comment's reactions.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewReactions the permission to set, may be {@code null}
     */
    public void setViewReactions(Principal viewReactions) {
        this.viewReactions = viewReactions;
    }

    /**
     * Sets the permission to view the comment's reactions.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewReactions the permission to set
     * @param defaultValue the default permission
     */
    public void setViewReactions(Principal viewReactions, Principal defaultValue) {
        this.viewReactions = Objects.equals(viewReactions, defaultValue) ? null : viewReactions;
    }

    /**
     * Retrieves the permission to view the comment's negative reactions.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewNegativeReactions() {
        return viewNegativeReactions;
    }

    /**
     * Retrieves the permission to view the comment's negative reactions,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewNegativeReactions(Principal defaultValue) {
        return viewNegativeReactions != null ? viewNegativeReactions : defaultValue;
    }

    /**
     * Retrieves the permission to view the comment's negative reactions,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewNegativeReactions(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewNegativeReactions(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the comment's negative reactions.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewNegativeReactions the permission to set, may be {@code null}
     */
    public void setViewNegativeReactions(Principal viewNegativeReactions) {
        this.viewNegativeReactions = viewNegativeReactions;
    }

    /**
     * Sets the permission to view the comment's negative reactions.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewNegativeReactions the permission to set
     * @param defaultValue the default permission
     */
    public void setViewNegativeReactions(Principal viewNegativeReactions, Principal defaultValue) {
        this.viewNegativeReactions =
             Objects.equals(viewNegativeReactions, defaultValue) ? null : viewNegativeReactions;
    }

    /**
     * Retrieves the permission to view the number of the comment's reactions.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewReactionTotals() {
        return viewReactionTotals;
    }

    /**
     * Retrieves the permission to view the number of the comment's reactions,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewReactionTotals(Principal defaultValue) {
        return viewReactionTotals != null ? viewReactionTotals : defaultValue;
    }

    /**
     * Retrieves the permission to view the number of the comment's reactions,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewReactionTotals(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewReactionTotals(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the number of the comment's reactions.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewReactionTotals the permission to set, may be {@code null}
     */
    public void setViewReactionTotals(Principal viewReactionTotals) {
        this.viewReactionTotals = viewReactionTotals;
    }

    /**
     * Sets the permission to view the number of the comment's reactions.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewReactionTotals the permission to set
     * @param defaultValue the default permission
     */
    public void setViewReactionTotals(Principal viewReactionTotals, Principal defaultValue) {
        this.viewReactionTotals = Objects.equals(viewReactionTotals, defaultValue) ? null : viewReactionTotals;
    }

    /**
     * Retrieves the permission to view the number of the comment's negative reactions.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewNegativeReactionTotals() {
        return viewNegativeReactionTotals;
    }

    /**
     * Retrieves the permission to view the number of the comment's negative reactions,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewNegativeReactionTotals(Principal defaultValue) {
        return viewNegativeReactionTotals != null ? viewNegativeReactionTotals : defaultValue;
    }

    /**
     * Retrieves the permission to view the number of the comment's negative reactions,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewNegativeReactionTotals(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewNegativeReactionTotals(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the number of the comment's negative reactions.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewNegativeReactionTotals the permission to set, may be {@code null}
     */
    public void setViewNegativeReactionTotals(Principal viewNegativeReactionTotals) {
        this.viewNegativeReactionTotals = viewNegativeReactionTotals;
    }

    /**
     * Sets the permission to view the number of the comment's negative reactions.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewNegativeReactionTotals the permission to set
     * @param defaultValue the default permission
     */
    public void setViewNegativeReactionTotals(Principal viewNegativeReactionTotals, Principal defaultValue) {
        this.viewNegativeReactionTotals =
             Objects.equals(viewNegativeReactionTotals, defaultValue) ? null : viewNegativeReactionTotals;
    }

    /**
     * Retrieves the permission to view the relative number of different types of the comment's reactions.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewReactionRatios() {
        return viewReactionRatios;
    }

    /**
     * Retrieves the permission to view the relative number of different types of the comment's reactions,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewReactionRatios(Principal defaultValue) {
        return viewReactionRatios != null ? viewReactionRatios : defaultValue;
    }

    /**
     * Retrieves the permission to view the relative number of different types of the comment's reactions,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewReactionRatios(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewReactionRatios(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the relative number of different types of the comment's reactions.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewReactionRatios the permission to set, may be {@code null}
     */
    public void setViewReactionRatios(Principal viewReactionRatios) {
        this.viewReactionRatios = viewReactionRatios;
    }

    /**
     * Sets the permission to view the relative number of different types of the comment's reactions.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewReactionRatios the permission to set
     * @param defaultValue the default permission
     */
    public void setViewReactionRatios(Principal viewReactionRatios, Principal defaultValue) {
        this.viewReactionRatios = Objects.equals(viewReactionRatios, defaultValue) ? null : viewReactionRatios;
    }

    /**
     * Retrieves the permission to view the relative number of different types of the comment's negative reactions.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getViewNegativeReactionRatios() {
        return viewNegativeReactionRatios;
    }

    /**
     * Retrieves the permission to view the relative number of different types of the comment's negative reactions,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getViewNegativeReactionRatios(Principal defaultValue) {
        return viewNegativeReactionRatios != null ? viewNegativeReactionRatios : defaultValue;
    }

    /**
     * Retrieves the permission to view the relative number of different types of the comment's negative reactions,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getViewNegativeReactionRatios(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getViewNegativeReactionRatios(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to view the relative number of different types of the comment's negative reactions.
     * If set to {@code null}, the default permission should be used.
     *
     * @param viewNegativeReactionRatios the permission to set, may be {@code null}
     */
    public void setViewNegativeReactionRatios(Principal viewNegativeReactionRatios) {
        this.viewNegativeReactionRatios = viewNegativeReactionRatios;
    }

    /**
     * Sets the permission to view the relative number of different types of the comment's negative reactions.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param viewNegativeReactionRatios the permission to set
     * @param defaultValue the default permission
     */
    public void setViewNegativeReactionRatios(Principal viewNegativeReactionRatios, Principal defaultValue) {
        this.viewNegativeReactionRatios =
             Objects.equals(viewNegativeReactionRatios, defaultValue) ? null : viewNegativeReactionRatios;
    }

    /**
     * Retrieves the permission to add a reaction to the comment.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getAddReaction() {
        return addReaction;
    }

    /**
     * Retrieves the permission to add a reaction to the comment,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getAddReaction(Principal defaultValue) {
        return addReaction != null ? addReaction : defaultValue;
    }

    /**
     * Retrieves the permission to add a reaction to the comment,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getAddReaction(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getAddReaction(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to add a reaction to the comment.
     * If set to {@code null}, the default permission should be used.
     *
     * @param addReaction the permission to set, may be {@code null}
     */
    public void setAddReaction(Principal addReaction) {
        this.addReaction = addReaction;
    }

    /**
     * Sets the permission to add a reaction to the comment.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param addReaction the permission to set
     * @param defaultValue the default permission
     */
    public void setAddReaction(Principal addReaction, Principal defaultValue) {
        this.addReaction = Objects.equals(addReaction, defaultValue) ? null : addReaction;
    }

    /**
     * Retrieves the permission to add a negative reaction to the comment.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getAddNegativeReaction() {
        return addNegativeReaction;
    }

    /**
     * Retrieves the permission to add a negative reaction to the comment,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getAddNegativeReaction(Principal defaultValue) {
        return addNegativeReaction != null ? addNegativeReaction : defaultValue;
    }

    /**
     * Retrieves the permission to add a negative reaction to the comment,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getAddNegativeReaction(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getAddNegativeReaction(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to add a negative reaction to the comment.
     * If set to {@code null}, the default permission should be used.
     *
     * @param addNegativeReaction the permission to set, may be {@code null}
     */
    public void setAddNegativeReaction(Principal addNegativeReaction) {
        this.addNegativeReaction = addNegativeReaction;
    }

    /**
     * Sets the permission to add a negative reaction to the comment.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param addNegativeReaction the permission to set
     * @param defaultValue the default permission
     */
    public void setAddNegativeReaction(Principal addNegativeReaction, Principal defaultValue) {
        this.addNegativeReaction = Objects.equals(addNegativeReaction, defaultValue) ? null : addNegativeReaction;
    }

    /**
     * Retrieves the permission to override the permissions of the comment's reactions.
     * If {@code null}, the default permission is in effect.
     *
     * @return the permission, may be {@code null}
     */
    public Principal getOverrideReaction() {
        return overrideReaction;
    }

    /**
     * Retrieves the permission to override the permissions of the comment's reactions,
     * or {@code defaultValue} if the permission is {@code null}.
     *
     * @param defaultValue the default permission
     * @return the permission
     */
    public Principal getOverrideReaction(Principal defaultValue) {
        return overrideReaction != null ? overrideReaction : defaultValue;
    }

    /**
     * Retrieves the permission to override the permissions of the comment's reactions,
     * or {@code defaultValue} if {@code operations} is {@code null} or the permission is {@code null}.
     *
     * @param operations permissions data
     * @param defaultValue the default permission
     * @return the permission
     */
    public static Principal getOverrideReaction(CommentOperations operations, Principal defaultValue) {
        return operations != null ? operations.getOverrideReaction(defaultValue) : defaultValue;
    }

    /**
     * Sets the permission to override the permissions of the comment's reactions.
     * If set to {@code null}, the default permission should be used.
     *
     * @param overrideReaction the permission to set, may be {@code null}
     */
    public void setOverrideReaction(Principal overrideReaction) {
        this.overrideReaction = overrideReaction;
    }

    /**
     * Sets the permission to override the permissions of the comment's reactions.
     * If the value is equal to {@code defaultValue}, the permission is set to {@code null}.
     *
     * @param overrideReaction the permission to set
     * @param defaultValue the default permission
     */
    public void setOverrideReaction(Principal overrideReaction, Principal defaultValue) {
        this.overrideReaction = Objects.equals(overrideReaction, defaultValue) ? null : overrideReaction;
    }

    /**
     * Checks if all the permissions in the object are {@code null}.
     *
     * @return {@code true} if all the permissions are {@code null}, {@code false} otherwise.
     */
    @JsonIgnore
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

    /**
     * Creates and returns a copy of this {@code CommentOperations} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CommentOperations clone() {
        try {
            return (CommentOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
