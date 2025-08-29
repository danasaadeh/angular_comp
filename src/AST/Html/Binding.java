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
    public String convertToJsTemplate() {
        if (binding != null && value != null) {
            String cleanBinding = binding.trim();

            // Handle property binding [src] → src
            if (cleanBinding.startsWith("[") && cleanBinding.endsWith("]")) {
                cleanBinding = cleanBinding.substring(1, cleanBinding.length() - 1);
            }

            // Handle event binding (click) → onClick
            else if (cleanBinding.startsWith("(") && cleanBinding.endsWith(")")) {
                String eventName = cleanBinding.substring(1, cleanBinding.length() - 1);
                cleanBinding = "on" + eventName.substring(0, 1).toUpperCase() + eventName.substring(1);
            }

            // Remove extra quotes from value
            String cleanValue = value.replaceAll("^\"|\"$", "").trim();

            // Build normal HTML attribute with JS interpolation
            return cleanBinding + "=\"${" + cleanValue + "}\"";
        }
        return "";
    }



}
