package AST.Html;

public class HtmlAttribute {
    private String tagName;
    private String value;

    public HtmlAttribute() {
        this.tagName = "";
        this.value = "";
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
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
                "\n \t\t\t\t\t\t\t tagName='" + tagName + '\'' +
                "\n \t\t\t\t\t\t\t value='" + value + '\'' ;
    }
    public String print() {
        return "\n HtmlAttribute{" +
                "tagName='" + tagName + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
