package AST.Angular.Service;

public class ProvidedIn {
    private String value;

    // Constructor
    public ProvidedIn(String value) {
        this.value = value;
    }

    // Getter
    public String getValue() {
        return value;
    }

    // Setter
    public void setValue(String value) {
        this.value = value;
    }
    // toString method for debugging
    @Override
    public String toString() {
        return "ProvidedIn: " + value;
    }
}