package AST.Basic;

import AST.Statements;

public class Declaration extends Statements {
    private String id;
    private String dataType;

    public Declaration(String dataType, String id) {
        this.dataType = dataType;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getDataType() {
        return dataType;
    }



    public void setId(String id) {
        this.id = id;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }



    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\t ID: " + id +
                (dataType != null ? " : " + dataType : "");
    }


    public String print() {
        return "\n Declaration{" +
                "\n dataType='" + dataType + '\'' +
                "\n id='" + id + '\'' +
                '}';
    }
}