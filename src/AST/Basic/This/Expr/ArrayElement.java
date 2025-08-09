package AST.Basic.This.Expr;

import AST.Statements;

public class ArrayElement extends Statements {
    private Statements value;

    public ArrayElement(Statements value) {
        this.value = value;
    }

    public Statements getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ArrayElement{" +
                "value=" + value +
                '}';
    }
}
