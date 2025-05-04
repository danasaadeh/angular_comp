package AST.Html;

public class Directive {
    private String ng;
    private  String value;

    public Directive() {
        this.ng = "";
        this.value = "";
    }

    public String getNg() {
        return ng;
    }

    public void setNg(String ng) {
        this.ng = ng;
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
                "\n \t\t\t\t\t\t\t ng='" + ng + '\'' +
                "\n \t\t\t\t\t\t\t value='" + value + '\'' ;
    }
    public String print() {
        return "\n Directive{" +
                "ng='" + ng + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
