package AST.Basic.Function;

import AST.Statements;

import java.util.List;

public class ParameterList extends Statements {
    public List<String> parameters;



    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public List<String> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "ParameterList{" +
                "parameters=" + parameters +
                '}';
    }

    public String convertToJs() {
        if (parameters == null || parameters.isEmpty()) return "";
        return String.join(", ", parameters);
    }
}
