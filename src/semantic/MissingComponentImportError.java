package semantic;

public class MissingComponentImportError extends SemanticError {

    public MissingComponentImportError(String missingIdentifier, int line, int column) {
        super("Component dependency '" + missingIdentifier + "' is used in the component's imports but is not imported.", line, column);
    }
}
