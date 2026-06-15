package org.moera.lib.node;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import org.moera.lib.http.Header;
import org.moera.lib.http.HttpTransport;
import org.moera.lib.http.QueryParam;
import org.moera.lib.http.Response;
import org.moera.lib.node.carte.CarteSource;
import org.moera.lib.node.exception.MoeraNodeApiAuthenticationException;
import org.moera.lib.node.exception.MoeraNodeApiException;
import org.moera.lib.node.exception.MoeraNodeApiNotFoundException;
import org.moera.lib.node.exception.MoeraNodeApiOperationException;
import org.moera.lib.node.exception.MoeraNodeApiValidationException;
import org.moera.lib.node.exception.MoeraNodeCallException;
import org.moera.lib.node.exception.MoeraNodeConnectionException;
import org.moera.lib.node.exception.MoeraNodeException;
import org.moera.lib.util.Util;
import tools.jackson.core.JacksonException;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

/**
 * This class implements basic REST API operations that allow applications to call Moera Node API.
 * <p>
 * This class is not thread-safe.
 */
public class NodeApiClient {

    /**
     * The interface provides a single method to process a {@link Response},
     * allowing custom handling of API responses received from a node.
     * <p>
     * Implementations of this interface should define specific behavior for
     * parsing, validating, or otherwise processing the {@link Response}.
     * <p>
     * If an error occurs during response processing, the method can throw a
     * {@link MoeraNodeException}.
     */
    public interface ResponseConsumer {

        /**
         * Processes the provided {@link Response}. This method is intended to handle
         * custom logic for parsing, validating, or processing the response received from
         * a node.
         *
         * @param responseBody the response body to be processed
         * @throws MoeraNodeException if an error occurs when processing the response
         */
        void accept(Response responseBody) throws MoeraNodeException;

    }

    private String root;
    private String rootSecret;
    private String token;
    private String carte;
    private CarteSource carteSource;
    private NodeAuth authMethod = NodeAuth.NONE;
    private String userAgent;

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final HttpTransport transport;

    /**
     * Default constructor for the {@code NodeApiClient} class.
     */
    public NodeApiClient(HttpTransport transport) {
        this.transport = transport;
    }

    /**
     * Constructs a new instance of the {@code NodeApiClient} class and initializes it with the given node URL.
     *
     * @param nodeUrl the URL of the node to connect to
     */
    public NodeApiClient(HttpTransport transport, String nodeUrl) {
        this.transport = transport;
        nodeUrl(nodeUrl);
    }

    /**
     * API endpoint URL of the node.
     */
    public String getRoot() {
        return root;
    }

    /**
     * Convert partial node URL to a standardized form.
     *
     * @param url partial URL
     * @return standard URL
     */
    public static String moeraRoot(String url) {
        if (!url.startsWith("http:") && !url.startsWith("https:")) {
            url = "https://" + url;
        }
        if (url.endsWith("/")) {
            url = url.substring(0, url.length() - 1);
        }
        if (url.endsWith("/api")) {
            url = url.substring(0, url.length() - 4);
        }
        if (!url.endsWith("/moera")) {
            url += "/moera";
        }
        return url;
    }

    /**
     * Set node URL.
     *
     * @param url the URL
     */
    public void nodeUrl(String url) {
        this.root = moeraRoot(url);
    }

    /**
     * Set root secret for authentication.
     *
     * @param secret the secret
     */
    public void rootSecret(String secret) {
        this.rootSecret = secret;
    }

    /**
     * Set admin token for authentication.
     *
     * @param token the token
     */
    public void token(String token) {
        this.token = token;
    }

    /**
     * Set carte for authentication.
     *
     * @param carte the carte
     */
    public void carte(String carte) {
        this.carte = carte;
    }

    /**
     * Set a source of cartes for authentication.
     *
     * @param carteSource the source of cartes
     */
    public void carteSource(CarteSource carteSource) {
        this.carteSource = carteSource;
    }

    /**
     * Select authentication method for the following requests.
     *
     * @param authMethod the authentication method
     */
    public void authMethod(NodeAuth authMethod) {
        this.authMethod = authMethod;
    }

