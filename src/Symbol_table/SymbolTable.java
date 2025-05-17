package Symbol_table;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SymbolTable {
    private List<Row> row = new ArrayList<>();
    private Stack<String> scopeStack = new Stack<>();

    public List<Row> getRow() {
        return row;
    }

    public void setRow(List<Row> row) {
        this.row = row;
    }

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

    public void print() {
        System.out.println("Symbol Table:");
        System.out.println("ID\t| Variable Name\t\t| Type\t\t | \t\t Value  \t\t\t | Scope");
        System.out.println("=============================================================================");

        for (int i = 0; i < row.size(); i++) {
            Row currentRow = row.get(i);
            if (currentRow != null) {
                System.out.printf("%d\t| %s\t\t| %s \t\t| %s\t\t| %s\n",
                        i + 1,
                        currentRow.getName(),
                        currentRow.getType(),
                        currentRow.getValue(),
                        currentRow.getScope()); // Added scope here

                System.out.println("---------------------------------------------------------------------------");
            }
        }
    }
}