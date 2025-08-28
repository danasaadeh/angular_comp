package AST.Basic.Loop.Exp;



import AST.Basic.Loop.Exp.Expression;

public class UnaryExpression extends Expression {
    private String operator;
    private Expression operand;

    public UnaryExpression(String operator, Expression operand) {
        this.operator = operator;
        this.operand = operand;
    }

    public String getOperator() {
        return operator;
    }

    public Expression getOperand() {
        return operand;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tUnaryExpression{" +
                "\n \t\t\t\t\t\t\toperator='" + operator + '\'' +
                "\n \t\t\t\t\t\t\t operand=" + operand +
                '}';
    }
    public String convertToJs() {
        // Example: for -a, return "-(a)"
        return operator + "(" + operand.convertToJs() + ")";
    }
}
