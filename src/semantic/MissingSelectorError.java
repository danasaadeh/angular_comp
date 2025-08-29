


package semantic;


public class MissingSelectorError extends SemanticError {
    public MissingSelectorError(String componentName, int line, int column) {
        super("Component " + componentName + " is missing a selector", line, column);
    }
}