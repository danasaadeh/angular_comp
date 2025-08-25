package AST.Html;

import java.util.List;

public class HtmlChardata {
    private String inter;
    private   String htmlText;

    public HtmlChardata() {
        this.htmlText = "";
        this.inter="";
    }

    public String getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText;
    }


    public String getInter() {
        return inter;
    }

    public void setInter(String inter) {
        this.inter = inter;
    }

    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\t htmlText='" + htmlText + '\'' +
                "\n \t\t\t\t\t\t\t inter='" + inter + '\'';
    }
    public String print() {
        return "\n HtmlChardata{" +
                "htmlText='" + htmlText + '\'' +
                ", inter='" + inter + '\'' +
                '}';
    }

    public String convertToHtml() {
        StringBuilder htmlBuilder = new StringBuilder();
        
        // Add HTML text
        if (htmlText != null && !htmlText.isEmpty()) {
            htmlBuilder.append(htmlText);
        }
        
        // Add interpolation (Angular template expressions)
        if (inter != null && !inter.isEmpty()) {
            htmlBuilder.append(inter);
        }
        
        return htmlBuilder.toString();
    }
    
    public boolean hasContent() {
        return (htmlText != null && !htmlText.isEmpty()) || 
               (inter != null && !inter.isEmpty());
    }
}
