package org.moera.lib.node.carte;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

import org.moera.lib.node.MoeraNode;
import org.moera.lib.node.exception.MoeraNodeException;
import org.moera.lib.node.types.CarteAttributes;
import org.moera.lib.node.types.CarteInfo;
import org.moera.lib.node.types.Scope;

/**
 * Class that gets cartes from the given node, caches them and supplies them for authentication.
 * <p>
 * This class is not thread-safe.
 */
public class MoeraCarteSource implements CarteSource {

    private final MoeraNode node;
    private final long clientScope;
    private final long adminScope;
    private final String targetNodeName;
    private List<CarteInfo> cartes = Collections.emptyList();

    /**
     * Create the carte source.
     *
     * @param node node to get cartes from
     * @param clientScope permissions to be granted to the cartes; if <code>null</code>, all permissions of the cartes'
     *                   owner are granted
     * @param adminScope additional administrative permissions (of those granted to the cartes' owner by the target
     *                  node) to be granted to the cartes
     * @param targetNodeName if set, the cartes are valid for authentication on the specified node only
     */
    public MoeraCarteSource(MoeraNode node, Long clientScope, Long adminScope, String targetNodeName) {
        this.node = node;
        this.clientScope = clientScope != null ? clientScope : Scope.ALL.getMask();
        this.adminScope = adminScope != null ? adminScope : Scope.NONE.getMask();
        this.targetNodeName = targetNodeName;
    }

    /**
     * Force renewing the cached list of cartes.
     *
     * @throws MoeraCartesException if cartes cannot be obtained
     */
    public void renew() {
        var attributes = new CarteAttributes();
        attributes.setClientScope(Scope.toValues(clientScope));
        attributes.setAdminScope(Scope.toValues(adminScope));
        attributes.setNodeName(targetNodeName);
        try {
            cartes = node.createCartes(attributes).getCartes();
        } catch (MoeraNodeException e) {
            throw new MoeraCartesException("Error obtaining cartes from the node", e);
        }
    }

    /**
     * Retrieves a valid carte for authentication purposes. The method attempts to use
     * a cached carte if available and valid. If no cached carte is valid, the method
     * will attempt to renew the list of cartes.
     *
     * @return a valid carte
     * @throws MoeraCartesException if no valid carte is available or could not be obtained
     */
    public String getCarte() {
        boolean renewed = false;
        while (true) {
            long now = Instant.now().toEpochMilli();
            cartes = cartes.stream().filter(c -> c.getDeadline() > now).toList();
            if (cartes.isEmpty()) {
                if (renewed) {
                    throw new MoeraCartesException("Could not obtain a valid carte from the node");
                }
                renew();
                renewed = true;
                continue;
            }
            for (CarteInfo carte : cartes) {
                if (carte.getBeginning() <= now) {
                    return carte.getCarte();
                }
            }
            throw new MoeraCartesException("Could not obtain a carte valid for now");
        }
    }

}
