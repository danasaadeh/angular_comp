



package semantic;

public class TypeMismatchError extends SemanticError {
    public TypeMismatchError(String variableName, String actual, String expected, int line, int column) {
        super("Type mismatch for variable '" + variableName + "'. Assigned: " + actual +
                ", Expected: " + expected, line, column);
    }
}






