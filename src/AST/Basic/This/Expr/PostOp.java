package AST.Basic.This.Expr;


import AST.Statements;

public class PostOp extends Statements {
    private String operation;

    public PostOp(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    @Override
    public String toString() {
        return "PostOp{" +
                "operation='" + operation + '\'' +
                '}';
    }
}
