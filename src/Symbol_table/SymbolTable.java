package Symbol_table;

import semantic.DuplicateSelectorError;
import semantic.DuplicateVariableError;
import semantic.MissingSelectorError;
import semantic.SemanticError;

import java.io.PrintWriter;
import java.util.*;

public class SymbolTable {
    private final List<Row> row = new ArrayList<>();
    private final Stack<String> scopeStack = new Stack<>();
    private final Map<String, Row> symbols = new HashMap<>();
    private final List<SemanticError> errors = new ArrayList<>();
    private final SymbolTable parent;

    // For tracking duplicate selectors across components
    private static final Map<String, Integer> globalSelectors = new HashMap<>();

    public SymbolTable(SymbolTable parent) {
        this.parent = parent;
    }

    public SymbolTable() {
        this(null); // Root scope
    }

    // Enter a new logical scope
    public void enterScope(String scope) {
        scopeStack.push(scope);
    }

    public void exitScope() {
        if (!scopeStack.isEmpty()) {
            scopeStack.pop();
        }
    }

    public String getCurrentScope() {
        return scopeStack.isEmpty() ? "global" : scopeStack.peek();
    }

    public boolean add(String name, Row r) {
        // Check for redeclaration in the current scope
        if (symbols.containsKey(name)) {
            errors.add(new DuplicateVariableError(name, r.getLine(), r.getColumn()));
            return false;
        }

        symbols.put(name, r);
        row.add(r); // Still keep your row list for printing, etc.

        // Special logic for components: check selector
        if ("component".equals(r.getKind())) {
            String selector = r.getSelector();
            if (selector == null || selector.isEmpty()) {
                errors.add(new MissingSelectorError(r.getName(), r.getLine(), r.getColumn()));
            } else {
                int count = globalSelectors.getOrDefault(selector, 0);
                if (count > 0) {
                    errors.add(new DuplicateSelectorError(selector, r.getLine(), r.getColumn()));
                }
                globalSelectors.put(selector, count + 1);
            }
        }

        return true;
    }

    // Look only in current scope
    public Row lookupInCurrentScope(String name) {
        return symbols.get(name);
    }

    // Look recursively through parent scopes
    public Row lookup(String name) {
        Row r = symbols.get(name);
        if (r != null) return r;
        if (parent != null) return parent.lookup(name);
        return null;
    }

    public List<Row> getRow() {
        return row;
    }

    public void setRow(List<Row> row) {
        this.row.clear();
        this.row.addAll(row);
    }

    public Map<String, Row> getSymbols() {
        return symbols;
    }

    public SymbolTable getParent() {
        return parent;
    }

    public List<SemanticError> getErrors() {
        List<SemanticError> all = new ArrayList<>(errors);
        if (parent != null) {
            all.addAll(parent.getErrors());
        }
        return all;
    }

    public void writeTo(PrintWriter writer) {
        writer.println("Symbol Table:");
        writer.println("ID\t| Variable Name\t\t| Type\t\t | \t\t Value  \t\t\t | Scope");
        writer.println("=============================================================================");

        for (int i = 0; i < row.size(); i++) {
            Row currentRow = row.get(i);
            if (currentRow != null) {
                writer.printf("%d\t| %s\t\t| %s \t\t| %s\t\t| %s%n",
                        i + 1,
                        currentRow.getName(),
                        currentRow.getType(),
                        currentRow.getValue(),
                        currentRow.getScope());
                writer.println("---------------------------------------------------------------------------");
            }
        }
    }

}
