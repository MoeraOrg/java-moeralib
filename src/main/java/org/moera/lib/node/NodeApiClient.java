package org.moera.lib.node;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.moera.lib.node.carte.CarteSource;
import org.moera.lib.node.exception.MoeraNodeApiAuthenticationException;
import org.moera.lib.node.exception.MoeraNodeApiException;
import org.moera.lib.node.exception.MoeraNodeApiNotFoundException;
import org.moera.lib.node.exception.MoeraNodeApiOperationException;
import org.moera.lib.node.exception.MoeraNodeApiValidationException;
import org.moera.lib.node.exception.MoeraNodeCallException;
import org.moera.lib.node.exception.MoeraNodeConnectionException;
import org.moera.lib.node.exception.MoeraNodeException;

public class NodeApiClient {

    public interface ResponseConsumer {

        void accept(ResponseBody responseBody) throws MoeraNodeException;

    }

    private String root;
    private String rootSecret;
    private String token;
    private String carte;
    private CarteSource carteSource;
    private NodeAuth authMethod = NodeAuth.NONE;

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final OkHttpClient client = new OkHttpClient();

    public NodeApiClient() {
    }

    public NodeApiClient(String nodeUrl) {
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

    public <T> T call(
        String location, QueryParam[] params, String method, Object body, TypeReference<T> resultClass
    ) throws MoeraNodeException {
        AtomicReference<T> result = new AtomicReference<>();
        call(location, params, method, body, responseBody -> {
            try {
                result.set(objectMapper.readValue(responseBody.string(), resultClass));
            } catch (IOException e) {
                throw new MoeraNodeException("Server returned incorrect response", e);
            }
        });

        return result.get();
    }

    public void call(
        String location, QueryParam[] params, String method, Object body, ResponseConsumer responseConsumer
    ) throws MoeraNodeException {
        RequestBody requestBody;
        try {
            requestBody = body != null
                ? RequestBody.create(objectMapper.writeValueAsString(body), MediaType.parse("application/json"))
                : null;
        } catch (JsonProcessingException e) {
            throw new MoeraNodeCallException("Cannot encode the request body", e);
        }

        call(location, params, method, requestBody, responseConsumer);
    }

    public <T> T call(
        String location, QueryParam[] params, String method, Path body, String contentType, TypeReference<T> resultClass
    ) throws MoeraNodeException {
        RequestBody requestBody = body != null
            ? RequestBody.create(body.toFile(), MediaType.parse(contentType))
            : null;

        AtomicReference<T> result = new AtomicReference<>();
        call(location, params, method, requestBody, responseBody -> {
            try {
                result.set(objectMapper.readValue(responseBody.string(), resultClass));
            } catch (IOException e) {
                throw new MoeraNodeException("Server returned incorrect response", e);
            }
        });

        return result.get();
    }

    public void call(
        String location, QueryParam[] params, String method, RequestBody requestBody, ResponseConsumer responseConsumer
    ) throws MoeraNodeException {
        var requestBuilder = new Request.Builder();

        requestBuilder.method(method, requestBody);
        requestBuilder.addHeader("Accept", "application/json");

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
            requestBuilder.addHeader("Authorization", "Bearer " + bearer);
        }

        if (root == null) {
            throw new MoeraNodeCallException("Node URL is not set");
        }

        var url = HttpUrl.parse(root + "/api" + location);
        if (url == null) {
            throw new MoeraNodeCallException("Node URL is not set");
        }
        if (params != null && params.length > 0) {
            var builder = url.newBuilder();
            for (var param : params) {
                if (param.value() != null) {
                    builder.addQueryParameter(param.name(), param.value().toString());
                }
            }
        }

        var request = requestBuilder.url(url).build();
        try (Response response = client.newCall(request).execute()) {
            if (response.body() == null) {
                throw new MoeraNodeException("Server returned empty result");
            }
            validateResponseStatus(response.code(), response.body());
            responseConsumer.accept(response.body());
        } catch (IOException e) {
            throw new MoeraNodeConnectionException(e);
        }
    }

    private void validateResponseStatus(int status, ResponseBody body) throws MoeraNodeApiException {
        switch (status) {
            case 403:
                throw new MoeraNodeApiAuthenticationException();

            case 200:
            case 201:
                // do nothing
                break;

            case 400:
                throw new MoeraNodeApiValidationException(toString(body));

            case 404:
                throw new MoeraNodeApiNotFoundException(toString(body));

            case 409:
                throw new MoeraNodeApiOperationException(toString(body));

            default:
                throw new MoeraNodeApiException(status, toString(body));
        }
    }

    private static String toString(ResponseBody body) {
        try {
            return body != null ? body.string() : "";
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
