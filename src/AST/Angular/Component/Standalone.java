package AST.Angular.Component;

public class Standalone {


    private String value;


    public Standalone(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Standalone: " + value;
    }
}

