package AST.Basic;

public class Init {
    private String id;
    private String dataType;
    private String value;

    public Init(String dataType, String id, String value) {
        this.dataType = dataType;
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getDataType() {
        return dataType;
    }

    public String getValue() {
        return value;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return
                " \n \t\t\t\t\t\t\t ID: " + id +
                (dataType != null ? " : " + dataType : "") +
                " = " + value;
    }
    public String print() {
        return "\n Init: " +
                "ID: " + id +
                (dataType != null ? " : " + dataType : "") +
                " = " + value;
    }
}