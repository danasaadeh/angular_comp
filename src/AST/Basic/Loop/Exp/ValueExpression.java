package AST.Basic.Loop.Exp;


import AST.Basic.Loop.Exp.Expression;

public class ValueExpression extends Expression {
    private String value;

    public ValueExpression(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tValueExpression{" +
                "\n \t\t\t\t\t\t\tvalue='" + value + '\'' +
                '}';
    }
    public String convertToJs() {
        // Directly return the value (number, variable, or string)
        return value;
    }
}