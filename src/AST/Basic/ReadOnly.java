package AST.Basic;

import AST.Statements;

public class ReadOnly extends Statements {
    private Declaration declaration;
    private ThisExpression thisExpression;

    public ReadOnly(Declaration declaration, ThisExpression thisExpression) {
        this.declaration = declaration;
        this.thisExpression = thisExpression;
    }

    public Declaration getDeclaration() {
        return declaration;
    }

    public ThisExpression getThisExpression() {
        return thisExpression;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }

    public void setThisExpression(ThisExpression thisExpression) {
        this.thisExpression = thisExpression;
    }

    @Override
    public String toString() {
        return "ReadOnly{" +
                "declaration=" + declaration +
                ", thisExpression=" + thisExpression +
                '}';
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReadOnly { ");
        if (declaration != null) sb.append(declaration.print());
        if (thisExpression != null) sb.append(" = ").append(thisExpression.print());
        sb.append(" }");
        return sb.toString();
    }
}
