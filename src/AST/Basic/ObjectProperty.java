package AST.Basic;

public class ObjectProperty {
    private String id;
    private String val;

    public ObjectProperty(String id, String val) {
        this.id = id;
        this.val = val;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getVal() {
        return val;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return id + ": " + val; // Format for objectProperty representation
    }
}