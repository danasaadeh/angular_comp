package AST.Basic.This.Expr;

import AST.Statements;

public class ArrowFunction extends Statements {
    private String parameter;
    private Statements body;

    public ArrowFunction(String parameter, Statements body) {
        this.parameter = parameter;
        this.body = body;
    }

    public String getParameter() {
        return parameter;
    }

    public Statements getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "ArrowFunction{" +
                "parameter='" + parameter + '\'' +
                ", body=" + body +
                '}';
    }
}
