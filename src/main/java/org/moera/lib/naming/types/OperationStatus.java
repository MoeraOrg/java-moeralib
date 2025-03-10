package org.moera.lib.naming.types;

import java.util.Arrays;

/**
 * Represents the status of Moera naming service operation.
 */
public enum OperationStatus {

    /**
     * Indicates that the operation is waiting to be sent to the naming server.
     */
    WAITING,

    /**
     * Indicates that the operation has been accepted by the naming server and is awaiting further processing.
     */
    ADDED,

    /**
     * Indicates that the operation has been initiated and is currently in progress.
     */
    STARTED,

    /**
     * Indicates that the operation has completed successfully.
     */
    SUCCEEDED,

    /**
     * Indicates that the operation has failed.
     */
    FAILED,

    /**
     * Indicates that the operation's state could not be determined.
     */
    UNKNOWN;

    /**
     * Returns the string representation of the status.
     *
     * @return the string representation of the status
     */
    public String getValue() {
        return name().toLowerCase();
    }

    /**
     * Returns the {@code OperationStatus} corresponding to the string representation of the status.
     * If no matching status is found, returns {@code null}.
     *
     * @param value the string representation of the operation status
     * @return the corresponding {@code OperationStatus}, or {@code null} if no match is found
     */
    public static OperationStatus forValue(String value) {
        if (value == null) {
            return null;
        }
        return Arrays.stream(values()).filter(v -> v.name().equalsIgnoreCase(value)).findFirst().orElse(null);
    }

}
