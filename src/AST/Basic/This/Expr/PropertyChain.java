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
    @Override
    public String convertToJs() {
        StringBuilder sb = new StringBuilder();

        if (identifiers != null && !identifiers.isEmpty()) {
            for (int i = 0; i < identifiers.size(); i++) {
                sb.append(identifiers.get(i));
                if (i < identifiers.size() - 1) sb.append(".");
            }
        }

        if (methodCall != null) {
            // Special case: _products.next(...) => _products.push(arg0)
            if (!identifiers.isEmpty()
                    && "next".equals(methodCall.getMethodName())) {

                sb.append(".push(");
                if (methodCall.getArguments() != null && !methodCall.getArguments().isEmpty()) {
                    sb.append(methodCall.getArguments().get(0).convertToJs());

                }
                sb.append(")");
                return sb.toString();
            }

            // Default
            if (!identifiers.isEmpty()) sb.append(".");
            sb.append(methodCall.convertToJs());
        }

        return sb.toString();
    }

}
