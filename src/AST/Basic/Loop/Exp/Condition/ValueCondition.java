package AST.Basic.Loop.Exp.Condition;

public class ValueCondition extends Condition {
    private String value;

    public ValueCondition(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tValueCondition{" +
                "\n \t\t\t\t\t\t\tvalue='" + value + '\'' +
                '}';
    }
}