    /**
     * Switch off authentication for the following requests.
     */
    public void noAuth() {
        authMethod(NodeAuth.NONE);
    }

    /**
     * Select carte authentication for the following requests.
     */
    public void auth() {
        authMethod(NodeAuth.PEER);
    }

    /**
     * Select admin token authentication for the following requests.
     */
    public void authAdmin() {
        authMethod(NodeAuth.ADMIN);
    }

    /**
     * Select root admin secret authentication for the following requests.
     */
    public void authRootAdmin() {
        authMethod(NodeAuth.ROOT_ADMIN);
    }

    /**
     * Set User-Agent header content.
     *
     * @param userAgent the user agent
     */
    public void userAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * Executes a request to the node API with the specified parameters and parses the JSON response into
     * the specified result type.
     *
     * @param location the endpoint location of the API call, relative to the node's root URL
     * @param params an array of query parameters to be included in the API request; may be {@code null}
     * @param method the HTTP method to use for the request (e.g., {@code GET}, {@code POST}, {@code DELETE})
     * @param body an object representing the request body to include in the API request,
     *            the object is converted to JSON before sending; can be {@code null} for methods like {@code GET}
     * @param resultClass the type reference of the expected response object
     * @param <T> the type of the expected response object
     * @return the parsed response object of type {@code T}
     * @throws MoeraNodeException if an error occurs during request processing or response handling
     */
    public <T> T call(
        String location, QueryParam[] params, String method, Object body, TypeReference<T> resultClass
    ) throws MoeraNodeException {
        AtomicReference<T> result = new AtomicReference<>();
        call(location, params, method, body, responseBody -> {
            try {
                result.set(objectMapper.readValue(responseBody.body(), resultClass));
            } catch (IOException e) {
                throw new MoeraNodeException("Server returned incorrect response", e);
            }
        });

        return result.get();
    }

    /**
     * Executes a request to the node API with the specified parameters.
     *
     * @param location the endpoint location of the API call, relative to the node's root URL
     * @param params an array of query parameters to be included in the API request; may be {@code null}
     * @param method the HTTP method to use for the request (e.g., {@code GET}, {@code POST}, {@code DELETE})
     * @param body an object representing the request body to include in the API request,
     *            the object is converted to JSON before sending; can be {@code null} for methods like {@code GET}
     * @param responseConsumer a consumer that processes the response body received from the node
     * @throws MoeraNodeException if an error occurs during request processing or response handling
     */
    public void call(
        String location, QueryParam[] params, String method, Object body, ResponseConsumer responseConsumer
    ) throws MoeraNodeException {
        try {
            var requestBody = body != null ? objectMapper.writeValueAsString(body) : null;
            call(location, params, method, requestBody, null, "application/json", responseConsumer);
        } catch (JacksonException e) {
            throw new MoeraNodeCallException("Cannot encode the request body", e);
        }
    }

    /**
     * Executes a request to the node API with the specified parameters and parses the JSON response into
     * the specified result type.
     *
     * @param location the endpoint location of the API call, relative to the node's root URL
     * @param params an array of query parameters to be included in the API request, may be {@code null}
     * @param method the HTTP method to use for the request (e.g., {@code GET}, {@code POST}, {@code DELETE})
     * @param body the file path for the request body to include in the API request;
     *            can be {@code null} for methods like {@code GET}
     * @param contentType the MIME type of the request body
     * @param resultClass the type reference of the expected response object
     * @param <T> the type of the expected response object
     * @return the parsed response object of type {@code T}
     * @throws MoeraNodeException if an error occurs during request processing or response handling
     */
    public <T> T call(
        String location, QueryParam[] params, String method, Path body, String contentType, TypeReference<T> resultClass
    ) throws MoeraNodeException {
        var requestFile = body != null ? body.toFile() : null;

        AtomicReference<T> result = new AtomicReference<>();
        call(location, params, method, null, requestFile, contentType, responseBody -> {
            try {
                result.set(objectMapper.readValue(responseBody.body(), resultClass));
            } catch (IOException e) {
                throw new MoeraNodeException("Server returned incorrect response", e);
            }
        });

        return result.get();
    }

