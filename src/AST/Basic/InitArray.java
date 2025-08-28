
//package AST.Basic;
//
//import java.util.List;
//
//public class InitArray {
//    private String id;              // Identifier
//    private String dataType;        // Data type (optional)
//    private List<String> values;    // Values in the array
//
//    public InitArray(String dataType, String id) {
//        this.dataType = dataType;
//        this.id = id;
//
//    }
//    //private Helpers helpers;        // Optional helpers
//
//    // Constructor
//
//
//    // Getters
//    public String getId() {
//        return id;
//    }
//
//    public String getDataType() {
//        return dataType;
//    }
//
//    public List<String> getValues() {
//        return values;
//    }
//
//    // Method to add a value to the values list
//    public void addValue(String value) {
//        this.values.add(value);
//    }
//
//    // Setters
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setDataType(String dataType) {
//        this.dataType = dataType;
//    }
//
//    public void setValues(List<String> values) {
//        this.values = values;
//    }
//
//
//
//    @Override
//    public String toString() {
//        return "InitArray: " +
//                "ID: " + id +
//                (dataType != null ? " : " + dataType : "") +
//                " = [" + String.join(", ", values) + "]";
//    }
//}

//package AST.Basic;
//
//import AST.Statements;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class InitArray extends Statements {
//    private String id;
//    private String dataType;
//    private List<Value> values;
//
//
//    public InitArray() {
//        this.values = new ArrayList<>();
//    }
//
//
//    public String getId() {
//        return id;
//    }
//
//    public String getDataType() {
//        return dataType;
//    }
//
//
//
//    public void addValue(Value value) {
//        this.values.add(value);
//    }
//
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setDataType(String dataType) {
//        this.dataType = dataType;
//    }
//
//    public void setValues(List<Value> values) {
//        this.values = values;
//    }
//
//    @Override
//    public String toString() {
//        return
//                "\n \t\t\t\t\t\t\tid='" + id + '\'' +
//                "\n \t\t\t\t\t\t\t dataType='" + dataType + '\'' +
//                "\n \t\t\t\t\t\t\t values=" + values ;
//    }
//    public String print() {
//        return "\n InitArray{" +
//                "\n id='" + id + '\'' +
//                ",\n dataType='" + dataType + '\'' +
//                ",\n values=" + values +
//                '}';
//    }
//
//    public List<Value> getValues() {
//        return values;
//    }
//}


package AST.Basic;

import AST.Statements;
import java.util.ArrayList;
import java.util.List;

public class InitArray extends Statements {
    private String id;              // Identifier
    private String elementType; // <- add
    private List<Value> values;     // Values in the array

    public InitArray(String id,String elementType) {
        this.id = id;
        this.elementType=elementType;

        this.values = new ArrayList<>(); // Initialize the values list
    }

    public String getId() {
        return id;
    }

    public List<Value> getValues() {
        return values;
    }

    public void addValue(Value value) {
        this.values.add(value);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return   " = " + values;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }
    public String convertToJs() {
        StringBuilder sb = new StringBuilder();
        sb.append("let ").append(id).append(" = [");

        for (int i = 0; i < values.size(); i++) {
            sb.append(values.get(i));
            if (i < values.size() - 1) sb.append(", ");
        }

        sb.append("];");
        return sb.toString();
    }

}