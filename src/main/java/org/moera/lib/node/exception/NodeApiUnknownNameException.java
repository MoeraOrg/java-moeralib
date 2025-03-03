package org.moera.lib.node.exception;

public class NodeApiUnknownNameException extends MoeraNodeException {

    private final String nodeName;

    public NodeApiUnknownNameException(String nodeName) {
        super(String.format("Node name '%s' not found", nodeName));
        this.nodeName = nodeName;
    }

    public String getNodeName() {
        return nodeName;
    }

}
