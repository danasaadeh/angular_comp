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

