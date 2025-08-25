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

    public String convertToHtml() {
        if (binding == null || binding.isEmpty()) {
            return "";
        }
        
        StringBuilder htmlBuilder = new StringBuilder();
        
        // Handle Angular two-way binding [(ngModel)]
        if (binding.equals("(ngModel)") && value != null && !value.isEmpty()) {
            // Remove any existing quotes from the value
            String cleanValue = value.replace("\"", "").trim();
            if (!cleanValue.isEmpty()) {
                htmlBuilder.append(" [(ngModel)]=\"").append(cleanValue).append("\"");
            }
        } else {
            htmlBuilder.append(" ").append(binding);
            
            if (value != null && !value.isEmpty()) {
                // Remove any existing quotes from the value
                String cleanValue = value.replace("\"", "").trim();
                if (!cleanValue.isEmpty()) {
                    htmlBuilder.append("=\"").append(cleanValue).append("\"");
                }
            }
        }
        
        return htmlBuilder.toString();
    }
}
