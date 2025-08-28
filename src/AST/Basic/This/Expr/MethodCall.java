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
                String arg = arguments.get(i).convertToJs();

                // تحويل خاص لمعالجة spread operator
                if (arg.contains("...current")) {
                    arg = "...current"; // تبسيط spread operator
                }

                sb.append(arg);
                if (i < arguments.size() - 1) sb.append(", ");
            }
        }
        sb.append(")");

        // تحويل دوال RxJS إلى JavaScript عادي
        if (methodName.equals("asObservable")) {
            return ""; // تجاهل asObservable في JavaScript العادي
        }
        else if (methodName.equals("getValue")) {
            return ""; // تجاهل getValue، نستخدم المصفوفة مباشرة
        }
        else if (methodName.equals("next")) {
            return sb.toString().replace("next", "="); // تحويل next إلى assignment
        }

        return sb.toString();
    }

}

