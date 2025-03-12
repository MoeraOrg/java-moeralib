package org.moera.lib.node.types.principal;

/**
 * Represents a logical expression based on principals.
 * This class supports combining principals through logical operations such as AND, OR, and NOT.
 * It can be used to define complex logical filters involving principals.
 */
public final class PrincipalExpression implements PrincipalFilter {

    enum Operation {
        OR, AND
    }

    private final Principal principal;
    private final boolean inverse;
    private final Operation operation;
    private final PrincipalExpression left;
    private final PrincipalExpression right;

    private PrincipalExpression(Principal principal, boolean inverse) {
        this.principal = principal;
        this.inverse = inverse;
        operation = null;
        left = null;
        right = null;
    }

    private PrincipalExpression(Operation operation, PrincipalExpression left, PrincipalExpression right) {
        principal = null;
        this.inverse = false;
        this.operation = operation;
        this.left = left;
        this.right = right;
    }

    private PrincipalExpression(Principal principal, boolean inverse, Operation operation,
                                PrincipalExpression left, PrincipalExpression right) {
        this.principal = principal;
        this.inverse = inverse;
        this.operation = operation;
        this.left = left;
        this.right = right;
    }

    /**
     * Returns the current {@code PrincipalExpression} instance.
     *
     * @return the current instance of {@code PrincipalExpression}
     */
    @Override
    public PrincipalExpression a() {
        return this;
    }

    /**
     * Creates a new {@code PrincipalExpression} instance based on the given {@code Principal}.
     *
     * @param principal the principal to be wrapped in a {@code PrincipalExpression}
     * @return a {@code PrincipalExpression} instance representing the given principal
     */
    public static PrincipalExpression by(Principal principal) {
        return new PrincipalExpression(principal, false);
    }

    /**
     * Creates a new {@code PrincipalExpression} instance for the given {@code Principal}
     * with an inverted meaning.
     *
     * @param principal the principal to be wrapped in a {@code PrincipalExpression} with an inverted meaning
     * @return a {@code PrincipalExpression} instance representing the given principal with an inverted meaning
     */
    public static PrincipalExpression byNot(Principal principal) {
        return new PrincipalExpression(principal, true);
    }

    /**
     * Creates a new {@code PrincipalExpression} instance that represents
     * the negation of the given {@code PrincipalExpression}.
     *
     * @param expression the {@code PrincipalExpression} to negate
     * @return a new {@code PrincipalExpression} instance with the negated meaning
     */
    public static PrincipalExpression not(PrincipalExpression expression) {
        return new PrincipalExpression(
            expression.principal, !expression.inverse, expression.operation, expression.left, expression.right
        );
    }

    /**
     * Combines the current {@code PrincipalExpression} with another {@code PrincipalExpression}
     * using a logical OR operation.
     *
     * @param expression the {@code PrincipalExpression} to combine with the current instance
     *                    using a logical OR operation
     * @return a new {@code PrincipalExpression} instance representing the logical OR
     *         combination of the current instance and the given {@code PrincipalExpression}
     */
    public PrincipalExpression or(PrincipalExpression expression) {
        return new PrincipalExpression(Operation.OR, this, expression);
    }

    /**
     * Combines the current {@code PrincipalExpression} with another principal
     * using a logical OR operation.
     *
     * @param principal the {@code Principal} to combine with the current expression
     *                  using a logical OR operation
     * @return a new {@code PrincipalExpression} instance representing the logical OR
     *         combination of the current expression and the given {@code Principal}
     */
    public PrincipalExpression or(Principal principal) {
        return new PrincipalExpression(Operation.OR, this, by(principal));
    }

    /**
     * Combines the current {@code PrincipalExpression} with another principal
     * using a logical OR operation, while negating the meaning of the provided {@code Principal}.
     *
     * @param principal the {@code Principal} to combine with the current expression
     *                  using a negated OR operation
     * @return a new {@code PrincipalExpression} instance representing the negated OR
     *         combination of the current expression and the given {@code Principal}
     */
    public PrincipalExpression orNot(Principal principal) {
        return new PrincipalExpression(Operation.OR, this, byNot(principal));
    }

