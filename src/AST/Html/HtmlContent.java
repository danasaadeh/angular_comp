package AST.Html;

import java.util.ArrayList;
import java.util.List;

public class HtmlContent {
    private List<HtmlElement> htmlElements;
    private List<HtmlChardata> data;

    public HtmlContent() {
        this.data = new ArrayList<>();
        this.htmlElements = new ArrayList<>();
    }


    public List<HtmlChardata> getData() {
        return data;
    }

    public void setData(List<HtmlChardata> data) {
        this.data = data;
    }

    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(List<HtmlElement> htmlElements) {
        this.htmlElements = htmlElements;
    }

    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\t data=" + data +
                "\n \t\t\t\t\t\t\t htmlElements=" + htmlElements ;
    }

    public String print() {
        return "\n HtmlContent{" +
                "data=" + data +
                ", htmlElements=" + htmlElements +
                '}';
    }

    public String convertToHtml() {
        StringBuilder htmlBuilder = new StringBuilder();
        
        // Render text data
        if (data != null) {
            for (HtmlChardata chardata : data) {
                if (chardata != null) {
                    String chardataHtml = chardata.convertToHtml();
                    if (!chardataHtml.isEmpty()) {
                        htmlBuilder.append(chardataHtml);
                    }
                }
            }
        }
        
        // Render nested HTML elements
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
    
    public boolean hasContent() {
        // Check if there's any text data
        if (data != null) {
            for (HtmlChardata chardata : data) {
                if (chardata != null && chardata.hasContent()) {
                    return true;
                }
            }
        }
        
        // Check if there are any nested elements
        if (htmlElements != null && !htmlElements.isEmpty()) {
            return true;
        }
        
        return false;
    }
}

