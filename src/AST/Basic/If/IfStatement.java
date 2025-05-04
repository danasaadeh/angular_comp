package AST.Basic.If;

import AST.Basic.Loop.Exp.Body;
import AST.Basic.Loop.Exp.Condition.Condition;
import AST.Statements;

import java.util.ArrayList;
import java.util.List;

public class  IfStatement  extends Statements {
    private Condition condition;
    private Body body;
    private List<ElseIfStatement> elseIfs;
    private Body elseBody;

    public IfStatement(Condition condition, Body body, List<ElseIfStatement> elseIfs, Body elseBody) {
        this.condition = condition;
        this.body = body;
        this.elseIfs = elseIfs;
        this.elseBody = elseBody;
    }

    public Condition getCondition() {
        return condition;
    }

    public Body getBody() {
        return body;
    }

    public List<ElseIfStatement> getElseIfs() {
        return elseIfs;
    }

    public Body getElseBody() {
        return elseBody;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tIfStatement{" +
                "\n \t\t\t\t\t\t\tcondition=" + condition +
                "\n \t\t\t\t\t\t\tbody=" + body +
                "\n \t\t\t\t\t\t\telseIfs=" + elseIfs +
                "\n \t\t\t\t\t\t\telseBody=" + elseBody +
                '}';
    }
}