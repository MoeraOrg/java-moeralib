package org.moera.lib.http;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

/**
 * Executes HTTP requests and provides access to their responses.
 */
public interface HttpTransport {

    /**
     * Executes an HTTP request.
     *
     * @param location the URL or location to send the request to
     * @param method the HTTP method to use
     * @param headers the headers to include in the request
     * @param body the textual request body, or {@code null} if no textual body is supplied
     * @param file the file to use as the request body, or {@code null} if no file is supplied
     * @param contentType the media type of the request body
     * @return the response received from the server
     * @throws IOException if an I/O error occurs
     */
    Response call(
        String location,
        String method,
        Collection<Header> headers,
        String body,
        File file,
        String contentType
    ) throws IOException;

}
