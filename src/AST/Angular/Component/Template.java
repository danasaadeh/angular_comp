package AST.Angular.Component;

import AST.Html.HtmlDocument;
import AST.Html.HtmlElements;

public class Template {
    private HtmlDocument htmlDocument;

    public Template() {
        this.htmlDocument = new HtmlDocument();
    }


    public HtmlDocument getHtmlDocument() {
        return htmlDocument;
    }

    public void setHtmlDocument(HtmlDocument htmlDocument) {
        this.htmlDocument = htmlDocument;
    }

    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\thtmlDocument=" + htmlDocument ;
    }
    public String print() {
        return "Template{" +
                "htmlDocument=" + htmlDocument +
                '}';
    }

    public String convertToHtml() {
        if (htmlDocument != null) {
            return htmlDocument.convertToHtml();
        }
        return "";
    }

    public String convertToJs() {
        if (htmlDocument != null) {
            return htmlDocument.convertToJs();
        }
        return "";
    }
}

