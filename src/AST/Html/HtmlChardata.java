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
}
