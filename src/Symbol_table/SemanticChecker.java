package Symbol_table;

import java.util.*;

public class SemanticChecker {
    private SymbolTable symbolTable;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    public boolean check() {
        boolean isValid = true;
        for (Row row : symbolTable.getRow()) {
            if (row != null) {
                row.setDuplicateReported(false); // Reset the flag
            }
        }



        if (!checkTypeCompatibility(symbolTable)) {
            isValid = false; // Type mismatch detected
        }
        if (!checkUndefinedVariable(symbolTable)) {
            System.out.println("Semantic Error: Use of undefined variable.");
            isValid = false; // Undefined variable detected
        }
        if (!checkDuplicateVariableInScope(symbolTable)) {
            System.out.println("Semantic Error: Duplicate variable declaration in the same scope.");
            isValid = false; // Duplicate variable detected
        }
        if (!checkComponentSelector(symbolTable)) {
            System.out.println("Semantic Error: Component must have a 'selector' property.");
            isValid = false; // Missing selector in component
        }
        if (!checkDuplicateSelectors(symbolTable)) {
            System.out.println("Semantic Error: Duplicate selectors found in components within the same file.");
            return false;}


        return isValid; // Return the overall validity of the semantic checks
    }

//    public boolean check() {
//        if (!checkTypeCompatibility(symbolTable)) {
//            System.out.println("Semantic Error: Type mismatch (e.g., string assigned to number)");
//            return false;
//        } else if (!checkUndefinedVariable(symbolTable)) {
//            System.out.println("Semantic Error: Use of undefined variable.");
//            return false;
//        } else if (!checkDuplicateVariableInScope(symbolTable)) {
//            System.out.println("Semantic Error: Duplicate variable declaration in the same scope.");
//            return false;
//        } else if (!checkComponentSelector(symbolTable)) {
//            System.out.println("Semantic Error: Component must have a 'selector' property.");
//            return false;
//        } else if (!checkDuplicateSelectors(symbolTable)) {
//            System.out.println("Semantic Error: Duplicate selectors found in components within the same file.");
//            return false;}
//        else {
//            return true;
//        }
//    }

    // 1. Type Compatibility Check
    private boolean checkTypeCompatibility(SymbolTable table) {
        for (Row row : table.getRow()) {
            if (row != null && row.getType() != null && row.getValue() != null) {
                if (row.getType().equals("number") && row.getValue().matches("\".*\"")) {
                    return false;
                }
            }
        }
        return true;
    }

    // 2. Undefined Variable Check
    private boolean checkUndefinedVariable(SymbolTable table) {
        for (Row row : table.getRow()) {
            if (row != null && row.getType() == null && row.getValue() == null) {
                return false;
            }
        }
        return true;
    }

    // 3. Duplicate Variable in the Same Scope
    private boolean checkDuplicateVariableInScope(SymbolTable table) {
        Map<String, Set<String>> scopeVariables = new HashMap<>();
        for (Row row : table.getRow()) {
            if (row == null || row.getName() == null || row.getScope() == null) continue;
            scopeVariables.putIfAbsent(row.getScope(), new HashSet<>());
            if (!scopeVariables.get(row.getScope()).add(row.getName())) {
                return false; // Duplicate found
            }
        }
        return true;
    }

    // 4. Component Selector Validation
    private boolean checkComponentSelector(SymbolTable table) {
        for (Row row : table.getRow()) {
            if (row != null && "Component".equals(row.getType()) && (row.getValue() == null || !row.getValue().contains("selector"))) {
                return false;
            }
        }
        return true;
    }

    // 5. Duplicate Selectors Check
    private boolean checkDuplicateSelectors(SymbolTable table) {
        Set<String> selectors = new HashSet<>();
        for (Row row : table.getRow()) {
            if (row != null && "Component".equals(row.getType()) && row.getValue() != null) {
                String[] props = row.getValue().split(",");
                for (String prop : props) {
                    prop = prop.trim();
                    if (prop.startsWith("selector:")) {
                        String selector = prop.split(":")[1].trim().replaceAll("[\"']", "");
                        if (!selectors.add(selector)) {
                            return false; // Duplicate selector found
                        }
                    }
                }
            }
        }
        return true;
    }


}
