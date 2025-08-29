package Symbol_table;

public class Row {
    private String name;
    private String type;
    private String value;
    private String scope;



    private String kind;
    private String selector;
    private int line;
    private int column;

    public Row() {

    }

    // ---- Existing Getters and Setters ----
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

//    public boolean isDuplicateReported() {
//        return duplicateReported;
//    }
//
//    public void setDuplicateReported(boolean duplicateReported) {
//        this.duplicateReported = duplicateReported;
//    }

    // ---- New Getters and Setters for Semantic Analysis ----
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