    /**
     * Combines the current {@code PrincipalExpression} with another {@code PrincipalExpression}
     * using a logical AND operation.
     *
     * @param expression the {@code PrincipalExpression} to combine with the current instance
     *                   using a logical AND operation
     * @return a new {@code PrincipalExpression} instance representing the logical AND
     *         combination of the current instance and the given {@code PrincipalExpression}
     */
    public PrincipalExpression and(PrincipalExpression expression) {
        return new PrincipalExpression(Operation.AND, this, expression);
    }

    /**
     * Combines the current {@code PrincipalExpression} with another principal
     * using a logical AND operation.
     *
     * @param principal the {@code Principal} to combine with the current expression
     *                  using a logical AND operation
     * @return a new {@code PrincipalExpression} instance representing the logical AND
     *         combination of the current expression and the given {@code Principal}
     */
    public PrincipalExpression and(Principal principal) {
        return new PrincipalExpression(Operation.AND, this, by(principal));
    }

    /**
     * Combines the current {@code PrincipalExpression} with the provided {@code Principal}
     * using a logical AND operation, while negating the meaning of the provided {@code Principal}.
     *
     * @param principal the {@code Principal} to combine with the current expression
     *                  using a negated AND operation
     * @return a new {@code PrincipalExpression} instance representing the negated AND
     *         combination of the current expression and the given {@code Principal}
     */
    public PrincipalExpression andNot(Principal principal) {
        return new PrincipalExpression(Operation.AND, this, byNot(principal));
    }

    /**
     * Evaluates whether a client the given privileges satisfy the conditions of this {@code PrincipalExpression}.
     *
     * @param admin        specifies whether the client has administrative privileges
     * @param nodeName     the name of the client's node
     * @param subscribed   specifies if the current node is subscribed to the client's node
     * @param friendGroups an array of friend groups that the client's node belongs to
     * @return {@code true} if the parameters satisfy the conditions of the {@code PrincipalExpression};
     *         otherwise {@code false}
     * @throws InvalidPrincipalExpression if the logical operation or its operands are not properly set
     */
    @Override
    public boolean includes(boolean admin, String nodeName, boolean subscribed, String[] friendGroups) {
        if (principal != null) {
            return inverse != principal.includes(admin, nodeName, subscribed, friendGroups);
        }
        if (operation == Operation.OR) {
            if (left == null) {
                throw new InvalidPrincipalExpression("Left operand not set");
            }
            if (right == null) {
                throw new InvalidPrincipalExpression("Right operand not set");
            }
            return inverse != (
                left.includes(admin, nodeName, subscribed, friendGroups)
                || right.includes(admin, nodeName, subscribed, friendGroups)
            );
        }
        if (operation == Operation.AND) {
            if (left == null) {
                throw new InvalidPrincipalExpression("Left operand not set");
            }
            if (right == null) {
                throw new InvalidPrincipalExpression("Right operand not set");
            }
            return inverse != (
                left.includes(admin, nodeName, subscribed, friendGroups)
                && right.includes(admin, nodeName, subscribed, friendGroups)
            );
        }
        throw new InvalidPrincipalExpression("Operation not set");
    }

    /**
     * Returns a string representation of the {@code PrincipalExpression} instance.
     *
     * @return the string representation of the {@code PrincipalExpression} instance
     * @throws InvalidPrincipalExpression if the logical operation or its operands are not properly set
     */
    @Override
    public String toString() {
        if (principal != null) {
            return (inverse ? "not " : "") + principal;
        }
        if (operation == null) {
            throw new InvalidPrincipalExpression("Operation not set");
        }
        if (left == null) {
            throw new InvalidPrincipalExpression("Left operand not set");
        }
        if (right == null) {
            throw new InvalidPrincipalExpression("Right operand not set");
        }
        return inverse
                ? "not ((%s) %s (%s))".formatted(left, operation.name().toLowerCase(), right)
                : "(%s) %s (%s)".formatted(left, operation.name().toLowerCase(), right);
    }

}
