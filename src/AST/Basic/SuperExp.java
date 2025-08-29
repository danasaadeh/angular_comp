package AST.Basic;

import AST.Statements;

import java.util.List;

public class SuperExp extends Statements {
    private String methodName;
    private List<String> arguments;
    private String property;
    private String value;


    public SuperExp(String methodName, List<String> arguments) {
        this.methodName = methodName;
        this.arguments = arguments;
        this.property = null;
        this.value = null;
    }


    public SuperExp(String property, String value) {
        this.property = property;
        this.value = value;
        this.methodName = null;
    }


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