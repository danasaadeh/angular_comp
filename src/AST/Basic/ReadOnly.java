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
    @Override
    public String convertToJs() {
//        StringBuilder sb = new StringBuilder();
//
//        if (declaration != null) {
//            sb.append("const ").append(declaration.convertToJs());
//        }
//
//        if (thisExpression != null && thisExpression.getPropertyChain() != null) {
//            // Get the first identifier from the list (the base variable)
//            String baseIdentifier = thisExpression.getPropertyChain().getIdentifiers().get(0);
//            sb.append(" = ").append(baseIdentifier);
//        }
//
//        sb.append(";");
        return "";
                //sb.toString();
    }

}
