package AST.Basic;

import AST.Basic.Loop.Exp.Expression;
public class Print {
    private Expression expression;

    public Print(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\t Print{" +
                "\n \t\t\t\t\t\t\t expression=" + expression +
                '}';
    }
}
