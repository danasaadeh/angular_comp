

package AST.Angular.Component;

public class Selector {
    private String value;


    public Selector(String value) {
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
        return "Selector: " + value;
    }
}
