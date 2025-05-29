package semantic;


public class DuplicateVariableError extends SemanticError {
    public DuplicateVariableError(String variableName, int line, int column) {
        super("Redeclared variable in the same scope: " + variableName, line, column);
    }
}
