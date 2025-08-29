package semantic;

import java.util.*;

/**
 * Utility that groups a list of {@link SemanticError} objects into five logical
 * tables and prints them to the console.  The grouping is as follows:
 * <pre>
 *  1. Duplicate errors (DuplicateSelector + DuplicateVariable)  -> Map table
 *  2. Missing selector errors                                   -> List table
 *  3. Missing component-import errors                           -> List table
 *  4. Type-mismatch errors                                      -> List table
 *  5. Undefined-variable errors                                 -> List table
 * </pre>
 *
 * The duplicate table is represented as a {@code Map<String, List<SemanticError>>}
 * where the key is the offending name (selector / variable) and the value is a
 * list of occurrences.  This makes it easy to see how many times each name was
 * duplicated.  All other categories are represented as {@code List<SemanticError>}.
 */




public final class SemanticErrorTablePrinter {

    private SemanticErrorTablePrinter() {
    }

    public static void printTables(List<SemanticError> allErrors) {
        // ----- Group errors -------------------------------------------------
        Map<String, List<SemanticError>> duplicateTable = new LinkedHashMap<>();
        List<SemanticError> missingSelectorTable = new ArrayList<>();
        List<SemanticError> missingImportTable = new ArrayList<>();
        List<SemanticError> typeMismatchTable = new ArrayList<>();
        List<SemanticError> undefinedVarTable = new ArrayList<>();

        for (SemanticError err : allErrors) {
            if (err instanceof DuplicateSelectorError || err instanceof DuplicateVariableError) {
                String key = extractOffendingName(err.getMessage());
                duplicateTable.computeIfAbsent(key, k -> new ArrayList<>()).add(err);
            } else if (err instanceof MissingSelectorError) {
                missingSelectorTable.add(err);
            } else if (err instanceof MissingComponentImportError) {
                missingImportTable.add(err);
            } else if (err instanceof TypeMismatchError) {
                typeMismatchTable.add(err);
            } else if (err instanceof UndefinedVariableError) {
                undefinedVarTable.add(err);
            }
        }

        // ----- Print each table ---------------------------------------------
        System.out.println("================== Semantic Error Tables ==================");

        // 1. Duplicate errors (Map)
        System.out.println("\n(1) Duplicate Errors Table (Map: name -> occurrences)");
        if (duplicateTable.isEmpty()) {
            System.out.println("  No duplicate selector/variable errors.");
        } else {
            for (Map.Entry<String, List<SemanticError>> entry : duplicateTable.entrySet()) {
                System.out.printf("  %s -> %d occurrence(s)%n", entry.getKey(), entry.getValue().size());
                for (SemanticError e : entry.getValue()) {
                    System.out.printf("    • %s%n", e);
                }
            }
        }


        printListTable("(2) Missing Selector Errors", missingSelectorTable);
        printListTable("(3) Missing Component-Import Errors", missingImportTable);
        printListTable("(4) Type-Mismatch Errors", typeMismatchTable);
        printListTable("(5) Undefined Variable Errors", undefinedVarTable);

        System.out.println("===========================================================\n");
    }

    private static void printListTable(String title, List<SemanticError> list) {
        System.out.println("\n" + title);
        if (list.isEmpty()) {
            System.out.println("  None.");
        } else {
            for (SemanticError e : list) {
                System.out.println("  • " + e);
            }
        }
    }


    private static String extractOffendingName(String message) {
        if (message == null) {
            return "unknown";
        }
        int colon = message.lastIndexOf(':');
        if (colon >= 0 && colon + 1 < message.length()) {
            return message.substring(colon + 1).trim();
        }
        int lastSpace = message.lastIndexOf(' ');
        return lastSpace >= 0 ? message.substring(lastSpace + 1).trim() : message;
    }
}

