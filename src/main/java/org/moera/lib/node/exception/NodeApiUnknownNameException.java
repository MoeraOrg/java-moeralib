package org.moera.lib.node.exception;

public class NodeApiUnknownNameException extends MoeraNodeException {

    private final String nodeName;

    public NodeApiUnknownNameException(String nodeName) {
        super("Node name '%s' not found".formatted(nodeName));
        this.nodeName = nodeName;
    }

    public String getNodeName() {
        return nodeName;
    }

}
