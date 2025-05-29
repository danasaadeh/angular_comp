package semantic;

public class DuplicateSelectorError extends SemanticError {
    public DuplicateSelectorError(String selector, int line, int column) {
        super("Duplicate selector in same file: " + selector, line, column);
    }
}