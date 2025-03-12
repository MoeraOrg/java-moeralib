package org.moera.lib.node.types;

import java.util.function.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.moera.lib.node.types.validate.ValidationFailure;

/**
 * The Structure class serves as an abstract base class for various structures used in Moera Node API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Structure {

    @JsonIgnore
    private Object extra;

    /**
     * Retrieves the additional data associated with the structure.
     * This data is not present in the serialized JSON form of the structure.
     *
     * @return the extra object stored in the structure, or {@code null} if no extra data is set
     */
    public Object getExtra() {
        return extra;
    }

    /**
     * Retrieves the existing extra data associated with the structure or, if it does not exist,
     * creates and assigns new extra data using the provided creator.
     * <p>
     * This method can be conveniently used for keeping complex objects in the {@code extra} property.
     * For example, if an object of {@code StructureExtras} class should be kept in {@code extra},
     * it can be accessed as follows:
     * <pre>
     *     structure.getOrCreateExtra(StructureExtras::new).getSomething()
     * </pre>
     * {@code getOrCreateExtra} method ensures that the object will always be present.
     *
     * @param <T> the type of the extra data
     * @param creator a supplier function used to create the extra data if it does not already exist
     * @return the existing or newly created extra data of type T
     */
    @SuppressWarnings("unchecked")
    public <T> T getOrCreateExtra(Supplier<T> creator) {
        if (extra == null) {
            extra = creator.get();
        }
        return (T) extra;
    }

    /**
     * Sets additional data associated with the structure. This data is not included
     * in the serialized JSON form of the structure and can be used to store custom
     * information.
     *
     * @param extra the extra object to be associated with the structure
     */
    public void setExtra(Object extra) {
        this.extra = extra;
    }

    /**
     * Validates the structure.
     * <p>
     * If the structure contains incorrect data, this method should throw {@link ValidationFailure} exception.
     */
    public void validate() {
    }

}
