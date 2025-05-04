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
}

