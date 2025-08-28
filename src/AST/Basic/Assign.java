package AST.Basic;


import AST.Statements;

public class Assign  extends Statements {
    private String variableName;
    private String value;

    public Assign(String variableName, String value) {
        this.variableName = variableName;
        this.value = value;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\tvalue='" + value + '\'' +
                ", variableName='" + variableName + '\'' ;
    }
    @Override
    public String convertToJs() {
        StringBuilder jsBuilder = new StringBuilder();

        jsBuilder.append(variableName)
                .append(" = ")
                .append(value)
                .append(";");

        return jsBuilder.toString();
    }


//    @Override
//    public String toString() {
//        return "\n \t\t\t\t\t\t\t " + variableName + " = " + value;
//    }
}