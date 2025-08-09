package AST.Basic.This.Expr;

import AST.Statements;
import java.util.List;

public class Array extends Statements {
    private List<Statements> elements;

    public Array(List<Statements> elements) {
        this.elements = elements;
    }

    public List<Statements> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "Array{" +
                "elements=" + elements +
                '}';
    }
}
