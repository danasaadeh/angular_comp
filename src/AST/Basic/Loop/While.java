package AST.Basic.Loop;

import AST.Basic.Declaration;
import AST.Basic.Loop.Exp.Body;
import AST.Basic.Loop.Exp.Condition.Condition;
import AST.Basic.Loop.Exp.Expression;
import AST.Basic.Print;
import AST.Statements;

import java.util.ArrayList;
import java.util.List;

public class While  extends Statements {
    private Condition condition;
    private Body body;


    public While(Condition condition, Body body ) {
        this.condition = condition;
        this.body = body;

    }

    public Condition getCondition() {
        return condition;
    }

    public Body getBody() {
        return body;
    }



    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tWhile{" +
                "\n \t\t\t\t\t\t\tcondition=" + condition +
                "\n \t\t\t\t\t\t\tbody=" + body
                ;
    }

    @Override
    public String convertToJs() {
        StringBuilder sb = new StringBuilder();
        sb.append("while(")
                .append(condition instanceof Condition ? ((Condition)condition).convertToJs() : condition)
                .append(") {\n");

        // Convert body statements
        for (Statements stmt : body.getStatements()) {
            if (stmt instanceof Declaration) sb.append("  ").append(((Declaration)stmt).convertToJs()).append("\n");
            else if (stmt instanceof Print) sb.append("  ").append(((Print)stmt).convertToJs()).append("\n");
            else if (stmt instanceof Expression) sb.append("  ").append(((Expression)stmt).convertToJs()).append(";\n");
            else sb.append("  ").append(stmt.toString()).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}