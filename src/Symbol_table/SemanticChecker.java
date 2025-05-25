package Symbol_table;


public class SemanticChecker {
    private SymbolTable symbolTable;

    public SemanticChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public boolean check() {
        if (!checkTypeCompatibility(symbolTable)) {
            System.out.println("Semantic Error: Type mismatch (e.g., string assigned to number)");
            return false;
        } else if (!checkFunctionParameterCount(symbolTable)) {
            System.out.println("Semantic Error: Function parameter count mismatch.");
            return false;
        } else if (!checkUndefinedVariable(symbolTable)) {
            System.out.println("Semantic Error: Use of undefined variable.");
            return false;
        } else if (!checkComponentSelector(symbolTable)) {
            System.out.println("Semantic Error: Component must have a 'selector' property.");
            return false;
        } else if (!checkTemplateValidation(symbolTable)) {
            System.out.println("Semantic Error: Component must have either 'template' or 'templateUrl' (not both or none).");
            return false;
        } else {
            return true;
        }
    }

    // 1. Type Compatibility Check
    private boolean checkTypeCompatibility(SymbolTable table) {
        for (int i = 0; i < table.getRow().size(); i++) {
            Row row = table.getRow().get(i);
            if (row != null && row.getType() != null && row.getValue() != null) {
                if (row.getType().equals("number") && row.getValue().matches("\".*\"")) {
                    return false;
                }
            }
        }
        return true;
    }

    // 2. Function Parameter Count Check (Mock logic)
    private boolean checkFunctionParameterCount(SymbolTable table) {
        for (int i = 0; i < table.getRow().size(); i++) {
            Row row = table.getRow().get(i);
            if (row != null && "function".equals(row.getType())) {
                String[] expected = row.getValue().split(",");
                String[] actual = row.getName().split(",");
                if (expected.length != actual.length) {
                    return false;
                }
            }
        }
        return true;
    }

    // 3. Undefined Variable Check
    private boolean checkUndefinedVariable(SymbolTable table) {
        for (int i = 0; i < table.getRow().size(); i++) {
            Row row = table.getRow().get(i);
            if (row != null && row.getType() == null && row.getValue() == null) {
                return false;
            }
        }
        return true;
    }

    // 4. Component Selector Validation
    private boolean checkComponentSelector(SymbolTable table) {
        for (int i = 0; i < table.getRow().size(); i++) {
            Row row = table.getRow().get(i);
            if (row != null && "Component".equals(row.getType()) && !row.getValue().contains("selector")) {
                return false;
            }
        }
        return true;
    }

    // 5. Template/TemplateUrl Validation
    private boolean checkTemplateValidation(SymbolTable table) {
        for (int i = 0; i < table.getRow().size(); i++) {
            Row row = table.getRow().get(i);
            if (row != null && "Component".equals(row.getType())) {
                boolean hasTemplate = row.getValue().contains("template");
                boolean hasTemplateUrl = row.getValue().contains("templateUrl");

                if (!hasTemplate && !hasTemplateUrl) {
                    return false;
                }
                if (hasTemplate && hasTemplateUrl) {
                    return false;
                }
            }
        }
        return true;
    }
}
