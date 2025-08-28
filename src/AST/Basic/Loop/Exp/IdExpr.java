package AST.Basic.Loop.Exp;

public class IdExpr extends Expression{
    private String ID;

    public IdExpr(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }


    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\tIDExpression{" +
                "\n \t\t\t\t\t\t\tvalue='" + ID + '\'' +
                '}';
    }
    @Override
    public String convertToJs() {

        return ID;
    }
}
