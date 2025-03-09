package org.moera.lib;

import java.net.URI;
import java.net.URISyntaxException;

import org.moera.lib.naming.NodeName;

/**
 * This class represents a Moera universal URL and contains routines for constructing and parsing it.
 */
public class UniversalLocation {

    /**
     * The host used as a redirector in universal URLs.
     */
    public static final String REDIRECTOR = "moera.page";

    private String nodeName;
    private String scheme;
    private String authority;
    private String path;
    private String query;
    private String fragment;

    /**
     * Constructs a {@code UniversalLocation} object based on the location part of the provided URI.
     *
     * @param uri the URI to be parsed
     */
    public UniversalLocation(URI uri) {
        String path = uri.getPath();
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        if (path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }
        if (path.isEmpty()) {
            return;
        }

        String[] dirs = path.split("/");
        if (!dirs[0].startsWith("@")) {
            return;
        }

        if (dirs[0].length() > 1) {
            nodeName = dirs[0].substring(1);
        }

        String host = null;
        String port = null;

        if (dirs.length > 1 && !dirs[1].equals("~")) {
            String[] parts = dirs[1].split(":");
            int i = 0;
            if (parts[i].indexOf('.') < 0) {
                scheme = parts[i++];
            }
            if (i < parts.length) {
                host = parts[i++];
            }
            if (i < parts.length) {
                port = parts[i++];
            }
        }

        if (scheme == null) {
            scheme = "https";
        }
        if (host != null && !host.isEmpty()) {
            authority = host;
            if (port != null && !port.isEmpty()) {
                authority += ':' + port;
            }
        }

        StringBuilder buf = new StringBuilder();
        for (int i = 2; i < dirs.length; i++) {
            buf.append('/').append(dirs[i]);
        }

        this.path = buf.isEmpty() ? "/" : buf.toString();

        this.query = uri.getQuery();
        this.fragment = uri.getFragment();
    }

    /**
     * Constructs a {@code UniversalLocation} object using the provided parameters.
     *
     * @param nodeName the node name associated with the location, which will be processed and shortened if necessary
     * @param scheme the URI scheme (e.g., "http", "https"); defaults to "https" if not provided
     * @param authority the authority component of the URI, typically containing the host and optionally the port
     * @param path the path component of the URI; adjusted automatically if it starts with {@code "/moera"} or
     *            is {@code null}
     * @param query the query string of the URI
     * @param fragment the fragment identifier of the URI
     */
    public UniversalLocation(
        String nodeName, String scheme, String authority, String path, String query, String fragment
    ) {
        setNodeName(nodeName);
        setScheme(scheme);
        setAuthority(authority);
        setPath(path);
        setQuery(query);
        setFragment(fragment);
    }

    /**
     * Builds a universal Moera URL from the direct URL of a page on a node, adding the node name provided.
     *
     * @param nodeName the name of the node, which will be used for the universal URL
     * @param url the direct URL to be transformed into a universal URL, may be {@code null}
     * @return the constructed universal URL; if a syntax error occurs, a default redirector URI (without location)
     *         is returned
     */
    public static String redirectTo(String nodeName, String url) {
        try {
            UniversalLocation uni;
            if (url != null) {
                URI uri = new URI(url);
                uni = new UniversalLocation(nodeName, uri.getScheme(), uri.getAuthority(), uri.getPath(),
                        uri.getQuery(), uri.getFragment());
            } else {
                uni = new UniversalLocation(nodeName, null, null, null, null, null);
            }
            URI uri = new URI("https", UniversalLocation.REDIRECTOR, uni.getLocation(), uni.getQuery(),
                    uni.getFragment());
            return uri.toASCIIString();
        } catch (URISyntaxException e) {
            return "https://" + UniversalLocation.REDIRECTOR;
        }
    }

