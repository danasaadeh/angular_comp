package AST.Basic;

public class ArrayDecl {
    private String id;
    private String dataType;

    public ArrayDecl(String dataType, String id) {
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
                "ID: " + id +
                (dataType != null ? " : " + dataType : "");
    }
}