    /**
     * Executes a request to the node API with the specified parameters.
     *
     * @param location the endpoint location of the API call, relative to the node's root URL
     * @param params an array of query parameters to be included in the API request, may be {@code null}
     * @param method the HTTP method to use for the request (e.g., {@code GET}, {@code POST}, {@code DELETE})
     * @param body the request body to include in the API request;
     *             can be {@code null} for methods like {@code GET}
     * @param file the file to include in the API request;
     *             can be {@code null} for methods that do not support file uploads
     * @param contentType the content type of the request body
     * @param responseConsumer a consumer that processes the response body received from the node
     * @throws MoeraNodeException if an error occurs during request processing or response handling
     */
    public void call(
        String location,
        QueryParam[] params,
        String method,
        String body,
        File file,
        String contentType,
        ResponseConsumer responseConsumer
    ) throws MoeraNodeException {
        var headers = new ArrayList<Header>();
        headers.add(Header.of("Accept", "application/json"));
        if (userAgent != null) {
            headers.add(Header.of("User-Agent", userAgent));
        }

        String bearer = null;
        switch (authMethod) {
            case PEER:
                if (carteSource != null) {
                    bearer = "carte:" + carteSource.getCarte();
                } else if (carte != null) {
                    bearer = "carte:" + carte;
                } else {
                    throw new MoeraNodeCallException("Carte is not set");
                }
                break;
            case ADMIN:
                if (token == null) {
                    throw new MoeraNodeCallException("Token is not set");
                }
                bearer = "token:" + token;
                break;
            case ROOT_ADMIN:
                if (rootSecret == null) {
                    throw new MoeraNodeCallException("Root secret is not set");
                }
                bearer = "secret:" + rootSecret;
                break;
        }
        if (bearer != null) {
            headers.add(Header.of("Authorization", "Bearer " + bearer));
        }

        if (root == null) {
            throw new MoeraNodeCallException("Node URL is not set");
        }

        var url = new StringBuilder(root).append("/api").append(location);
        if (params != null && params.length > 0) {
            var separator = url.indexOf("?") >= 0 ? '&' : '?';
            for (var param : params) {
                if (param.value() != null) {
                    url.append(separator).append(Util.ue(param.name())).append('=').append(Util.ue(param.value()));
                    separator = '&';
                }
            }
        }

        try (Response response = transport.call(url.toString(), method, headers, body, file, contentType)) {
            validateResponseStatus(response);
            responseConsumer.accept(response);
        } catch (IOException e) {
            throw new MoeraNodeConnectionException(e);
        }
    }

    private void validateResponseStatus(Response response) throws MoeraNodeApiException {
        int status = response.code();
        switch (status) {
            case 403:
                throw new MoeraNodeApiAuthenticationException();

            case 200:
            case 201:
                // do nothing
                break;

            case 400:
                throw new MoeraNodeApiValidationException(toString(response));

            case 404:
                throw new MoeraNodeApiNotFoundException(toString(response));

            case 409:
                throw new MoeraNodeApiOperationException(toString(response));

            default:
                throw new MoeraNodeApiException(status, toString(response));
        }
    }

    private static String toString(Response response) {
        try {
            return response != null ? response.body() : "";
        } catch (IOException e) {
            return "";
        }
    }

    protected String ue(Object value) throws MoeraNodeException {
        if (value == null) {
            throw new MoeraNodeException("null value is not allowed for path substitution");
        }
        return URLEncoder.encode(value.toString(), StandardCharsets.UTF_8);
    }

    protected String commaSeparatedFlags(QueryParam... flags) {
        if (flags == null || flags.length == 0) {
            return "";
        }

        return Arrays.stream(flags)
            .filter(flag -> Boolean.TRUE.equals(flag.value()))
            .map(QueryParam::name)
            .collect(Collectors.joining(","));
    }

}
