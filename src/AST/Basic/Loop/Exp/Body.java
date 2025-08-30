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

        StringBuilder js = new StringBuilder();
        for (Statements stmt : statements) {
            js.append(stmt.convertToJs()).append("\n");
        }
        return js.toString();
    }
}