

package semantic;

public class UndefinedVariableError extends SemanticError {
    public UndefinedVariableError(String variableName, int line, int column) {
        super("Undefined variable: " + variableName, line, column);
    }
}