    /**
     * Build a universal Moera URL from the node name, the Moera root URL of the node, virtual path and
     * other components.
     *
     * @param nodeName the name of the node associated with the generated URL
     * @param rootUrl the Moera root URL of the node (may be {@code null})
     * @param path the virtual path component of the URL (may be {@code null})
     * @param query the query string of the URL
     * @param fragment the fragment identifier for the URL
     * @return the constructed universal URL; if a syntax error occurs, a default redirector URI (without location)
     *         is returned
     */
    public static String redirectTo(String nodeName, String rootUrl, String path, String query, String fragment) {
        try {
            UniversalLocation uni;
            if (rootUrl != null) {
                URI uri = new URI(rootUrl);
                uni = new UniversalLocation(nodeName, uri.getScheme(), uri.getAuthority(), path, query, fragment);
            } else {
                uni = new UniversalLocation(nodeName, null, null, path, query, fragment);
            }
            URI uri = new URI("https", UniversalLocation.REDIRECTOR, uni.getLocation(), uni.getQuery(),
                    uni.getFragment());
            return uri.toASCIIString();
        } catch (URISyntaxException e) {
            return "https://" + UniversalLocation.REDIRECTOR;
        }
    }

    /**
     * Retrieves the name of the node associated with this location.
     *
     * @return the node name as a String
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the name of the node associated with this location.
     * The provided node name is shortened using the {@link NodeName#shorten} method before being assigned.
     *
     * @param nodeName the node name to set; may be transformed into a shortened format
     */
    public void setNodeName(String nodeName) {
        this.nodeName = NodeName.shorten(nodeName);
    }

    /**
     * Retrieves the URI scheme associated with this location.
     *
     * @return the URI scheme.
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * Sets the URI scheme for this location. If the provided scheme is {@code null},
     * it defaults to "https".
     *
     * @param scheme the URI scheme to set
     */
    public void setScheme(String scheme) {
        if (scheme == null) {
            scheme = "https";
        }
        this.scheme = scheme;
    }

    /**
     * Retrieves the authority component of the URI. The authority typically consists
     * of the host, and optionally, the port number.
     *
     * @return the authority component of the URI
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Sets the authority component of the URI.
     *
     * @param authority the authority component, typically containing the host and optionally the port
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    /**
     * Sets the scheme and authority components of the current object, taking them from the given URI.
     *
     * @param uri the URI from which the scheme and authority will be extracted
     */
    public void setSchemeAndAuthority(URI uri) {
        setScheme(uri.getScheme());
        setAuthority(uri.getAuthority());
    }

    /**
     * Retrieves the path component of the URI.
     *
     * @return the path component
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the path component of the URI.
     * If the provided path starts with {@code "/moera"}, this prefix is removed.
     * If the path is {@code null} or empty, it defaults to the root path {@code "/"}.
     *
     * @param path the path component of the URI; may be {@code null} or empty
     */
    public void setPath(String path) {
        if (path != null && path.startsWith("/moera")) {
            path = path.substring(6);
        }
        this.path = path != null && !path.isEmpty() ? path : "/";
    }

    /**
     * Constructs and returns the universal Moera location based on the node name, scheme,
     * authority, and path components of the current object (does not include query and fragment).
     * If the authority is null, a tilde character ({@code '~'}) is used as a placeholder.
     *
     * @return a string representing the location
     */
    public String getLocation() {
        StringBuilder buf = new StringBuilder();
        buf.append("/@");
        if (nodeName != null) {
            buf.append(nodeName);
        }
        buf.append('/');
        if (authority != null) {
            if (scheme != null && !scheme.equalsIgnoreCase("https")) {
                buf.append(scheme).append(':');
            }
            buf.append(authority);
        } else {
            buf.append('~');
        }
        buf.append(path);
        return buf.toString();
    }

    /**
     * Retrieves the query component of the URI.
     *
     * @return the query string, or {@code null} if the query is not defined
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the query component of the URI.
     *
     * @param query the query string to be set
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Retrieves the fragment component of the URI.
     *
     * @return the fragment component of the URI, or {@code null} if no fragment is defined
     */
    public String getFragment() {
        return fragment;
    }

    /**
     * Sets the fragment component of the URI.
     *
     * @param fragment the fragment identifier to be set, representing the portion
     *                 of the URI that comes after the `#` character; may be {@code null}
     */
    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

}
