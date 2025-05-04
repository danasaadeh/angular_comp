package AST.Basic.If;

import AST.Basic.Loop.Exp.Body;
import AST.Basic.Loop.Exp.Condition.Condition;

public class ElseIfStatement {
    private Condition condition;
    private Body body;

    public ElseIfStatement(Condition condition, Body body) {
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
        return "\n \t\t\t\t\t\t\tElseIfStatement{" +
                "\n \t\t\t\t\t\t\tcondition=" + condition +
                "\n \t\t\t\t\t\t\t body=" + body +
                '}';
    }
}