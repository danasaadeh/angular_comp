package AST.Basic.This.Expr;


import AST.Statements;
import java.util.List;

public class MethodCall extends Statements {
    private String methodName;
    private List<Statements> arguments;

    public MethodCall(String methodName, List<Statements> arguments) {
        this.methodName = methodName;
        this.arguments = arguments;
    }

    public String getMethodName() {
        return methodName;
    }

    public List<Statements> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "MethodCall{" +
                "methodName='" + methodName + '\'' +
                ", arguments=" + arguments +
                '}';
    }

    @Override
    public String convertToJs() {
        StringBuilder sb = new StringBuilder();

        // Detect "addXxx" method pattern dynamically
        if (methodName.startsWith("add") && arguments != null && !arguments.isEmpty()) {
            String entityName = methodName.substring(3); // "Product" from "addProduct"
            String lowerEntity = entityName.isEmpty()
                    ? "item"
                    : Character.toLowerCase(entityName.charAt(0)) + entityName.substring(1);

            String plural = lowerEntity.endsWith("s") ? lowerEntity : lowerEntity + "s";

            // Build dynamic function
            sb.append("function ").append(methodName).append("(")
                    .append(arguments.get(0).convertToJs()).append(") {\n")
                    .append("  const ").append(methodName)
                    .append(" = _").append(plural).append(";\n\n")

                    .append("  _").append(plural).append(".push(\n")
                    .append("      current\n")
                    .append("  );\n")
                    .append("}\n");

            return sb.toString();
        }

        // Default: just print methodName + args
        sb.append(methodName).append("(");
        if (arguments != null && !arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                sb.append(arguments.get(i).convertToJs());
                if (i < arguments.size() - 1) sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

}