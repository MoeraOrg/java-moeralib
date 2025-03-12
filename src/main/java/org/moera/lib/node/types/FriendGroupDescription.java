package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupDescription extends Structure implements Cloneable {

    private String title;
    private FriendGroupOperations operations;

    /**
     * Retrieves title of the group of friends.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title of the group of friends.
     *
     * @param title the value to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the operations and the corresponding principals.
     *
     * @return the value
     */
    public FriendGroupOperations getOperations() {
        return operations;
    }

    /**
     * Sets the operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(FriendGroupOperations operations) {
        this.operations = operations;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(title, "friend-group.title.blank");
        ValidationUtil.maxSize(title, 63, "friend-group.title.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code FriendGroupDescription} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FriendGroupDescription clone() {
        try {
            return (FriendGroupDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
