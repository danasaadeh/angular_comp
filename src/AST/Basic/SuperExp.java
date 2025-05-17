package AST.Basic;

import AST.Statements;

import java.util.List;

public class SuperExp extends Statements {
    private String methodName;
    private List<String> arguments;
    private String property; // This will hold the full property chain
    private String value;

    // Constructor for method call
    public SuperExp(String methodName, List<String> arguments) {
        this.methodName = methodName;
        this.arguments = arguments;
        this.property = null; // Ensure property is not set for method calls
        this.value = null; // Ensure value is not set for method calls
    }

    // Constructor for property assignment
    public SuperExp(String property, String value) {
        this.property = property; // This can now hold the full chain of properties
        this.value = value;
        this.methodName = null; // Ensure methodName is not set for property assignments
        this.arguments = null; // Ensure arguments are not set for property assignments
    }

    // Getters and setters
    public String getMethodName() {
        return methodName;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public String getProperty() {
        return property; // This will return the full chain of properties
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