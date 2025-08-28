package AST.Basic.Function;

import AST.Statements;

import java.util.ArrayList;
import java.util.List;

public class FuncBody {
    public List<Statements> statements;
    public Return returnStatement;

    public FuncBody() {
        this.statements = new ArrayList<>();
    }

    public List<Statements> getStatements() {
        return statements;
    }

    public void setStatements(List<Statements> statements) {
        this.statements = statements;
    }


    public Return getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(Return returnStatement) {
        this.returnStatement = returnStatement;
    }

    public void addStatement(Statements statement) {
        this.statements.add(statement);
    }


    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\t returnStatement=" + returnStatement +
                        "\n \t\t\t\t\t\t\tstatements=" + statements
                ;
    }
    public String print() {
        return "\n FuncBody{" +
                "\n returnStatement=" + returnStatement +
                ",\n statements=" + statements +
                '}';
    }

    public String convertToJs() {
        StringBuilder jsBuilder = new StringBuilder();

        for (Statements stmt : statements) {
            String stmtJs = stmt.convertToJs();

            // تصفية العبارات غير المرغوب فيها
            if (!stmtJs.contains("asObservable") && !stmtJs.contains("getValue")) {
                jsBuilder.append("  ").append(stmtJs).append("\n");
            }
        }

        return jsBuilder.toString();
    }
}
