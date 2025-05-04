package AST.Basic;

import java.util.List;

public class SuperExp {
    private String methodName;
    private List<String> arguments;
    private String property;
    private String value;

    // Constructor for method call
    public SuperExp(String methodName, List<String> arguments) {
        this.methodName = methodName;
        this.arguments = arguments;
    }

    // Constructor for property assignment
    public SuperExp(String property, String value) {
        this.property = property;
        this.value = value;
    }

    // Getters and setters
    public String getMethodName() {
        return methodName;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public String getProperty() {
        return property;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (methodName != null) {
            return "SuperExp{methodName='" + methodName + "', arguments=" + arguments + '}';
        } else {
            return "SuperExp{property='" + property + "', value='" + value + "'}";
        }
    }
}