package AST.Basic.If;

import AST.Basic.Loop.Exp.Body;

public class ElseStatement {
    private Body body;

    public ElseStatement(Body body) {
        this.body = body;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tElseStatement{" +
                "\n \t\t\t\t\t\t\tbody=" + body +
                '}';
    }
}
