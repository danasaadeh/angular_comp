package AST.Html;

public class Binding {
    private  String binding;
    private  String value;

    public Binding() {
        this.binding = "";
        this.value = "";
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\t binding='" + binding + '\'' +
                "\n \t\t\t\t\t\t\t value='" + value + '\''
                ;
    }

    public String print() {
        return "\n Binding{" +
                "binding='" + binding + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
