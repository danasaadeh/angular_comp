package AST.Html;

public class HtmlAttribute {
    private String name;
    private String value;

    public HtmlAttribute() {
        this.name = "";
        this.value = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "\n \t\t\t\t\t\t\t name='" + name + '\'' +
                "\n \t\t\t\t\t\t\t value='" + value + '\'' ;
    }
    public String print() {
        return "\n HtmlAttribute{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String convertToHtml() {
        if (name == null || name.isEmpty()) {
            return "";
        }
        
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append(" ").append(name);
        
        if (value != null && !value.isEmpty()) {
            // Remove any existing quotes from the value to prevent double-quoting
            String cleanValue = value.replace("\"", "").trim();
            if (!cleanValue.isEmpty()) {
                htmlBuilder.append("=\"").append(cleanValue).append("\"");
            }
        }
        
        return htmlBuilder.toString();
    }
}
