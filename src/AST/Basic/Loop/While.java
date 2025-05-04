package AST.Basic.Loop;

import AST.Basic.Loop.Exp.Body;
import AST.Basic.Loop.Exp.Condition.Condition;

import java.util.ArrayList;
import java.util.List;

public class While {
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
}