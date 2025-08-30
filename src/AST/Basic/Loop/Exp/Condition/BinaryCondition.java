package AST.Basic.Loop.Exp.Condition;

public class BinaryCondition extends Condition {
    private Condition left;
    private String operation;
    private Condition right;

    public BinaryCondition(Condition left, String operation, Condition right) {
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    public Condition getLeft() {
        return left;
    }

    public String getOperation() {
        return operation;
    }

    public Condition getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tBinaryCondition{" +
                "\n \t\t\t\t\t\t\tleft=" + left +
                "\n \t\t\t\t\t\t\toperation='" + operation + '\'' +
                "\n \t\t\t\t\t\t\tright=" + right +
                '}';
    }
    @Override
    public String convertToJs() {
        return  left.convertToJs() + " " + operation + " " + right.convertToJs() ;
    }
}
