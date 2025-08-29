package AST.Basic;

import AST.Statements;

public class Init extends Statements {
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
        return " \n\t\t\t\t\t\t\tID: " + id +
                (dataType != null ? " : " + dataType : "") +
                " = " + value;
    }

    public String print() {
        return "\n Init: ID: " + id +
                (dataType != null ? " : " + dataType : "") +
                " = " + value;
    }

    @Override
    public String convertToJs() {
        StringBuilder sb = new StringBuilder();

        if (value != null) {
            String trimmed = value.trim();

            // If it looks like an object (starts with {), skip it
            if (!trimmed.startsWith("{") && !trimmed.startsWith("[")) {
                String jsValue;

                // Wrap string in quotes
                if ("string".equalsIgnoreCase(dataType)) {
                    jsValue =  trimmed ;
                } else {
                    // number, boolean, or other primitive
                    jsValue = trimmed;
                }

                sb.append("let ").append(id).append(" = ").append(jsValue).append(";\n");
            }
        }

        return sb.toString();
    }
}
