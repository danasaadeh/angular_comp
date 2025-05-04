package AST.Basic.Loop.Exp.Condition;

public class IdentifierCondition extends Condition {
    private String identifier;

    public IdentifierCondition(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tIdentifierCondition{" +
                "\n \t\t\t\t\t\t\tidentifier='" + identifier + '\'' +
                '}';
    }
}
