package AST.Html;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    private String tagName;
    private List<HtmlAttribute> htmlAttributes;
    private Directive directives;
    private Binding bindings;
    private HtmlContent htmlContents;

    public HtmlElement() {
        this.bindings = new Binding();
        this.directives = new Directive();
        this.htmlAttributes = new ArrayList<>();
        this.htmlContents = new HtmlContent();
        this.tagName = "";
    }


    public Binding getBindings() {
        return bindings;
    }

    public void setBindings(Binding bindings) {
        this.bindings = bindings;
    }

    public Directive getDirectives() {
        return directives;
    }

    public void setDirectives(Directive directives) {
        this.directives = directives;
    }

    public List<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(List<HtmlAttribute> htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    public HtmlContent getHtmlContents() {
        return htmlContents;
    }

    public void setHtmlContents(HtmlContent htmlContents) {
        this.htmlContents = htmlContents;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\t bindings=" + bindings +
                "\n \t\t\t\t\t\t\t tagName='" + tagName + '\'' +
                "\n \t\t\t\t\t\t\t htmlAttributes=" + htmlAttributes +
                " \n \t\t\t\t\t\t\t directives=" + directives +
                "\n \t\t\t\t\t\t\t htmlContents=" + htmlContents
                ;
    }
    public String print() {
        return "\n HtmlElement{" +
                "\n bindings=" + bindings +
                ", tagName='" + tagName + '\'' +
                ",\n htmlAttributes=" + htmlAttributes +
                ",\n directives=" + directives +
                ",\n htmlContents=" + htmlContents +
                '}';
    }
}