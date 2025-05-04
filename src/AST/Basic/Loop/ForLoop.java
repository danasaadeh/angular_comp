package AST.Basic.Loop;

import AST.Basic.Init;
import AST.Basic.Loop.Exp.Body;
import AST.Basic.Loop.Exp.Condition.Condition;
import AST.Basic.Loop.Exp.Expression;
import AST.Statements;

public class ForLoop {
    private Init init;
    private Condition condition;
    private Expression expression;
    private Body body;

    public ForLoop(Init init, Condition condition, Expression expression, Body body) {
        this.init = init;
        this.condition = condition;
        this.expression = expression;
        this.body = body;
    }

    public Init getInit() {
        return init;
    }

    public Condition getCondition() {
        return condition;
    }

    public Expression getExpression() {
        return expression;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tForLoop{" +
                "\n \t\t\t\t\t\t\tinit=" + init +
                "\n \t\t\t\t\t\t\tcondition=" + condition +
                "\n \t\t\t\t\t\t\texpression=" + expression +
                "\n \t\t\t\t\t\t\tbody=" + body +
                '}';
    }
}
