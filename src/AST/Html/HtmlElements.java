package AST.Html;

import java.util.ArrayList;
import java.util.List;

public class HtmlElements
{
    private List<HtmlElement> htmlElements;

    public HtmlElements() {
        this.htmlElements = new ArrayList<>();
    }

    public void setHtmlElements(HtmlElement htmlElements){
        this.htmlElements.add(htmlElements);
    }


    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\t htmlElements=" + htmlElements ;
    }
    public String print() {
        return "\n HtmlElements{" +
                "htmlElements=" + htmlElements +
                '}';
    }

    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(List<HtmlElement> htmlElements) {
        this.htmlElements = htmlElements;
    }
}
