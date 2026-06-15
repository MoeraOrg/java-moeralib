package org.moera.lib.http;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/**
 * Provides access to the status and body of an HTTP response.
 */
public interface Response extends Closeable {

    /**
     * Returns the HTTP status code.
     *
     * @return the HTTP status code
     */
    int code();

    /**
     * Returns the response body as a string.
     *
     * @return the response body
     */
    String body() throws IOException;

    /**
     * Returns the response body as a byte stream.
     *
     * @return a stream containing the response body
     */
    InputStream bodyStream();

    /**
     * Returns the media type of the response body.
     *
     * @return the response body media type, or {@code null} if it is not specified
     */
    String contentType();

    /**
     * Returns the length of the response body in bytes.
     *
     * @return the response body length, or {@code -1} if it is unknown
     */
    long contentLength();

}
