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

    public String convertToHtml() {
        if (ng == null || ng.isEmpty()) {
            return "";
        }
        
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append(" ").append(ng);
        
        if (value != null && !value.isEmpty()) {
            // Remove any existing quotes from the value
            String cleanValue = value.replace("\"", "").trim();
            if (!cleanValue.isEmpty()) {
                htmlBuilder.append("=\"").append(cleanValue).append("\"");
            }
        }
        
        return htmlBuilder.toString();
    }
}
