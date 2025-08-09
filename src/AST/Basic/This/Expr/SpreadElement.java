package AST.Basic.This.Expr;

import AST.Statements;

public class SpreadElement extends Statements {
    private Statements expression;

    public SpreadElement(Statements expression) {
        this.expression = expression;
    }

    public Statements getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "SpreadElement{" +
                "expression=" + expression +
                '}';
    }
}
