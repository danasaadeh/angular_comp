package AST.Html;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    private List<Object> scriptlets;
    private String xml;
    private String dtd;
    private List<HtmlElement> htmlElements;

    public HtmlDocument() {
        this.scriptlets = new ArrayList<>();
        this.xml = null;
        this.dtd = null;
        this.htmlElements = new ArrayList<>();
    }

    public List<Object> getScriptlets() {
        return scriptlets;
    }

    public void addScriptlet(Object scriptlet) {
        this.scriptlets.add(scriptlet);
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getDtd() {
        return dtd;
    }

    public void setDtd(String dtd) {
        this.dtd = dtd;
    }

    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\t htmlElements=" + htmlElements
                ;
    }
    public String print() {
        return "\n HtmlDocument{" +

                ", htmlElements=" + htmlElements +
                '}';
    }

    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(List<HtmlElement> htmlElements) {
        this.htmlElements = htmlElements;
    }

    public void addHtmlElement(HtmlElement element) {
        this.htmlElements.add(element);
    }

    public void setScriptlets(List<Object> scriptlets) {
        this.scriptlets = scriptlets;
    }

    public String convertToHtml() {
        StringBuilder htmlBuilder = new StringBuilder();
        
        if (htmlElements != null) {
            for (HtmlElement element : htmlElements) {
                if (element != null) {
                    String elementHtml = element.convertToHtml();
                    if (!elementHtml.isEmpty()) {
                        htmlBuilder.append(elementHtml);
                    }
                }
            }
        }
        
        return htmlBuilder.toString();
    }
}