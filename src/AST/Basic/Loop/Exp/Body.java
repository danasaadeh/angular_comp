package AST.Basic.Loop.Exp;



import AST.Statements;

import java.util.ArrayList;
import java.util.List;

public class Body {
    private List<Statements> statements;

    public Body() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statements statement) {
        statements.add(statement);
    }

    public List<Statements> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tBody{" +
                "\n \t\t\t\t\t\t\tstatements=" + statements +
                '}';
    }
    public String convertToJs() {
        // Convert all statements in body to JS and join with newlines
        StringBuilder js = new StringBuilder();
        for (Statements stmt : statements) {
            if (stmt instanceof Expression) {
                js.append(((Expression) stmt).convertToJs()).append(";\n");
            } else {
                js.append(stmt.toString()).append(";\n"); // fallback
            }
        }
        return js.toString();
    }
}