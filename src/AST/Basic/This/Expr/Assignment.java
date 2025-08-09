package AST.Basic.This.Expr;

import AST.Statements;

public class Assignment extends Statements {
    private Statements value;

    public Assignment(Statements value) {
        this.value = value;
    }

    public Statements getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "value=" + value +
                '}';
    }
}
