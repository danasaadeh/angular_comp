package AST.Basic.This.Expr;

import AST.Statements;

import java.util.List;

public class PropertyChain extends Statements {
    private List<String> identifiers;
    private MethodCall methodCall;

    public PropertyChain(List<String> identifiers, MethodCall methodCall) {
        this.identifiers = identifiers;
        this.methodCall = methodCall;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }

    @Override
    public String toString() {
        return "PropertyChain{" +
                "identifiers=" + identifiers +
                ", methodCall=" + methodCall +
                '}';
    }
}