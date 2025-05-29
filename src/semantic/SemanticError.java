package semantic;

public abstract class SemanticError {
    protected String message;
    protected int line;
    protected int column;

    public SemanticError(String message, int line, int column) {
        this.message = message;
        this.line = line;
        this.column = column;
    }

    public String getMessage() { return message; }
    public int getLine() { return line; }
    public int getColumn() { return column; }

    @Override
    public String toString() {
        return "Line " + line + ", Column " + column + ": " + message;
    }
}








