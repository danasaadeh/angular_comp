package AST.Basic.Loop.Exp;

import AST.Basic.Loop.Exp.Expression;

public class BinaryExpression extends Expression {
    private Expression left;
    private String operator;
    private Expression right;

    public BinaryExpression(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public String getOperator() {
        return operator;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tBinaryExpression{" +
                "\n \t\t\t\t\t\t\tleft=" + left +
                "\n \t\t\t\t\t\t\toperator='" + operator + '\'' +
                "\n \t\t\t\t\t\t\tright=" + right +
                '}';
    }
    @Override
    public String convertToJs() {
        // Wrap in parentheses for correct JS precedence
        return "(" + left.convertToJs() + " " + operator + " " + right.convertToJs() + ")";
    }
}