package AST.Html;

public class Hash {
    private String hash;
    private  String value;

    public Hash() {
        this.hash = "";
        this.value = "";
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
                "\n \t\t\t\t\t\t\t hash='" + hash + '\'' +
                        "\n \t\t\t\t\t\t\t value='" + value + '\'' ;
    }
    public String print() {
        return "\n Hash{" +
                "hash='" + hash + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String convertToHtml() {
        if (hash == null || hash.isEmpty()) {
            return "";
        }
        
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append(" ").append(hash);
        
        if (value != null && !value.isEmpty()) {
            // Remove any existing quotes from the value
            String cleanValue = value.replace("\"", "").trim();
            if (!cleanValue.isEmpty()) {
                htmlBuilder.append("=\"").append(cleanValue).append("\"");
            }
        }
        
        return htmlBuilder.toString();
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}

